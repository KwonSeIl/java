/*
 * 	���ǽ�
 * 	 1) 90�̻� ~ 100����(&&)
 * 	  num>=90 && num<=100
 *   2) 0���� �۰� 100���� ũ��(||)
 *    num<0 || num>100 =========> �߸��� �Է�
 *   3) y,Y
 *    num=='y'||num=='Y'(�񱳿�����: ����,�Ǽ�,��,����)
 *    ***���ڿ�(equals) => id,pwd(�α��� ó��) ***��(���ڿ� �߽�) 
 *   
 *    
 * 	  
 */
// 3���� ������ �޾� ���, ����, ���� ���ؼ� ����ϴ� ���α׷� 
// 90�̻�:'A', 80:B, 70:C, 60:D, ���ϴ� F

import java.util.Scanner;
public class ���_���ǹ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("����, ����, ���� �Է�(80 80 80):");
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		
		//����
		int total=kor+eng+math;
		//���
		double avg=total/3.0;
		
		//��� ���
		System.out.println("���� ����:"+kor);
		System.out.println("���� ����:"+eng);
		System.out.println("���� ����:"+math);
		
		System.out.println("����:"+total);
		System.out.printf("���:%.2f\n",avg);
		// ���� ���ǹ�: �ߺ������� ó���� �� �����
		/*
		 *  3,5,7��� -> ����if�� 
		 *  if�� ���� ���� => �ӵ��� ����
		 *   => �˻� �� ���  ==> WHERE 
		 */
		char c='A';
		//���� ���
		if(avg>=90 && avg<=100) 
			c='A';
		if(avg>=80 && avg<90) 
			c='B';
		if(avg>=70 && avg<80) 
			c='C';
		if(avg>=60 && avg<70) 
			c='D';
		if(avg<60)
			c='F';
		
		System.out.println("����:"+c);

	}

}


