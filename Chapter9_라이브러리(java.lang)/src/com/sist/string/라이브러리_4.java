package com.sist.string;
// concat, replace, replaceAll, substring, split
// indexOf, lastIndexOf, valueOf
public class ���̺귯��_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// concat: ���ڿ� ����(+)
		// ����: public String concat(String s)
		/*String s1="Hello ";
		String s2="Java";
		String s12=s1.concat(s2);
		System.out.println(s12);
		String s3=s1+s2;
		System.out.println(s3);*/
		//replace => �ܾ�/���ڿ� ����
		/*String s="Hello Java";
		String s1=s.replace('a', 'b'); //Hello Jbvb
		String s2=s.replace("Java", "Oracle");
		System.out.println(s1);
		System.out.println(s2);
		String ss="a.jpg&b.jpg&c.jpg"; //����Ŭ (& -> Scanner)
		String ss1=ss.replace("&", "^");
		System.out.println(ss1);*/
		//replaceAll ==> ���Խ� 
		// ����: public String replaceAll(String p,String s)
		String s="�ȳ��ϼ��� Hello 12345";
		// ��õ => �ش��ϴ� ��ȭ��,������ 
		// LIKE ==> REGEXP
		System.out.println("�ѱ۸� ���:"+s.replaceAll("[^��-�R]", ""));
		//^ => �����ϰ� [��-�R] => �ѱ� ��ü 
		System.out.println("��� ���:"+s.replaceAll("[^A-Za-z]", ""));
		System.out.println("���ڸ� ���:"+s.replaceAll("[^0-9]", ""));
		
		String ss="Hello Java";
		String ss1=ss.substring(6);
		System.out.println(ss1);
		String ss2=ss.substring(0,5);
		System.out.println(ss2); // �������� ����
		// ����: public String substring(int s): s���� ������ ��ü�� �о� �´�
		//		public String substring(int s,int e): s���� e-1������ �о�´�
		
		String sss="red,green,black,white,pink";
		String[] color=sss.split(",");
		for(String c:color)
		{
			System.out.println(c);
		}
		//����: String[] split(String regex) ==> ���Խ� �̿� ==> \\(|)
		// ���Խ� ��ȣ: . | ^ ? + * ==> \\. \\| \\^ \\? \\+ \\*
		
		// IndexOf / lastIndexOf => �ش繮���� ��ġ��
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
		String m=temp3.trim(); // �¿쿡 ���� ����
		System.out.println(m.length());
		//����: public String trim()
		// valueOf(): ���ڿ� ��ȯ
		int a=10;
		int b=20;
		String p1=String.valueOf(a); //"10"
		String p2=String.valueOf(b); //"20"
		System.out.println(p1+p2);
		// ������ / �� ==> ���ڿ�
		
		// String / Collection:CURD / read, write
		// Wrapper ==> Integer => parseInt
	}

}
