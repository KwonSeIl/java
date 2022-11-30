package com.sist.exception;

import java.io.IOException;

/*
 * 	1. try~catch
 * 	2. throws
 * 		-------
 * 		���� ����(����ȸ��) => �ý��ۿ� ���� �˷��ش�
 * 		����)
 * 			public void display() throws NumberFormatException,RuntimeException, Exception
 * 										 --------------------------------------------------
 * 										 catch: ���� ����. throws: ���� ����
 * 			=> ���̺귯���� ����� ���ܸ� throws�� �̿��ؼ� ���
 * 				==>				 ---------------- ó���ϸ鼭 ����� �ؾ� �Ѵ�
 * 			=> ���� 2����
 * 			  1) try~catch: ���� ó���ϴ� ���
 * 			  2) throws: ���� ó���ϴ� ��� 
 * 
 * 			  public void display() throws Exception ==> display�� ȣ�� �ÿ��� Exception ó���� �� ����Ѵ�
 * 			  {
 * 
 * 			  }
 * 
 * 			  public void aaa()
 * 			  {
 * 				display() //�����ڵ�
 * 			  }
 * 
 * 			  1) 
 * 				public void aaa()
 * 				{
 * 					try
 * 					{
 * 						display();
 * 					}catch(Exception e) {}
 * 				}
 * 			  2)
 * 				public void aaa() throws Exception
 * 				{
 * 					display();
 * 				}
 * 			 ----------------------------------------
 * 			 public void aaa() throws NumberFormatException, ArrayIndexOutOfBoundsException
 * 			 {
 * 			 }
 * 
 * 			 main()
 * 		 	 {
 * 				aaa(); //������� 
 * 			 }
 * 			
 * 			// Exception / Throwable
 * 				��� ���ܸ� ó���� �� �ִ� Ŭ���� 
 * 		
 * 				void aaa() throws IOException, ClassNotFoundException
 * 
 * 				void bbb() throws IOException, ClassNotFoundException
 * 				void bbb() throws Exception ==> Ȯ��
 * 				void bbb() throws Throwable  ==> Ȯ��
 * 
 * 				void aaa() throws Throwable ==> ���
 * 		
 * 				void bbb() throws Exception   ====> ���� �߻���
 * 
 * 						Throwable
 * 							|
 * 					-------------------
 * 					|				  |
 * 				  Error				Exception
 * 										RuntimeException ==> ����ó���� ������ �� �ִ�
 * 											|
 * 										NumberFormatException, NullPointerException
 */
public class MainClass_����ó��_1 {
	//CheckException => �����Ϸ��� ����ó���� �Ǿ����� Ȯ�� ==> �ݵ�� ����ó���ؼ� ����ؾ� ��
	public static void aaa() throws InterruptedException, IOException
	{
		
	}
	//UnCheckException => �����Ϸ��� ����ó���� Ȯ������ ���� ==> ����ó���� ������ �� ���� 
	public static void bbb() throws NumberFormatException, NullPointerException
	{
		
	}
	public static void main(String[] args) throws Exception {
		//								���� ==> �ڹٽý��ۿ��� ó�� ��û
		// TODO Auto-generated method stub
		/* bbb();
		 * try
		 *  {
		 *  	aaa();
		 *  }catch(Exception ex) {} */
		///aaa();
		try 
		{
			Thread.sleep(1000);
		}catch(Exception ex) {} //���α׷��Ӱ� ���� ó���ؼ� ���
	}

}
