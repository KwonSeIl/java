/*
 *  char (���ڸ� �����ϴ� �޸��� ũ��) => 2byte(0~65535) = unicode
 *  �ʱⰪ ����: 'A' ==> ��� ���ڴ� ��ȣ�� ����
 *  				 ���� ����� ���� ���ڰ� ����� 
 *  				 'A' ==> 65
 *  				 ==> 100001
 *  		�ʱⰪ�� ������ �� '' -> ����. ' '�� ����
 *  		==>char�� ����ó���� ���ڷ� ����� 
 *  		'A'+1
 *  		---
 *  		65 + 1 ==> 66 ���������� ��޵� �� ���� 
 *  �Ǽ� �ʱ�ȭ
 *  float f=10.5; ==> ���� ==> f=10.5F(f)
 *  		----
 *  		double �����(8byte)
 *  boolean ==> true/false
 */
public class �����ʱ�ȭ_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println('A'); //  char���
		System.out.println((int)'A'); // int�� ��ȯ�ؼ� ���
		System.out.println((double)'A');
		//System.out.println(0b100001);
		//System.out.println(Integer.toBinaryString((int)'A')); 2���� ���
		//char c='';
		float f=10.5F;
		double d=10.5;
		d=10.5d;
		boolean b=true;
		b=false;
		
		final int K=100; // ���(����Ұ��� ����) => ����� ��� ���ĺ��� �빮�ڷ� ��� 
		// k=1000; ->����
		
		
		

	}

}
