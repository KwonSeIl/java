import java.util.Arrays;

import javax.swing.Spring;

/*
 * 	���ڿ� ���� ��������(�ڹ�)==> "", char==> ''
 * 	-------------
 * 	String���� ����
 * 	------���ڿ��� �����ϴ� ���, ���ڿ��� �����ϴ� ��� (���̺귯��)
 * 	 1) ���� ���
 * 		*** String s=""; => ���� ���� ���Ǵ� ���(�⺻��ó�� ���-> ����ϱ� ����) => ���� 90%���� ���(��� �����Ͱ� ���ڿ��� �Ǿ�����)
 * 		String id="admin" => char[] c={'a','d','m','i','n'}
 * 		------> char[]�� ����ϱ� ���� ���� Ŭ����
 * 		String s=new String("");
 * 	 2) String ���
 * 		1. ���� ��ȯ
 * 		 1) toUpperCase: ���ĺ� �빮�� ��ȯ 
 * 		 2)	toLowerCase: �ҹ��� ��ȯ
 * 		 ****3)	valueOf: ��� ���������� ���ڿ��� ��ȯ
 * 				int a=10;
 * 				valueOf(a) ==> "10" ==> parseInt("10") ==> 10
 * 				boolean b=true ==>parseBoolean("true") ==> true
 * 				valueOf(b) ==> "true"
 * 		2. ���� ����
 * 		 *****1) substring(): ���ڿ� �ڸ� �� ���(ȭ�� UI���� �����) 
 * 		3. ���� ����
 * 		 ***1) trim(): �¿� ���� ������ �� ���(�Է�)
 * 		 2) replace(): ���� ������ �� ��� ==> ����Ŭ(ũ�Ѹ�)==> �̹��� ����
 * 			replace('&','^')
 * 		 3) replaceAll(): ���Խ�(��������)
 * 			ip ã��
 * 			replaceAll("[0-9]{1,3}\\[0-9]{1,3}\\.[0-9]{1,3}")
 * 						127.1.63.200
 * 						���ִ� ���ְ� ���ְ�... ---> ����+ ==> �м�(������,AI)
 *  	 4) split(): ���ڿ��� �迭�� ����
 *  		String s="red,blue,green";
 *  		String[] arr=s.split(",") ===> {"red","blue","green"}
 * 		4. ���� ��
 * 		 ***1) equals(): ��ҹ��� ���� �� ��(�α���, ID �ߺ�üũ, ID ã��, �󼼺���)
 * 		 2) contains(): ����(�˻�)
 * 		 3) startsWith: ������Ʈ ���� �� �����(���۴ܾ� ã��)
 * 		 4) endsWith: ������ �ܾ� ã��
 * 			--------------------------> �˻��� 
 * 		5. ���� ã��
 * 		 ***1) indexOf: �տ������� ������ ã��
 * 			String s="Hello java"
 * 			s.indexOf("a"); -> ja�� a ã��
 * 		 2)lastIndexOf: �ڿ������� ������ ã��
 * 			s.lastIndexOf("a") -> va�� a ã�� 
 * 		6. ��Ÿ
 * 		 1) concat("a","b") ==> ab ==> + ������ �־� ���� ���X
 * 		 "a"+"b" => "ab"
 * 		 ***2) charAt() : ���� �Ѱ��� ������ �� �� ���
 * 		 3) toCharArray(): ���ڿ��� char[]�� ����
 * 		----------------------------------------��� / �뵵 / ���ó ����
 */
public class ���ڿ�_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String string="Hello Java";
		char[] c=string.toCharArray();
		System.out.println(Arrays.toString(c)); */
		
		//1. ����(���ڿ�) ����
		//String msg="Hello Java";
		String msg;
		//char[] ==> 
		/*
		 * 	"Hello Java" => {'H','e','l','l',...}
		 * 	 0123456789 �� �ε���
		 * 	 charAt(0) ==> 'H'
		 * 	
		 */
		//2. �ʱ�ȭ
		msg="Hello Java"; //�̷� ���� �Է°� �ްų� ���� �б��� ��, �����ϰ� ���߿� �ʱ�ȭ��
		
		//3. Ȱ��(��ûó��)
		//1) ������ ����Ȯ��(length()) ==>
		System.out.println(msg.length()); //���鵵 ���ڷ� �����. ��й�ȣ �ڸ��� ����� �� ��� ��
		//2) ������ ����
		System.out.println(msg.trim().length()); //�¿쿡 �ִ� ���鸸 ���� ����. �Է°��� ����ڰ� �Է��� �� �����(�Ǽ� => space)
		//3) �빮�ڷ� ��ȯ
		System.out.println(msg.toUpperCase()); //�˻��� �� ���
		//4) �ҹ��ڷ� ��ȯ
		System.out.println(msg.toLowerCase()); //�˻��� �� ���
		// ==> �ѱ� �˻��� �� ����� -> �������� ã��=> �޼ҵ�
		//5) �ڸ��� substring()
		/*
		 * 	substring(int start) =>������ ��ġ����
		 * 	substring(int start,int end)=>
		 */
		System.out.println(msg.substring(6));
		System.out.println(msg.substring(0,5)); //end�� ����-> �ϳ� �� Ŀ�� ��
		String post="101-123";
		//101, 123
		System.out.println(post.substring(0,3));
		System.out.println(post.substring(4));
		String fileName="���ڿ�_1.java";
		System.out.println(fileName.substring(6));
		//���ϸ� ==> ���ڿ�.1.java�� ���� 
		System.out.println(fileName.substring(fileName.lastIndexOf(".")+1));
		System.out.println(msg.indexOf("a"));
		System.out.println(msg.lastIndexOf("a"));
		//4. ���
		/*
		 *  ���̺귯�� ���� ��
		 *  1. �޼ҵ��(���)
		 *  2. �Ű�����
		 *  3. ������
		 */

	}

}
