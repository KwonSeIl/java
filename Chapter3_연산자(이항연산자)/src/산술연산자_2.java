/*
 *  ��������� => �����ȯ***
 *  		  : ������ ������ ���� ���������̾�� ����ó���� ��
 *  						 -----
 *  			�ٸ� ���������� ����Ǹ� ū ������������ ���� �� ����ó���� ��(�ڵ�����ȯ) 92page
 *  							  -------> �ڵ�
 *  							  ��)
 *  							   int + double = double
 *  							   --- double�� ���� -> double+double
 *  
 *  							   int+char = int
 *  								   ---- int�� ���� -> int+int
 *  							   *** int ���� ��������( byte, char)=> ����� int
 *  								char+byte =int
 *  								char+char=int
 *  								byte+byte=int
 *  
 *  							  ���� ������������ ������ ����ó�� -> ����
 *  							   double+int =int
 *  							   ------int�� ���� => (int)double+int
 *  		*** �������� ���� �Ǹ� => ���� ū ���������� ��� ������ ��
 *  			char + int +double = double
 *  			---- int
 *  			----------double ====> double+double
 *  
 *  			byte < char < int < long < float < double
 *  
 */
public class ���������_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int c='A'+'B';
		//System.out.println(c);
		byte b1=10;
		byte b2=20;
		byte b3=(byte)(b1+b2); // ����� int
		System.out.println(b3); // �����÷ο� �߻��� �� ���� => ����: int�� �޾Ƽ� ����
		
		char c='A';
		int d=100;
		int k=c+d;
		// c=65 ==> 65+100=165
		System.out.println(k);
		
		//int m=10.5+10.5; -> ����
		// m = 4byte, 10.5+10.5 = 8byte => �����޸𸮿� ���� �Ұ�-> ���� �߻� (�����ʿ� �ִ� �����Ͱ� �۰ų� ���ƾ� ��)
		int m=(int)10.5+(int)10.5;
		/*
		 *  (int)10.5 ==> 10 -> �Ҽ��� ����
		 *  (int)10.5 ==> 10
		 *  10+10=20
		 *  (type) > ��������ں��� ������ ����
		 */
		int n=(int)(10.5+10.5); // �������� �� ���
		// ���Ϲ���, ���, Mnet ==> 
		/*
		 *  (): �ֿ켱 ���� ==> 10.5+10.5 = 21.0
		 *  (int)21.0 = 21
		 */
		System.out.println("m="+m);
		System.out.println("n="+n);
		

	}

}
