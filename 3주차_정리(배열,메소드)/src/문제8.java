/*
 * 입력 받은 값이 짝수인지 홀숨인지 판별하는 메소드를 구현하시오
 */
import java.util.Scanner;
public class 문제8 {
	static String method2(int a)
	{
		if(a%2==0)
			return "짝수";
		return "홀수";
		// return a%2==0?"짝수":"홀수"
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=method2(11);
		System.out.println(s);

	}

}
