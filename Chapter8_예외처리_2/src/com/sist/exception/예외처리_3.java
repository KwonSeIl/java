package com.sist.exception;
// CheckException: �����Ϸ��� ����(����ó�� �ߴ��� ����) 
/*
 * 	���������
 * 	URL �̿�
 * 	������ �̿�
 * 	����(Network)
 * 	�����ͺ��̽�
 */
import java.io.*;
public class ����ó��_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*FileReader fr=null;
		try
		{
			fr=new FileReader("c:\\javaDev\\����ó��_1.java");
			int i=0; //�ѱ��ھ� �о�´�(char ��� int�� ����)
			while((i=fr.read())!=-1) //-1:EOF(������ ��)
			{
				System.out.print((char)i);
			}
		}catch(IOException e)
		{
			System.out.println("������ �������� �ʽ��ϴ�!!");
		}
		finally
		{
			try
			{
				fr.close();
			}catch(IOException ex)
			{
				System.out.println("���� �ݱ� ����");
			}
		}*/
		try (FileReader fr=new FileReader("c:\\javaDev\\����ó��_1.java")) //fr.close() �ڵ� ��ȯ
		{
			int i=0;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
		}catch(IOException e)
		{
			System.out.println("������ �������� �ʽ��ϴ�");
		}
		

	}

}
