/*
 * 1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식 작성 (조건문)
 * x>=10 && x<20
 * 2. char형 변수 ch가 공백이고 탭이 아닐 때 true인 조건식 작성
 * ch==' ' && ch!='\t'
 * 3.char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식 작성
 * ch='x' || ch=='X'
 * 4.char형 변수 ch가 숫자('0' ~ '9')일 때 true인 조건식 작성
 * ch>='0' && ch<='9'
 */
import java.util.Scanner;
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수를 입력하세요:");
		int x=scan.nextInt();
		
		if(x>10 && x<20)
			System.out.println("true");
		else 
			System.out.println("false");

	}

}
