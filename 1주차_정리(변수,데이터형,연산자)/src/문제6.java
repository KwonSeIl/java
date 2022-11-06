/*
 *     int num1=10, num2=10;   
       int a, b;   
       a = ++num1; => 증가된 상태 대입 ==>11
       b = num2++; => 증가 전 값 대입->나중 증가 ==>10

       System.out.printf("%d, %d \n", b, num2);

 */
public class 문제6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int num1=10, num2=10;   
	       int a, b;   
	       a = ++num1; //증가된 상태 대입 => 11
	       b = num2++; // 증가 전 값 대입 -> 나중에 증가 ==> 10

	       System.out.printf("a=%d, b=%d \n", b, num2);
	}

}
