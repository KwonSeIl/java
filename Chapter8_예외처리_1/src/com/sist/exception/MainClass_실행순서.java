package com.sist.exception;
class A
{
	
}
class B extends A
{
	
}
public class MainClass_������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			String str=" 10";
			System.out.println(Integer.parseInt(str.trim())); //parseInt() ���ڿ��� ���������� ������ �� ���Ǵ� �޼ҵ�
			//System.out.println(10/0); // �� -> catch�� �̵� �� ���� 
			//System.out.println(str.trim());
			B a=(B)new A();
			B b=(B)a;
		} 
		catch (ArrayIndexOutOfBoundsException ex) 
		{
			// �迭���� �ʰ��� �� ó���ϴ� ����ó�� => �Ѱ��� ����
			System.out.println("�迭�� ������ �ʰ��Ͽ����ϴ�.");
		}
		catch (ArithmeticException ex) 
		{
			// 0���� ���� ��� ó���� 
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		catch (NumberFormatException ex) 
		{
			// ���ڿ��� ������ ����ÿ� ó��
			System.out.println("������ ��ȯ�� �ȵ˴ϴ�.");
		}
		catch (NullPointerException ex)
		{
			// ��ü, Ŭ������ �ּҰ��� ���� ���(null) ó��
			System.out.println("��ü�� �ּҰ� ���� �����Դϴ�.");
		}
		catch (ClassCastException ex)
		{
			// ����ȯ�� �߸����� ��� ó��
			System.out.println("Ŭ���� ����ȯ�� �߸��Ǿ����ϴ�.");
		}
		catch (RuntimeException ex) 
		{
			// ���� �ִ� ��� ���ܸ� ó�� // �������� ���ϴ� ���(��Ÿ)
			System.out.println("���� ��ϵ� ���� ���� �ٸ� ��� ���ܸ� ó���Ѵ�");
		}
		/*catch (Exception ex) 
		{
			
		}
		catch (Throwable ex) {
			
		}*/
	}

}
