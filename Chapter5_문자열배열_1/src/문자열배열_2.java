import java.util.Scanner;
public class 문자열배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] books= {
				"Java And Oracle",
				"Java And JSP",
				"HTML5 & CSS3",
				"Spring & vueJS",
				"SpringBoot & ReactJS",
				"JPA와 Java",
				"MyBatis & Java",
				"혼자 배우는 자바",
				"Java의 정석"
		};
		//1. 전체 목록 출력
		System.out.println("========= 전체 출력 ===========");
		for(int i=0;i<books.length;i++)
		{
			System.out.println((i+1)+"."+books[i]);
		}
		System.out.println("============================");
		//2. 검색: contains 이용
		Scanner scan=new Scanner(System.in);
		System.out.print("검색어 입력:");
		String fd=scan.next();
		for(String book:books)
		{
			if(book.contains(fd)) //결과값: true/false. Oracle: LIKE '%Java%'
			{
				System.out.println(book);
			}
		}
		///////////////// 서제스트
		//3. 시작문자/끝문자 가져오기 ==> 자동완성기
		System.out.println("=========== startsWith =========="); //Oracle: LIKE 'Java%'
		for(String book:books)
		{
			if(book.startsWith(fd))
			{
				System.out.println(book);
			}
		}
		System.out.println("========== endsWith ============="); //Oracle: LIKE '%Java'
		for(String book:books)
		{
			if(book.endsWith(fd))
			{
				System.out.println(book);
			}
		}
		
		
		
	}

}
