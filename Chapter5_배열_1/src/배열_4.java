// �ʱ�ȭ ==> ����� �Է� ==> �迭 : ���� ���������� ��Ƽ� ���� 
// ��ɺ��� ��Ƽ� ó�� 
/*
 *    ���� 
 *    --- ������ ���, ��....
 *    
 *    3���� �л� ==> ���� , ���� , ���� ������ �Է��� �޾Ƽ� ���� , ���, ������ ��� 
 *    ---------------------------------------------------------------
 *    ���� 18�� 
 *    �迭 6�� => ����,���� , ���� , ���� , ��� , ����  ==> �ε��� 0,1,2
 */
import java.util.Scanner;
public class �迭_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ���� 3�� ���� ���� 
		int[] kor=new int[3];
		// ���� 3�� ���� ���� 
		int[] eng=new int[3];
		// ���� 
		int[] math=new int[3];
		// ���� 
		int[] total=new int[3];
		// ��� 
		double[] avg=new double[3];
		// ���� 
		char[] score=new char[3]; 
		// ���̺귯�� (�ڹ�����) ==> 70% , ����� ���� 20% ==> 10%  Jsoup
		Scanner scan=new Scanner(System.in);
		// ������ �ο� 
		for(int i=0;i<3;i++)
		{
			System.out.print((i+1)+"��° �������� �Է�:");
			kor[i]=scan.nextInt();  
			
			System.out.print((i+1)+"��° �������� �Է�:");
			eng[i]=scan.nextInt();
			
			System.out.print((i+1)+"��° �������� �Է�:");
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
		}
		// ���� 
		for(int i=0;i<3;i++)
		{
			// 88/10 8  80/10 8 => B
			switch((int)(avg[i]/10)) // ����,����,���ڿ�  ==> double
			{
			case 10: case 9:
				score[i]='A';
				break;
			case 8:
				score[i]='B';
				break;
			case 7:
				score[i]='C';
				break;
			case 6:
				score[i]='D';
				break;
			default:
				score[i]='F';
			}
		}
		// ��� ==> �迭 1���� �ִ� ���� ����� ���� ==> �迭 5�� ���ÿ� ��� (�Ϲ�=>�ε���)
		for(int i=0;i<3;i++)
		{
			System.out.printf("%-5d%-5d%-5d%-5d%-7.2f%3c\n",kor[i],eng[i],math[i],total[i],avg[i],score[i]);
		}
		
	}

}
