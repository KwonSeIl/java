/*
 * 	삼항연산자: 피연산자가 3개인 경우의 연산자 
 * 	 형식)
 * 		(조건)?값1:값2
 * 		-----------> 조건 true => 값1
 * 					 조건 false => 값2 ==> if ~ else (소스코딩을 줄이기 위해 사용)
 * 					 페이지 (이전/다음) -> 삼항연산자 사용 처리
 * 
 * 
 */
public class 삼항연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='1';
		System.out.println((c>='A' && c<='Z')||(c>='a' && c<='z')?"알파벳":"알파벳 아님");

	}

}
