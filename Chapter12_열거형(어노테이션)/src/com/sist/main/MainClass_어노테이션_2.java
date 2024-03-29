package com.sist.main;
import java.lang.reflect.Method;
import java.util.*;
/*
 * 	문서 정리(소스코드 안에서 정리) => 주석(기능은 없음. 검색만 하는 역할)
 *  => 많이 사용하는 곳: 스프링, 마이바티스, JPA(웹 관련 라이브러리는 주로 어노테이션)
 *  => 사용자 정의는 거의 없음
 *  
 *  => @Overide
 *  => @Deprecated: 경고 -> 새로운 메소드가 있다
 *  => @SuperessWarnings: 경고를 나타내지 않게 만듦
 *  => @FunctionallInterface: 람다식 지정
 *  => 스프링, Mybatis, JPA도 이미 제작 되어 있음 --> 인덱스 
 *  ------------------------------------------------703page
 *  711page 사용자 정의
 *  	**** 찾는 내용은 항상 어노테이션 밑에 있거나 옆에 있다
 *  1. Target: 구분자
 *  	클래스 찾기: Target(TYPE) ==> type (클래스와 관련된 내용) -> 클래스형이나 인터페이스, 열거형이 들어갈 수 있음
 *  	@													-----
 *  	class ClassName
 *  	{
 *  		---------------------
 *  		 변수		Target(FIELD)
 *  		=> 일반 변수는 사용하지 않는다
 *  		=> 클래스, 인터페이스, 열거형 사용 가능
 *  		@
 *  		ClassName c;
 *  		---------------------
 *  		 메소드	Target(METHOD)
 *  		@		
 *  		public void display()
 *  		{
 *  		}
 *  		public void display(@ B b) => Target(PARAMETER)
 *  		---------------------
 *  		 생성자	Target(CONSTRUCTOR)	
 *  		@
 *  		public 생성자()
 *  		{
 *  		}
 *  		---------------------
 *  	}
 *  
 *  718page
 */
class Board2{
	@RequestMapping("write.do")
	public void write() // write.do => 글쓰기 요청
	{
		System.out.println("글쓰기 처리...");
	}
	@RequestMapping("list.do")
	public void list() // list.do
	{
		System.out.println("게시물 목록 출력...");
	}
	@RequestMapping("update.do")
	public void update() //update.do
	{
		System.out.println("게시물 수정하기");
	}
	@RequestMapping("delete.do")
	public void delete() //delete.do
	{
		System.out.println("게시물 삭제...");
	}
	@RequestMapping("find.do")
	public void find() //find.do
	{
		System.out.println("게시물 찾기...");
	}
	@RequestMapping("detail.do")
	public void detail() //detail.do
	{
		System.out.println("상세보기");
	}
	
}
public class MainClass_어노테이션_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("기능 요청:");
		String cmd=scan.next();
		
		try
		{
			// => 라이브러리에 만들어져 있음 
			Class clsName=Class.forName("com.sist.main.Board2");
			//클래스 정보 읽기
			//메모리 할당
			Object obj=clsName.getDeclaredConstructor().newInstance();
			//클래스 안에 선언된 모든 메소드 읽기
			Method[] methods=clsName.getDeclaredMethods();
			for(Method m:methods)
			{
				RequestMapping rm=m.getAnnotation(RequestMapping.class);
				// Method 위에 있는 메소드 찾기
				if(rm.value().equals(cmd))
				{
					m.invoke(obj, null); //메소드 호출
					// detail() ==> null 매개변수 없는 경우 호출
					break;
				}
			}
		}catch(Exception ex) {}

	}

}
