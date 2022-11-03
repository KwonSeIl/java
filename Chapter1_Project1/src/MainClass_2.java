import java.util.Arrays;

/*
 *  1. 자바설치: jdk.java.net/archive/
 *  	14~18 버전
 *  2. path: c:\jdk-17.02/bin => 실행 파일 가짐(java,javac)
 *  3. classpath: 자바에서 지원하는 라이브러리 사용
 * 					.;c:\jdk-17.02/lib
 * --------------------------------
 *  4. 편집기: eclipse.org => 가장 최신버전(java, javaee)
 *   자바: java se(일반자바==>자바실행도구, 라이브러리) *****
 *   	 java ee(기업용 환경 | 웹) *****
 *   	 java me(모바일) ==>사용빈도x(kotlin 대체) 
 *  5. STS(Spring, Spring-Boot), Oracle
 *  ========================================
 * 	기억해야 할 것
 *  1) 자바 표현법
 *  	숫자관련:
 *  		정수
 *  		=10진법: 10, 20, ...
 *  		=8진법: 012(->10), 011, 달력 ==> 01,02,03,07,08->0XX
 *  		=16진법: 0xFF, 0xXX(사용빈도 거의 없음)
 *  		실수: 10.5(8byte, double), 10.5F (4byte, float)
 *  	문자관련: ''=>한글자만 저장 가능. 'AB'(X)==>'A','홍'
 *  	문자열관련: 한글자 이상. "ABC","A",...
 *  	논리관련: true/false
 *  	========================> 대소문자 구분, 문장 종료 ;
 *  	;의미: 한 문장인지 마침표. 
 *  	컴퓨터에 명령 내리는 것: 순차적으로 내린다(알고리즘) ==>명령 하나에 ;
 *  	int a=10; 4바이트 메모리를 만들고 10 저장
 *  2) 주석: 컴파일 시 번역에서 제외가 되는 부분 = 분석하기 편함
 *  		int a=90; // 국어점수 
 *  3) 문법 에러 사항
 *  	1. ;
 *  	2. main을 못찾는 경우
 *  	3. 대소문자 구분
 *  	--->방지 위해 클래스명(대문자), 변수(소문자), 메소드(소문자)
 *  	4. {} ==> 들여쓰기 해주기
 *  	class A ===>C언어
 *  	{
 *  		public void main()
 *  		{
 *  			if()
 *  			{
 *  			}
 *  		}
 *  	}
 *  	class A {       =====> java
 *  		public void main() {
 *  			if() {
 *  			}
 *  		}
 *  	}
 *  	저장명 ===> 10PAGE
 *  	class A ==> A.java
 *  	{
 *  	}
 *  	=================== A.java, B.java
 *  	class A
 *  	{
 *  	}
 *  	class B
 *  	{
 *  	}
 *  	========================= B.java
 *  	class A
 *  	{
 *  	}
 *  	public class B
 *  	{
 *  	}
 *  	=====================
 *  4) 특징 (3~4page)
 *  	1. 운영체제의 독립적임(모든 운영체제에서 컴파일된 파일이 동일)
 *  	2. 객체지향 프로그램 (6장~7장)
 *  		= 재사용 (상속, 포함) -> 새롭게 추가, 기존의 기능 변경
 * 								오버로딩		오버라이딩
 * 			= 데이터보호: 캡슐화
 * 			= 유지보수 목적
 * 		3. 배우기 쉬움(포인터, 구조체, 상속) => 자바에서 생략	
 * 		4. 자동메모리 관리
 * 			malloc, free ==> new, delete ==> new, 가비지컬렉션(자동회수)
 * 		 	System.gc() = 멀티미디어
 * 		5. 동적 로딩
 * 			프로젝트: 클래스 여러개 만듦 ==> 필요시마다 로딩
 * ===========>2~8장,9장(라이브러리)~13장, 나머지는 흐름 파악(쓰레드, 네트워크, 람다식)
 * jdk ==> 실행 종류, 가상머신(JVM): 자바를 실행하기 위한 기계 장치
 * 							==========운영체제에 따라 다름
 * 			자바 애플리케이션
 * 			===========
 * 				|
 * 				JVM (미들웨어 연결)=> Mac, Linux, Windows(32/64)=> zip
 * 				|				=========tar.gz
 * 				운영체제
 * 
 * 실행과정
 * Hello.java =========|(JVM)Hello.class======== 화면에 출력
 * 				javac					 java
 * 1. 자바에서 쓰는 명령어
 * 	1) javac: 컴파일러, 인터프리터 사용 ==> 제임스 고슬링(보안 뛰어남->해킹) ==> 샌드박스 ==> 인증시스템 변경
 * 	동원증권: 자바구축(보안) ==> 5000만원 걺->해킹
 * 			현재 보안업체: 안랩/김랩/소프트포럼(33대란 때 망함) 사용
 * 							-------------------시조 터보백신(안양대 1학년)		
 * 							바이로봇==>92%찾음, 치료 X->바보로봇
 * 							V3==>86% 찾음, 치료O
 * 							----------------> 독일 Open(99%찾음)
 * 	.java ==> .class
 * 	2)java: 실행 시 사용
 * 	3)javap: .class ==> .java
 * 	4)jar: 자바 zip 파일
 * 	5)javah: C언어 호환
 * -------------------bin폴더 안에 있음
 */
// 주석: ctrl+shift+/  ctrl+shift+\(주석 풀기)
// ctrl+space
// 메뉴 -> Project -> clean (버퍼) => 인식 안될 때  
public class MainClass_2 {

		
		 /* public static void main(String[] args) {
		 *	  
		 * {// TODO Auto-generated method stub
		 * 
		 * System.out.println("1"); System.out.println("2"); System.out.println("3");
		 * System.out.println("4"); System.out.println("5");
		 *}
		 *
		 *		*				i	j
		 *		**				줄수	별표
		 *		***				1	1
		 *		****			2	2
		 *		*****			3	3	
		 *						4	4
		 *						5	5 => i=j =>j=i
		 *		*****			
		 *		****			i	j
		 *		***				줄수	별표
		 *		**				1	5
		 *		*				2	4
		 *						3	3
		 *						4	2
		 *						5	1 |더함 i+j=5 => j=5-i
		 */
		 public static void main(String[] args) {
		 /*
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=6-i;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			} //유지보수
			System.out.println("===============");
			System.out.println("*****");
			System.out.println("****");
			System.out.println("***");
			System.out.println("**");
			System.out.println("*"); //가독성 */
			int[] arr= {10,9,6,8,3};
			for(int i=0;i<arr.length-1;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]>arr[j])
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]+" ");	
			}
			
			System.out.println("============");
			int[] arr2= {10,9,6,8,3};
			Arrays.sort(arr2);//DESC
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr2[i]+" ");
			}
	}
}