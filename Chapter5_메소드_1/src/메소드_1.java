/*
 * 	메소드
 * 	 구성요소
 * 	 : 처리 결과값(리턴값)		사용자	요청값(매개변수)
 * 	 예) 정수 두 개를 보내주고 더한 값 달라
 * 		-------매개변수		-----리턴값
 * 		 id,pwd => 로그인 여부 확인 요청 ==> boolean 결과값
 * 	 메소드 제작
 * 		--------------------------
 * 		결과값(리턴형)		  매개변수
 * 		--------------------------
 * 			0				0		=> String substring(int s)
 * 		--------------------------
 * 			0				X		=> String trim()
 * 		--------------------------	
 * 			X				0		=> System.out.println("A")
 * 										void println(String a)
 * 		--------------------------
 * 			X				X		=> System.out.println()
 * 	 호출
 * 	기존에 있는 프로그램을 기능별로 나눠 작업(분업화)
 * 	** 특징) 메소드는 반드시 한 개의 기능만 수행할 수 있게 만든다.(재사용이 편하다)
 * 			입력기능
 * 			처리기능 ==> 세분화
 * 			출력기능
 * 	메소드
 * 	 1) 선언부(원형)
 * 		형식) 리턴형(결과값)	메소드명(매개변수)
 * 	 2) 구현부
 * 		형식) 리턴형(결과값)	메소드명(매개변수)
 * 			{
 * 				//구현
 * 			}
 * 	 3) 더하기 기능
 * 		int add(int a,int b) //리턴형과  return에 있는 데이터형 같거나 커야 함.
 * 		--- long, double ==> 권장사항) 가급적이면 동일하게 
 * 		{
 * 			//맨 마지막 줄에
 * 			return a+b; // 메소드 종료 시점
 * 		}
 * 
 * 		void
 * 		---- 메소드 자체 처리(데이터베이스 => insert, update, delete)
 * 		{
 * 			return; //결과값 없음. 생략 가능 
 * 		}
 * 	
 * 		1. 구성요소
 * 		 1) 매개변수 => 사용자가 요청한 값
 * 					= 로그인요청(id,pwd)
 * 					= ID 중복체크 요청(id)
 * 					***여러개 -> ,로 구분
 * 						--- 3개 이상 => 배열,클래스 이용해 전송
 * 						예)정렬 => 배열
 * 						  회원가입 => 클래스
 * 		 2) 메소드명 => 변수(식별자)
 * 					1. 알파벳, 한글(알파벳 대소문자 구분)
 * 					2. 숫자 사용O(앞에 사용은 X)
 * 					3. 특수문자 사용O(_,$)
 * 					4. 키워드 사용X
 * 					약속사항) 소문자로 시작함
 * 							단어가 2개 이상인 경우: getFileName, get_file_name,nextInt()
 * 			JPA: List<Emp> findByHiredate(int year) => 자동으로 SQL문장 만들어짐. MyBatis  
 * 		 3) 리턴형(결과값): 사용자 요청을 처리한 결과값
 * 						메소드
 * 						 1) 자체 처리(구구단 출력) => void
 * 						 2) 결과값을 넘겨준다(로그인 여부) => 해당 데이터형을 설정
 * 							---- 반드시 1개만 설정 가능 
 * 								---------------> 여러개 나올 경우(배열, 클래스)
 * 		 4) 매개변수
 * 			----- 1) 사용자가 입력(명시적인 초기화, Scanner, random())
 * 				  2) 반복 제어 => 틀린 문장 확인
 * 				  3) 웹 => 검색, 입력, 버튼 클릭, 메뉴 클릭, 페이지 요청, 상세보기
 * 				====> 반드시 자체 출력, 결과값 넘겨줄 것인지 생각
 * 
 */
// => 년도, 월, 일을 입력 
import java.util.Scanner;
public class 메소드_1 {
	/*
	 * 	int userInput()
	 * 	{
	 * 	}
	 * 	=======================>메소드_1 a=new 메소드_1();
	 * 							a.userInput()
	 * 
	 * 	static int userInput()
	 * 	{
	 * 	}
	 * 	==>자동메모리 할당 
	 */
	static int userInput(String msg)  //반복적인 지점 모아놓음 -> 반복제거
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(msg);
		int value=scan.nextInt();
		
		return value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=userInput("년도 입력:");
		int month=userInput("월 입력:");
		int day=userInput("일 입력:");
		/*
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		int year=scan.nextInt();
		
		System.out.print("월 입력:");
		int month=scan.nextInt();
		
		System.out.print("일 입력:");
		int day=scan.nextInt();*/

		System.out.println(year+"년도 "+month+"월 "+day+"일"); 
	}

}
