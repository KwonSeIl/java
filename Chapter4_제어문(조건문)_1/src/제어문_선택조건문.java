/*
 * 	true/false -> ���� ó��
 * 	=> ¦/Ȧ, ��/�ҹ���, �α��� ����, ID �ߺ�
 * 
 * 	����)
 * 	 if(����)
 * 	 {
 * 		������ true�� �� ó��
 * 	 }
 * 	 else
 * 	 {
 * 		������ false�� �� ó��
 * 	 }
 * 
 * 	 -----------------------
 * 	 ���� ���ǹ�
 * 
 * 	 if(����)
 * 	 {
 * 		���� true�� �� ó��
 * 	 }
 * 	 if(!����)
 * 	 {
 * 		���� false�� �� ó��
 * 	 }
 */
import java.util.Scanner;
//Scanner�� ����: ���� �Է� ����X -> ���ڿ�(�ѱ��ڸ� charAt(0))
public class ���_�������ǹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("���ĺ� ���� �Է�:");
		char alpha=scan.next().charAt(0);
		if(alpha>='A' && alpha<='Z')
			System.out.println(alpha+"��(��) �빮���Դϴ�!!");
		//if(alpha>='a' && alpha<='z')
		else
			System.out.println(alpha+"��(��) �ҹ����Դϴ�!!");
		

	}

}
