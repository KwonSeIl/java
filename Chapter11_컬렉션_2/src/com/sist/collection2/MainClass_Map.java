package com.sist.collection2;
/*
 * 			Collection
 * 				|
 * 			   Map
 * 			------------------> 인터페이스
 * 				|
 * 		--------------------
 * 		|					|
 * 		Hashtable			HashMap(***)
 * 
 * 		특징) 두 개를 동시에 저장함 
 * 			=> key는 중복할 수 없음, value는 중복 가능 
 * 			=> 1)key는 문자열, value는 상관 없음
 * 			   2)사용처: 웹에서 지원하는 모든 클래스( Map형식으로 되어 있음)
 * 					=> HttpServletRequest, HttpServletResponse, HttpSession, Cookie
 * 						request.setAttribute("id","addmin");
 * 						id="admin" pwd="1234"
 * 					=> 외부에서 지원하는 라이브러리 : 스프링,마이바티스
 * 					예) ("movieAllData","SELECT * FROM movie")
 * 				 스프링 => 클래스 관리("a",new A())
 * 			=> 주요메소드
 * 				저장: put(key,값)
 * 				읽기: get(key)
 * 				-------------------> 최신 방문 영화  
 */
import java.util.*;
public class MainClass_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		map.put("id", "admin");
		map.put("password", "1234");
		map.put("name", "홍길동");
		map.put("sex", "남자");
		map.put("age", 25);
		map.put("password", "4567");// 덮어쓴다 
		
		//값 출력
		/*System.out.println("ID:"+map.get("id"));
		System.out.println("Password:"+map.get("password"));
		System.out.println("이름:"+map.get("name"));
		System.out.println("성별:"+map.get("sex"));
		System.out.println("나이:"+map.get("age"));*/
		Set s=map.keySet(); //map에 저장된 key만 저장 
		System.out.println(s);
		for(Object obj:s)
		{
			String key=(String)obj;
			System.out.println(key+":"+map.get(key));
		}
		

	}

}
