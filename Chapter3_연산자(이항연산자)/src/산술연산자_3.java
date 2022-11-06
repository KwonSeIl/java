/*
 *  % 나누고 나머지값  ==> 자바스크립트 (%), 오라클(MOD()), EL(5 mod 2)
 *  -------------------------------------------------------
 *   자바스크립트: 자바(==), 오라클(=), 자바스크립트(===): ES5(==), ES6(===), ES8
 *   										  var		let, const
 *   요즘: JSP ==> HTML로 출력 (ThymeLeaf 사용)
 *   Fornt		Back
 *   화면출력		서버    => 삼성(SpringBoot<=>VueJS), 현대(SpringBoot<=>React)
 *   DB: JDBC/MyBatis/JPA
 *   
 *  => 부호(결과값은 왼쪽편 부호가 남음) 
 */
public class 산술연산자_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=2;
		
		System.out.printf("%d%%%d=%d\n",a,b,a%b);
		System.out.printf("%d%%%d=%d\n",-a,b,-a%b);
		System.out.printf("%d%%%d=%d\n",a,-b,a%-b);
		System.out.printf("%d%%%d=%d\n",-a,-b,-a%-b);
		// -5*-5 = 25, -5*5=-25 ==>*,/는 일반 계산과 동일
		
		int c=367;
		System.out.println(c%10);
		System.out.println((c%100)/10);
		// ===> 367%100 ==>67. 67/10==>6
		System.out.println(c/100);
		
		// 입력 받아 윤년여부 확인 ==> 알고리즘 공식(예약,예매) ==> && ||
		

	}

}
