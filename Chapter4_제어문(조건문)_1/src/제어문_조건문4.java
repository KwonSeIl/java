/*
 * 	1. 136page 
 * 		----> if�� ���� ���
 * 	2.	137page
 * 		---->���ǽ�: ����������, �񱳿�����, �������� ��� (����� true/false)
 * 		C��� if(1), if(0) --> java���� ����
 * 	3. 138page
 * 		// ���� ����� �ٷ� �ؿ� �ִ� ���� 1���� ����
 * 		if()
 * 		{
 * 			// ������ true�� �� ����Ǵ� ����
 * 			// �����ؾߵǴ� ���� �������� �� ��� 
 * 		}
 * 	4. 140page
 * 		if~else
 * 		����)
 * 		  if(����)
 * 		    ���� true�� �� ó��
 * 		  else
 * 			���� false�� �� ó��
 * 	-------------------------------------------------------------
 */
import java.util.Scanner;
public class ���_���ǹ�4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("========== Menu =========");
		System.out.println("1. �α���");
		System.out.println("2. ȸ������");
		System.out.println("3. ��ȭ��� ��û");
		System.out.println("4. ��ȭ �󼼺���");
		System.out.println("5. ����");
		System.out.println("6. ����");
		System.out.println("=========================");
		// ���� ���ǹ�, �������ǹ� 
		Scanner scan=new Scanner(System.in);
		System.out.print("�޴� ����(1~6):");
		int menu=scan.nextInt();
		if(menu==1)
			System.out.println("�α��� ��û�ϼ̽��ϴ�.");
		if(menu==2)
			System.out.println("ȸ�������� ��û�ϼ̽��ϴ�.");
		if(menu==3)
			System.out.println("��ȭ����� ��û�ϼ̽��ϴ�.");
		if(menu==4)
			System.out.println("��ȭ �󼼺��⸦ ��û�ϼ̽��ϴ�.");
		if(menu==5)
			System.out.println("��ȭ ���Ÿ� ��û�ϼ̽��ϴ�.");
		if(menu==6)
			System.exit(0); // ���α׷� ����
	}

}


