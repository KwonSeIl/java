/*
 * 	1. ��ǻ�Ϳ� ���������� 
 * 		----------- ������� ==> q/Q �Է�: ���� 
 */
import java.util.Scanner;
public class �ݺ����_3 {
	//���� => break, continue => �߸��� �Է�(���)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int win=0,lose=0,same=0;
		int count=0; //���� Ƚ��
		//new ==> �޸𸮰� ������ �ٸ�
		Scanner scan=new Scanner(System.in);
		
		while(true)
		{
			// ���� �߻� ==> ���� ���� ==> 0(����),1(����),2(��)
			int com=(int)(Math.random()*3); //0~2
			// ==>��(������) 0.0~0.99	====> 0.0~0.2999 => int -> 0~2
			System.out.print("����(0),����(1),��(2):");
			int user=scan.nextInt();
			if(user<0 || user>2) //�߸��� �Է�
			{
				System.out.println("����(0),����(1),��(2)�� �Է��ϼ���!");
				continue; // ó������ �ٽ� ���� ==> while�� ���ǹ����� �̵� 
			}
			count++; //����Ƚ��
			
			//�����
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
			
			//Ȯ��
			/*
			 * 		com		user	com-user
			 * 		0(����)	0(����)	0		=>(same)
			 * 				1(����)	-1		=>(user)
			 * 				2(��)	-2		=>(com)
			 * 		1(����)	0(����)	1		=>(com)
			 * 				1(����)	0		=>(same)
			 * 				2(��)	-1		=>(user)
			 * 		2(��)	0(����)	2		=>(user)
			 * 				1(����)	1		=>(com)
			 * 				2(��)	0		=>(same)
			 * 		=================================user ==> -1,2
			 * 		=================================com ==> -2,1
			 */
			// 10�� 4�� 2�� 4�� 
			switch (com-user)
			{
			case -1: case 2:
				System.out.println("����� Win");
				win++; //�̱� Ƚ��
				break;
			case -2: case 1:
				System.out.println("��ǻ�� Win");
				lose++; //�� Ƚ��
				break;
			
			case 0:
				System.out.println("����");
				same++; //��� Ƚ��
			}
			// ���� Ȯ��
			System.out.print("������ �����ұ��?(y/n):");
			char c=scan.next().charAt(0); //Scanner�� ���� �Ѱ� �ޱ�
			if(c=='y' || c=='Y')
			{
				System.out.println("Game Over");
				break; //while�� ���� 
			}
		}
		// ���� ���� ���� Ȯ��
		System.out.printf("%d�� %d�� %d�� %d��\n",count,win,same,lose);

	}

}
