import javax.swing.JFrame;

/*
 * 	230page
 * 
 * 	= 기존의 프로그램을 쉽게 제작(활용) => 규칙
 * 	= 코드의 재사용성 높음(->기존의 코드를 변경, 추가 가능)
 * 	= 코드 관리가 용이함(메소드-> 구조화된 프로그램으로 변경)
 * 	= 이미 사용중인 프로그램을 변경 -> 신뢰성 높은 프로그램
 * 	-------------------------------------------
 * 	1. 클래스의 구성요소
 * 		= 공통적인 데이터나 기능을 설정
 * 		  ---------- 사물을 단순화시켜서 시뮬레이션(실제 동작X) ==> 기계에 심어줌
 * 		  ---------- 한 개의 클래스로 동작하는 것X, 여러개의 클래스를 연관관계 가지고 있음
 * 					 행위자 <==========> 처리
 * 					 사람 <===========> 자판기
 * 					 --- Acter
 * 		 ----------- 개발자마다 데이터가 다름 
 * 		1) 설계에 필요한 데이터 설계(데이터: 변수)
 * 		2) 메소드(기능)
 * 		3) 변수 => 변수의 초기화, 저장: 생성자
 * 								 ----- 반드시 클래스명과 동일해야 함
 * 		4) 메모리에 저장할 땐, 
 * 			클래스명 변수명 = new 클래스명()
 * 			-----	|
 *					객체(인스턴스)
 * 	     	 			 ---  -------생성자: 매모리에 저장할 초기값
 * 			기본형 => 변수
 * 			배열 => 배열명
 * 			클래스 => 객체(클래스 변수)
 * 			--------------------> 기본형과 동일하게 생각(형변환)
 * 		  사용자정의 데이터형// 새로운 메모리 설정(제작)
 *  2. 데이터 관련: 데이터를 보호(캡슐화) => 키워드 이용해서 데이터 은닉화
 *  								---- private
 *  3. 메소드 관련: 기능 변경, 추가 가능하게 함(오버라이딩, 오버로딩) => 다형성
 *  4. 클래스 관련: 있는 그대로 사용, 변경 후 사용
 *  			------------  ---------
 *  			  포함(has-a)		상속(is-a): 사용자 정의(스프링은 독립적인 클래스)
 *  			  -------- 라이브러리
 *  ---------------> 유지보수 목적
 * 
 */
public class 객체지향프로그램_1 extends JFrame{
	public 객체지향프로그램_1() {
		setSize(640,480);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 객체지향프로그램_1();
	}

}
