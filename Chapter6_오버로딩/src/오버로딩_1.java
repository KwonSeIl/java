/*
 *  1. 변수
 *  	인스턴스 변수
 *  	[접근지정어][옵션] 데이터형 변수명;
 *  	--------
 *  	private, protected, public, default
 *  								-------
 *  								단점: 폴더가 틀린 경우에는 접근이 불가능
 *  		옵션 => static, final
 *  	예) int a; //따로 저장 => 호출 시 반드시 객체 생성후 사용 가능 (인스턴스명.변수명)
 *  		static int b; //공유 => 자동 저장-> 클래스명으로 접근이 가능(클래스명.변수명)
 *  		final int c=상수값 지정;  //상수
 *  		------------------- 호출
 *  	클래스 변수: static
 *  2. 메소드: 동작, 행위 => 작업을 할 수 있는 명령어의 집합
 *  	로그인을 한다
 *  	로그아웃을 한다
 *  	목록을 보여준다
 *  	메뉴를 클릭한다
 *  	이미지를 클릭 후 상세보기한다
 *   	예약을 한다
 *   
 *   	선언
 *   	[접근지정어][옵션] 리턴형 메소드명(매개변수...) ==> 선언부
 *   			static|final|abstract
 *   	{
 *   		구현부
 *   		return 값; => void일 경우에만 생략 가능
 *   	}
 *  ------------핵심
 *  클래스(컴포넌트) 
 *  	----------------
 *  	=> 필요한 데이터(이름, 날짜, 조회수, 제목,내용,비번)
 *  	예) 글쓰기 -> 메소드
 *  		수정하기 -> 메소드
 *  		삭제하기 -> 메소드
 *  		목록출력 -> 메소드
 *  		상세보기 -> 메소드
 *  		검색하기 -> 메소드
 *  		------------------- 게시판 기능
 *  		메소드 => 리턴형 / 매개변수(여러개 설정) => Call By Value(메소드에서만 변경),
 *  										Call By Reference(배열, 클래스 자체 변경)
 *  				---- 한개(배열, 클래스)
 *  	 * 인스턴스 메소드 => 인스턴스메소드 호출, 인스턴스 변수, static 변수, static 메소드 => 사용 가능
 *  		static  메소드 => static만 호출이 가능(static변수, static 메소드)
 *  						인스턴스 변수, 인스턴스 메소드 사용시에는
 *  						반드시 객체 생성후에 접근이 가능
 *  						---------------------------------- 데이터베이스(static)
 *    -----------CBD
 *  오버로딩: 생성자 
 *  	283page
 *  	=======
 *  	1) 하나의 메소드명으로 여러개의 기능을 만들 수 있음(새로운 추가)
 *  	2) 메소드명을 줄일 수 있음
 *  		--------------기능이 동일
 *  		println(int a)	
 *  		println(boolean b)	
 *  		println(char[] c)
 *  		println(double d)
 *  		println(String s)
 *  		...
 *  	3) 버튼 => onClick(String id,String pwd)
 *  			 onClick(int b)
 *  
 *  	1. 오버로딩의 조건
 *  		1) 같은 클래스내에서 같은 메소드명을 가지고 있음
 *  			-------------------
 *  		2) 매개변수의 개수가 다르다, 매개변수의 데이터형이 다르다
 *  				  --------			-----------
 *  		3) 리턴형은 관계 없다
 *  			----------
 *  		예)
 *  			=> void display() 원본
 *  			1. int display() (X)
 *  			2. char display(int a) (O)
 *  			3. void display(char c) (O)
 *  			4. char display(int a,int b) (O)
 *  			5. double display(double d1, double d2) (O) 
 *  			
 *  			=> void display(int a,char c,double d2)
 *  				void display(float a,int c,int d2)
 *  				void display(double a,double c,double d2)
 *  				void display(int a,int c,int d2)
 *  
 *  				display(10.0,'A',10.5F)
 *  					  double char float
 *  				void data(int a)
 *  		
 *  				=> data(10)
 *  					data('A') data(byte,short)
 *  					
 *  				1. 같은 매개변수
 *  				2. 큰 데이터형 변수
 *  	
 *  				
 */
public class 오버로딩_1 {
	static final int c=100;
	void display(char c,int i,long l)
	{
		System.out.println("display(char c,int i,long l) Call...");
	}
	int  display(int c,int i,double l)
	{
		System.out.println("display(int c,int i,double l) Call...");
		return 0;
	}
	double display(double c,double i,double l)
	{
		System.out.println("display(double c,double i,double l) Call...");
		return 0.0;
	}
	long display(float c,float i,float l)
	{
		System.out.println("display(float c,float i,float l) Call...");
		return 0L;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		오버로딩_1 a=new 오버로딩_1();
		//a.display(10, 10, 10);
	}

}
