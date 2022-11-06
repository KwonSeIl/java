/*
 * 	연산자
 * 	----
 * 	 단항연산자 
 * 	  증감연산자(++, --)
 * 	  부정연산자(!)
 * 	  형변환연산자 (type)
 * 	 이항연산자
 *    산술연산자(+, -, *, /, %) -> 가장 많이 사용되는 연산자
 *    비교연산자(==,!=,<,>,<=,>=)
 *    논리연산자(&&, ||)
 *    대입연산자(=, +=, -=)
 * 	 삼항연산자
 * 	  (조건)?값1:값2
 * 
 * 	 *** 제어문 관련 => 부정, 비교, 논리 (조건,반복) ==>조건(t/f) ->결과 boolean
 * 		 연산 + 제어  
 * 
 * 	 91page: 연산자 우선순위 => 비트연산자/ 쉬프트연산자 (제외)
 * 	  단항연산자 -> 산술연산자 -> 비교연산자 -> 논리연산자 = 대입연산자
 * 	 91~92page: 산술변환 
 * 	   => 연산은 항상 같은 타입끼리 연산 
 * 		  --------------------> 같은 데이터형으로 변경 후 연산처리 (자동형변환: 큰 데이터형으로)
 * 	 	int + double
 * 		--- double ====> double+double = double (자동)
 * 		사용자(프로그래머)가 변경 => 강제형변환
 * 		int + (int)double = int 
 * 	 92page: int 이하 데이터형 (byte, char) 연산 -> int
 * 		byte + byte = int
 * 		char + char = int
 * 		byte + char = int
 * 		*** int/int=int ==> int/double ==>소수점 인식
 * 	 93page
 * 	  단항연산자
 * 		++,--
 * 		한개증가, 감소 ==>
 * 		a++, a=a+1, ++a, a+=1 =>1개 증가 
 * 		a--, a=a-1, --a, a-=1 =>1개 감소   
 * 		** 전치(++a)
 * 		 결과값을 대입 -> 증가된 값 대입
 * 		** 후치(a++)
 * 		 결과값을 대입 -> 대입하고 나중에 증가
 * 		int a=10;
 * 		System.out.println(a); =>10
 * 		System.out.println(a++); => 10
 * 
 * 		int a=10;
 * 		int b = ++a;
 * 				---1
 * 			----2
 * 		int a=10;
 * 		int b = a++;
 * 			-----1
 * 				---2
 * 	 96page:(음수/양수)
 * 		int a=10;
 * 		a=-a; ======>a=-10
 * 	 97page:산술연산자
 * 	  => 산술변환이 있음(데이터형이 같은 것만 연산 -> 큰 데이터형으로 변경 후 처리) => 필요시에만 강제로 변경
 * 		int + double
 * 		---double
 * 		10+10.5
 * 		--> 10.0변경
 * 		--------> 20.5
 * 
 * 		10+(int)10.5
 * 		-------------> 20
 * 
 * 		10/3 = 3
 * 		10/(double)3 = 3.33
 * 		------------------------
 * 		/ (0으로 나눌 수X) ==> 조건(오류처리), 정수/정수=정수 => 필요시 정수를 실수로 변환 
 * 		% 부호가 왼쪽편 따라감 
 * 		*** +,-보다 *,/,%가 우선순위
 * 		예) 5+6*10
 * 			 ----1
 * 			---2   => 65
 * 			(5+6)*10=110 ==> (): 최우선순위 연산자
 * 		***작은 데이터형으로 연산 결과 받는 경우 오버플로우 발생(저장 범위를 벗어남) 
 * 		 byte b=(byte)300; ==> 12 ====> 44
 * 		 ----------------
 * 		  256+44
 * 			  -- 32+8+4
 * 		  ->(1)00101100
 * 		   b = 00101100 => 32+8+4 => 44
 * 		-----------------------------------------------------
 *   	+,-,* ==> 누적(장바구니 -> 물품 가격계산, 수량)
 *   	/,% ==> 통계 
 *   	산술연산자 ==> 결과값 지정X 
 *   109page: 비교연산자(결과값 무조건 boolean)
 *   	==, !=, <, >, <=, >= ==>숫자외 관련X 사용X(정수,실수,문자)
 *   	------(정수,실수,문자,논리)
 *   				  ------ (< || =, > || =)
 *   114page: 논리연산자(결과값 무조건 boolean)
 *   	&&: 범위가 포함
 *   		(조건) && (조건) ==> 조건 2개 동시 true->true
 *   	||: 범위가 미포함 
 *   		(조건) || (조건) ==> 조건중 1개 이상 true->true
 *   	***118page: 효율적인 연산
 *   	 &&: (조건) && (조건)
 *   		  ---false ==> 다음조건 확인없이 false 출력
 *   	 ||: (조건) || (조건)
 *   		 ----true ==> 다음조건 확인없이 true 출력 
 *   130page: 삼항연산자(단점: 결과값을 알 수X)
 *   	(조건)?값:값
 *   	-------true
 *   	---------false 
 *   
 *   	int a=10;
 *   	a%2==0?"짝수":"홀수"
 *   	
 *   	a%2==0?true:false
 *   	
 *   	a%2==0?'Y':'N'
 *   부정,논리,비교연산자는 결과값 명확
 *   
 *   132page: 대입연산자
 *   	=, (+=, -=, /=: 복합대입연산자)
 *   	int a=10; => 10을 a에 대입해라
 *   	a+=1; =>a에 1을 더한 값을 저장 
 *   	----------------a=a+1;
 *   	a-=1; =>a에 1 뺀 값 저장
 *   	-----------------a=a-1;
 *   	a/=2; =>a의 값을 2로 나눈값 저장
 *   	-----------------a=a/2;
 *   
 *   	=================> a++, a--: 여러개 감소, 증가 => a+=5;
 *   
 *   
 */
import java.util.Scanner;
public class 연산자정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("국어, 영어, 수학점수");
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();

		int total=kor+eng+math;
		double avg=total/3.0;
		int temp=(int)avg;
		System.out.println("총합="+total);
		System.out.println("평균="+temp);
		System.out.println((kor>=40 && eng>=40 && math>=40 && temp>=60)?"합격":"불합격");




	}

}
