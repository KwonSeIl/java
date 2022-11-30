package com.sist.main3;
class A
{
	int a;
}
class B extends A
{
	//a
	int b;
}
class C extends B
{
	//a,b
	int c;
}

class D extends A
{
	//a
}
class E extends A
{
	//a
}
/*
 * 	상속의 예외 조건: static(공유), 생성자, 초기화 블록
 * 	상속 접근 제어어: 상속을 받은 경우 접근 불가능(private)
 * 				 => protected (X)
 * 				 => default (X)
 * 				 => private -> setXxx(), getXxx()
 * 				 => 메소드는 통신 (public)
 * 	상속의 형식
 * 	  class 하위클래스 extends 상위클래스
 * 	   => 상속 :  필요시마다 변경해서 사용 가능
 * 				 ---------------------> 오버라이딩
 * 				 오버라이딩 => 덮어쓴다(모든 내용이 동일)
 * 				 => 메소드 
 * 					리턴형 메소드명 매개변수
 * 					----------------> 모두 동일해야 함 
 * 					 예외) 접근지정어는 축소할 수 없고, 확대는 가능하다 => 다를 수 있음
 * 					private < default < protected < public
 */
public class MainClass_단일상속 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
