/*
 * 1. 실행과정
 * 	.java (원시소스: 프로그래머만 아는 코드)
 * 	.class (컴파일된 파일: 0,1만들어진 바이너리 파일=>컴퓨터만 알아볼 수 있는 언어)
 * Hello.java =======> Hello.class ======>JVM(main을 번역) ==>화면
 * 			   javac 				java
 * 
 * 2. 변수: 데이터관리 프로그램(메모리에 한개의 데이터를 저장하는 공간)
 * 3. 변수명 설정 방법
 * 		1) 알파벳,한글로 시작 (알파벳은 대소문자 구분) 
 * 		2) 숫자사용 가능(앞에서 사용X)
 * 		3) 특수문자(_,$) ==>$abc, main_class, main$class ==> $는 사용빈도 없음
 * 						 _앞, 뒤에==> 임시파일, 임시변수
 * 		4) 키워드 사용X ==> public, int, double
 * 		5) 문법사항 아님
 * 		   변수: 소문자시작
 * 		   상수: 모든 문자 대문자 
 * 	  데이터형 (기본형: 자바에서 지원하는 메모리 크기)
 * 	  정수
 * 		byte(-128~127:8bit=1byte)
 * 		int(모든 정수는 int를 인식, -21억 4천~21억 4천. 32bit=4byte)
 * 		long(64bit=8byte)
 * 		==>int, long 구분시에 접미어 사용 (L,l) ==> 100L, 100
 * 	  실수
 * 		double(8byte ==> 소수점 15자리)
 * 	  문자
 * 		char(2byte ==>unsigned(음수 없는 상태)0~65535 => 모든문자에는 정수값을 사용)
 * 			'A':65 'a':97 '0':48==> 아스키 코드값
 * 			==> char는 연산시에 정수형으로 변경 
 * 	  논리
 * 		boolean (1byte==> true/false). 다른프로그래밍(false:0,0.0)==>true==>삼항연산자, 조건문, 반복문
 * 	  초기값
 * 		byte _byte=1;
 * 		short _short=2;    ===> _byte 
 *		int _int=3;   ===> _byte,_short,_char
 *		long _long=4L;    ====> _byte,_short,_char, _int
 *		char _char='A';    ====> _byte
 *		float _float=10.1F;   ====>_byte,_short,_char,_int,_long
 *		double _double=10.2;    ==>_byte,_short,_char,_int,_long,_float
 *
 *		예)
 *		double d=10.5;
 *				 ------
 *					'A'  ==>65.0 저장
 *					10  ==> 10.0
 *					10.5F ==> 10.5
 *					10L ==> 10.0
 *		int i=10;
 *			  'A'
 *			  10L (X)
 *			  10.5(x)
 *			  10.5F(x)
 *		데이터 크기
 *		byte < short < int <long < float < double 
 *				char
 *		------------------------------------------
 *		문자열 "" ==> 여러개의 문자 사용 ==> 문자열 저장 공간(string)
 *		결합: +
 *		"a="+7 ==> "a=7"
 *		7+"a" ==> "7a"
 *		
 */
public class 변수총정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int rank=2; 
		 
		System.out.println(rank+"위");
		rank++;
		System.out.println(rank+"위"); */
		double d=10.5;
		System.out.println("d="+d);
		d='A'; // char ==> double로 자동변환 'A'==>65.0
		System.out.println("d="+d);
		d=10; //int ==> double 10 ==> 10.0
		System.out.println("d="+d);
		d=10L;
		System.out.println("d="+d);
		d=10.7F;
		System.out.println("d="+d);
		
		long a=(long)10.5F;
	}

}
