/*
 *  ������ �ʱ�ȭ
 *  = ������� �ʱ�ȭ
 *   int a=10;
 *  =�Է°��� �޾Ƽ� ó��
 *   int a=scan.nextInt()
 *    => ��,������(�Է�â=> �Է°�)
 *  =���� �߻�
 *   Random r=new Random();
 *   int a=r.nextInt(100);+1 ====>1~100���� 
 *  =�̹� ����� ������ ���� ���� 
 *   int a=10;
 *   int b=a;
 *   int c=b;
 *  =����ó��
 *   int a=1024*1024*100; =====> ���ε�(��ũ��)->100M
 *   int total=60*60*24
 *  ===> ������ �����ϸ�
 *  	�������(Ŭ���� ������ ����Ǵ� ����) => �ڵ��ʱ�ȭ ��(int a; --> a=0)
 *  	***��������(�޼ҵ� ������ ����Ǵ� ����) => �ڵ��ʱ�ȭX -> ����ϱ� �� �ݵ�� �ʱ�ȭ �ؾ� ��
 *  	*** ������ �� �ִ� ��=> ���Ƿ� ���� -> ���߿� �� �����ؼ� ��� 
 *   
 */
public class ����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int a;   
		   int b;   
		   a=3;   
		   b=a+5;
		// int a=3;
		// int b=a+5;
		   System.out.printf("a�� ��: %d \n", a);   
		   System.out.printf("b�� ��: %d \n", b);   


	}

}
