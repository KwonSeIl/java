/*
 * 	90~100 A
 * 	80~89 B
 * 	70~79 C
 * 	60~69 D
 * 	60�̸� F
 * ==> �������ǹ� 
 * 	
 * 	���� List
 * 	�Լ�/�޼ҵ� â
 * 	���̺귯��/�����ӿ�ũ ����
 * 	  --����ǰ  --���� : ���̺귯��(�ٲ� �� X), �����ӿ�ũ(�� ������� ��ĥ ����, open source)
 * */

import java.util.Scanner;
public class ���_���ù� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3�� ����(����,����,����)
		Scanner scan=new Scanner(System.in);
		System.out.print("����,����,���� ���� �Է�(80 80 80):");
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		
		//����
		int total=kor+eng+math;
		//���
		double avg=total/3.0;
		
		//����
		char score='A'; // ' '�� ���� 
		switch((int)(avg/10)) //����, ���ڿ�, ������ ����
		{
			//if(avg==10 || avg==9)
			case 10:
			case 9:
				score='A';
				break;
			case 8:
				score='B';
				break;
			case 7:
				score='C';
				break;
			case 6:
				score='D';
				break;
			default:
				score='F';
		}
		
		System.out.println("���� ����:"+kor);
		System.out.println("���� ����:"+eng);
		System.out.println("���� ����:"+math);
		System.out.println("����:"+total);
		System.out.printf("���:%.2f\n",avg);
		System.out.println("����:"+score);
		
		
		
		

	}

}
