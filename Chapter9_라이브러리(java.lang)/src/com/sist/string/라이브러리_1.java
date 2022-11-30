package com.sist.string;
/*
 *  String Å¬·¡½º(À¥ => µ¥ÀÌÅÍÇüÀÌ ¹®ÀÚ¿­¸¸ Á¸Àç)
 *   1) ¹®ÀÚ¿­À» ÀúÀåÇÏ´Â µ¥ÀÌÅÍÇü / Å¬·¡½ºÇü
 *   2) Object·ÎºÎÅÍ »ó¼ÓÀ» ¹ŞÀº Å¬·¡½º
 *   3) String Å¬·¡½º´Â finalÅ¬·¡½º -> º¯°æÀÌ ºÒ°¡´ÉÇÑ Å¬·¡½º(ÀÖ´Â ±×´ë·Î ¶óÀÌºê·¯¸®¸¦ »ç¿ëÇØ¾ß ÇÑ´Ù) => ¿À¹ö¶óÀÌµù ºÒ°¡
 *   				 -------- È®ÀåÀ» ÇÒ ¼ö ¾ø´Â Å¬·¡½º(Á¾´Ü Å¬·¡½º) 
 *   				 Math,StringBuffer,StringBuilder,System, Wrapper => Á¾´Ü
 *   4) »ç¿ë¹ı
 *   	String º¯¼ö¸í="";   => ""ÀÚÃ¼°¡ ÁÖ¼Ò¿¡ ÇØ´çµÊ ==> char[] º¯¼ö¸í={'','',''}
 *   	"Hello" "Hello"
 *   	-------------- °°Àº ÁÖ¼Ò¸¦ °¡Áö°í ÀÖ´Ù(°°Àº ¹®ÀÚ¿­Àº °°Àº ÁÖ¼Ò¸¦ °¡Áö°í ÀÖ´Ù) 
 *   	»õ·Î¿î °ø°£¿¡ ÀúÀå => new String("")
 *   	¿¹)
 *   		String s1="Hello";
 *   		String s2="Hello";
 *   		------------------- °°Àº ÁÖ¼Ò
 *   		String s3=new String("Hello");
 *   		----------------------------- ´Ù¸¥ ÁÖ¼Ò¿¡ ÀúÀå
 *   5) ÁÖ¿ä¸Ş¼Òµå(ÀÚ¹Ù½ºÅ©¸³Æ®¿Í µ¿ÀÏ)
 *     1. public char charAt(int index): ¹®ÀÚ¿­¿¡¼­ ¿øÇÏ´Â À§Ä¡¿¡ ¹®ÀÚ ÇÑ °³ ÃßÃâ
 *     	  		 ----		  ---------
 *     	  *** ÀÚ¹Ù¿¡¼­ »ç¿ëÇÏ´Â ¸ğµç ¹®ÀÚ¿­Àº ÀÎµ¦½º ¹øÈ£°¡ 0¹øºÎÅÍ ½ÃÀÛ
 *     	  String s="0123156789";
 *     	  s.charAt(3) ==> '3'
 *     	  String s="ABCDEFG";
 *     				0123456
 *     	  s.charAt(5) ==> 'F'
 *     2. length(): ¹®ÀÚ °³¼ö¸¦ °¡Áö°í ¿Â´Ù
 *     	  public int length()
 *        String s="Hello"; => s.length() ==> 5 (ÇÑ±Ûµµ µ¿ÀÏÇÔ)
 *        String s="¾È³çÇÏ¼¼¿ä"; => s.length() ==> 5
 *        ==> »ç¿ëÃ³: È­¸é UI (±ÛÀÚ¼ö¸¦ µ¿ÀÏÇÏ°Ô ¸¸µå´Â °æ¿ì¿¡ ÁÖ·Î »ç¿ë) => HTML(À¯¿¬¼º) => CSS
 *     3. toUpperCase()
 *     	  public String toUpperCase(): ´ë¹®ÀÚ º¯È¯ => ÄÃ·³¸í/Å×ÀÌºí¸í(¹è¿­)
 *     											  ---- ¸â¹öº¯¼ö
 *     											  ---- Å¬·¡½º(ROW)
 *     	  => String s="Hello"; => "HELLO"; ´ë¹®ÀÚ´Â ±×´ë·Î, ¼Ò¹®ÀÚ¸¸ ´ë¹®ÀÚ·Î º¯°æ
 *     4. toLowerCase()
 *     	  public String toUpeerCase(): ¼Ò¹®ÀÚ º¯È¯
 *     -----------------------------------------------------------------------
 *     °Ë»ö (À¥ => »ç¿ëÀÚ ¿äÃ»(°Ë»ö))
 *       1) startsWith: ½ÃÀÛ¹®ÀÚ¿­ÀÌ °°Àº °æ¿ì
 *       	public boolean startsWith(String prefix) => Á¢µÎ¾î ==> ÄíÅ° Ãâ·Â(ÃÖ±Ù ¹æ¹®)
 *       2) endsWith: ³¡³ª´Â ¹®ÀÚ¿­ÀÌ °°Àº °æ¿ì
 *       	public boolean endsWith(String suffix) => Á¢¹Ì¾î
 *       ***3) contains: ¹®ÀÚ¿­¾È¿¡ Æ÷ÇÔµÈ ¹®ÀÚ¿­
 *       	public boolean contains(String str) => ½ÇÁ¦ °Ë»ö
 *       4) equals: ¹®ÀÚ¿­ÀÌ °°Àº °æ¿ì(´ë¼Ò¹®ÀÚ ±¸ºĞ)
 *       	public boolean equals(String s) => ·Î±×ÀÎ Ã³¸®, ID Áßº¹Ã¼Å©, ÀÌ¸§ Ã£±â
 *       ***5) equalsIgnoreCase: ¹®ÀÚ¿­ÀÌ °°Àº °æ¿ì(´ë¼Ò¹®ÀÚ ±¸ºĞX)
 *       	public boolean equalsIgnoreCase(String s) => À¥: È¸¿ø°¡ÀÔ, ·Î±×ÀÎ, °Ô½ÃÆÇ, °Ë»ö±â
 *       *** »çÀÌÆ®: È¸¿ø°¡ÀÔ, °Ô½ÃÆÇ, °øÁö»çÇ×, °Ë»ö±â(ÇÊ¼ö)
 *       º¯°æ(¹®ÀÚ¿­ º¯°æ, Ãß°¡, Á¦°Å)
 *        1) concat ==> + ¹®ÀÚ¿­ °áÇÕ(MySQL¿¡¼­ concat)
 *        	 public String concat(String s)
 *        2) trim() ==> ÁÂ¿ìÀÇ °ø¹éÀ» Á¦°Å 
 *        	 public String trim(); ==> »ç¿ëÀÚÀÇ ½Ç¼ö ¹æÁö(space) ===> À¯È¿¼º °Ë»ç
 *        3) replace() ==> ¹®ÀÚ,¹®ÀÚ¿­ º¯°æ ==> ¿À¹ö·Îµù
 *        	 public String replace(char c1,char c2)
 *        	 public String replace(String s1,String s2)
 *        						   --------- ---------
 *        							old			new
 *        ***4) replaceAll()==> Á¤±Ô½Ä(Á¤±Ô½Ä: ¹®ÀÚ¿­ÀÇ ÆĞÅÏ ÀÌ¿ë)
 *        					[°¡-ÆR],[A-Za-z],[0-9]
 *        	 public String replaceAll(String pattern,String s)
 *        	 ** µ¥ÀÌÅÍ ºĞ¼®, AI ==> Á¤±Ô½Ä, Å©·Ñ¸µ(youtube)
 *        ***5) substring(): ¹®ÀÚ ÀÚ¸£±â
 *        	 ¿À¹ö·Îµù
 *        	 public String substring(int startIndex)
 *           public String substring(int startIndex, int endIndex)
 *           ¿¹)
 *           	String s="Hello Java";
 *           			  0123456789
 *           	s.substring(6) ==> "Java"
 *           	s.substring(0,5) ==> "Hello"
 *           				  - endIndex-1 ==> ¸¶Áö¸·À» Á¦¿Ü
 *       ---------------------------------------------------------
 *         ¹®ÀÚÀÇ À§Ä¡
 *         	***1) indexOf: ¾Õ¿¡¼­ºÎÅÍ Ã£±â
 *         		¿À¹ö·Îµù
 *         		public int indexOf(char c)
 *         		public int indexOf(String c)
 *         	***2) lastIndexOf: µÚ¿¡¼­ºÎÅÍ Ã£±â
 *         		public int lastindexOf(char c)
 *         		public int lastindexOf(String c)
 *          ***3) valueOf: ¸ğµç µ¥ÀÌÅÍÇüÀ» ¹®ÀÚ¿­·Î º¯È¯	==> À¯ÀÏÇÏ°Ô static, ¿À¹ö·ÎµùÀÌ ¸¹ÀÌ µÇ¾î ÀÖÀ½
 *          	public String value(int a)
 *          	public String value(double a)
 *          	public String value(char[] a)
 *          	public String value(boolean a)
 *   
 */
public class ¶óÀÌºê·¯¸®_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // charAt: public char charAt(int index): ÁöÁ¤µÈ À§Ä¡ÀÇ ¹®ÀÚ¸¦ ÀĞ¾î¿Ã ¶§ »ç¿ë(À¥¿¡¼­´Â »ç¿ëºóµµ °ÅÀÇ ¾øÀ½)
		/*String s="Hello Java";
		//		  0123456789
		char c=s.charAt(4);
		System.out.println("c="+c);*/
		// length(): public int length() => ¹®ÀÚÀÇ °³¼ö ÀĞ¾î¿Â´Ù(¿µ¹®,ÇÑ±Û µ¿ÀÏ)
		// length() ==> È­¸é UI¿¡ ±ÛÀÚ¼ö È®ÀÎ, ºñ¹Ğ¹øÈ£ °Ë»ç
		/*String e="ABC";
		String h="È«±æµ¿";
		System.out.println("eÀÇ ±ÛÀÚ¼ö:"+e.length());
		System.out.println("hÀÇ ±ÛÀÚ¼ö:"+h.length());*/
		String s="Hello Java";
		// public String toUpperCase()
		// public String toLowerCase()
		/*
		 * 	String s="Hello Java";
		 * 	s=s.toUpperCase();
		 * 	==> ¿øº» º¯°æ 
		 */
		System.out.println("´ë¹®ÀÚº¯È¯:"+s.toUpperCase());
		System.out.println("¼Ò¹®ÀÚº¯È¯:"+s.toLowerCase());
		// ¹®ÀÚ¿­¿¡ ÀúÀåµÈ µ¥ÀÌÅÍ´Â º¯°æÀÌ ¾ÈµÈ´Ù
		System.out.println("¿øº»:"+s);
		
	}

}
