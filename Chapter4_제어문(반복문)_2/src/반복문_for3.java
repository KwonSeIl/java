/*
 * 	1~10 -> 홀수만 출력 -> 1 3 5 7 9
 * 	증가는 1,2,3...가능
 * 	1 4 7 10 -> 출력
 */
public class 반복문_for3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i+=2)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		int i=1;
		while(i<=10)
		{
			System.out.print(i+" ");
			i+=2;
		}
		
		//짝수만 출력 
		System.out.println();
		for(i=2;i<=10;i+=2)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		i=2;
		while(i<=10)
		{
			System.out.print(i+" ");
			i+=2;
		}
	}

}
