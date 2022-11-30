package com.sist.connect1;

import java.util.Scanner;

// 다른 클래스에서 접근시에는 import 이용 
//import
/*
 * 	다른 패키지에 존재하는 클래스를 사용할 때 -> import
 * 	=> 라이브러리 / 사용자 정의 클래스 
 * 
 * 	import 패키지명.클래스명 => 클래스 한 개만 가지고 올 때
 * 	import 패키지명.* => 패키지에 있는 모든 클래스를 가지고 올 때
 * 	import static 패키지명.클래스명.메소드명 => 메소드 한 개 가지고 올 때
 * 	import static 패키지명.클래스명.* => 메소드 전체 사용 시
 */
// Math,String,StringBuffer,Integer,Object => 자동으로 import를 처리 
/*
 * 	생략 => 자동으로 컴파일러가 처리
 * 	 1) 메소드
 * 		void display()
 * 		{
 * 			return; => 생략하면 자동 추가
 * 		}
 * 	 2) 생성자
 * 		class A
 * 		{
 * 			A() => 생략시에는 자동 추가(기본 생성자만)
 * 			{
 * 			}
 * 		}
 * 	 3) import문
 * 		import java.lang.* => 자동으로 추가
 */
//import java.util.Scanner; //권장사항
//import java.util.*;
import static java.lang.Math.random;
import static java.lang.System.out;
import static java.lang.String.valueOf;
// static일 때만 가능
/*
 * 	패키지 선언
 * 	 package 패키지명; => 분류 위해 폴더 생성
 * 	 -------------
 * 	 import
 * 	  = 패키지명.클래스명
 * 	  = 패키지명.*
 * 	
 * 	 java코딩 순서
 * 	  1)package => 한 번만 사용
 * 	  2)import => 여러개 사용 가능 
 * 	  3)class 선언
 * 	 
 * 	 *** static
 * 	   import static 패키지명.클래스명.메소드명
 * 	   import static 패키지명.클래스명.*;
 * 
 *    static
 *    	클래스명.메소드명
 *    	------ 생략 가능 
 *    
 *    import는 라이브러리만 사용하는 것이 아니라 사용자 정의 클래스도 사용
 *    -----------------------------------------------
 *    주의점) import 사용이 필요없는 경우
 *    		--------------------
 *    		 => 같은 패키지의 클래스를 사용할 때는 import를 사용하지 않음
 *    			-------
 *    			다른 패키지에 있는 클래스를 사용할 때는 반드시 import를 사용해야 함
 *    		
 *    		패키지명 설정
 *    		com.회사명.분류명
 *    		------------- 폴더명(키워드 사용X)
 *    		 알파벳, 한글, 숫자, 특수문자 가능, 키워드 불가능 
 *    		 ----권장사항(소문자) 3~7자리
 *    
 *    		com.sist.분류...
 *    		com.naver
 *    		com.daum
 */
public class 접근지정어 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(random()*10)+1;
		//System.out.println(a);
		//out.println(a);
		out.println(valueOf(a));
	}

}
