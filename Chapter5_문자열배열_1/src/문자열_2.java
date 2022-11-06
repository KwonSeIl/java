import java.util.Arrays;

// concat: ¹®ÀÚ¿­ °áÇÕ
// concat(¹®ÀÚ¿­,¹®ÀÚ¿­) ==> ¹®ÀÚ¿­+¹®ÀÚ¿­
public class ¹®ÀÚ¿­_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  int a=10;
		 *  a=5;
		 *  
		 *  String s1="Hello";
		 *  s1="lo";
		 */
		String s1="Hello ";
		String s2="Java!!";
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2);
		// ¹®ÀÚ¿­ -> ±â´É ¼öÇà ÈÄ ¹®ÀÚ¿­ º¯°æµÇÁö ¾ÊÀ½. Áï ¿øº»Àº º¯°æX
		System.out.println(s1);
		s1=s1.substring(3);
		System.out.println(s1);
		System.out.println(s1);
		
		//º¯È¯
		String msg="Hello Java";
		//a -> b·Î ¹Ù²Ù±â => Hello Jbvb
		System.out.println(msg.replace("a","b"));
		
		String msg1="È«±æµ¿ version 2!!"; //Å©·Ñ¸µ ÇÏ´Ùº¸¸é µå¶ó¸¶|120ºÐ|
		System.out.println(msg1.replaceAll("[^°¡-ÆR]", ""));
		//[°¡-ÆR]		[A-Za-z]	[0-9]
		System.out.println(msg1.replaceAll("[^A-Za-z]", ""));
		System.out.println(msg1.replaceAll("[^0-9]", ""));
		
		String movie="¹üÁË, ½º¸±·¯ |ÇÑ±¹ |105ºÐ |2022 .10.26 °³ºÀ";
		String[] m=movie.split("\\|"); // |´Â Ãâ·ÂÇÒ ¶§ ¹Ýµå½Ã \\ ºÙ¿©¾ß ÇÔ
		// ^,|,?,.,+ ¹Ýµå½Ã \\ Áà¾ßÇÔ 
		System.out.println(Arrays.toString(m));
		
	}

}
