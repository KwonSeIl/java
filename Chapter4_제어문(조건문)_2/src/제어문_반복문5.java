import java.util.Scanner;

public class ���_�ݺ���5 {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		for(;;)
		{
			System.out.print("1. �޸���, 2. �׸���, 3. ������, 4. ����");
			int no=scan.nextInt();
			
			if(no<1 || no>4)
			{
				System.out.println("�޴� ������ �߸��Ǿ����ϴ�.");
				continue;
			}
			switch(no)
			{
				case 1:
					Runtime.getRuntime().exec("C:\\Windows\\notepad.exe");
					break;
				case 2:
					Runtime.getRuntime().exec("C:\\Windows\\System32\\mspaint.exe");
					break;
				case 3:
					Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
					break;
				case 4:
					System.out.println("���α׷��� �����մϴ�.");
					System.exit(0); //0(��������), -1(������ ����)
			}
		}

	}

}
