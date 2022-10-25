//1~10까지 짝수 출력
public class 제어문_반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
		/*
		 * 	2 => i<=10 true ==> 2출력
		 * +2
		 * 	4 => i<=10 true ==> 4출력
		 * +2
		 * 	6 => i<=10 true ==>6출력
		 * +2
		 * 	8 => i<=10 ture ==>8출력
		 * +2
		 * 	10 => i<=10 true ==>10출력 
		 * +2
		 *	12 => i<=10 false ==> 종료 	
		 */
		for(int i=2;i<=10;i+=2) //초기값(어디서부터), 조건식(어디까지 갈것인지), 증감식(몇개씩 증감)
		{
			System.out.print(i+" ");
		}
		
		
		
	}

}
