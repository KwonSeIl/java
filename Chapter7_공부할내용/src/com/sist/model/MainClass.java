package com.sist.model;
import java.util.Scanner;
public class MainClass {
	public static int menu()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("======= Menu ======");
		System.out.println("1. HOME");
		System.out.println("2. ȸ������");
		System.out.println("3. ��ȭ");
		System.out.println("4. ��������");
		System.out.println("5. �Խ���");
		System.out.println("6. ����");
		System.out.println("===================");
		System.out.print("�޴� ����:");
		return scan.nextInt();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Move mm=null; //Map ==> ������̼� @
		while(true)
		{
			int m=menu();
			switch(m)
			{
			case 1: //Home �̵�
				mm=new Home();
				mm.move();
				break;
			case 2: //ȸ������ �̵�
				mm=new Join();
				mm.move();
				break;
			case 3: //��ȭ
				mm=new Movie();
				mm.move();
				break;
			case 4:
				mm=new Notice();
				mm.move();
				break;
			case 5:
				mm=new Board();
				mm.move();
				break;
			case 6:
				System.out.println("����Ʈ�� �����մϴ�!!");
				System.exit(0);
			}
					
		}
	}

}
