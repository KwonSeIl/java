class A
{
	A()
	{
		System.out.println("������ call");
		
	}
	protected void finalize() throws Throwable{
		System.out.println("�Ҹ��� call");
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a=null;
		System.gc();

	}

}
