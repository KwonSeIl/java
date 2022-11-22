package com.sist.spring;

import java.util.StringJoiner;

/*
 * 	471page 	(기술면접:Wrapper)
 * 	--------	11장,12장, 15장 (웹 관련) *** => 2~8장(기본), 9장(String, Object) 
 * 	String
 * 	------
 * 	StringBuffer: append() => 문자열 결합
 * 				  toString()
 * 	Math: random() /ceil() / round()
 * 	***Wrapper: Integer, Double, Boolean => 문자열 해당 데이터형으로 변경
 * 			 parseInt(), ParseDouble(), paseBoolean()
 * 			=> 박싱 / 언박싱
 * 			=> List<int> (X) -> List<integer>
 * 	StringTokenizer: nextToken(), counterToken(), hasMoreToken()
 * 	Pattern / Matcher
 * 	-------	  -------- find(), group(), compile()
 * 	------------------------------------------------------------------- 1권
 * 	
 */
public class MainClass_String_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color="red,green,blue,black,white,yellow,magent";
		// 컬러별 분리
		String[] colors=color.split(",");
		for(String c:colors)
		{
			System.out.println(c);
		}
		System.out.println("==== 출력형식 (join) ====");
		String ss=String.join("-", colors);
		System.out.println(ss);
		System.out.println("==== 출력형식 ====");
		ss=color.replace(",", "-");
		System.out.println(ss);
		// 이미지 (여러개를 동시에 묶어서 저장) => 구분자 사용해서 저장 ->데이터를 나눠서 출력
		// 오라클 => ^
		StringJoiner sj=new StringJoiner(",","{","}"); // {데이터,데이터,데이터,}
		//							   구분자  prefix suffix
		for(String s:colors)
		{
			sj.add(s);
			
		}
		System.out.println(sj.toString());
	}

}
