// updown ����
import java.util.Scanner;
public class ���_�ݺ���3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int com=(int)(Math.random()*100)+1;
		
		for(;;) //���ѷ��� while(true)
		{
			System.out.println("1~100���� ������ �Է�:");
			int user=scan.nextInt();
			if(user<1 || user>100)
			{
				System.out.println("�߸��� �Է��Դϴ�.");
				//ó������ �ٽ� �����Ѵ�
				continue; //���������� ���ư�
			}
			
			if(com>user)
			{
				System.out.println("�Է°����� ū ���� �Է��ϼ���.");
			}
			else if(com<user) 
			{
				System.out.println("�Է°����� ���� ���� �Է��ϼ���.");
			}
			else
			{
				System.out.println("Game Over!");
				System.exit(0); //���α׷� ����
			}
		}
		
	}

}
