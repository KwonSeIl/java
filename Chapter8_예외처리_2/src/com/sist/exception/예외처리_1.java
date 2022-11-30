package com.sist.exception;
/*
 * 	컴파일 (이진파일 변경), 인터프리터 (한줄씩 읽어서 출력) 
 * 	---------------	  --------------------
 * 		javac				java
 * 		  |					  |
 * 		프로그래머 실수			사용자 오류
 * 		----------			--------
 * 		CheckException		UnCheckException(확인하지 않음) => 예외처리 생략 가능
 * 		컴파일러가 예외처리가 되었는지 여부 확인
 * 
 * 		CheckException
 * 		  = IOException: 파일명, 경로명 문제 발생 경우
 * 		  = ClassNotFoundException: 클래스가 없는 경우(리플렉션 => new 없이 메모리 할당 가능) 
 * 		  = SQLException: 데이터베이스 연결(오라클, MySQL)
 * 		  = INterruptedException: 쓰레드 충돌 방지 위해 사용 
 * 		  = MalformedURLException: IP,URL 주소가 틀린 경우 ==> 크롤링 시에도 나타남 
 * 		UnCheckException
 * 		  = ArrayIndexOutOfBoundsException: 배열범위 초과할 경우(인덱스번호 오류)
 * 											=> 12장 (컬렉션)
 * 		  = NumberFormatException: 정수 변환 ==> 웹/윈도우는 정수를 전송할 수 없음(문자열) 
 * 		  = NullPointerException: 객체 생성없이 선언 후 사용
 * 								  모든 클래스는 기본값 null => 메소드나 변수 사용이 불가능 
 * 		  = ClassCastException: 클래스 형변환 ==> 제네릭스 사용(자동 형변환)
 * 		  class A<T> : 임시클래스 ==> Object
 * 		  {
 * 			String
 * 			public void setT(T t)
 * 			{
 * 			}
 * 			public T getT()
 * 			{
 * 			}
 * 		  }
 * 		 ----------------------------------------------------------
 * 		1) 처리방법
 * 		  ***1. 예외 복구(직접처리) try~catch~finally: 프로그래머가 처리
 * 		  ***2. 예외 회피(간접처리) throws: 시스템에 알려줌(예외 떠넘기기)
 * 				라이브러리에 많이 존재
 * 				sleep() throws InterruptedException
 * 		  3. 예외 던지기(임의로 발생) throw: 사용빈도 거의 없음(continue 대신 많이 사용)
 * 			 ---------------- 사용자정의 예외처리 
 * 		2) 사용법
 * 		  try: 정상수행이 가능한 코딩(예외 발생 가능성) ==> 에러에 대비한 코딩 
 * 				=> 프로그래머의 실수
 * 				=> 사용자 입력 오류
 * 		  catch: 오류 발생시에 어떻게 처리할지 코딩(복구=>에러확인)
 * 				=> 프로그래머 실수(복구) -> 소스 수정
 * 				=> 사용자 실수 -> 다시 입력을 요청 
 * 				=> 예상되는 에러만큼 catch를 사용할 수 있다(멀티) ==> 통합해서 사용 가능 
 * 				=> 전체예외처리가 가능한 클래스: Exception/Throwable
 *        finally: 무조건 수행
 *        			try에서 수행 -> 정상 수행
 *        			catch에서 수행 -> 오류 발생
 *        			try/catch수행 상관없이 무조건 수행(닫기:파일,서버연결 해제,DB 닫기)
 *        -----------> 생략이 가능(필요시에만 사용)
 *        
 *        예)	
 *        		사이트 => 오류(다음화면이 없다), 로딩시간이 오래 걸린다 ==> 사이트 이동
 *        		String num="10";		// String num=" 10"; ==> 오류 발생(오류에 대한 대비가 없는 경우) -> 프로그램 종료 
 * 		 		=> 정수로 변환
 * 				int i=Integer.parsInt(num);
 * 				1------
 * 				2------
 * 				3------
 * 				4------
 * 				5------
 * 				------------------------------- 정상수행(5번까지 수행)
 * 
 * 				에러발생에 대한 대비
 * 				-------------
 * 				try
 * 				{
 * 					문장1	==> 정상수행
 * 					문장2	==> 정상수행  
 * 					문장3	==> 정상수행 --> try가 종료한 다음에 catch는 수행하지 않고 다음문장으로 넘어감 
 * 				}catch(A)
 * 				{
 * 					처리문장4
 * 				}
 * 				catch(B)
 * 				{
 * 					처리문장5
 * 				}
 * 				chtch(C)
 * 				{
 * 					처리문장6
 * 				}
 * 				문장7
 * 				-------------------------------------------------------------------
 * 				try
 * 				{
 * 					문장1	==> 정상수행
 * 					문장2	==> 오류발생 (B) --> B라는 오류를 찾는다  
 * 					문장3	==> 정상수행 
 * 						|
 * 				}catch(A)	==> 다중조건문(선택문)
 * 				{
 * 					처리문장4
 * 				}	   |	
 * 				catch(B)
 * 				{
 * 					처리문장5
 * 				}	   |
 * 				chtch(C)
 * 				{
 * 					처리문장6
 * 				}
 * 				문장7
 * 				--------------------------------------------------------------------
 * 				try
 * 				{
 * 					문장1	==> 정상수행
 * 					문장2	==> 오류발생 (B) --> B라는 오류를 찾는다  
 * 					문장3	==> 정상수행 
 * 						|
 * 				}catch(A|B|C)	==> 다중조건문(선택문)
 * 				{
 * 					처리문장4
 * 				}	   
 * 				
 * 				문장7
 * 				----------------------------------------------
 * 				try
 * 				{
 * 					문장1	==> 정상수행
 * 					문장2	==> 오류발생 (B) --> B라는 오류를 찾는다  
 * 					문장3	==> 정상수행 
 * 						|
 * 				}catch(Exception)	==> 다중조건문(선택문)  Exception:모든 예외처리가 가능 
 * 				{
 * 					처리문장4
 * 				}	   
 * 				
 * 				문장7
 * 				
 * 
 */
import java.util.Scanner;
public class 예외처리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// UnCheckException => 예외처리 생략 가능 ==> 정수변환, 배열, 나누기
		try
		{
			Scanner scan=new Scanner(System.in);
			System.out.print("정수 두개 입력(10 10):");
			int[] arr=new int[2];
			arr[0]=scan.nextInt();
			arr[2]=scan.nextInt(); //오류 발생 -> 프로그램 비정상 종료
			
			int res=arr[0]/arr[1];
			System.out.println("res="+res);
		}catch(ArrayIndexOutOfBoundsException ex)
		{
			// 에러 확인
			//System.out.println(ex.getMessage()); //처리
			ex.printStackTrace(); //실행과정을 출력 ==> 422page
		}
		System.out.println("프로그램 종료");
	}

}
