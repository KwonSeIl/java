package com.sist.exception;
/*
 * 	throws
 * 	------
 * 		�̹� ������� �޼ҵ忡�� ���ܿ� ���� ������ ����� 
 * 		==> �ٸ����(����): �ڵ� ����ó���� �� �� ����
 * 		==> �ڹٿ��� � ������ �߻������� �����ϰ� �ִ� (���) => �߰��� ���α׷��� ���� �� �ִ� 
 * 		==> ������
 * 
 * 		-----------------------------------------------------------------
 * 		void aaa(char a,int a,int b)
 * 		void aaa(int a,int b,int c)
 * 
 * 		aaa('A','A',10)
 * 
 * 		throws => ������, �޼ҵ忡���� ��� ����
 * 				  �ʱ�ȭ��Ͽ����� throws�� ����� �� ���� 
 */
public class MainClass_throws1 {
	
	public static void method1() throws Exception
	{
		method2();
	}
	public static void method2() throws Exception
	{
		throw new Exception();
	}
	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		try 
		{
			method1();
		}catch(Exception ex) {}
	}

}
