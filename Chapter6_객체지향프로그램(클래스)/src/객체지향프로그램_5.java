/*
 * 	234page~236page, 238page, 240page
 * 	1. 객체(인스턴스)생성, 저장 메모리 활용
 * 	 1) 생성
 * 		class Music
 * 		클래스명 변수명(인스턴스);
 * 		Music music; => 선언(null -> 주소값이 없는 상태) : 실제 데이터가 저장된 메모리를 참조(=참조변수)	
 * 																			-------- => 배열, 클래스
 * 		music=new Music(); //생성 -> 실제 데이터를 저장하는 메모리 확보
 * 		------------------ 선언 -> 사용(변수 => static)
 * 		= 인스턴스: new를 이용해서 생성시마다 따로 저장되는 변수 => .을 이용해서 접근
 * 		= static (공유변수) -> 컴파일 시에 자동으로 메모리에 저장 => 클래스명.변수, 클래스명.메소드()
 * 													 => 같은 클래스 안에서는 클래스명을 생략할 수 있음 
 * 	 2) 메모리 생성하는 과정
 * 		Tv t	=> 		===t===
 * 					실제 데이터가 있는 메모리 주소값 => null인 상태
 * 						=======
 * 		메모리 주소 설정
 * 		t=new Tv();		=======0x100
 * 						  크기
 * 						=======
 * 						  채널
 * 						=======
 * 						  색상
 * 						=======
 * 
 * 	new를 사용하면 -> 메모리 저장 장소가 달라짐 (바로 회수가 어려움 => GC)
 * 	웹 -> 메모리에 저장 후에 브라우저로 전송
 * 	------------------------------
 * 
 */
class Sawon{
	int saubn;
	String name;
	String dept;
	String job;
	long pay;
}

public class 객체지향프로그램_5 {

	//int a=10; //파랑:멤버변수 갈색:지역변수 
	/*void display()
	{
		int a=20; // 지역변수 우선순위 
		System.out.println("a="+this.a); //a: 지역변수. this.a: 멤버변수 . //지역변수, 멤버변수 -> 같은 변수 사용 가능 
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사원이 3명
		Sawon s1=new Sawon(); //s1 => sabun, name, dept,job,pay
		s1.saubn=1;
		s1.name="홍길동";
		s1.dept="개발부";
		s1.job="대리";
		s1.pay=3800;
		
		Sawon s2=new Sawon(); //s2 => sabun, name, dept,job,pay
		s2.saubn=2;
		s2.name="홍길동1";
		s2.dept="개발부";
		s2.job="대리";
		s2.pay=3800;
		
		Sawon s3=new Sawon(); //s3 => sabun, name, dept,job,pay
		s3.saubn=3;
		s3.name="홍길동2";
		s3.dept="개발부";
		s3.job="대리";
		s3.pay=3800;
		

	}

}
