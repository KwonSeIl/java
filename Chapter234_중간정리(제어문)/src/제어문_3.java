// ���� �Է��� �޾Ƽ� ���/����, ���ĺ� ���� Ȯ��
// if~~else if~else(������ (����,��ȣ,�ѱ�))
import java.util.Scanner;
public class ���_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �� �� �Է�:");
		String msg=scan.next();
		char ch=msg.charAt(0);// ���ڿ� 1��° ���� ������ ��
		
		if(ch>='A' && ch<='Z')
			System.out.println(ch+"��(��) �빮���Դϴ�");
		else if(ch>='a' && ch<'z')
			System.out.println(ch+"��(��) �ҹ����Դϴ�");
		else
			System.out.println(ch+"��(��) ���ĺ��� �ƴմϴ�");
		// =========================>switch �����
		

	}

}
