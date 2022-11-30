package com.sist.music;
//Áö´Ï,¸á·Ğ ==> µ¥ÀÌÅÍ¸¦ ÀúÀå ÈÄ ¿äÃ»¿¡ ´ëÇÑ Ã³¸® 
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class MusicSystem {
	private static ArrayList<Music> list=new ArrayList<Music>(); //200°³ ÀúÀå
	/*
	 * 	ÃÊ±âÈ­
	 * 	-----
	 * 	  1. ¸í½ÃÀû ÃÊ±âÈ­ (»ç¿ë ¾î·Æ) => ±âº»Çü µ¥ÀÌÅÍÀÏ °æ¿ì »ç¿ë 
	 * 	  2. »ı¼ºÀÚ => ÀÎ½ºÅÏ½º º¯¼ö¿¡ ´ëÇÑ ÃÊ±âÈ­ÇÒ °æ¿ì ¸¹ÀÌ »ç¿ë (»ı¼ºÀÚ¸¦ ¹İµå½Ã È£Ãâ ÈÄ »ç¿ë)
	 *    3. ÃÊ±âÈ­ºí·° : ÀÚµ¿¼öÇà
	 *    	=> static=> ÀÚµ¿ÀúÀå=> »ı¼ºÀÚ È£Ãâ ÇÊ¿äX
	 *    
	 *    => ¸í½ÃÀû ÃÊ±âÈ­ -> ÃÊ±âÈ­ºí·°-> »ı¼ºÀÚ
	 *    	 ------------------------- 1)¸í½ÃÀûÃÊ±âÈ­°í·Á
	 *    								------------- ÃÊ±âÈ­ ÇÒ ¼ö ¾ø´Â°Í: ±¸Çö(Å©·Ñ¸µ) 
	 *    
	 *    Å¬·¡½º
	 *    ---------------------------
	 *    	º¯¼ö
	 *    		= ÀÎ½ºÅÏ½º º¯¼ö(µû·Î ÀúÀåµÇ´Â º¯¼ö) ==> new
	 *    		= Á¤Àû º¯¼ö(ÇÑ°³¸¸ ÀúÀå) ==> static
	 *    ----------------------------
	 *    	ÃÊ±âÈ­
	 *    		= ÀÎ½ºÅÏ½º ºí·°
	 *    			{
	 *    				ÃÊ±âÈ­
	 *    			}
	 *    		= static ºí·°
	 *    			static
	 *    			{
	 *    				staticº¯¼ö ÃÊ±âÈ­
	 *    			}
	 *    ------------------------------
	 *    	»ı¼ºÀÚ
	 *    		= ½ÃÀÛ°ú µ¿½Ã¿¡ Ã³¸®ÇØ¾ßÇÒ ±â´ÉÀÌ ÀÖ´Â °æ¿ì
	 *    			ÀÚµ¿·Î±×ÀÎ/ÄíÅ°Ã³¸®/È­¸éUI
	 *    ---------------------------
	 *    	¸Ş¼Òµå: ±â´É(º¯¼öÀÇ ±â´É) => ¾î³ëÅ×ÀÌ¼ÇÀ» ±¸ºĞÇÒ ¼ö ÀÖ´Ù 
	 *    -----------------------
	 *    	=> ¿­°ÅÇü(»ó¼ö ¿©·¯°³¸¦ ¸ğ¾Æ¼­ °ü¸®) => »ç¿ë ºóµµ´Â °ÅÀÇ ¾ø´Ù
	 *    
	 */
	// µ¥ÀÌÅÍ ¼öÁı
	// Å¬·¡½º ¿µ¿ª¿¡¼­´Â ±¸ÇöÀ» ÇÒ ¼ö ¾øÀ½ -> ¼±¾ğ¸¸ °¡´É => ¿¬»êÃ³¸®,Á¦¾î¹®Ã³¸®,¿¹¿ÜÃ³¸® ºÒ°¡
	/*
	 * 	<div>
	 *    <div class="a">
	 *    	<span class="b">aaa</span>		div.a sapn.b=> spanÅÂ±× ¾È¿¡ b¶ó´Â Å¬·¡½º¸¦ °¡Áö°í ÀÖ´Â µ¥ÀÌÅÍ ¿äÃ»
	 *    	<span class="c">bbb</span>
	 *    </div>
	 *  </div>
	 *  <div>
	 *    <div class="d">
	 *    	<span class="b">aaa</span>
	 *    	<span class="c">bbb</span>
	 *    </div>
	 *  </div>
	 *  
	 *  ==> ÅÂ±×¸í ==> ±¸ºĞÀÚ: class,id ==> class:. , id:#
	 */
	static
	{
		int mno=1;
		try
		{
			//Áö´Ï¹ÂÁ÷
			for(int i=1;i<=2;i++)
			{
				Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20221125&hh=14&rtm=Y&pg="+i).get();
				Elements title=doc.select("table.list-wrap td.info a.title");
				Elements singer=doc.select("table.list-wrap td.info a.artist");
				Elements album=doc.select("table.list-wrap td.info a.albumtitle");
				Elements etc=doc.select("span.rank span.rank");
				for(int j=0;j<title.size();j++)
				{
					/*System.out.println(title.get(j).text()+" "
							+singer.get(j).text()+" "
							+album.get(j).text()+" "
							+etc.get(j).text());*/
					Music m=new Music(); //m=>100°³ ÇÊ¿ä
					m.setMno(mno);
					m.setCno(1);
					m.setTitle(title.get(j).text());
					m.setSinger(singer.get(j).text());
					m.setAlbum(album.get(j).text());
					String temp=etc.get(j).text();
					int in=0;
					String state=temp.replaceAll("[^°¡-ÆR]","");
					if(state.equals("À¯Áö"))
					{
						in=0;
					}
					else
					{
						in=Integer.parseInt(temp.replaceAll("[^0-9]", "").trim());
					}
					m.setState(state);
					m.setCrement(in);
					list.add(m); //ArrayList´Â Music °´Ã¼¸¸ ÀúÀå °¡´É 
					mno++;
				}
				
			}
			//µ¥ÀÌÅÍ¼öÁı¿Ï·á
			mno=101;
			Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			Elements title=doc.select("tr.lst50 div.rank01");
			Elements singer=doc.select("tr.lst50 div.rank02");
			Elements album=doc.select("tr.lst50 div.rank03");
			Elements etc=doc.select("tr.lst50 div.wrap span.rank_wrap");
			for(int i=0;i<title.size();i++)
			{
				/*System.out.println(title.get(i).text()+" "
						+singer.get(i).text()+" "
						+album.get(i).text()+" "
						+etc.get(i).text());*/
				Music m=new Music(); //m=>100°³ ÇÊ¿ä
				m.setMno(mno);
				m.setCno(2);
				m.setTitle(title.get(i).text());
				m.setSinger(singer.get(i).text());
				m.setAlbum(album.get(i).text());
				String temp=etc.get(i).text();
				int in=0;
				String state=temp.replaceAll("[^°¡-ÆR]","");
				if(state.contains("µ¿ÀÏ"))
				{
					in=0;
				}
				else
				{
					in=Integer.parseInt(temp.replaceAll("[^0-9]", "").trim());
				}
				m.setState(state);
				m.setCrement(in);
				list.add(m); //ArrayList´Â Music °´Ã¼¸¸ ÀúÀå °¡´É 
				mno++;
			}
		}catch(Exception ex) {}
	}
	// ¿äÃ»¿¡ ´ëÇÑ Ã³¸® 
	// ¸ñ·Ï => Áö´Ï/¸á·Ğ -> ³ª´²¼­ Ã³¸® ==> cno
	public ArrayList<Music> musicCategoryData(int cno)
	{
		ArrayList<Music> mList=new ArrayList<Music>(); //À½¾ÇÁ¤º¸¸¸ ¸ğ¾Æ¼­ Àü¼Û
		for(Music m:list)
		{
			if(m.getCno()==cno)
			{
				mList.add(m);
			}
		}
		return mList;
	}
	// ³ë·¡ °Ë»ö(³ë·¡ / °¡¼ö¸í)
	// »ó¼¼º¸±â ==> mno
	// ´ñ±Û / ÃßÃµ ... À½¹İ ±¸¸Å, Æ÷ÀÎÆ® ÃæÀü...
	/*public static void main(String[] args) {
		MusicSystem m=new MusicSystem();
		System.out.println(m.list.size());
	}*/

}


