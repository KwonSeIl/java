package com.sist.exception;
// ��Ƽ catch��
import java.util.Scanner;
public class ����ó��_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���ڿ��� �޾Ƽ� ���� ��ȯ -> ������
		try
		{
			Scanner scan=new Scanner(System.in);
			System.out.print("ù ��° ���� �Է�:");
			String num1=scan.next();
			System.out.print("�� ��° ���� �Է�:");
			String num2=scan.next();
			
			//���� ���� -> ����
			int n1=Integer.parseInt(num1);
			int n2=Integer.parseInt(num2);	//NumberFormatException
			
			//������ => �������� -> 0
			int n3=n1/n2;
			
			System.out.println("�����:"+n3);
			
		} //�����߻��� ó��
		catch(NumberFormatException | ArithmeticException e)
		{
			//e�� ��ü ==> � Ŭ������ ��ü���� Ȯ�� ==> instanceof �����ڸ� �̿��Ѵ�
			if(e instanceof NumberFormatException)
				System.out.println("���ڿ��� �ԷµǾ����ϴ�.\n ������ �Է��ϼ���");
			else if(e instanceof ArithmeticException)
				System.out.println("0���� ���� �� �����ϴ�.");
			//e.printStackTrace();
		}
		//�� ==> ȭ����� 
		System.out.println("ȭ�� ��� ����..."); // ���������� �����ϰ� ��������� �����ϰ� ���α׷� ����
		/*
		 * 	catch�� ������ ����� ����
		 * 	catch�� ���Ǵ� ����ó��Ŭ������ ������ �����Ѵ�(�������� => ���� �ִ� Ŭ������ �������� ���ÿ� ó���� �����ϴ�)
		 */

	}

}
