import java.util.Scanner;
public class ����16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է��ϼ���(1~12)>>");
		int month=scan.nextInt();
		
		if(month>=3 && month<=5)
			System.out.println("��");
		else if(month>=6 && month<=8)
			System.out.println("����");
		else if(month>=9 && month<=11)
			System.out.println("����");
		else if(month==12 || month==1 || month==2)
			System.out.println("�ܿ�");
		else 
			System.out.println("�߸� �Է�");
		
		/*
		 *  switch(����,���ڿ�,����)
		 *  {
		 *  	case '', "", 1:
		 *  		���;
		 *  		break;
		 *  	default: ����
		 *  }
		 */
		
		//case ��: ���� �ߺ� ����� �Ұ�
		//			�Ǽ� ���X ==> ����, �޴�<a>
		switch(month)
		{
			case 12:case 1:case 2:
				System.out.println("�ܿ�");
				break;
			case 3:case 4:case 5:
				System.out.println("��");
				break;
			case 6:case 7:case 8:
				System.out.println("����");
				break;
			case 9:case 10: case 11:
				System.out.println("����");
				break;
			default:
				System.out.println("�߸� �Է��߽��ϴ�.");
				
		}
		
	}

}
