/*
 * 	1. 단항연산자
 * 	 = 증감연산자(++,--): 반복문, 데이터베이스 값 읽는 경우, 파일 읽기
 * 	   => 한개를 증가, 한개를 감소(정수형,문자형)
 * 	   ***전치연산자 ++a: 먼저 증가 후 대입
 * 		int a=10;
 * 		int b=++a;
 * 		 -> ++a, b=a
 * 	   ***후치연산자 a++: 대입 후 증가
 * 		int a=10;
 * 		int b=a++;
 * 		 -> b=a, a++
 *   = 부정연산자(!): 조건문, 예약일이 아닌 경우
 *     => boolean에서만 사용 가능(true/false)
 *     => 좌석 예매 => 영화, (맛집, 도서관)=>선택권한X
 *   = 형변환연산자: 자동처리, 필요할 때 강제형변환(숫자 관련=> 정수,문자,실수 등장) 
 *     => 클래스형변환(*************)
 *     => (데이텨형)값 ======> 큰 데이터형(자동), 작은 데이터형(강제)
 *     	 (char)65, (int)10.5
 *     	 *** 오버플로우 발생 가능성 있음 ===> (int)300 -> 44
 *   = 음수/양수(-,+)
 *  2. 이항연산자: 연산자는 항상 같은 데이터형이 있어야 연산처리 됨(다른 데이터형이 있는 경우에 변경 처리) 
 *   = 산술연산자(+, -, *, /, %)=> 웹에서 가장 많이 사용되는 연산자 
 *   	=> 다른 데이터형을 묶어서 연산 -> 자동형변환됨(산술변환)
 *   	  (가장 큰 데이터형으로 변환)
 *   	 int + int = int, long + long = long, double + double = double
 *   	 int + long = long
 *   	 ----------(X)
 *   	 int => long
 *   
 *    	 double + int 
 *    			  --- double => double + double = double 
 *    	 (int)double + int = int 
 *      => /: 0으로 나눌 수X, 정수/정수=정수 ==> 소수점(정수/실수)
 *      	5/2 => 2.5=> 2
 *      => %: 결과값이 왼쪽부호 따라옴.
 *      	+ % + => +
 *      	- % + => -
 *      	+ % - => +
 *      	- % - => -
 *   = 비교연산자: 조건문, 반복문 => 응용(제어문), 삼항연산자  -> 결과값 boolean(true/false)
 *   		==: 같다(정수,실수,문자,논리). 문자열은 비교 불가(equals), 객체비교(instanceof)
 *   		!=: 같지 않다(정수,실수,문자,논리)
 *   		<: 작다(정수,실수,문자)
 *   		>: 크다(정수,실수,문자)
 *   		<=: 작거나 같다(정수,실수,문자)  ==> < || ==
 *   		>=: 크거나 같다(정수,실수,문자)	 ==> > || ==
 *   = 논리연산자: 조건문, 반복문(제어문에서 주로 사용) ====> 결과값 boolean(true/false) 
 *   	*** && > || (연산 우선순위 &&)
 *   	&&(범위 포함)=> 두개 조건 true-> true , ||(범위 미포함)=> 두개 중 한개 이상 true->true
 *   	(조건) && (조건) 
 *   	(조건) || (조건)  
 *   	=> 효율적인 연산
 *   	 (조건) && (조건)
 *   	  flase   -----> 수행X: 앞에 조건이 false일 확률이 높은 것을 앞에 배치 
 *   	 (조건) || (조건)
 *   	  true    ----> 수행X: 앞에 조건이 true일 확률이 높은 것을 앞에 배치 
 *   = 대입연산자
 *   	= 대입(값)
 *   	 int a=10; a에 10을 대입
 *   	= +=
 *      --------->a+=5; -> a값에 5를 더함
 *   	= -=
 *      --------->a-=5; -> a값에 5를 뺌
 *   	= *= 
 *      ---------->a*=5 -> a값에 5를 곱함
 *      = /=
 *      ---------->a/=5; -> a값에 5를 나눔 
 *      복합대입연산자
 *   
 */
// 국어,영어,수학 점수를 받아서 총점, 평균을 구한 다음 60이상 Pass, 60이하 Fail
import java.util.Scanner;
public class 연산자정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in); // 키보드 입력값을 받을 준비=> 클래스는 메모리에 저장할 때 반드시 new 사용
		// ==> JVM에서 저장메모리 크기를 확인하고 배치함 ==> heap(관리는 GC에서) 
		System.out.print("국여,영어,수학 점수 입력(90 90 90):");
		int kor=scanner.nextInt();
		int eng=scanner.nextInt();
		int math=scanner.nextInt();
		
		int total=kor+eng+math;
		double avg=total/3.0;
		
		int temp=(int)avg;
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg);
		System.out.println(temp>60?"Pass":"Fail");
		
		

	}

}
