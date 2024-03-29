/*
 * 	자바에서 지원하는 제어문
 * 	 1) 조건문(1.형식, 2.조건식) ==> 136~137page
 * 	 	----------------------------------
 * 		if(조건)
 * 		{
 * 			조건이 true일 때 실행하는 문장 ==> 단일조건문(false일 때는 if를 건너뜀)
 * 		}
 * 		==> 검색, 로그인 처리, ID 중복, 우편번호 검색, 상세보기
 * 		----------------------------------
 * 		if(조건)
 * 		{
 * 			조건이 true일 때 처리
 * 		}
 * 		else
 * 		{
 * 			조건이 false일 때 처리
 * 		}
 * 		==> 선택 조건문(한줄로 변경 시 -> 삼항연산자) 
 * 		==> 예약일 /예약일 아닌 경우
 * 		==> 로그인 상태, 쿠키 저장, 확인(입력)
 * 		----------------------------------
 * 		if(조건)
 * 		{
 * 			조건이 true면 수행하는 문장 ==> 문장 수행하고 종료
 * 			조건이 false면 다음 조건으로 이동
 * 		}
 * 		else if(조건)
 * 		{
 * 			조건이 true면 수행하는 문장 ==> 문장 수행하고 종료
 * 			조건이 false면 다음 조건으로 이동
 * 		}
 * 		else if(조건)
 * 		{
 *  		조건이 true면 수행하는 문장 ==> 문장 수행하고 종료
 * 			조건이 false면 다음 조건으로 이동
 * 		}
 * 		else
 * 		{
 * 			해당 조건이 없는 경우 무조건 수행하는 문장
 * 		}
 * 		==> 메뉴 처리, 권한 부여, 별점
 * 		----------------------------------
 * 		*** 조건(true/false) ==> 부정연산자, 논리연산자, 비교연산자,equals
 * 	 2) 선택문
 * 		----> 게임, 네트워크(프로토콜)
 * 			  서버 <======> 클라이언트
 * 				    약속사항(=프로토콜)
 * 			  id,pwd,nickname ==> 서버에서는 알지 못함
 * 
 * 		 형식)
 * 			=> 한개의 데이터를 처리할 경우에 주로 사용
 * 			switch(문자열,문자,정수)
 * 			{
 * 				case 값:
 * 					처리문장
 * 					break;
 * 				case 값:
 * 					처리문장
 * 					break;
 * 				case 값:
 * 					처리문장
 * 					break;
 * 				default:
 * 					처리문장
 * 			}
 * 			**** 모든 case에 break가 있는 것은 아님
 * 				case 10: case9: 처리 break
 * 			*** default는 생략 가능
 * 			*** 값을 받는 경우 --> 문자열을 받아서 처리할 수 있음 
 * 			*** 게임(키보드) ==> 윈도우 
 * 	 3)	반복문
 * 	 4) 반복제어문 
 */
// 경우의 수 ==> 1개 :if. 2개:if~else. 3개:다중 조건문 
// => 로그인 처리 
// => 로그인 처리 -> id체크, pwd체크 ==> 다중조건문 
import java.util.Scanner;
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String ID="Admin";
		final String PWD="1234";
		
		Scanner scan=new Scanner(System.in);
		System.out.print("ID를 입력하세요:");
		String id=scan.next();
		
		System.out.print("비밀번호를 입력하세요:");
		String pwd=scan.next();
		/*
		 *  equalsIgnoreCase: 대소문자 구분X
		 *  equals: 대소문자 구분 
		 */
		
		//로그인
		/*
		if(id.equalsIgnoreCase(ID) && pwd.equals(PWD))
		{
			System.out.println("로그인 되었습니다.");
			System.out.println("메인페이지로 이동");
		}
		else
		{
			System.out.println("로그인 실패입니다.");
			System.out.println("로그인 || 회원가입으로 이동");
		} */
		//중첩 조건문
		if(id.equals(ID)) // ==주면 오류 발생
		{
			if(pwd.equals(PWD))
			{
				System.out.println("로그인 되었습니다.");
			}
			else
			{
				System.out.println("비밀번호가 틀립니다.");
			}
		}
		else
		{
			System.out.println("ID가 존재하지 않습니다");
		}

	}

}
