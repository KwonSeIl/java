/*
 *  사용자로부터 세 개의 정수를 입력받음
 *  곱과 합을 순서대로 진행-> 결과 출력 프로그램
 */
public class 문제12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1; //1~100
		int b=(int)(Math.random()*100)+1;
		int c=(int)(Math.random()*100)+1;
		System.out.printf("%d * %d + %d = %d",a,b,c,a*b+c);
		

	}

}
