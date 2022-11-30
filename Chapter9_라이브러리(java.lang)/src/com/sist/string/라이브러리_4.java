package com.sist.string;
// concat, replace, replaceAll, substring, split
// indexOf, lastIndexOf, valueOf
public class ¶óÀÌºê·¯¸®_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// concat: ¹®ÀÚ¿­ °áÇÕ(+)
		// ¿øÇü: public String concat(String s)
		/*String s1="Hello ";
		String s2="Java";
		String s12=s1.concat(s2);
		System.out.println(s12);
		String s3=s1+s2;
		System.out.println(s3);*/
		//replace => ´Ü¾î/¹®ÀÚ¿­ º¯°æ
		/*String s="Hello Java";
		String s1=s.replace('a', 'b'); //Hello Jbvb
		String s2=s.replace("Java", "Oracle");
		System.out.println(s1);
		System.out.println(s2);
		String ss="a.jpg&b.jpg&c.jpg"; //¿À¶óÅ¬ (& -> Scanner)
		String ss1=ss.replace("&", "^");
		System.out.println(ss1);*/
		//replaceAll ==> Á¤±Ô½Ä 
		// ¿øÇü: public String replaceAll(String p,String s)
		String s="¾È³çÇÏ¼¼¿ä Hello 12345";
		// ÃßÃµ => ÇØ´çÇÏ´Â ¿µÈ­¸í,¸ÀÁı¸í 
		// LIKE ==> REGEXP
		System.out.println("ÇÑ±Û¸¸ Ãâ·Â:"+s.replaceAll("[^°¡-ÆR]", ""));
		//^ => Á¦¿ÜÇÏ°í [°¡-ÆR] => ÇÑ±Û ÀüÃ¼ 
		System.out.println("¿µ¾î¸¸ Ãâ·Â:"+s.replaceAll("[^A-Za-z]", ""));
		System.out.println("¼ıÀÚ¸¸ Ãâ·Â:"+s.replaceAll("[^0-9]", ""));
		
		String ss="Hello Java";
		String ss1=ss.substring(6);
		System.out.println(ss1);
		String ss2=ss.substring(0,5);
		System.out.println(ss2); // ¸¶Áö¸·Àº Á¦¿Ü
		// ¿øÇü: public String substring(int s): sºÎÅÍ ³ª¸ÓÁö ÀüÃ¼¸¦ ÀĞ¾î ¿Â´Ù
		//		public String substring(int s,int e): sºÎÅÍ e-1¹ø±îÁö ÀĞ¾î¿Â´Ù
		
		String sss="red,green,black,white,pink";
		String[] color=sss.split(",");
		for(String c:color)
		{
			System.out.println(c);
		}
		//¿øÇü: String[] split(String regex) ==> Á¤±Ô½Ä ÀÌ¿ë ==> \\(|)
		// Á¤±Ô½Ä ±âÈ£: . | ^ ? + * ==> \\. \\| \\^ \\? \\+ \\*
		
		// IndexOf / lastIndexOf => ÇØ´ç¹®ÀÚÀÇ À§Ä¡°ª
		String temp="Hello Java";
		//			 0123456789
		int index=temp.indexOf("a");
		System.out.println(index);
		index=temp.lastIndexOf("a");
		System.out.println(index);
		// ==> substring
		String temp2="adkladaklda.dakjdakd.png";
		String k=temp2.substring(temp2.lastIndexOf(".")+1);
		System.out.println(k);
		
		String temp3=" Hello Java ";
		System.out.println(temp3.length());
		String m=temp3.trim(); // ÁÂ¿ì¿¡ °ø¹é Á¦°Å
		System.out.println(m.length());
		//¿øÇü: public String trim()
		// valueOf(): ¹®ÀÚ¿­ º¯È¯
		int a=10;
		int b=20;
		String p1=String.valueOf(a); //"10"
		String p2=String.valueOf(b); //"20"
		System.out.println(p1+p2);
		// À©µµ¿ì / À¥ ==> ¹®ÀÚ¿­
		
		// String / Collection:CURD / read, write
		// Wrapper ==> Integer => parseInt
	}

}
