/*
 *  ==>if~else
 */

import java.util.Scanner;
public class ����15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("2�ڸ��� ���� �Է�(10~99):");
		int num=scan.nextInt();
		int a=num/10;
		int b=num%10;
		if(a==b)
			System.out.println("10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		else 
			System.out.println("10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		/*
		 * if(num%11==0) // 11 22 33... System.out.println("10�� �ڸ��� 1�� �ڸ��� �����ϴ�."); else
		 * System.out.println("10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		 */
	}

}
