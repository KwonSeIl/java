/*
 *  ���:
 *  System.out.println()
 *  System.out.print()
 *  System.out.printf()
 *  �Է�: System.in(Ű���� �Է°�), Scanner,BufferdReader
 *  	-----------					  --------------����ó�� �ؾ��� 
 *  							|
 *  ����
 *   1) �ʱ�ȭ
 *   	������� �ʱ�ȭ int a=10;
 *   	�Է°�
 *   	����
 */
import java.util.Scanner; //using...
// java.lang ==> ���� ���� 
/*
 *  �ڹ� �ڵ�����
 *   1. package: ���� Ŭ������ ��� ����(�ѹ��� ��� ����) 
 *   2. �ٸ� Ŭ������ �о�� (import ���)
 *   	import => ������ ��� ���� 
 *   3. public class className
 *   	{
 *   		public static void main(String[] args) {
 *   		}
 *   	}
 */
// ����, ����, �������� => �Է� �޾Ƽ� ����, ��� ���
// ����, ���� ��� 
public class ȭ�����_printf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. ���� ����
		int kor,eng,math,total;
		double avg;
		// 2. �Է°� �޾Ƽ� ���� �ʱ�ȭ
		Scanner scan=new Scanner(System.in);
		// new => �޸𸮿� ������ ���¿��� �����;� �� System.in : Ű���� �Է°�
		// Ű���� �Է°��� �޾Ƽ� �ش� ������ ���� ����(scanner ����)
		System.out.print("���� ���� �Է�:");
		kor=scan.nextInt(); // ������ ����, next():���ڿ� �Է�, nextDouble(): �Ǽ��� �Է�
		System.out.print("���� ���� �Է�:");
		eng=scan.nextInt();
		System.out.print("���� ���� �Է�:");
		math=scan.nextInt();
		
		total=kor+eng+math;
		avg=total/3.0;
		// %d(�����Է�),%f(�Ǽ�),%s(���ڿ�),%c(����)���� �� ����
		System.out.printf("%-5s%-5s%-5s%-7s%-5s\n","����","����","����","����","���"); // \n: �����ٿ� ��� 
		//System.out.println���ε� ����(���� �༭) -> ���� ���� ���Ǵ� ȭ�����(��=> ���� ���(�����))
		System.out.printf("%-7d%-7d%-7d%-9d%-7.2f",kor,eng,math,total,avg); //�����ٿ� ����� ����->\n �ٿ��� ��
		// 3. ����
		// 4. ȭ�� ��� 

	}

}
