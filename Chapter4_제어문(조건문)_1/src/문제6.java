/*
 * 임의의 문자를 추출하여 대문자인지 소문자인지 확인하는 프로그램 작성
 */
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=(int)(Math.random()*2);
		int no=(int)(Math.random()*26)+65;
		char c=' ';
		
		if(i==0) //0이면 대문자 출력
		{
			c=(char)no;
		}
		else //1 나오면 소문자 출력
		{
			c=(char)(no+32);
		}
		
		System.out.println("c="+c);
		
		if(c>='A' && c<='Z')
			System.out.println(c+"는 대문자");
		else
			System.out.println(c+"는 소문자");

	}

}
