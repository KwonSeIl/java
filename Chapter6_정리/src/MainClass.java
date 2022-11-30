class A
{
	A()
	{
		System.out.println("持失切 call");
		
	}
	protected void finalize() throws Throwable{
		System.out.println("社瑚切 call");
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
