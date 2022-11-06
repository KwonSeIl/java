/*	137page
 * 	문자열 => String(클래스)
 * 			데이터형,클래스형(문자열 관련 기능)
 * 	 사용법)
 * 		String 변수명=""
 * 	 기능)
 * 		비교:equals(), equalsIgnoreCase()
 * 		    -------	  -----------------
 * 			 대소문자 구분		대소문자 구분X
 * 		 => admin Admin(flase)	admin Admin(true)
 * 		 =>  로그인			검색
 * 		문자열 길이: length()
 * 		문자 1개: charAt() , 몇번째 위치의 값 가져올 때 사용 
 * 		--------------------
 */
public class 문자열데이터형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="Hello Java";
		System.out.println(string.length());
		System.out.println(string.charAt(5)); //5번째 문자 가져오기 
		
		for(int i=string.length()-1;i>=0;i--)
		{
			System.out.print(string.charAt(i));
		}

	}

}
