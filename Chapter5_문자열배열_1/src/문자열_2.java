import java.util.Arrays;

// concat: 문자열 결합
// concat(문자열,문자열) ==> 문자열+문자열
public class 문자열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  int a=10;
		 *  a=5;
		 *  
		 *  String s1="Hello";
		 *  s1="lo";
		 */
		String s1="Hello ";
		String s2="Java!!";
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2);
		// 문자열 -> 기능 수행 후 문자열 변경되지 않음. 즉 원본은 변경X
		System.out.println(s1);
		s1=s1.substring(3);
		System.out.println(s1);
		System.out.println(s1);
		
		//변환
		String msg="Hello Java";
		//a -> b로 바꾸기 => Hello Jbvb
		System.out.println(msg.replace("a","b"));
		
		String msg1="홍길동 version 2!!"; //크롤링 하다보면 드라마|120분|
		System.out.println(msg1.replaceAll("[^가-힣]", ""));
		//[가-힣]		[A-Za-z]	[0-9]
		System.out.println(msg1.replaceAll("[^A-Za-z]", ""));
		System.out.println(msg1.replaceAll("[^0-9]", ""));
		
		String movie="범죄, 스릴러 |한국 |105분 |2022 .10.26 개봉";
		String[] m=movie.split("\\|"); // |는 출력할 때 반드시 \\ 붙여야 함
		// ^,|,?,.,+ 반드시 \\ 줘야함 
		System.out.println(Arrays.toString(m));
		
	}

}
