//170page
import java.util.Scanner;
public class �ݺ���_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("�ݾ��� �Է�(56789)>> ");
		// ��, õ, ��, �� ����
		int won=scan.nextInt();
		int a=won/10000;
		int b=(won%10000)/1000;
		int c=(won%1000)/100;
		int d=(won%100)/10;
		int e=won%10;
		
		System.out.println("������:"+a);
		System.out.println("õ����:"+b);
		System.out.println("���:"+c);
		System.out.println("�ʿ�:"+d);
		System.out.println("�Ͽ�:"+e);

	}

}
