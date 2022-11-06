/*
 * 	***indexOf: 앞에서부터 찾기
 * 	***lastIndexOf: 뒤에서부터 찾기(경로명)
 * 	-------------- 문자의 위치 찾기 
 * 	***split
 * 	===========================================> 12개 메소드는 반드시 암기 
 */
public class 문자열정리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String movie="1|쇼생크 탈출|드라마|https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2|팀 로빈스(앤디 듀프레인), 모건 프리먼(엘리스 보이드 레드 레딩)|2016 .02.24 재개봉, 1995 .01.28 개봉|15세 관람가|프랭크 다라본트";
		//split
		String[] data=movie.split("\\|"); //split 사용시 주의점) 정규식 이용
		// 정규식 기호: ^(부정),?(존재여부),|(선택),+(한글자 이상),*(0글자 이상),.(한개 문자) ==> \\붙여야 함
		// 오라클: !=, ^=, <>
		for(String s:data)
		{
			System.out.println(s);
		}
	}

}
