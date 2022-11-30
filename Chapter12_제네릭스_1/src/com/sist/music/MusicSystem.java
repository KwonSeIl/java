package com.sist.music;
//����,��� ==> �����͸� ���� �� ��û�� ���� ó�� 
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class MusicSystem {
	private static ArrayList<Music> list=new ArrayList<Music>(); //200�� ����
	/*
	 * 	�ʱ�ȭ
	 * 	-----
	 * 	  1. ����� �ʱ�ȭ (��� ���) => �⺻�� �������� ��� ��� 
	 * 	  2. ������ => �ν��Ͻ� ������ ���� �ʱ�ȭ�� ��� ���� ��� (�����ڸ� �ݵ�� ȣ�� �� ���)
	 *    3. �ʱ�ȭ�� : �ڵ�����
	 *    	=> static=> �ڵ�����=> ������ ȣ�� �ʿ�X
	 *    
	 *    => ����� �ʱ�ȭ -> �ʱ�ȭ��-> ������
	 *    	 ------------------------- 1)������ʱ�ȭ���
	 *    								------------- �ʱ�ȭ �� �� ���°�: ����(ũ�Ѹ�) 
	 *    
	 *    Ŭ����
	 *    ---------------------------
	 *    	����
	 *    		= �ν��Ͻ� ����(���� ����Ǵ� ����) ==> new
	 *    		= ���� ����(�Ѱ��� ����) ==> static
	 *    ----------------------------
	 *    	�ʱ�ȭ
	 *    		= �ν��Ͻ� ��
	 *    			{
	 *    				�ʱ�ȭ
	 *    			}
	 *    		= static ��
	 *    			static
	 *    			{
	 *    				static���� �ʱ�ȭ
	 *    			}
	 *    ------------------------------
	 *    	������
	 *    		= ���۰� ���ÿ� ó���ؾ��� ����� �ִ� ���
	 *    			�ڵ��α���/��Űó��/ȭ��UI
	 *    ---------------------------
	 *    	�޼ҵ�: ���(������ ���) => ������̼��� ������ �� �ִ� 
	 *    -----------------------
	 *    	=> ������(��� �������� ��Ƽ� ����) => ��� �󵵴� ���� ����
	 *    
	 */
	// ������ ����
	// Ŭ���� ���������� ������ �� �� ���� -> ���� ���� => ����ó��,���ó��,����ó�� �Ұ�
	/*
	 * 	<div>
	 *    <div class="a">
	 *    	<span class="b">aaa</span>		div.a sapn.b=> span�±� �ȿ� b��� Ŭ������ ������ �ִ� ������ ��û
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
	 *  ==> �±׸� ==> ������: class,id ==> class:. , id:#
	 */
	static
	{
		int mno=1;
		try
		{
			//���Ϲ���
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
					Music m=new Music(); //m=>100�� �ʿ�
					m.setMno(mno);
					m.setCno(1);
					m.setTitle(title.get(j).text());
					m.setSinger(singer.get(j).text());
					m.setAlbum(album.get(j).text());
					String temp=etc.get(j).text();
					int in=0;
					String state=temp.replaceAll("[^��-�R]","");
					if(state.equals("����"))
					{
						in=0;
					}
					else
					{
						in=Integer.parseInt(temp.replaceAll("[^0-9]", "").trim());
					}
					m.setState(state);
					m.setCrement(in);
					list.add(m); //ArrayList�� Music ��ü�� ���� ���� 
					mno++;
				}
				
			}
			//�����ͼ����Ϸ�
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
				Music m=new Music(); //m=>100�� �ʿ�
				m.setMno(mno);
				m.setCno(2);
				m.setTitle(title.get(i).text());
				m.setSinger(singer.get(i).text());
				m.setAlbum(album.get(i).text());
				String temp=etc.get(i).text();
				int in=0;
				String state=temp.replaceAll("[^��-�R]","");
				if(state.contains("����"))
				{
					in=0;
				}
				else
				{
					in=Integer.parseInt(temp.replaceAll("[^0-9]", "").trim());
				}
				m.setState(state);
				m.setCrement(in);
				list.add(m); //ArrayList�� Music ��ü�� ���� ���� 
				mno++;
			}
		}catch(Exception ex) {}
	}
	// ��û�� ���� ó�� 
	// ��� => ����/��� -> ������ ó�� ==> cno
	public ArrayList<Music> musicCategoryData(int cno)
	{
		ArrayList<Music> mList=new ArrayList<Music>(); //���������� ��Ƽ� ����
		for(Music m:list)
		{
			if(m.getCno()==cno)
			{
				mList.add(m);
			}
		}
		return mList;
	}
	// �뷡 �˻�(�뷡 / ������)
	// �󼼺��� ==> mno
	// ��� / ��õ ... ���� ����, ����Ʈ ����...
	/*public static void main(String[] args) {
		MusicSystem m=new MusicSystem();
		System.out.println(m.list.size());
	}*/

}


