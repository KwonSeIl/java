/*
 * 	반복문: 같은 형태 여러개인 경우 사용하는 제어문
 * 		***1. for: 반복 횟수가 지정되어 있으면
 * 			 순서1  순서2
 * 		 for(초기값;조건식;증감식) ==> 웹사이트: 화면UI에서 많이 나옴 
 * 		 {
 * 			반복 수행 문장
 * 		 }
 * 		***2. while: 반복 횟수 지정X (데이터베이스에서 많이 나옴)
 * 		 초기값 -----------순서1
 * 		 while(조건식)-----순서2
 * 		 {
 * 			수행문장
 * 			증감식
 * 		 }
 * 		 예)
 * 	 		int a=10; ---1
 * 			while(a<10) ---2
 * 			{
 * 				수행문장
 * 				증감식
 * 			}
 * 		------------------------ 한 번도 수행을 안할 수 있음 
 * 		3. do~while: 한 번 이상을 반드시 수행
 * 		 초기값 ----------순서1
 * 		 do
 * 		 {
 * 			실행문장 ------순서2
 * 			증가식 -------순서3
 * 		 } while(조건식);
 * 
 * 		 조건검색 ==> 선 조건, 후조건에 따라 달라짐 
 * 		 156page
 * 		 for=> 일반 for
 * 			 	forEach(웹에서 사용) => map, foreach, for of, for in
 * 				-------배열/컬렉션
 * 
 * 		for
 * 		 1) 형식
 * 					  false -> for문 종료(2번이 false) 
 * 				1	→  2  ← 4
 * 			for(초기값;조건식;증감식)
 * 					↓	  ↑
 * 				반복수행문장 3			true -> 2,3,4반복
 * 		  
 * 		  1부터 10번 수행
 * 		  for(int i=1;i<=10;i++)
 * 		  {
 * 			반복문장 
 * 		  }
 * 
 * 		  100번 수행
 * 		  for(int i=0;i<100;i++)
 * 		  for(int i=1;i<=100;i++)
 * 		  A~Z
 * 		  for(char c='A';c<='Z';c++)
 * 					 'a'    'z' -> 소문자
 * 		  **무한루프 for(;;)
 * 			int[] arr={1,2,3,4,5,6}
 * 			for(int a:arr) ==>foreach(향상된 for문)
 *  	 2) 동작순서
 * 		  
 */
//2~9까지 정수 입력 받아서 해당 단을 출력하는 프로그램 

public class 제어문_반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan=(int)(Math.random()*8)+2; //2~9
		System.out.println(dan+"단");
		for(int i=1;i<=9;i++) //i++, i+=2, i+=3...
		{
			System.out.printf("%2d * %2d = %2d\n",dan,i,dan*i);
			//System.out.println(dan+"*"+i+"="+dan*i);
		}
		
		
	}

}
