/*
 *   ���� ���� : 
 *             ����(����), ����(����), ����(����), ����(����), ���(�Ǽ�) ���� �����ϰ�,
 *             �� ������ Ű����� �Է¹ް�,
 *             �հ�(����+����+����)�� ���(�հ�/3.0)�� ����ϰ�,
 *             �� ������ ������ ����� ������ �հ� ���� ó����
               <�հ��� ���� >
               �� ������ ������ ���� 40���̻��̸鼭,
               ����� 60�� �̻��̸� �հ�, �ƴϸ� ���հ� ó����
 */
import java.util.Scanner;
public class ����15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub3
		Scanner scan=new Scanner(System.in);
		System.out.print("���� ���� �Է�:");
		int kor=scan.nextInt();
		
		System.out.print("���� ���� �Է�:");
		int eng=scan.nextInt();
		
		System.out.print("���� ���� �Է�:");
		int math=scan.nextInt();
		
		int total=kor+eng+math;
		double avg=total/3.0;
		
		System.out.println("����:"+total);
		System.out.printf("���:%.2f\n",avg);
		
		System.out.println((kor>=40 && eng>=40 && math>=40 && avg>=60)?"�հ�":"���հ�");

	}

}
