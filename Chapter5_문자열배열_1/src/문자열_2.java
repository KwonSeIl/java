import java.util.Arrays;

// concat: ���ڿ� ����
// concat(���ڿ�,���ڿ�) ==> ���ڿ�+���ڿ�
public class ���ڿ�_2 {

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
		// ���ڿ� -> ��� ���� �� ���ڿ� ������� ����. �� ������ ����X
		System.out.println(s1);
		s1=s1.substring(3);
		System.out.println(s1);
		System.out.println(s1);
		
		//��ȯ
		String msg="Hello Java";
		//a -> b�� �ٲٱ� => Hello Jbvb
		System.out.println(msg.replace("a","b"));
		
		String msg1="ȫ�浿 version 2!!"; //ũ�Ѹ� �ϴٺ��� ���|120��|
		System.out.println(msg1.replaceAll("[^��-�R]", ""));
		//[��-�R]		[A-Za-z]	[0-9]
		System.out.println(msg1.replaceAll("[^A-Za-z]", ""));
		System.out.println(msg1.replaceAll("[^0-9]", ""));
		
		String movie="����, ������ |�ѱ� |105�� |2022 .10.26 ����";
		String[] m=movie.split("\\|"); // |�� ����� �� �ݵ�� \\ �ٿ��� ��
		// ^,|,?,.,+ �ݵ�� \\ ����� 
		System.out.println(Arrays.toString(m));
		
	}

}
