/*
 *  ����ڷκ��� �� ���� ������ �Է¹޾� ������ ���� 
 *  ������ ����� ����ϴ� ���α׷� �ۼ� 
 *  
 */
import java.util.Scanner;

public class ����11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("ù��° ���� �Է�:");
		int num1=scan.nextInt();
		
		System.out.print("�ι�° ���� �Է�:");
		int num2=scan.nextInt();
		
		System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
		System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);

		//printf: ���ϴ� ������ŭ ����(�����Ű�����) ...
		//(String format, Obhect...args) => �޼ҵ� �� ����
		/*
		 * int a=10;
		 * a++; //
		 *  //����
		 *  ++a; //����
		 *  
		 *   int a=10;
		 *   System.out.println(a++) =>10
		 *   //����
		 *   System.out.println(++a) => 12
		 */
	}

}
