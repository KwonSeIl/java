/*
 *  ���׿����� 
 *   1. ����������: ++,--
 *   	++: ���� 1 ����(������ ����)
 *   	--: ���� 1 ����(������ ����)
 *   	 1) ��ġ ������
 *   		++a ==> �ٸ� ������ ���Խ� => ���� ���� �� ����
 *   				b=++a ==> b=a
 *   				  ---����1
 *   				--����2
 *   	 2) ��ġ ������ 
 *   		a++ ==> �ٸ� ������ ���Խ� => ���� ���� �� �� ���߿� ����
 *   				b=a++
 *   				---����1
 *   				  ----����2 
 *   2. ����������: ! => boolean�� ��� ����(treu => false, false =>true)
 *   3. ����ȯ������: (type)
 *   	�ڵ�����ȯ => ������ ���� ����,����ó�� �� 
 *   			  int a='A';
 *   			  double d=10;
 *   			  int + double = double
 *   			  char + char = int
 *   
 *   	��������ȯ ==> ���̺귯������ ������ ���� -> ������ ���� 
 *   		(double)10 => 10.0
 *   		(int)'A' => 65
 *   		(char)65 => 'A'
 */
public class ���׿��������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.out.println("1" + "2"); System.out.println(true + "");
		  System.out.println('A' + 'B'); System.out.println('1' + 2);
		  System.out.println('1' + '2'); System.out.println('J' + "ava" );
		 

	}

}
