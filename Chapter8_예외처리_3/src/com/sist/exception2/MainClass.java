package com.sist.exception2;
import java.util.Scanner;
/*
 * 	try~catch (finally)
 * 	throws
 * 	-------------- ó�����
 */
public class MainClass {
	public static int menu()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("======== Menu ========");
		System.out.println("1. Top200");
		System.out.println("2. ����");
		System.out.println("3. POP");
		System.out.println("4. OST");
		System.out.println("5. Ʈ��");
		System.out.println("6. JAZZ");
		System.out.println("7. CLASSIC");
		System.out.println("8. EXIT");
		System.out.println("=====================");
		System.out.print("�޴� ����:");
		return scan.nextInt();
	}
	public static void main(String[] args) /*throws Exception*/{
		// TODO Auto-generated method stub
		MusicSystem ms=new MusicSystem();
		while(true)
		{
			int m=menu();
			if(m==8)
			{
				System.out.println("���α׷� ����");
				break;
			}
			else
			{
				try 
				{
				
					MusicVO[] music=ms.musicData(m);
					for(int i=0;i<music.length;i++)
					{
						System.out.println((i+1)+". "+music[i].getTitle());
					}
				}catch(Exception ex) {}
				finally
				{
					System.out.println("======= ��� �Ϸ� ========");
					// ���� �ݱ�, ����Ŭ �ݱ�
				}
			}
		}
		
	}

}
