//21page ���� => �ʱⰪ => ������ ����ϱ� ���� ó������ ���� ���� ����(�ʱ�ȭ)
/*
 *  1. ����� ���ÿ� �ʱ�ȭ
 *  	int a=10;
 *  2. ���� �� ���߿� �ʱ�ȭ ==> �Է°��� �޾Ƽ� ����, ���� ����
 *  	int a;
 *  	a=100;
 *  
 *  �ܾ�
 *   => type : ��������
 *   => ���ͷ� : ���� ��
 *   	int a=100
 *   	type : int
 *   	���ͷ� : 100
 *   	������ : a
 *   ------------------------------
 *   
 */
public class �����ʱ�ȭ {
	// ���� ==> �������, �������� => �ڵ� �ʱ�ȭ
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� => �������� ==> �ݵ�� �ʱ�ȭ�� �Ŀ� ��� ����(���, ����ó��)
		int a=10;
		int b=20;
		System.out.println("a="+a+",b="+b);
		
		int c=a; // �ӽú��� ���� == sort�� �� ����
		a=b;
		b=c;
		
		System.out.println("a="+a+",b="+b);
		/*
		int a;
		a=(int)(Math.random()*100)+1; //����
		System.out.println(a); */
	}

}
