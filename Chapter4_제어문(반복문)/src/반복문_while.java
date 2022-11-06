/*
 * 	while (167page)
 * 	------> 무한루프 사용에 많이 쓰임(데이터베이스에서 많이 등장)
 *  특징
 *   1) 순차적으로 실행 
 *    형식) 초기값
 *    	  while(조건식) : 조건이 true일 때 {}반복, false 종료 
 *    	  {
 *    		반복수행문장
 *    		증가식
 *    	  }
 *    	  ==>for(초기값;조건식;증가식)
 *    			반복 수행문장 
 *    주의점)
 *    		for(;;) ==> while(true)
 *    		while() ==> 반드시 조건문을 제시해야 함 
 *    			 --조건(비교연산자,논리연산자,부정연산자), true/fasle
 */
public class 반복문_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A-Z, Z-A
		char c='A';
		while(c<='Z') 
		{
			System.out.print(c+" ");
			c++;
		}
		//Z+1 ==> [
		
		System.out.println();
		c='Z'; //초기화
		while(c>='A') 
		{
			//대문자 소문자 ==>32 차이 'A'=65 'a'=97
			System.out.print(c+" ");  //소문자-> ((char)(c+32)+" ")
			c--;
		}
		System.out.println();
		int i=1;
		while(i<=100) 
		{
			i++;
		}
		System.out.println("i="+i);

	}

}
