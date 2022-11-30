package com.sist.string;
/*
 *  String Ŭ����(�� => ���������� ���ڿ��� ����)
 *   1) ���ڿ��� �����ϴ� �������� / Ŭ������
 *   2) Object�κ��� ����� ���� Ŭ����
 *   3) String Ŭ������ finalŬ���� -> ������ �Ұ����� Ŭ����(�ִ� �״�� ���̺귯���� ����ؾ� �Ѵ�) => �������̵� �Ұ�
 *   				 -------- Ȯ���� �� �� ���� Ŭ����(���� Ŭ����) 
 *   				 Math,StringBuffer,StringBuilder,System, Wrapper => ����
 *   4) ����
 *   	String ������="";   => ""��ü�� �ּҿ� �ش�� ==> char[] ������={'','',''}
 *   	"Hello" "Hello"
 *   	-------------- ���� �ּҸ� ������ �ִ�(���� ���ڿ��� ���� �ּҸ� ������ �ִ�) 
 *   	���ο� ������ ���� => new String("")
 *   	��)
 *   		String s1="Hello";
 *   		String s2="Hello";
 *   		------------------- ���� �ּ�
 *   		String s3=new String("Hello");
 *   		----------------------------- �ٸ� �ּҿ� ����
 *   5) �ֿ�޼ҵ�(�ڹٽ�ũ��Ʈ�� ����)
 *     1. public char charAt(int index): ���ڿ����� ���ϴ� ��ġ�� ���� �� �� ����
 *     	  		 ----		  ---------
 *     	  *** �ڹٿ��� ����ϴ� ��� ���ڿ��� �ε��� ��ȣ�� 0������ ����
 *     	  String s="0123156789";
 *     	  s.charAt(3) ==> '3'
 *     	  String s="ABCDEFG";
 *     				0123456
 *     	  s.charAt(5) ==> 'F'
 *     2. length(): ���� ������ ������ �´�
 *     	  public int length()
 *        String s="Hello"; => s.length() ==> 5 (�ѱ۵� ������)
 *        String s="�ȳ��ϼ���"; => s.length() ==> 5
 *        ==> ���ó: ȭ�� UI (���ڼ��� �����ϰ� ����� ��쿡 �ַ� ���) => HTML(������) => CSS
 *     3. toUpperCase()
 *     	  public String toUpperCase(): �빮�� ��ȯ => �÷���/���̺��(�迭)
 *     											  ---- �������
 *     											  ---- Ŭ����(ROW)
 *     	  => String s="Hello"; => "HELLO"; �빮�ڴ� �״��, �ҹ��ڸ� �빮�ڷ� ����
 *     4. toLowerCase()
 *     	  public String toUpeerCase(): �ҹ��� ��ȯ
 *     -----------------------------------------------------------------------
 *     �˻� (�� => ����� ��û(�˻�))
 *       1) startsWith: ���۹��ڿ��� ���� ���
 *       	public boolean startsWith(String prefix) => ���ξ� ==> ��Ű ���(�ֱ� �湮)
 *       2) endsWith: ������ ���ڿ��� ���� ���
 *       	public boolean endsWith(String suffix) => ���̾�
 *       ***3) contains: ���ڿ��ȿ� ���Ե� ���ڿ�
 *       	public boolean contains(String str) => ���� �˻�
 *       4) equals: ���ڿ��� ���� ���(��ҹ��� ����)
 *       	public boolean equals(String s) => �α��� ó��, ID �ߺ�üũ, �̸� ã��
 *       ***5) equalsIgnoreCase: ���ڿ��� ���� ���(��ҹ��� ����X)
 *       	public boolean equalsIgnoreCase(String s) => ��: ȸ������, �α���, �Խ���, �˻���
 *       *** ����Ʈ: ȸ������, �Խ���, ��������, �˻���(�ʼ�)
 *       ����(���ڿ� ����, �߰�, ����)
 *        1) concat ==> + ���ڿ� ����(MySQL���� concat)
 *        	 public String concat(String s)
 *        2) trim() ==> �¿��� ������ ���� 
 *        	 public String trim(); ==> ������� �Ǽ� ����(space) ===> ��ȿ�� �˻�
 *        3) replace() ==> ����,���ڿ� ���� ==> �����ε�
 *        	 public String replace(char c1,char c2)
 *        	 public String replace(String s1,String s2)
 *        						   --------- ---------
 *        							old			new
 *        ***4) replaceAll()==> ���Խ�(���Խ�: ���ڿ��� ���� �̿�)
 *        					[��-�R],[A-Za-z],[0-9]
 *        	 public String replaceAll(String pattern,String s)
 *        	 ** ������ �м�, AI ==> ���Խ�, ũ�Ѹ�(youtube)
 *        ***5) substring(): ���� �ڸ���
 *        	 �����ε�
 *        	 public String substring(int startIndex)
 *           public String substring(int startIndex, int endIndex)
 *           ��)
 *           	String s="Hello Java";
 *           			  0123456789
 *           	s.substring(6) ==> "Java"
 *           	s.substring(0,5) ==> "Hello"
 *           				  - endIndex-1 ==> �������� ����
 *       ---------------------------------------------------------
 *         ������ ��ġ
 *         	***1) indexOf: �տ������� ã��
 *         		�����ε�
 *         		public int indexOf(char c)
 *         		public int indexOf(String c)
 *         	***2) lastIndexOf: �ڿ������� ã��
 *         		public int lastindexOf(char c)
 *         		public int lastindexOf(String c)
 *          ***3) valueOf: ��� ���������� ���ڿ��� ��ȯ	==> �����ϰ� static, �����ε��� ���� �Ǿ� ����
 *          	public String value(int a)
 *          	public String value(double a)
 *          	public String value(char[] a)
 *          	public String value(boolean a)
 *   
 */
public class ���̺귯��_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // charAt: public char charAt(int index): ������ ��ġ�� ���ڸ� �о�� �� ���(�������� ���� ���� ����)
		/*String s="Hello Java";
		//		  0123456789
		char c=s.charAt(4);
		System.out.println("c="+c);*/
		// length(): public int length() => ������ ���� �о�´�(����,�ѱ� ����)
		// length() ==> ȭ�� UI�� ���ڼ� Ȯ��, ��й�ȣ �˻�
		/*String e="ABC";
		String h="ȫ�浿";
		System.out.println("e�� ���ڼ�:"+e.length());
		System.out.println("h�� ���ڼ�:"+h.length());*/
		String s="Hello Java";
		// public String toUpperCase()
		// public String toLowerCase()
		/*
		 * 	String s="Hello Java";
		 * 	s=s.toUpperCase();
		 * 	==> ���� ���� 
		 */
		System.out.println("�빮�ں�ȯ:"+s.toUpperCase());
		System.out.println("�ҹ��ں�ȯ:"+s.toLowerCase());
		// ���ڿ��� ����� �����ʹ� ������ �ȵȴ�
		System.out.println("����:"+s);
		
	}

}
