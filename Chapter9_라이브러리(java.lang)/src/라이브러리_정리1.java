/*
 * 	java.lang => ����) import�� �����Ѵ�
 * 	---------
 * 	Object: ***clone / ***toString / equals / getClass / ***finalize
 * 	String: ***substring / ***length / ***trim / ***split / ***replace / *indexOf / *lastIndexOf
 * 			***valueOf / **startsWith / **contains / *****equals
 * 	----------------
 * 	StringBuffer
 * 	Wrapper
 * 	System
 * 	Math
 * 	------------------- ��(������, ��Ʈ��ũ, ����, NIO:Application)
 * 	Date/Calendar/Collection/IO(File)
 * 	---------------------------------
 * 	java.sql
 */
public class ���̺귯��_����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello Java";
		char[] c=s.toCharArray(); // ����ؾ� �� : ���ڿ��� char�� �ٲٴ� ����
		for(char ch:c)
			System.out.println(ch);
		
		String ss=String.valueOf(c);
		System.out.println(ss);
		
	}

}
