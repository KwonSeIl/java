// 1~100까지 for(int i=1;i<=100;i++) => 총합, 짝수합, 홀수합 구하기

public class 제어문_반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0,even=0,odd=0;
		
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				even+=i; //even=even+i
				System.out.printf("even=%d,i=%d\n",even,i);
				/*
				 * 	even = 0
				 * 	even += i; ==>  i=2, even=2
				 * 					  4		  6
				 * 					  6		  12 
				 * 					  8       20
				 */
			}
			else
			{	
				odd+=i;
				System.out.printf("odd=%d,i=%d\n",odd,i);
			}
			total+=i;	
		}
		
		System.out.println("1~100까지 총합:"+total);
		System.out.println("1~100까지 짝수 합:"+even);
		System.out.println("1~100까지 홀수 합:"+odd);
		System.out.println("=====================================");
		// 3의 배수(a3), 5의 배수(a5), 7(a7)의 배수의 합
		int a3=0,a5=0,a7=0;
		
		for(int i=1;i<=100;i++)
		{
			if(i%3==0) 
				a3+=i;
			if(i%5==0)
				a5+=i;
			if(i%7==0)
				a7+=i;
		}
		
		System.out.println("3의 배수 합:"+a3);
		System.out.println("5의 배수 합:"+a5);
		System.out.println("7의 배수 합:"+a7);
		
	}

}
