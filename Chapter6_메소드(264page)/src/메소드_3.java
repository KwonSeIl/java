//263page
public class 메소드_3 {
	static void aaa() //static은 호출 가능. instance는 호출 불가능 
	{
		// static에서는 인스턴스변수, 메소드 호출 시 반드시 메모리 할당을 한 후 사용해야 함 
		메소드_3 m=new 메소드_3();
		m.first();
	}
	void first() //static, instance 호출이  가능
	{
		aaa();
		System.out.println("fisrt() 진입.."); //순서1
		second();
		System.out.println("first() 종료.."); //순서6
	}
	void second()
	{
		aaa();
		System.out.println("second() 진입.."); //순서2
		last();
		System.out.println("second() 종료.."); //순서5
	}
	void last()
	{
		System.out.println("last() 진입.."); //순서3
		System.out.println("last() 종료..");	//순서4
	}
	/*
	 * 	last
	 * 	-------
	 * 	second			second
	 * 	-------			------
	 * 	first			first		first
	 * 	-------			------		------		-----
	 * 	main			main		main		main		=> -------- -> 프로그램 종료
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메소드가 메모리에 저장이 안됨 
		System.out.println("main() 진입..");
		메소드_3 m=new 메소드_3(); //메소드가 저장되는 시점
		System.out.println("메모리 제작 m="+m);
		System.out.println(m+" 메모리 주소에 메소드가 전체 저장");
		m.first();
		System.out.println("main() 종료..");
		

	}

}
