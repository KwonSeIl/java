/*
 *  출력:
 *  System.out.println()
 *  System.out.print()
 *  System.out.printf()
 *  입력: System.in(키보드 입력값), Scanner,BufferdReader
 *  	-----------					  --------------예외처리 해야함 
 *  							|
 *  변수
 *   1) 초기화
 *   	명시적인 초기화 int a=10;
 *   	입력값
 *   	난수
 */
import java.util.Scanner; //using...
// java.lang ==> 생략 가능 
/*
 *  자바 코딩순서
 *   1. package: 현재 클래스의 경로 지정(한번만 사용 가능) 
 *   2. 다른 클래스를 읽어옴 (import 사용)
 *   	import => 여러개 사용 가능 
 *   3. public class className
 *   	{
 *   		public static void main(String[] args) {
 *   		}
 *   	}
 */
// 국어, 영어, 수학점수 => 입력 받아서 총점, 평균 출력
// 가로, 세로 출력 
public class 화면출력_printf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 변수 선언
		int kor,eng,math,total;
		double avg;
		// 2. 입력값 받아서 변수 초기화
		Scanner scan=new Scanner(System.in);
		// new => 메모리에 저장한 상태에서 가져와야 함 System.in : 키보드 입력값
		// 키보드 입력값을 받아서 해당 변수에 값을 대입(scanner 역할)
		System.out.print("국어 점수 입력:");
		kor=scan.nextInt(); // 정수값 저장, next():문자열 입력, nextDouble(): 실수형 입력
		System.out.print("영어 점수 입력:");
		eng=scan.nextInt();
		System.out.print("수학 점수 입력:");
		math=scan.nextInt();
		
		total=kor+eng+math;
		avg=total/3.0;
		// %d(정수입력),%f(실수),%s(문자열),%c(문자)인지 잘 구분
		System.out.printf("%-5s%-5s%-5s%-7s%-5s\n","국어","영어","수학","총점","평균"); // \n: 다음줄에 출력 
		//System.out.println으로도 가능(공백 줘서) -> 가장 많이 사용되는 화면출력(웹=> 에러 출력(디버깅))
		System.out.printf("%-7d%-7d%-7d%-9d%-7.2f",kor,eng,math,total,avg); //다음줄에 출력이 없음->\n 붙여야 함
		// 3. 연산
		// 4. 화면 출력 

	}

}
