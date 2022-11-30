/*
 * 	java.lang => 장점) import를 생략한다
 * 	---------
 * 	Object: ***clone / ***toString / equals / getClass / ***finalize
 * 	String: ***substring / ***length / ***trim / ***split / ***replace / *indexOf / *lastIndexOf
 * 			***valueOf / **startsWith / **contains / *****equals
 * 	----------------
 * 	StringBuffer
 * 	Wrapper
 * 	System
 * 	Math
 * 	------------------- 웹(쓰레드, 네트워크, 람다, NIO:Application)
 * 	Date/Calendar/Collection/IO(File)
 * 	---------------------------------
 * 	java.sql
 */
public class 라이브러리_정리1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello Java";
		char[] c=s.toCharArray(); // 기억해야 함 : 문자열을 char로 바꾸는 형식
		for(char ch:c)
			System.out.println(ch);
		
		String ss=String.valueOf(c);
		System.out.println(ss);
		
	}

}
