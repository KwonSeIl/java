package com.sist.util;
// 513page
/*
 * 	StringTokenizer: 구분자별로 문자열을 나눠줄 때 사용(DB연결) => 서버
 * 		=> java.util
 * 		=> 생성자
 * 			new StringTokenizer(문자열,구분문자)
 * 		=> 주요메소드
 * 			countTokens(): 분리한 단어의 개수 나타냄
 * 			hasMoreTokens(): 루프 사용 시 많이 사용
 * 			nextToken(): 분리된 문자열을 읽을 때 사용
 * 		
 * 		*** 개수가 남으면 가능. But 모자라면 오류 발생 
 */
import java.util.*;
public class MainClass_StringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String date="2022-11-21";
		StringTokenizer st=new StringTokenizer(date,"-");
		//StringTokenizer(date) ==> " "은 구분문자에서 생략이 가능
		/*String year=st.nextToken(); //문자열 -> 정수형으로 변경해야 함
		String month=st.nextToken();
		String day=st.nextToken();*/
		//String temp=st.naxtToken(); //오류
		System.out.println(st.countTokens());
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}

}
