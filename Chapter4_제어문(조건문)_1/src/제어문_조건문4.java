/*
 * 	1. 136page 
 * 		----> if문 형식 기억
 * 	2.	137page
 * 		---->조건식: 부정연산자, 비교연산자, 논리연산자 기억 (결과값 true/false)
 * 		C언어 if(1), if(0) --> java에선 오류
 * 	3. 138page
 * 		// 보통 제어문은 바로 밑에 있는 문장 1개만 수행
 * 		if()
 * 		{
 * 			// 조건이 true일 때 수행되는 문장
 * 			// 수행해야되는 문장 여러개일 때 사용 
 * 		}
 * 	4. 140page
 * 		if~else
 * 		형식)
 * 		  if(조건)
 * 		    조건 true일 때 처리
 * 		  else
 * 			조건 false일 때 처리
 * 	-------------------------------------------------------------
 */
import java.util.Scanner;
public class 제어문_조건문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("========== Menu =========");
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("3. 영화목록 요청");
		System.out.println("4. 영화 상세보기");
		System.out.println("5. 예매");
		System.out.println("6. 종료");
		System.out.println("=========================");
		// 단일 조건문, 다중조건문 
		Scanner scan=new Scanner(System.in);
		System.out.print("메뉴 선택(1~6):");
		int menu=scan.nextInt();
		if(menu==1)
			System.out.println("로그인 요청하셨습니다.");
		if(menu==2)
			System.out.println("회원가입을 요청하셨습니다.");
		if(menu==3)
			System.out.println("영화목록을 요청하셨습니다.");
		if(menu==4)
			System.out.println("영화 상세보기를 요청하셨습니다.");
		if(menu==5)
			System.out.println("영화 예매를 요청하셨습니다.");
		if(menu==6)
			System.exit(0); // 프로그램 종료
	}

}


