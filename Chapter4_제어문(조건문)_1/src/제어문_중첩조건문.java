/*
 * 	��ø���ǹ�(����if��)
 * 	 =if(���ǹ� && ���ǹ�)
 * 	 if(���ǹ�)
 * 	 {
 * 		if(���ǹ�)
 * 		{
 * 		}
 * 		else
 * 		{
 * 		}
 * 	 }
 * 
 * 	��ǻ�� -> ����������
 * 
 * 	��ǻ��		�����
 * 	 ����		 ���� => ���� && ���� 
 * 			 ����
 * 		 	 ��
 * 	 ����		 ����
 * 			 ����
 * 			 ��
 * 	 ��		 ����
 * 			 ����
 * 			 ��    ============> 3���� ����(=�˰���)
 */
// => ���� ����(0), ����(1), ��(2)
import java.util.Scanner;
public class ���_��ø���ǹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		// malloc(sizeof()) ==> �°�(������)
		System.out.print("����(0), ����(1), ��(2):");
		int user=scan.nextInt();
		
		//��ǻ��
		int com=(int)(Math.random()*3); //0,1,2
		
		//Ȯ��
		if(com==0)
			System.out.println("��ǻ��:����");
		else if(com==1)
			System.out.println("��ǻ��:����");
		else if(com==2)
			System.out.println("��ǻ��:��");
		if(user==0)
			System.out.println("�����:����");
		else if(user==1)
			System.out.println("�����:����");
		else if(user==2)
			System.out.println("�����:��");
		//����� ���
		/*
		 *  com		user -> com-user
		 * 	��ǻ�� 	�����		
		 * 	 ����(0) 	 ����(0)	 0
		 * 			 ����(1)	 -1 ==>P	
		 * 			 ��(2)	 -2 ==>C
		 * 	 ����(1) 	 ����(0)	 1 ==>C
		 * 			 ����(1)	 0	
		 * 			 ��(2)	 -1 ==>P
		 *	 ��(2) 	 ����(0)	 2 ==P
		 * 			 ����(1)	 1	==>C
		 * 			 ��(2)	 0
		 * 	
		 * 		com==>-2,1
		 * 		play==>-1,2
		 */
		int res=com-user;
		if(res==-2 || res==1)
			System.out.println("��ǻ�� Win");
		else if(res==-1 || res==2)
			System.out.println("����� Win");
		else 
			System.out.println("����");
		// -> ����if�� 
		/*
		if(com==0) //����
		{
			if(user==0) //����
				System.out.println("�����ϴ�.");
			else if(user==1) //����
				System.out.println("����ڰ� �̰���ϴ�.");
			else if(user==2)
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		}

		else if(com==1) //����
		{
			if(user==0) //����
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			else if(user==1) //����
				System.out.println("�����ϴ�.");
			else if(user==2) //��
				System.out.println("����ڰ� �̰���ϴ�.");
		}
		
		else if(com==2) //��
		{
			if(user==0) //����
				System.out.println("����ڰ� �̰���ϴ�.");
			else if(user==1) //����
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			else if(user==2) //��
				System.out.println("�����ϴ�.");
		} */
	}

}


