import javax.swing.plaf.basic.BasicSplitPaneDivider;

import java.io.InvalidClassException;

/*
 * 두 정수의 나눗셈 결과를 구하는 메소드를 구현하시오(실수)
 * ----매개변수	-----리턴형
 */

import java.util.Scanner;
public class 문제1 {
	//실제 계산기 ==> 변수(String) ==> 7,9 => 79
	//static double div(int a,int b) ==> 반드시 실수로 변경
	static String div(int a,int b) //260page => 유효성 검사 
	{
		String result=""; //예외처리(8장)
		if(b==0)
			result="0으로 나눌 수 없습니다.";
		else 
			result=String.valueOf(a/(double)b); //결과값을 문자열로 변경 
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("첫 번째 정수 입력:");
		int a=scan.nextInt();
		System.out.print("두 번째 정수 입력:");
		int b=scan.nextInt();
		
		//결과값 받기
		String result=div(a, b);
		System.out.println(result);

	}

}
