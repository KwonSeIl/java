/*
 * 문자열을 입력받아서 좌우 대칭인지 확인하는 메소드를 구현하시오(구글 코테)
 * -----매개변수		--------리턴형
 */
import java.util.Scanner;
public class 문제3 {
	static boolean method(String s)
	{
		boolean bCheck=true;
		for(int i=0;i<s.length()/2;i++)
		{
			int last=s.length()-1-i;
			if(s.charAt(i)!=s.charAt(last))
			{
				bCheck=false;
				break;
			}
		}
		return bCheck;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s="";
		while(true) //문자 ==> 문자 개수 짝수여야 함
		{
			System.out.print("문자열 입력:");
			s=scan.next();
			if(s.length()%2!=0)
			{
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			break;
		}
		boolean bCheck=method(s);
		if(bCheck==true)
			System.out.println("좌우 대칭");
		else 
			System.out.println("좌우 대칭 아님");
		
		
	}

}
