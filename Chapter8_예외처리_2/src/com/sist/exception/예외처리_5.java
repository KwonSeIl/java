package com.sist.exception;
// ���� ������ => ���Ƿ� ���ܸ� �߻�
// ���� => throw new ����ó��������();
// ��) throw new Exception ==> ������ �ִ� ��� ó��
class MyException extends Exception
{
	public MyException(String msg)
	{
		super(msg);
	}
}
public class ����ó��_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=10;
			if(a%2==0)
			{
				throw new MyException(a+"��(��) Ȧ���� �ƴմϴ�");
			}
		}catch(MyException ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}
