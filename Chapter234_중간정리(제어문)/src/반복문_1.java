/*
 * 	***for: 횟수가 지정(화면UI)(알고리즘)
 * 	 	형식)
 * 			for(int i=1;i<=5;i++)
 * 				=======  ==== ===
 * 				1부터 	 5까지 	1개씩 증가 ==> 반복 5번 수행
 * 			 	초기값		 조건식 	증가범위
 * 							false면 종료 
 * 		순서) 초기값 ----> 조건식 true----> 반복문장 수행 ----> 증가식 ---> 조건식  
 * 		형식) 		 ① -> ② <- ④
 * 				for(초기값;조건식;증가식)
 * 				{		  |	  				
 * 					반복수행문장③
 * 				}
 * 	***while: 무한루프, 횟수 지정X
 * 		 1) 무한루프
 * 			while(true)
 * 			{
 * 				실행문장
 * 			}
 * 		 2) 횟수가 지정된 경우 
 * 			초기값 ①
 * 			while(조건식) ② => false면 종료
 * 			{	  |
 * 				실행문장 ③
 * 				증가식 ④ -> 조건식으로 돌아감
 * 			}
 * 	do~while: 조건을 나중에 검색 ==> 반드시 한 번 이상 수행이 가능
 * 		형식) 초기값 ①
 * 			do
 * 			{
 * 				반복문장 ②
 * 				증가식 ③
 * 			}while(조건식); ④ -> ②으로 이동해 반복문장 수행 
 * 				|false면 종료 
 * 	***break: 무한루프-> 종료(반복문을 중단할 때 사용)
 * 	continue: 특정부분을 제외할 때 사용
 * 			  =>주의점: 이동(for:증가식으로 이동, while:조건식으로 이동=>무한루프에 걸릴 수 있음)
 * 				***while을 사용할 때에는 무한루프==> 처음부터 다시 실행할 때 
 */
public class 반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~10
		System.out.println("===== for문 =====");
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("===== while문 =====");
		int i=1;
		while(i<=10)
		{
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		System.out.println("===== do~while =====");
		i=1;
		do 
		{
			System.out.print(i+" ");
			i++;
		} while(i<=10);

	}

}
