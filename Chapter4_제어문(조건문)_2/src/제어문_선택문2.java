/*
 * 	12 1 2 => �ܿ�
 *  3 4 5 => ��
 *  6 7 8 => ����
 *  9 10 11 => ���� 149page
 */
import java.util.Scanner;
public class ���_���ù�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("���� ���� �Է��ϼ���:");
		int month=scan.nextInt();
		
		switch (month) 
		{
			case 12:case 1:case 2:	//if(month==12 || month==1 || month==2)
				System.out.println("�ܿ��Դϴ�.");
				break;
		
			case 3:
			case 4:
			case 5:	//if(month==3 || month==4 || month==5)
				System.out.println("���Դϴ�.");
				break;
			
			case 6:case 7:case 8: //if(month==6 || month==7 || month==8)
				System.out.println("�����Դϴ�.");
				break;
			case 9:case 10:case 11: //if(month==9 || month==10 || month==11)
				System.out.println("�����Դϴ�.");
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");;
		}

		
	}

}
