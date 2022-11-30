/*
 *  1. ����
 *  	�ν��Ͻ� ����
 *  	[����������][�ɼ�] �������� ������;
 *  	--------
 *  	private, protected, public, default
 *  								-------
 *  								����: ������ Ʋ�� ��쿡�� ������ �Ұ���
 *  		�ɼ� => static, final
 *  	��) int a; //���� ���� => ȣ�� �� �ݵ�� ��ü ������ ��� ���� (�ν��Ͻ���.������)
 *  		static int b; //���� => �ڵ� ����-> Ŭ���������� ������ ����(Ŭ������.������)
 *  		final int c=����� ����;  //���
 *  		------------------- ȣ��
 *  	Ŭ���� ����: static
 *  2. �޼ҵ�: ����, ���� => �۾��� �� �� �ִ� ��ɾ��� ����
 *  	�α����� �Ѵ�
 *  	�α׾ƿ��� �Ѵ�
 *  	����� �����ش�
 *  	�޴��� Ŭ���Ѵ�
 *  	�̹����� Ŭ�� �� �󼼺����Ѵ�
 *   	������ �Ѵ�
 *   
 *   	����
 *   	[����������][�ɼ�] ������ �޼ҵ��(�Ű�����...) ==> �����
 *   			static|final|abstract
 *   	{
 *   		������
 *   		return ��; => void�� ��쿡�� ���� ����
 *   	}
 *  ------------�ٽ�
 *  Ŭ����(������Ʈ) 
 *  	----------------
 *  	=> �ʿ��� ������(�̸�, ��¥, ��ȸ��, ����,����,���)
 *  	��) �۾��� -> �޼ҵ�
 *  		�����ϱ� -> �޼ҵ�
 *  		�����ϱ� -> �޼ҵ�
 *  		������ -> �޼ҵ�
 *  		�󼼺��� -> �޼ҵ�
 *  		�˻��ϱ� -> �޼ҵ�
 *  		------------------- �Խ��� ���
 *  		�޼ҵ� => ������ / �Ű�����(������ ����) => Call By Value(�޼ҵ忡���� ����),
 *  										Call By Reference(�迭, Ŭ���� ��ü ����)
 *  				---- �Ѱ�(�迭, Ŭ����)
 *  	 * �ν��Ͻ� �޼ҵ� => �ν��Ͻ��޼ҵ� ȣ��, �ν��Ͻ� ����, static ����, static �޼ҵ� => ��� ����
 *  		static  �޼ҵ� => static�� ȣ���� ����(static����, static �޼ҵ�)
 *  						�ν��Ͻ� ����, �ν��Ͻ� �޼ҵ� ���ÿ���
 *  						�ݵ�� ��ü �����Ŀ� ������ ����
 *  						---------------------------------- �����ͺ��̽�(static)
 *    -----------CBD
 *  �����ε�: ������ 
 *  	283page
 *  	=======
 *  	1) �ϳ��� �޼ҵ������ �������� ����� ���� �� ����(���ο� �߰�)
 *  	2) �޼ҵ���� ���� �� ����
 *  		--------------����� ����
 *  		println(int a)	
 *  		println(boolean b)	
 *  		println(char[] c)
 *  		println(double d)
 *  		println(String s)
 *  		...
 *  	3) ��ư => onClick(String id,String pwd)
 *  			 onClick(int b)
 *  
 *  	1. �����ε��� ����
 *  		1) ���� Ŭ���������� ���� �޼ҵ���� ������ ����
 *  			-------------------
 *  		2) �Ű������� ������ �ٸ���, �Ű������� ���������� �ٸ���
 *  				  --------			-----------
 *  		3) �������� ���� ����
 *  			----------
 *  		��)
 *  			=> void display() ����
 *  			1. int display() (X)
 *  			2. char display(int a) (O)
 *  			3. void display(char c) (O)
 *  			4. char display(int a,int b) (O)
 *  			5. double display(double d1, double d2) (O) 
 *  			
 *  			=> void display(int a,char c,double d2)
 *  				void display(float a,int c,int d2)
 *  				void display(double a,double c,double d2)
 *  				void display(int a,int c,int d2)
 *  
 *  				display(10.0,'A',10.5F)
 *  					  double char float
 *  				void data(int a)
 *  		
 *  				=> data(10)
 *  					data('A') data(byte,short)
 *  					
 *  				1. ���� �Ű�����
 *  				2. ū �������� ����
 *  	
 *  				
 */
public class �����ε�_1 {
	static final int c=100;
	void display(char c,int i,long l)
	{
		System.out.println("display(char c,int i,long l) Call...");
	}
	int  display(int c,int i,double l)
	{
		System.out.println("display(int c,int i,double l) Call...");
		return 0;
	}
	double display(double c,double i,double l)
	{
		System.out.println("display(double c,double i,double l) Call...");
		return 0.0;
	}
	long display(float c,float i,float l)
	{
		System.out.println("display(float c,float i,float l) Call...");
		return 0L;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		�����ε�_1 a=new �����ε�_1();
		//a.display(10, 10, 10);
	}

}
