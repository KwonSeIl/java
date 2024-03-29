package com.sist.main;
/*
 * 	라이브러리
 *		= java.lang(자바프로그램의 기본) => import를 생략이 가능
 *			1) Object: 최상위 클래스(모든 클래스는 Object로부터 상속을 받는다)
 *					=> 서로 다른 클래스를 묶어서 관리
 *					=> 모든 라이브러리에서 객체를 리턴하는 메소드는 Object형을 가지고 있음
 *						--------- 사용자가 어떤 클래스명을 사용할지 알지 못하기 때문에 -> 형변환
 *						class A
 *						{
 *							aaa()
 *							bbb()
 *							ccc()
 *						}
 *						Object a=new A(); ==> 호출X(변수는 Object가 가지고 있는 변수만 제어 가능)
 *						A aa=(A)a;
 *							Object가 가지고 있는 메소드만 호출 가능(메소드 => 오버라이딩된 메소드를 호출함)
 *					=> toString(): 객체를 문자열로 변환 (생략할 수 있음) 
 *						A a=new A();
 *						System.out.println("a="+a) ==> a.toString()		
 *														----------- 객체의 주소 출력
 *														----------- 오버라이딩(변수의 값) 
 *					=> finalize(): 소멸자(가비지컬렉션-> 자동호출) => 재정의(메모리 해제 여부 확인) 
 *									=> 멀티미디어, 화상, 음성
 *					=> clone(): 복사(같은 메모리 크기로 새로운 메모리 제작) => 스프링(prototype)
 *						스프링에서는 싱글턴 많이 사용(객체당 메모리 한개만 사용) -> 여러개 제작(clone) => 메모리 누수현상 방지
 *					=> equals(): 객체 비교
 *								비교-> == : 주소값 비교
 *									equals(): 실제 저장된 값 비교 
 *					=> 참조
 *						class A
 *						A a=new A();
 *						A b=a; 	=============> a,b는 같다(매개변수로 값을 받는 경우)
 *												Call By Reference: 같은 주소를 제어 
 *						A a=new A();
 *						A b=a.clone();	====> 새로운 메모리가 필요. 달라짐 
 *						
 *			2) String: 문자열 저장(데이터베이스)
 *						오라클
 *							문자형, 숫자형, 날짜형, 기타형
 *							---- CHAR, VARCHAR2, CLOB => 자바에서는 String으로 받는다
 *								 ---- NUMBER(4), NUMBER(7,2) => int, double
 *										--- DATE, TIMESAMP => java.util.Date
 *											 --- BLOB/BFILE => InputStream
 *				= 문자 저장 방법
 *					String s=""(사용多), String s=new String("")
 *				= 기능: 웹사이트(화면UI => HTML은 한줄 문자열) => CSS로 조절
 *					1차: SQL, 화면UI(글꼴, 색상)
 *				= length(): 문자의 개수 => int length()
 *				= trim(): 좌우 공백 제거 => String trim() -> 로그인, 회원가입, 검색
 *				= substring(): 문자 자를 때 
 *								오버로딩: String substring(int begin)
 *										String substring(int begin, int end): end-1
 *				= startsWith(): 시작 문자열이 같은 경우 -> Cookie 저장
 *								boolean startsWith(String fd)
 *				= endsWitt(): 끝나는 문자열이 같은 경우
 *								boolean endsWith(String fd)
 *				= contains(): 문자 포함 여부 -> 검색
 *								=> 자음으로 찾기. -> 오라클(PL/SQL)=Procedure, 자바
 *								=> Procedure -> 댓글
 *								=> 프로시저 VS 트리거
 *								=> boolean contains(string fd) -> 추천, 챗봇
 *				= equals(): 같은 경우 => 대소문자 구분 -> 로그인, 아이디 찾기, 비밀번호 찾기 
 *				= indexOf(): 찾는 문자나 문자열의 위치 -> 앞에서부터 찾음
 *							=> int indexOf(char c)
 *							=> int indexOf(String s)
 *							=> INSER("",1)
 *				= lastIndexOf(): 찾는 문자나 문자열의 위치-> 뒤에서부터 찾음 => 경로명, 확장자
 *							=> int lastIndexOf(char c)
 *							=> int lastIndexOf(String s)
 *							=> INSTR("",-1)
 *							=> Hello Java
 *							   1234567890
 *										-1
 *				= valueOf(): static 메소드 -> 모든 데이터형을 문자열로 변환 
 *							static String valueOf(int)
 *							static String valueOf(double)
 *							static String valueOf(char[])
 *			3) StringBuffer: 문자열 결합 -> 최적화
 *				= append(): 문자열 결합(+)
 *				= toString(): 저장된 데이터를 한번에 읽을 때 
 *			4) Math: 수학 관련
 *				= random(): 난수 발생, (0.0~0.99) => static double random()
 *				= ceil(): 올림 함수 -> 총페이지 구하기 => static double ceil(double d)
 *				= round(): 반올림 -> 평점 => static double round(double d)
 *			5) ***Wrapper: 데이터형을 클래스화 => Integer, Double, Boolean, Long
 *					=> 주로 사용 -> 제네릭스: 기본형을 사용할 수 없음 <클래스형>
 *					=> <int> X -> <Integer>
 *						기본형 ====== Wrapper 호환되어 있음
 *						Wrapper = 기본값: 박싱
 *							Integer i=10
 *						기본형 = Wrapper: 언박싱 
 *							int ii=i
 *
 *					=> parseInt(), parseDouble(), parseBoolean(), parseLong()
 *						=> 문자열을 해당 데이터형으로 변경
 *							--- 실제 프로그램: 윈도우, 브라우저, 휴대폰 
 *										   --- ex 파일 존재X -> 더블클릭 불가 . 데이터형(문자열) 
 *			6) System
 *				표준 입출력 => System.in, System.out
 *				gc(): 가비지컬렉션 호출 
 *				currentTimeMillis(): 시간 읽기 => 실행시간 -> 로그파일 
 *		= java.util: 웹, 모바일에서 사용빈도가 많은 클래스의 집합
 *			1) StringTokenizer: 단어별 문자를 자를 때 사용
 *				= 생성자 -> new StringTokenizer(String data, 구분자)
 *															--- String
 *					   -> 생성자 -> new StringTokenizer(String data) => 공백
 *					   -> 배열 형식으로 => 데이터 개수 넘으면 오류 발생
 *				= 구분된 데이터 읽기: nextToken() => String nextToken()
 *				= 구분된 데이터만큼 루프 처리: hasMoreTokens(): 개수가 다르거나 잘 모르는 경우
 *					**while(hasMoreTokens()) => boolean hasMoreTokens()
 *				= countTokens(): 자른 개수 => int countTokens()
 *			2) Date, Calendar => Date는 기능은 없다(날짜의 데이터형)
 *							  => Date에 없는 기능을 추가 새로운 클래스 -> calendar
 *							  => Calendar는 추상클래스
 *								생성
 *								Calendar cal=Calendar.getInstance()
 *								----------------------------------
 *								날짜 설정: set(Calendar.YEAR,2022)
 *										set(Calendar.MONTH,10) => MONTH는 인식할 때 0번부터 인식
 *										set(Calendar.DATE,30)	
 *								날짜 읽기: get(Calendar.YEAR)
 *										get(Calendar.MONTH)
 *										get(Calendar.DATE)
 *										get(Calendar.DAY_OF_WEEK) =>요일 1번(일요일) 
 *								=> 달력(예매, 예약, 결재일, 배송일) 
 *			3) ArrayList, HashSet, HashMap = Vector
 *						Collection: 데이터를 모아서 관리(배열을 확장, 배열의 단점을 보완)
 *						---------- 인터페이스로 되어 있음: 표준화 되어 있음, 필요시에 오버라이딩해서 사용
 *						 배열 단점: 같은 데이터형만 모아서 저장, 고정적 
 *								 ------------------ -----
 *									다른 데이터형을 저장할 수 있음(Object), 가변형
 *						Collection
 *							|
 *					----------------------------
 *					|				|			|
 *				  List			 Set			Map
 *					List: 순서 가짐, 데잍터 중복 허용 -> 검색, 순차적으로 저장속도가 가장 빠름, 데이터 접근하는 속도 빠름
 *							데이터베이스에서 주로 사용되는 컬렉션
 *							=> 구현된 클래스: ArrayList, Vector, LinkedList
 *										  -------- 자료구조(쉽게 메모리 제어가 가능 => CURD)
 *											add(), remove(), set(), get(), clear(), size()
 *											추가		삭제		수정		읽기		전체삭제	개수
 *					Set: 순서 없음, 데이터 중복 허용하지 않음
 *						 ArrayList에 저장된 데이터중에 중복된 데이터 제거  ==> 오라클에서 제거: DISTINCT
 *						 HashSet / TreeSet
 *						 -------
 *						   add(), remove(), get(), clear(), size()
 *						  => 웹에서 통신할 때 (사용자 정보 저장)-> 브라우저에 채팅
 *							Application: Socket
 *							Web: WebSocket(Spring)
 *					Map: 키와 값을 동시에 저장
 *						 키는 중복할 수 없음
 *						 값은 중복 가능 
 *						 => 클래스 관리(스프링), SQL관리(마이바티스), 쿠키, 세션, 요청값, 응답값 ==> Web에서 주로 등장
 *						 => HashMap / Hashtable 
 *							------	  ---------
 *							비동기			동기			====> AJAX
 *							put(): 저장
 *							get(): 읽기
 *							----------- 데이터값 변경 -> put이용 ==> put("같은 키","값") 
 *			4) java.lang.regexx
 *				Pattern / Matcher ==> 정규식
 *				정규식 기호
 *				--------
 *				[] => 범위 [A-Z], [a-z], [A-Za-z], [0-9], [가-힣]
 *						  [A-C] [A|D|V]
 *				{} => 개수 [A-Z]{3}, [A-Z]{1,3}
 *				+: 1이상 => 맛있+
 *				*: 0이상 => 맛없*
 *				.: 임의의 글자 한글자 [A-Z]. A1 AK A가
 *				$: 끝나는 문자 [A-Z]$
 *				^: 시작문자 ^[A-Z] /부정문자(예외) [^A-Z]
 *				|: 선택
 *				=====================================> 문자열의 패턴을 만들어 검색 (오라클, 자바스크립트)
 *		= java.text
 *			1) SimpleDateFormat: 날짜를 원하는 형태로 출력 => 게시판, 입력...
 *				=> TO_CHAR 오라클에서 변경후 사용
 *				=> String, Math, Date ..: 필요시에는 오라클에서 변경이 가능 
 *			2) MessageFormat: SQL => 형식있는 문자열을 만들 때 사용
 *				=> String name, sex, address, tel;
 *					int age; 
 *					WHERE name LIKE '%A%'
 *					WHERE REGEXP_LIKE(name,'A')
 *					WHERE SUBSTR(name,1,'A')
 *					WHERE INSTR(name,1,'A')>0
 *				=> 추가(문자열을 오라클로 전송)
 *					String sql="INSERT INTO table_name VALUES('"+name+"','"+sex+"','"+address
 *								+"','"+tel+"',"+age+")";
 *					String sql="INSRT INTO table_name VALUES('{0}','{1}','{2}','{3}',{4});
 *					==> 최근에 java.sql에 등장 -> PreparedStatement => (?,?,?,?,?)
 *		= java.io	
 *			1) File: 파일 / 디렉토리 정보 가짐 
 *				File file=new File("경로명"); ==> 디렉토리 정보
 *				File file=new File("경로명/파일명"); ==> 파일 정보
 *				=> 주요 메소드 
 *					= getName(): 파일명, 디렉토리명
 *					= getPath(): 경로명 전체 읽기
 *					= getParent(): 경로명만 읽기
 *					= length(): 파일 크기
 *					= listFiles(): 전체 파일명을 읽기 ==> ls -a, dir
 *					= createNewFile(): 파일 만들기
 *					= mkdir(): 폴더 만들기 ==> mkdir
 *					= delete(): 파일 삭제 ==> rm -rf
 *			2) FileInputStream / BufferedInputStream
 *					read(), close() ==> 읽기 / 닫기 
 *			3) FileOutputStream / BufferedOutputStream ==> 다운로드
 *					write(), close()
 *			--------------------------------------------------- 읽을 때 1byte => 바이트 스트림
 *			4) FileReader / ***BufferedReader : readLine()
 *					read(), close()
 *			5) FileWriter / BufferedWriter
 *					write(String), close()
 *			------------------------------------------------ 읽을 때 2byte => 문자 스트림
 *															한글이 포함된 경우에 주로 사용(파일에 저장된 데이터를 제어할 때 많이 사용) 
 *		= java.net
 *			1) URL: 웹사이트 주소를 설정할 때 사용
 *			2) URLEncoder: 브라우저(ASC), 자바(Unicode)
 *							--------	--------- 
 *							1byte		2byte
 *							=> 자바 ========== 브라우저로 전송
 *									byte 배열로 변경 => 인코딩 
 *							=> 브라우저 ======== 자바
 *									byte배열을 String으로 변환 => 디코딩
 */
import java.io.*;
import java.net.*;

import javax.net.ssl.HttpsURLConnection;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			URL url=new URL("https://www.daum.net/");
			HttpURLConnection conn=(HttpURLConnection)url.openConnection();
			if(conn!=null) //연결되었다면
			{
				BufferedReader in=
						new BufferedReader(new InputStreamReader(conn.getInputStream()));
				while(true)
				{
					String s=in.readLine();
					if(s==null) break;
					System.out.println(s);
				}
			}
		}catch(Exception ex) {}

	}

}
