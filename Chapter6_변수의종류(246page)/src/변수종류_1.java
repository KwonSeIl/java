/*
 * 246page
 * 	변수의 종류
 * 	--------
 * 	 class ClassName
 *   {
 *   	-------------------------------
 *   	멤버변수(전역변수)
 *   		= 인스턴스 변수
 *   		= 클래스 변수, 공유변수
 *   	-------------------------------
 *   	void 메소드(--------- 매개변수)
 *   	{
 *   		-------------------------
 *   		지역변수
 *   		-------------------------
 *   	}
 *   }
 *   ---------------------------------------------------
 *    종류			선언위치						생성시기
 *   ---------------------------------------------------
 *    인스턴스변수		클래스 블럭					인스턴스를 생성
 *    				class ClassName			클래스변수=new 클래스();
 *    				{								---
 *    					------				반드시 new 사용시에 생성
 *    				}						***따로 메모리가 생김
 *    										설정)
 *    										class ClassName
 *    										{
 *    											데이터형 변수명;
 *    											데이터형 변수명;
 *    											...
 *    											예) int score;
 *    												String name;
 *    												String sex;
 *    										}
 *   --------------------------------------------------
 *    클래스변수		클래스 블럭					컴파일될 때 자동으로 생성되는 변수
 *    				class ClassName			***한개만 생성되기 때문에 모든 객체가 공유하는 변수
 *    				{						class ClassNmae
 *    				}						{
 *    				=> 클래스 영역 안에 생성			static int a;
 *    					(클래스변수,인스턴스변수)		static int b;
 *    											static String c,d,e;
 *    										}
 *    					1) 인스턴스 변수
 *    					2) 클래스 변수
 *    					--------------> 기본 디폴트 초기화 
 *    					int => 0
 *    					long => 0L
 *    					float => 0.0F
 *    					double => 0.0
 *    					boolean => false
 *    					클래스 => null(주소가 없는 상태): 예) String name; => null
 *    					--------------------------
 *    					 => 클래스 변수: 한번에 모든 객체의 데이터를 변경(공통변수)
 *    					 => 사용법
 *    						1) 인스턴스 변수
 *    							객체명.변수
 *    								Scanner scan=new Scnaaer(System.in)
 *    								scan.nextInt()
 *    						2) 클래스 변수
 *    							1. 객체명.변수
 *    							2. 클래스명.변수 : Math.random()
 *   ---------------------------------------------------
 *    매개변수			메소드 괄호 안에 선언된 변수	메소드 호출후에 데이터를 전송했을 경우에 생성되는 변수
 *    				메소드명(------)			*** 사용자의 요청값을 받는 경우
 *    										void display(int a)
 *    										{
 *    										}
 *    										=> display(10)
 *    										*** 호출후에 자동으로 메모리 해제
 *    										*** Stack 영역에 저장(메모리 자체에 관리)
 *   ----------------------------------------------------
 *    지역변수			메소드 블럭 안에 선언되는 변수	메소드 호출시마다 생성되는 변수
 *    				메소드명()					display()
 *    				{						{
 *    					----------				int a=0;
 *    				}						}
 *    										*** 루프변수(반복문)
 *    										*** 반드시 초기화를 해야함 
 *    
 *    변수 => 기본형, 배열, 클래스
 *    		 --------------- 변수
 *    		 기본형: 한개의 데이터만 저장 가능
 *    		 배열: (관련된 데이터) 같은 데이터형을 모아서 저장
 *    		 클래스: (관련된 데이터) 다른 데이터형을 모아서 저장
 *   ----------------------------------------------------
 *   
 *   같은 학교에 대한 클래스 설계
 *   class Student
 *   {
 *   	int hakbun;
 *   	String name;
 *   	String subject;
 *   	---------------
 *   	static String schoolName; //메모리에 저장이 되어있는 상태(static:자동메모리 할당)
 *   }
 *   
 *   Student s1=new Student(); //hakbun,name,subject => 메모리에 저장되는 시점 (12byte)
 *   s1.hakbun
 *   s1.name
 *   s1.subject
 *   ----------------->
 *   s1.schoolName
 *   Student.schoolNmae => 메소드, 변수 => 클래스명으로 접근하면 (static): 예) Math
 *	
 *	 String s="Hello Java";
 *	 s.substring()
 *	 s.trim()
 *	 s.length()
 *	 String.valueOf() => static
 */
class Card
{
	int number;
	String image;
	static int width,height;
}
public class 변수종류_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card card1=new Card(); //저장공간이 다르다(인스턴스변수)
		card1.number=2;
		card1.image="♠";
		card1.width=100;
		card1.height=100;
		
		Card card2=new Card(); //저장공간이 다르다(인스턴스변수)
		card2.number=5;
		card2.image="♣";
		card2.width=100;
		card2.height=100;

		Card card3=new Card(); //저장공간이 다르다(인스턴스변수)
		card3.number=7;
		card3.image="♥";
		card3.width=100;
		card3.height=100;

		Card card4=new Card(); //인스턴스 변수 사용법: 객체명.변수명
		card4.number=9;
		card4.image="◆";
		card4.width=100;
		card4.height=100;
		
		//출력
		System.out.println(card1.number);
		System.out.println(card1.image);
		System.out.println(card1.width);
		System.out.println(card1.height);
		
		System.out.println(card2.number);
		System.out.println(card2.image);
		System.out.println(card2.width);
		System.out.println(card2.height);
		
		System.out.println(card3.number);
		System.out.println(card3.image);
		System.out.println(card3.width);
		System.out.println(card3.height);
		
		System.out.println(card4.number);
		System.out.println(card4.image);
		System.out.println(card4.width);
		System.out.println(card4.height);
		
		System.out.println("=========================");
		card1.width=300;
		card1.height=350;
		
		Card.width=450;
		Card.height=500;
		System.out.println("============card1========");
		System.out.println(card1.width);
		System.out.println(card1.height);
		System.out.println("============card2========");
		System.out.println(card2.width);
		System.out.println(card2.height);
		System.out.println("============card3========");
		System.out.println(card3.width);
		System.out.println(card3.height);
		System.out.println("==============card4========");
		System.out.println(card4.width);
		System.out.println(card4.height);
		
		//static => 메모리 공간이 동일 => 공유메모리
		/*  
		 * [인스턴스 변수 vs 클래스 변수 차이점]
		 * 	인스턴스 변수는 객체가 생성될 때 객체마다 각기 다른 메모리를 생성하기 때문에 다른 값을 유지함(***)
		 * 	클래스 변수는 저장공간이 1개만 생성되기 때문에 항상 같은 값을 유지한다
		 * 
		 */
		
		
		
		
		
	}

}
