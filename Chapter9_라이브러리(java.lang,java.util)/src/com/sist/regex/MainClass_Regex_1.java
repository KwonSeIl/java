package com.sist.regex;
import java.awt.PageAttributes;
// 패턴 => 형태를 만들어서 찾기
// 예) IP 전체를 가지고 온다 => [0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}
//						   숫자(1~3개).숫자(1~3개).숫자(1~3개)
//							127.0.0.1	211.89.63.1 (131)
//	긍정 ==> 맛있+		맛없+	
//
/*
 * 	패턴 사용 기호 (자바, 자바스크립트, 파이썬, 오라클 동일)
 * 	----------
 * 	한글: [가-힣]
 * 	영문: [A-Za-z]
 * 	  - 대문자: [A-Z]
 * 	  - 소문자: [a-z]
 * 	숫자: [0-9]
 * 	---------------
 * 	[abc] => a|b|c => [a-c]
 * 	
 * 	[]: 범위
 * 	{}: 개수
 * 	---------> [A-Z]{3} => 알파벳 3개
 * 			   [가-힣]{3,5} => 한글 3~5글자 
 * 	^: 시작, 제외
 * 	------ startsWith  예) ^[가-힣]{3} => 한글로 시작해서 3글자. [^가-힣] => 한글 제외
 * 	$: 끝
 * 	------ endsWith  예) [A-Z]$ => 대문자로 끝난 문자열 
 * 	.: 임의의 한글자
 * 	.*: 모든 문자
 * 	+: 한글자 이상
 * 	*: 0글자 이상
 * 	-----------------------------------------------------
 * 	[0-9] ==> 기호화 -> \\d	제외 [^0-9] ==> \\D
 * 	\\s 공백문자 \\S 공백문자 제외
 * 	\\w 알파벳,숫자		\\W 알파벳,숫자 제외
 * 		[A-Za-z0-9]		[^A-Za-z0-9]
 */
import java.util.regex.*;
public class MainClass_Regex_1 {
// 506~507page 예제
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data= {
				"bat","baby","bonus","c","cA",
				"ca","co","c.","c0","c#",
				"car","combat","count","date","disc",
				"홍길동","맜있다OK","시작12345"
		};
		// c[a-z]* ==> c, ca, co, car, combat, count
		// c[a-z]  ==> ca, co
		// c[a-zA-Z0-9] ==> ca, co, cA, c0
		// c\\w
		// .* ==> 전체 읽기 (한글자 포함  = 한글자 이상)
		// .+ ==> 두개 이상 포함 
		// [bc].* => bat, baby, bonus, c, cA, ca, co, c., c0, c#, car, combat, count
		// ^[가-힣]* => 홍길동 
		Pattern p=Pattern.compile("^[b|c|d].{3}");
		// . => 임의의 문자
		for(String s:data)
		{
			Matcher m=p.matcher(s);
			if(m.matches())
			{
				System.out.println(m.group());
			}
		}
		

	}

}
