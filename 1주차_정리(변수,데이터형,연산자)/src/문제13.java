/*
 * 	두 개의 정수를 입력 받아 첫째 수를 둘째 수로 나눈 나머지 출력  프로그램 
 */
import java.util.Scanner;
public class 문제13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//클래스명 객체명 = new 생성자(매개변수)
		System.out.print("1' 정수입력:");
		int a=scan.nextInt();
		
		System.out.print("2' 정수입력:");
		int b=scan.nextInt();
		
		int result=a%b;
		System.out.println(result);

	}

}
