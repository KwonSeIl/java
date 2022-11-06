import java.util.Arrays;

import javax.swing.Spring;

/*
 * 	문자열 관련 데이터형(자바)==> "", char==> ''
 * 	-------------
 * 	String에서 지원
 * 	------문자열을 저장하는 기능, 문자열을 제어하는 기능 (라이브러리)
 * 	 1) 저장 방법
 * 		*** String s=""; => 가장 많이 사용되는 방법(기본형처럼 사용-> 사용하기 편함) => 웹에 90%정도 사용(모든 데이터가 문자열로 되어있음)
 * 		String id="admin" => char[] c={'a','d','m','i','n'}
 * 		------> char[]을 사용하기 쉽게 만든 클래스
 * 		String s=new String("");
 * 	 2) String 기능
 * 		1. 문자 변환
 * 		 1) toUpperCase: 알파벳 대문자 변환 
 * 		 2)	toLowerCase: 소문자 변환
 * 		 ****3)	valueOf: 모든 데이터형을 문자열로 변환
 * 				int a=10;
 * 				valueOf(a) ==> "10" ==> parseInt("10") ==> 10
 * 				boolean b=true ==>parseBoolean("true") ==> true
 * 				valueOf(b) ==> "true"
 * 		2. 문자 제어
 * 		 *****1) substring(): 문자열 자를 때 사용(화면 UI에서 사용多) 
 * 		3. 문자 변경
 * 		 ***1) trim(): 좌우 공백 제거할 때 사용(입력)
 * 		 2) replace(): 글자 변경할 때 사용 ==> 오라클(크롤링)==> 이미지 저장
 * 			replace('&','^')
 * 		 3) replaceAll(): 정규식(문자형식)
 * 			ip 찾기
 * 			replaceAll("[0-9]{1,3}\\[0-9]{1,3}\\.[0-9]{1,3}")
 * 						127.1.63.200
 * 						맜있는 맛있고 맛있게... ---> 맛있+ ==> 분석(빅데이터,AI)
 *  	 4) split(): 문자열을 배열로 변경
 *  		String s="red,blue,green";
 *  		String[] arr=s.split(",") ===> {"red","blue","green"}
 * 		4. 문자 비교
 * 		 ***1) equals(): 대소문자 구분 후 비교(로그인, ID 중복체크, ID 찾기, 상세보기)
 * 		 2) contains(): 포함(검색)
 * 		 3) startsWith: 서제스트 만들 때 사용多(시작단어 찾기)
 * 		 4) endsWith: 끝나는 단어 찾기
 * 			--------------------------> 검색기 
 * 		5. 문자 찾기
 * 		 ***1) indexOf: 앞에서부터 데이터 찾기
 * 			String s="Hello java"
 * 			s.indexOf("a"); -> ja의 a 찾음
 * 		 2)lastIndexOf: 뒤에서부터 데이터 찾기
 * 			s.lastIndexOf("a") -> va의 a 찾음 
 * 		6. 기타
 * 		 1) concat("a","b") ==> ab ==> + 연산자 있어 자주 사용X
 * 		 "a"+"b" => "ab"
 * 		 ***2) charAt() : 문자 한개를 가지고 올 때 사용
 * 		 3) toCharArray(): 문자열을 char[]로 변경
 * 		----------------------------------------기능 / 용도 / 사용처 공부
 */
public class 문자열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String string="Hello Java";
		char[] c=string.toCharArray();
		System.out.println(Arrays.toString(c)); */
		
		//1. 변수(문자열) 선언
		//String msg="Hello Java";
		String msg;
		//char[] ==> 
		/*
		 * 	"Hello Java" => {'H','e','l','l',...}
		 * 	 0123456789 번 인덱스
		 * 	 charAt(0) ==> 'H'
		 * 	
		 */
		//2. 초기화
		msg="Hello Java"; //이런 경우는 입력값 받거나 파일 읽기할 때, 선언하고 나중에 초기화함
		
		//3. 활용(요청처리)
		//1) 문자의 개수확인(length()) ==>
		System.out.println(msg.length()); //공백도 문자로 취급함. 비밀번호 자리수 계산할 때 사용 多
		//2) 공백을 제거
		System.out.println(msg.trim().length()); //좌우에 있는 공백만 제거 가능. 입력값을 사용자가 입력할 때 사용多(실수 => space)
		//3) 대문자로 변환
		System.out.println(msg.toUpperCase()); //검색할 때 사용
		//4) 소문자로 변환
		System.out.println(msg.toLowerCase()); //검색할 때 사용
		// ==> 한글 검색할 땐 어려움 -> 자음으로 찾기=> 메소드
		//5) 자르기 substring()
		/*
		 * 	substring(int start) =>지정된 위치부터
		 * 	substring(int start,int end)=>
		 */
		System.out.println(msg.substring(6));
		System.out.println(msg.substring(0,5)); //end는 제외-> 하나 더 커야 함
		String post="101-123";
		//101, 123
		System.out.println(post.substring(0,3));
		System.out.println(post.substring(4));
		String fileName="문자열_1.java";
		System.out.println(fileName.substring(6));
		//파일명 ==> 문자열.1.java도 가능 
		System.out.println(fileName.substring(fileName.lastIndexOf(".")+1));
		System.out.println(msg.indexOf("a"));
		System.out.println(msg.lastIndexOf("a"));
		//4. 출력
		/*
		 *  라이브러리 공부 시
		 *  1. 메소드명(기능)
		 *  2. 매개변수
		 *  3. 리턴형
		 */

	}

}
