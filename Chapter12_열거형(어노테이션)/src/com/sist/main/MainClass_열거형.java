package com.sist.main;
/*
 * 	전체적으로 공부해야 할 것
 *  1) 데이터형
 *  2) 연산자
 *  3) 제어문
 *  4) 배열
 *  5) 클래스
 *  	= 구성요소
 *  	= 인스턴스 / 정적변수
 *  	= 메소드
 *  	= 생성자
 *  	= 객체지향의 3대 요소 (캡슐화, 재사용, (상속,포함), 다형성(오버로딩,오버라이딩))
 *  6) 클래스의 종류
 *  	= 추상클래스
 *  	= 인터페이스
 *  7) 예외처리
 *  	= 예외 복구(try~catch)
 *  	= 예외 회피(throws)
 *  8) 라이브러리
 *  	= java.lang
 *  		Object / StringBuffer
 *  		Math
 *  		System
 *  		Wrapper (Integer, Double, Boolean)
 *  	= java.util
 *  		StringTokenizer 
 *  		Date
 *  		Calendar
 *  		Random
 *  		List => ArrayList, Vector
 *  		Set => HashSet
 *  		Map => HashMap
 *  		--------------------> 제네릭스 <>: 클래스형만 첨부 가능(기본형일 경우 Wrapper 사용) => 데이터형의 통일화
 *  								<?> 
 *  							 ArrayList
 *  							 ArrayList<?>
 *  							 -------------> 모두 Object
 *  							=> 열거형: 상수의 집합 -> 배열 (사용빈도 거의 X). 사용법
 *  							=> 어노테이션: 구분자 (인덱스 => 검색용). if문 대체하는 프로그램,switch와 같음
 *  								---------------------------------------------------------
 *  								=> 스프링 (어노테이션 / XML 기반)
 *  	= java.text
 *  		SimpleDateFormat, MessageFormat
 *  	= java.io
 *  	  --------
 *  		파일의 종류
 *  			= 정형화: 프로그램에 필요한 데이터를 구분해서 저장(오라클과 관련) => 제약조건 첨부 
 *  			= 반정형화: 구분만 해주는 데이터(HTML/XML/JSON)
 *  									--------------
 *  			= 비정형화: 구분이 없는 데이터(txt, dat) => IO
 *  		= File 
 *  		= 읽기/쓰기
 *  			FileIputStream / FileOutputStream
 *  			FileReader / FileWriter
 *  			BufferedReader / BufferWriter ==> 데이터 수집 시 사용
 *  			BufferedInputStream / BufferedOutputStream ==> 다운/업로드 시 사용
 *  			------------------------------------------
 *  			ObjectInputStream / ObjectOutputStream ==> 네트워크 
 *  	= java.net: 흐름(역할 => 쓰레드, 내부클래스) -> 서버개발(웹서버가 이미 존재) ==> tomcat, 오라클서버 이용 
 *  --------------------------------------- 오라클 연결(java.sql): Connection, Statement,ResultSet
 *  														  => 오라클 연결
 *  														  => SQL 문장 전송(SQL문장)
 *  															*** SQL(개발자마다 틀리다) => 경우의 수多 
 *  														  => 결과값 받기
 */
/*
 * 	691page 열거형 (데이터를 모아서 관리) 
 * 				  -------------- 관련된 일반 데이터 모음: 배열
 * 								 관련된 상수 모음: 열거형 ==> 국번 (jdk1.5 이상에서 실행)
 * 								  ==> JDK(1.8): 호환형 => sun에서 마지막으로 만듦
 *  => STS / Eclipse / DBleaver / SqlDeveloper / Tomcat(9버전/10버전 => 10버전: 패키지명이 틀림)
 *  => 목적: 상수를 사용하기 쉽게 만드는 프로그램(데이터를 모아서 1개의 이름으로 제어)
 *  => 사용법
 *  	enum 열거형명 {상수명, 상수명 ...} => 윈도으, 게임, 서버개발...
 *  	enum Server {LOGIN, LOGOUT, MAKEROOM, ROOMIN, START} => 모두 static임
 *  		=> Server.LOGIN
 */
/*
 *  과일 apple 사과
  과일 avocado 아보카도
  과일 banana 바나나
  과일 blackberry 블랙베리, 검은 딸기
  과일 blueberry 블루베리
  과일 cherry tomato 체리 토마토, 방울 토마토
  과일 cherry 체리, 버찌
  과일 coconut 코코넛
  과일 grape 포도
  과일 kiwi 키위
  과일 lemon 레몬
  과일 lime 라임
  과일 mango 망고, 망고나무
  과일 melon 멜론
  과일 orange 오렌지
  과일 papaya 파파야
  과일 peach 복숭아
  과일 pear 배
  과일 persimmon 감, 감나무
  과일 pineapple 파인애플
  과일 plum 자두, 서양 자두, 플럼
  과일 strawberry 딸기
  과일 tangerine 귤, 탄제린
  과일 tomato 토마토
과일 watermelon 수박
 */
import java.util.*;
// 클래스의 일종 -> 생성자, 멤버변수를 가지고 있음 
enum 과일명{
	사과("apple"),
	아보카도("avocado"),
	바나나("banana"),
	블랙베리("blackberry"),
	블루베리("blueberry"),
	체리("cherry"),
	코코넛("coconut"),
	포도("grape"),
	키위("kiwi"),
	레몬("lemon"),
	라임("lime"),
	망고("mango"),
	멜론("melon");
	private String en;
	과일명(String en)
	{
		this.en=en;
	}
	public String getEn() {
		return en;
	}

}
public class MainClass_열거형 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("과일명 입력:");
		String f=scan.next();
		for(과일명 n:과일명.values())
		{
			//System.out.println(n); //toString 생략
			if(n.name().equals(f))
			{
				System.out.println(f+"의 영어명은 "+n.getEn());
				break;
			}
		}

	}

}
