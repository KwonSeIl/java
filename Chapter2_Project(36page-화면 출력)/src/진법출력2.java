/*
 *  2����: 0,1
 *  8����: 011,012...
 *  16����: 0x~~
 *  -----���α׷�(10���� ���)
 *  
 *  165
 *  --- 2���� ��ȯ
 *   128 64 32 16 8 4 2 1(0)
 *    1   0  1  0 0 1 0 1 =>10100101
 *   10100101 
 *   ---------8���� ��ȯ
 *   	  ---- 5
 *     ---4
 *   --2
 *   =>0245 
 *   10100101
 *   --------16���� ��ȯ
 *   	 ----5
 *   ----a
 *   =>0xa5
 *
 *  ���� ǥ�� => 1~~
 *   10
 *    =>2����: 00001010
 *    	1�� ������ ��ȯ: 11110101
 *    	2�� ����:		+	    1 => 11110110
 *    	2�� ���� ==> 00001010
 *    			   ------
 *    			   11110110
 *     -------------------------------����ó��, ����
 *  Application / �Ӻ����(�����) / WEB
 *  							---���� -> web�� �ʿ��� �ڹ�    
 *  2��==>41page���� 
 *  	 42~71page ==> ��ŵ
 *  	 72page ���� (����ȯ)
 *  
 *  ����ȯ: int -> double
 *  	  double -> int
 *  	  char -> int, double 
 *  	  => �ڵ�����ȯ, ��������ȯ (��������, Ŭ����) 
 *  		----------------------------
 *  		int + double 
 *  		---> double
 *  		=>double+double => double => ����ÿ��� �׻� ū������������ ���� => ���� 
 *  
 *  		char + int
 *  		----> int
 *  		=> int+int => int
 *  		===========================
 *   		������ ���� �Է��� �� 
 *   		 int a='A'
 *   				--> int�� ��ȯ(65) ==> 65
 *   		 ���� = ��
 *   		 --- ������ ũ�ų� ���ƾ� �� 
 *   
 *   		 int a=10.5 -> ���� => (int)10.5�� ���� (������ȯ) 
 *   			   ----double 
 *   		 double d=10; ==> d=10.0
 *   		 double d='A' ==> d=65.0 ==> �ڵ����� ��ȯ 
 *   		--------------------------------------
 *   		byte + char = int
 *   		byte + byte = int
 *   		=> int ���� ���������� ����Ǹ� int 
 *   		   ---- byte, short, char 
 *   
 *   		'A'+'B' ==>
 *   		--- ---
 *   		65	66 ==> 131
 *  			
 */
public class �������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.out.println(Integer.toBinaryString(165));
		 * System.out.println(Integer.toOctalString(165));
		 * System.out.println(Integer.toHexString(165)); System.out.println(~165); // ~:
		 * �������
		 */
		byte b1=10;
		byte b2=20;
		//int b3=(byte)(b1+b2); /=>�����÷ο� �߻�
		int b3=(b1+b2); // int, long, double, float
		System.out.println(b3);
	}

}
