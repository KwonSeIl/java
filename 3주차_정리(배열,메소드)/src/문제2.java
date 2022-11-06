/*
 * 문자열의 소문자를 대문자로 바꾸는 메소드를 구현하시오
 * 		----매개변수
 * 				--- 고민?
 * 
 * 	retrun s.toUpperCase()
 */
import java.util.Scanner;
public class 문제2 {
	static String chage(String alpha)
	{
		return alpha.toUpperCase();
		/* 
		 *  String s="";
		 *  for(int i=0;i<alpha.length();i++
		 *  {
		 *  	char a=alpha.charAt(i);
		 *  	a=(char)(a+32);
		 *  	s+=a;
		 *  }
		 */
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("알파벳 입력:");
		String alpha=scan.next();
		String s=chage(alpha);
		System.out.println(s);
	}

}
