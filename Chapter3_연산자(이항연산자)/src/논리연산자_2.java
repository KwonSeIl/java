/*
 * 	if / for
 *  --(조건잡기 어려움)
 *  
 *  1) 구구단	=======================> 2차 for문
 *  2) 페이지 나누기 (더 쉬워야 함) =======> 1차 for문 (조건문 ==> &&사용)
 *  
 *  난수 발생 => 1~100사이. 50<
 *  알파벳 => k>		&& 두가지를 동시에 만족
 *  
 */
public class 논리연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1;
		// 			0.0~0.99 ==>0.0~99.0 => 0~99
		//char b=(char)(Math.random()*26)+65;
		//		 ----------------------char => char + int = int
		char b=(char)((Math.random()*26)+65); //0~25 + 65 => 65~90. 소문자-> +97
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		boolean result=a>50 || b<'k';
		System.out.println(result);
		// 조건검색
		
		

	}

}
