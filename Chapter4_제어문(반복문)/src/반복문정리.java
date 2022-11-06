/*
 * 	반복문 => 반복적인 소스 모아 한번에 처리
 * 	----------------------------
 * 	for(시작값;끝나는값;증가식)
 * 
 * 	1~100
 * 	for(int i=1;i<=100;i++)
 * 	15~250
 * 	for(int i=15;i<=250;i++)
 * 	10~100 10씩 증가
 * 	for(int i=10;i<=100;i+=10)
 * 
 * 	=> 누적(합), 곱, 개수
 * 	   -- sum=0		gop=1	count=0 => 산술연산 
 * 		  sum+=i, gop*=i, count++
 * 	   -----	  ---
 * 		->총 구매액   ->구매개수 ==> 브라우저로 전송(받은 값을 출력), 모바일로 전송  
 * 		request.setAttribute("total",100000) -> 받은 값 출력
 * 		{"total":100000} => JSON (모바일)
 * 	=> count --> 추천할 때 사용多(네이버, 카카오)
 * 	*** 변수 개수 확인 -> 초기값 확인
 * 	*** 연산자
 * 	*** 제어문
 * 	----------------------> 메소드(여러개 => 클래스) ==> 암기(라이브러리) 
 * 
 * 	형식)
 *			1	 2		4 
 * 		for(시작값;범위(끝);증가식)
 * 		{
 * 			반복실행문장 3
 * 		}
 * 		1-2-3-4
 * 		  2-3-4 => 2번이 false:종료
 * 
 * 		for(int i=1;i<=10;i++)
 * 		{
 * 			
 * 		}
 * 		i=1 -> i<=10 ==> true 문장 수행
 * 		i++
 * 		i=2 -> i<=10 ==> true
 * 		....
 * 		i=11 -> i<=10 -> false ----> for문 종료 
 * 
 * 		while: 무한루프(종료하지 않는 프로그램) => while(true): 종료되지 않기 때문에 종료하는  프로그램 첨부해야 함
 * 										게임:ESC -> System.exit(0);
 * 				=> 데이터베이스(핵심)  => 80% 차지 
 * 		=> Front(for) / Back(while)
 * 
 * 		 형식)
 * 			초기값;  -------------1
 * 			while(조건식) --------2 => false 종료
 * 			{
 * 				반복수행문장 -------3
 * 				증가식 -----------4 ===>조건식 이동(2)
 * 			}
 * 
 * 			1~100까지 정수 출력
 * 			int i=1;
 * 			while(i<=100)
 * 			{
 * 				출력
 * 				i++;
 * 			}
 * 
 * 		156page~157page ==>이미지에서 순서 확인 
 * 		156page ==> 형식 
 * 		167page ==>while(형식->이미지 순서)
 */
public class 반복문정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true)
		{
			
		}

	}

}
