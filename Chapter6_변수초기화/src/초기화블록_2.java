class A
{
	int a;
	static int b=20;
	
	{
		a=100;
	}
	
	static
	{
		b=200;
	}
	
	A()
	{
		a=1000;
		b=2000;
	}
}
/*
 * 	1. ����� �ʱ�ȭ
 *  2. ����� �ʱ�ȭ�� �Ұ���
 *  	�ν��Ͻ�: �����ڸ� �̿��ؼ� �ʱ�ȭ(*******)
 *  	static: static{} => ���� (MyBatis)
 */
public class �ʱ�ȭ���_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		/*	
		 * 	  b
		 * 	-----	----	----	-----
		 * 	  0		 20	 	 200	 2000
		 * 	-----	----	----	-----
		 * 	  a		
		 * 	-----	----	----	-----
		 * 	  0		 10		 100	 1000
		 * 	-----	----	----	-----
		 */
	}

}
