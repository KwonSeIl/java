/*
 * 1. �������
 * 	.java (���üҽ�: ���α׷��Ӹ� �ƴ� �ڵ�)
 * 	.class (�����ϵ� ����: 0,1������� ���̳ʸ� ����=>��ǻ�͸� �˾ƺ� �� �ִ� ���)
 * Hello.java =======> Hello.class ======>JVM(main�� ����) ==>ȭ��
 * 			   javac 				java
 * 
 * 2. ����: �����Ͱ��� ���α׷�(�޸𸮿� �Ѱ��� �����͸� �����ϴ� ����)
 * 3. ������ ���� ���
 * 		1) ���ĺ�,�ѱ۷� ���� (���ĺ��� ��ҹ��� ����) 
 * 		2) ���ڻ�� ����(�տ��� ���X)
 * 		3) Ư������(_,$) ==>$abc, main_class, main$class ==> $�� ���� ����
 * 						 _��, �ڿ�==> �ӽ�����, �ӽú���
 * 		4) Ű���� ���X ==> public, int, double
 * 		5) �������� �ƴ�
 * 		   ����: �ҹ��ڽ���
 * 		   ���: ��� ���� �빮�� 
 * 	  �������� (�⺻��: �ڹٿ��� �����ϴ� �޸� ũ��)
 * 	  ����
 * 		byte(-128~127:8bit=1byte)
 * 		int(��� ������ int�� �ν�, -21�� 4õ~21�� 4õ. 32bit=4byte)
 * 		long(64bit=8byte)
 * 		==>int, long ���нÿ� ���̾� ��� (L,l) ==> 100L, 100
 * 	  �Ǽ�
 * 		double(8byte ==> �Ҽ��� 15�ڸ�)
 * 	  ����
 * 		char(2byte ==>unsigned(���� ���� ����)0~65535 => ��繮�ڿ��� �������� ���)
 * 			'A':65 'a':97 '0':48==> �ƽ�Ű �ڵ尪
 * 			==> char�� ����ÿ� ���������� ���� 
 * 	  ��
 * 		boolean (1byte==> true/false). �ٸ����α׷���(false:0,0.0)==>true==>���׿�����, ���ǹ�, �ݺ���
 * 	  �ʱⰪ
 * 		byte _byte=1;
 * 		short _short=2;    ===> _byte 
 *		int _int=3;   ===> _byte,_short,_char
 *		long _long=4L;    ====> _byte,_short,_char, _int
 *		char _char='A';    ====> _byte
 *		float _float=10.1F;   ====>_byte,_short,_char,_int,_long
 *		double _double=10.2;    ==>_byte,_short,_char,_int,_long,_float
 *
 *		��)
 *		double d=10.5;
 *				 ------
 *					'A'  ==>65.0 ����
 *					10  ==> 10.0
 *					10.5F ==> 10.5
 *					10L ==> 10.0
 *		int i=10;
 *			  'A'
 *			  10L (X)
 *			  10.5(x)
 *			  10.5F(x)
 *		������ ũ��
 *		byte < short < int <long < float < double 
 *				char
 *		------------------------------------------
 *		���ڿ� "" ==> �������� ���� ��� ==> ���ڿ� ���� ����(string)
 *		����: +
 *		"a="+7 ==> "a=7"
 *		7+"a" ==> "7a"
 *		
 */
public class ���������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int rank=2; 
		 
		System.out.println(rank+"��");
		rank++;
		System.out.println(rank+"��"); */
		double d=10.5;
		System.out.println("d="+d);
		d='A'; // char ==> double�� �ڵ���ȯ 'A'==>65.0
		System.out.println("d="+d);
		d=10; //int ==> double 10 ==> 10.0
		System.out.println("d="+d);
		d=10L;
		System.out.println("d="+d);
		d=10.7F;
		System.out.println("d="+d);
		
		long a=(long)10.5F;
	}

}
