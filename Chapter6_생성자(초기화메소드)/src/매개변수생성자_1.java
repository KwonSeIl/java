// 생성자를 통해서 인스턴스를 복사
// 스프링
import java.util.Scanner;
class Sawon
{
	int sabun;
	String name;
	String dept; //부서명
	String loc; //근무지
	long pay; //연봉
	Sawon() 
	{
		//임으로 초기화
		sabun=1;
		name="홍길동";
		dept="개발부";
		loc="서울";
		pay=5000;
	}
	Sawon(int sabun,String name)
	{
		this(); //자신의 생성자 호출이 가능함 => 매개변수가 없는 생성자 호출이 가능함
		/*
		 * 	sabun=1;
		 * 	name="홍길동";
		 * 	dept="개발ㄹ부"
		 * 	loc="서울";
		 * 	pay=5000;
		 */
		//this()는 생성자에서만 호출 가능 => 가장 첫 줄에 써야함 
		this.sabun=sabun;
		this.name=name;
	}
	Sawon(String dept,String loc,long pay)
	{
		this();
		this.dept=dept;
		this.loc=loc;
		this.pay=pay;
	}
	public Sawon(int sabun, String name, String dept, String loc, long pay)
	{
		this(dept,loc,pay);
		/*this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.loc = loc;
		this.pay = pay;*/
	}
	void print()
	{
		System.out.println("사번:"+sabun);
		System.out.println("이름:"+name);
		System.out.println("부서:"+dept);
		System.out.println("근무지:"+loc);
		System.out.println("연봉:"+pay);
	}
}
public class 매개변수생성자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon sa1=new Sawon(); //1,홍길동,개발부,서울,5000
		sa1.print();
		Sawon sa2=new Sawon(2,"박문수"); //2,박문수,null,null,0L
		sa2.print();
		Sawon sa3=new Sawon("총무부","경기",4200); //0,null,총무부,경기,4200
		sa3.print();
		Sawon sa4=new Sawon(3,"김두한","기획부","부산",5500);
		sa4.print();
		
	}

}
