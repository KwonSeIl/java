import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.w3c.dom.Text;

/*
 * 	변수(인스턴스변수,정적변수(클래스변수),지역변수,매개변수)
 * 	1. 인스턴스변수, 클래스변수 => 기본 디폴트로 자동 초기화
 *  	1) 자동 초기화 => 나중에 값을 변경
 *  	2) 시작과 동시에 데이터값이 필요할 때도 있음
 *  		= 명시적인 초기화
 *  			class A
 *  			{
 *  				int a=10; => 0
 *  				String s="aaa"; => null
 *  			}
 *  			예) Movie[] movie=new Movie[1938]; => 초기화
 *  				Movie[] movie={"","",""}
 *  		= 생성자 
 *  			class A ==> 변수의 초기화 메소드
 *  			{
 *  				Movie[] movie=new Movie[1938];
 *  				A()
 *  				{
 *  					for()
 *  					{
 *  						movie[i]=값
 *  					}
 *  				}
 *  			}
 *  		= 초기화 블록: 자동 인식 => 구현해서 변수값을 구하는 경우
 *  		  *** 구현: 메소드 호출, 제어문, 연산처리, 파일 읽기...
 *  		  *** 선언: 변수선언, 메소드선언
 *  				 int a;	 int a=10;
 *  				 abstract void aaa();
 *  				 void aaa()
 *  			     {
 *  					
 *  				 }
 *  		  1. 인스턴스 블록: 인스턴스 변수, static 변수에 대한 초기화
 *  		  2. static 블록: static 변수에 대한 초기화
 *  			
 *  		   사용법
 *  			class A
 *  			{
 *  				int a=10;
 *  				a=100; => 오류 (구현 형식이기 때문)
 *  				// 인스턴스 블록
 *  				{
 *  					a=100; => 구현 가능
 *  				}
 *  			}
 *  
 *  			class A
 *  			{
 *  				static int a=100;
 *  				a=200;
 *  				//static 블록
 *  				static
 *  				{
 *  					a=200;
 *  				}
 *  			}
 *  		
 *  2. 지역변수 => 반드시 초기화 후 사용
 *  3. 매개변수는 메소드가 호출될 때 초기화
 *  -----------------------------
 *  
 *  *** 초기화되는 순서
 *   1. 클래스 변수(static) => 자동저장(생성자가 없어도 된다)
 *   	기본값 => 명시적 초기화. 클래스블록 => 생성자 ====> 클래스블록
 *   ***2. 인스턴스
 *   	기본값 => 명시적 초기화. 인스턴스블록 => 생성자 ====> 생성자
 */
// => 중심: 변수 -> 데이터형클래스
/*
 * 	클래스의 구성요소
 * 	-----------
 * 	 변수: 데이터 저장
 * 		 공유변수 => 모든 객체가 동일하게 사용 ==> static
 * 		 객체변수( 인스턴스변수) => new 할 때마다 따로 생성되는 변수
 * 	 메소드: 저장된 데이터를 활용하는 기능 
 * 	 생성자: 데이터에 대한 초기화
 * 	 ------------------- 생략이 가능
 * 						 생성자가 없는 경우에 데이터를 초기화 {}, static{}
 * 
 * 	 ==> 객체지향(재사용, 보안) ---> 7장(기술면접 단골 list)
 * 			   ---- 수정, 추가 
 * 		 재사용
 * 			=> 변경해서 사용 = 상속 
 * 			=> 있는 그대로 사용 = 포함 
 * 		 보안
 * 			=> 은닉화
 * 			=> 캡슐화
 * 		 다형성	
 * 			=> 수정
 * 			=> 추가
 * 			-----------
 * 			추상화 
 */
class Movie
{
	int mno;
	String title;
	String story;
	String reserve;
	/*
	 * 	class A
	 * 	{
	 * 		int a; ==> int a=200;
	 * 		A()
	 * 		{
	 * 			a=200;
	 * 		}
	 * 	}
	 */
	
}
// => 중심: 메소드 -> 데이터를 관리 => 액션 클래스 
/*
 *  <ol class="list_movieranking">
                                    <li>
                        <div class="item_poster">
                            <div class="thumb_item">
                                <div class="poster_movie">
                                        <img src="https://img1.daumcdn.net/thumb/C408x596/?fname=https%3A%2F%2Ft1.daumcdn.net%2Fmovie%2Ff2e234313de6543bb1ba4ad0e5d6ae389a26765b" class="img_thumb" alt="블랙 팬서: 와칸다 포에버">
                                    <span class="rank_num">1</span>
                                        <span class="txt_tag">
                                            <span class="ico_movie ico_see see12">12세이상관람가</span>
                                        </span>
                                </div>
                                <div class="poster_info">
                                    <a href="/moviedb/main?movieId=133423" class="link_story" data-tiara-layer="poster">
                                        “와칸다를 지켜라!”거대한 두 세계의 충돌, 운명을 건 최후의 전투가 시작된다! 국왕이자 ‘블랙 팬서’인 '티찰라'의 죽음 이후수많은 강대국으로부터 위협을 받게 된 '와칸다'.'라몬다', '슈리' 그리고 '나키아', '오코예, '음바쿠'는각자 사명감을 갖고 '와칸다'를 지키기 위해 외로운 싸움을 이어간다.한편, 비브라늄의 패권을 둘러싼 미스터리한 음모와 함께깊은 해저에서 모습을 드러낸 최강의 적 '네이머'와 '탈로칸'의 전사들은'와칸다'를 향해 무차별 공격을 퍼붓기 시작하는데…
                                    </a>
                                </div>
                            </div>
                            <div class="">
                                <strong class="tit_item">
                                    <a href="/moviedb/main?movieId=133423" class="link_txt" data-tiara-layer="moviename">블랙 팬서: 와칸다 포에버</a>
                                </strong>
                                <span class="txt_append">
                                    <span class="info_txt">평점<span class="txt_grade">7.4</span></span>
                                    <span class="info_txt">예매율<span class="txt_num">69.2%</span></span>
                                </span>
                                <span class="txt_info">
							        개봉<span class="txt_num">22.11.09</span>
						        </span>
                            </div>
                        </div>
                    </li>
 */
class MovieSystem
{
	static Movie[] movie=new Movie[20];
	
	static
	{
		// 초기화(static 초기화)
		try {
			Document doc=Jsoup.connect("https://movie.daum.net/ranking/reservation").get();
			System.out.println(doc.toString());
			Elements title=doc.select("ol.list_movieranking strong.tit_item a");
			Elements story=doc.select("ol.list_movieranking div.poster_info a");
			Elements reserve=doc.select("ol.list_movieranking span.txt_append span.txt_num");
			
			
			for(int i=0;i<title.size();i++)
			{
				movie[i]=new Movie();
				movie[i].title=title.get(i).text();
				movie[i].story=story.get(i).text();
				movie[i].reserve=reserve.get(i).text();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
class MusicSystem
{
	Movie[] movie=new Movie[20];
	
	{
		//인스턴스 블록 => 초기화(초기화블록, 생성자) => 상속 예외
		try {
			Document doc=Jsoup.connect("https://movie.daum.net/ranking/reservation").get();
			System.out.println(doc.toString());
			Elements title=doc.select("ol.list_movieranking strong.tit_item a");
			Elements story=doc.select("ol.list_movieranking div.poster_info a");
			Elements reserve=doc.select("ol.list_movieranking span.txt_append span.txt_num");
			
			
			for(int i=0;i<title.size();i++)
			{
				movie[i]=new Movie();
				movie[i].title=title.get(i).text();
				movie[i].story=story.get(i).text();
				movie[i].reserve=reserve.get(i).text();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	MusicSystem()
	{
		try {
			Document doc=Jsoup.connect("https://movie.daum.net/ranking/reservation").get();
			System.out.println(doc.toString());
			Elements title=doc.select("ol.list_movieranking strong.tit_item a");
			Elements story=doc.select("ol.list_movieranking div.poster_info a");
			Elements reserve=doc.select("ol.list_movieranking span.txt_append span.txt_num");
			
			
			for(int i=0;i<title.size();i++)
			{
				movie[i]=new Movie();
				movie[i].title=title.get(i).text();
				movie[i].story=story.get(i).text();
				movie[i].reserve=reserve.get(i).text();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
public class 초기화블록_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie[] m=MovieSystem.movie;
		for(Movie mm:m)
		{
			System.out.println(mm.title);
			System.out.println(mm.story);
			System.out.println(mm.reserve);
			System.out.println("=====================");
		
		}
		System.out.println("==== 인스턴스 블록 ====");
		MusicSystem ms=new MusicSystem(); //저장: 인스턴스는 저장 먼저 해야함
		Movie[] mm=ms.movie;
		for(Movie mmm:m)
		{
			System.out.println(mmm.title);
			System.out.println(mmm.story);
			System.out.println(mmm.reserve);
			System.out.println("=====================");
		
		}
		
		
	}

}
