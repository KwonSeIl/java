/*
 * 	자바에서 지원하는 연산자
 * 	----------------
 * 	 종류 ==> 87page, 91page(우선순위):()
 * 		단항연산자(피연산자 1개)
 * 		  증감연산자:++, --
 * 			1) 전치연산자: ++a, --a
 * 			2) 후치연산자: a++, a--
 * 			-------------------공통점: a를 한개 증가, 감소
 * 			대입, 출력
 * 			 => 증가 먼저, 대입, 출력 먼저인지 따져봐야 함 
 * 			int a=1;
 * 			int b=++a;
 * 				==> 증가 먼저, 증가값을 대입 
 * 					++a;, b=a;
 * 				예)	int a=10;
 * 					System.out.println(++a) ==> 11. 증가 후 출력
 * 
 * 			int a=1;
 * 			int b=a++;
 * 				==> 대입이나 출력 먼저, 증가
 * 				b=a, a++
 * 				예)	int a=10;
 * 					System.out.println(++a) ==> 10. 먼저 출력, 나중에 증가
 * 			*** 무조건 1개 증가, 감소
 * 			a++
 * 			++a
 * 			------한 개 증가 
 * 			a=a+1
 * 			a+=1
 * 			-------여러개 증가 => 복합연산자 
 * 		  부정연산자: ! => boolean만 사용 가능 ==> true=>false, false=true
 * 				if(!예약일)
 * 				예) if(!((year%4==0) && (year%100!=0) || (year%400==0)))
 * 				=> 주로 제어문(if,for,while =>조건문)
 * 				=> 게임: 턴
 * 		  형변환연산자: (데이터형)=> let a=10, let a=10.0, let a='A'
 * 				=>강제 형변환(작게 만듦, 크게 만듦)
 * 						  ------  -------
 * 							(char)65, (int)10.6
 * 							(int)'A', (double)10
 * 							=> 10/3=3, 3.33
 * 								10/(double)3
 * 							=> double d=10/3; ==>3.0
 * 
 * 		이항연산자(피연산자 2개)
 * 		  산술연산자: +,-,*,/,% => 통계, 숫자  자르기 ==> 단독 사용 가능
 * 			1) 형변환(데이터형이 틀릴 경우)
 * 			  예) 10+10.5
 * 				 --- 10.0 ==> 10.0+10.5=20.5 (자동형변환)
 * 			2) +
 * 			 = 산술연산
 * 			 = 문자열 결합
 * 			3) /
 * 			 = 0으로 나눌 수 없음
 * 			 = 정수/정수
 * 			4) %
 * 			 = 결과값이 항상 왼쪽 부호랑 동일
 * 			 예) + % + => +
 * 				 - % - => -
 * 				 - % + => -
 * 				 + % - => + 
 * 		  ----------------------------------------(조건, 범위) => true/false
 * 		  비교연산자: ==, !=, <, >,<=,>=
 * 				  ==================> 숫자 관련, 문자 가능. 문자열은 제외 
 * 				  ======> boolean 비교
 * 				  1. 자바스크립트: ===, !==
 * 				  2. 오라클: =, !=(<>,^=)
 * 				  3. <= ==> (< || ==), >= ==>(> || ==). 6<=6(true)
 * 		  논리연산자: &&, ||
 * 				  &&: 범위, 기간 포함(예약일, 체크인/아웃)
 * 				  --- 직렬 연산자 -> (조건) && (조건)
 * 								 ----	  ---- 동시에 true ==> true, 나머지: false
 * 								 false일 경우 뒤의 조건 처리X (=효율적인 연산자) 
 * 				  ||: 범위를 벗어나는 경우(에러)
 * 				  --- 병렬 연산자 -> (조건) || (조건)
 * 								 ----     ----- 둘 중에 하나 true ==> true
 * 								 true일 경우 뒤의 조건 처리X(=효율적인 연산) 
 * 		  ----------------------------------------제어문에 같이 나옴
 * 		  대입연산자: =, +=, -=, *=
 * 				 기본: 값을 대입, 연산 결과, 변수값을 변경 (=)
 * 					 +=,-=,*=: 복합 대입 연산자. 합, 차, 곱, 제어문 증감을 많이 설정할 때 
 * 					예) int a=10;
 * 						a+=2; ===> a=a+2;
 * 						=> 10+2
 * 						a-=2; ===> a=a-2;
 * 						=> 10-2
 * 						a*=2; ===> a=a*2;
 * 						=> 10*2
 * 		삼항연산자(피연산자 3개) == if~else --> 소스를 줄일 경우 (웹) 삼항연산자 가끔 등장
 * 		 (조건)?값1:값2
 * 		 ---- true-> 값1, false->값2 
 * 		 ***** 고정값(부정연산자, 비교연산자, 논리연산자 => boolean)
 * 			   변동값(산술연산자, 삼항연산자)
 * 				 double+double, int+int
 * 			   	 증감연산자: 정수, 문자 사용O
 * 
 * 		단항연산자 -> 산술연산자 -> 비교연산자 -> 논리연산자 -> 삼항연산자 -> 대입연산자
 * 				 *,/,+,-
 * 		*산술변환
 * 		 ==> 연산자 처리
 * 			1) char ==> int로 변경
 * 			2) 데이터형이 다를 경우 큰 데이터형으로 변환
 * 			 예) long+int ==> long+long=long
 * 				double+long ==> double+double=double
 * 				char+char=int
 * 				byte+byte=int
 * 			3) 정수/정수=정수, 정수/실수=실수
 * 		
 */
public class 연산자_86page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		byte b1=10;
		byte b2=20;
		byte b3=b1+b2; ===> 오류  
		byte b1=10;
		byte b2=20;
		int b3=b1+b2; 로 수정해야 함 */ 
		int a=10;
		// a라는 메모리에 10을 대입(X), 10을 a메모리에 대입 
		System.out.println(a++);
		
		double d=10/3.0;
		//		 -------연산이 먼저 됨 
		System.out.println(d);
		

	}

}
