/*
 *  1. 변수(20~21page), 데이터형(27~29page) 정리
 *  2. 연산자(86page) 정리
 *  ---------------------
 *  
 *  1. 데이터형
 *  	정수형(int, long, byte), 실수형(double) , 논리형(boolean) , 문자형(char)
 *  2. 변수: 한개의 데이터만 저장 가능 
 *   	= 초기화 형식
 *   	  char ==> '값'
 *   	  int, byte ==> 10,20...
 *   	  loong ==> 10L(l)
 *   	  double ==> 0.00
 *   	  ------------------------다른 데이터형의 값을 지정할 수 있음(형변환) 
 *   	  boolean ==> true/false
 *   	= 변수 장점: 필요시마다 값 변경이 가능
 *   	  int a=10;
 *   	  a=20;
 *   	= 변수 설정하는 방법
 *   	  1) 문장을 보고 변수 찾기
 *   	  2) 실제 출력된 화면 
 *   	  3) 실제 동작하는 화면 
 *   3. 출력하는 기능 / 입력받는 기능
 *   	*****System.out.println(): 한줄씩 출력
 *   	System.out.print(): 옆에 붙여 출력
 *   	System.out.printf(): 서식
 *   
 *   	Scanner scan=new Scanner(System.in)
 *   				---- 클래스를 저장할 때 사용함 
 *   	* Integer.toOctalString(0): 정수를 8진법으로 변경
 *   	* Integer.toHexString(0): 16진법으로 변경
 *   	* Integer.toBinaryString(0): 2진법으로 변경
 *   4. 연산자(87page)
 *   	단항연산자(93page)
 *   	*** = 증감연산자(++,--): 전치연산자(++a), 후치연산자(a++) => 1개 증가하는 것은 동일
 *   		int a=10;
 *   		int b=++a; ==> ++a, b=a
 *   
 *   		int a=10;
 *   		int b=a++; ==>a는 1 증가 , b=a, a++
 *   	 ***= 부정연산자(!): boolean(반복문, 조건문) (119page)
 *   	*** = 형변환연산자: (type) ==>(int),(char),(double),(byte) =>82page
 *   		***작은 데이터형으로 변환: 오버플로우
 *   		  byte b=(byte)300; => b=44
 *   	 = 음수, 양수(-,+) ==>
 *   		int k=10; ==> k=-k
 *   	이항연산자
 *   	 ***= 산술연산자(+,-,*,/,%) ==> 형변환 주의
 *   	 = 비트연산자(&,|,^) => 내일만
 *   	 = 쉬프트연산자(<<,>>) => 내일만
 *   	 ***= 비교연산자(==,!=,<,>,<=,>=) ==> 결과값 boolean => 조건문 
 *   	*** = 논리연산자(&&,||) => 효율적 연산 주의
 *   	 ***= 대입연산자 (=,+=,-=), *= /= %= &= |= ^=
 *   	삼항연산자
 *   	 (조건)?값1:값2 ==> 페이징 
 *   		if()
 *   		{
 *   		}
 *   		else
 *   		{
 *   		}
 */
public class 연산자총정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
