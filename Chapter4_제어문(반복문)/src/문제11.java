/*
 * 10���� ������ �Է¹޾� �� ���� �� ¦���� ������ ����� ����ϴ� ���α׷� �ۼ�
 */
import java.util.Scanner;
public class ����11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner scan=new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
			System.out.print("���� �Է�:");
			int num=scan.nextInt();
			
			if(num%2==0)
				count++;
		}
		System.out.println("count="+count);
		
		

	}

}
