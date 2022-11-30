import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.w3c.dom.Text;

/*
 * 	����(�ν��Ͻ�����,��������(Ŭ��������),��������,�Ű�����)
 * 	1. �ν��Ͻ�����, Ŭ�������� => �⺻ ����Ʈ�� �ڵ� �ʱ�ȭ
 *  	1) �ڵ� �ʱ�ȭ => ���߿� ���� ����
 *  	2) ���۰� ���ÿ� �����Ͱ��� �ʿ��� ���� ����
 *  		= ������� �ʱ�ȭ
 *  			class A
 *  			{
 *  				int a=10; => 0
 *  				String s="aaa"; => null
 *  			}
 *  			��) Movie[] movie=new Movie[1938]; => �ʱ�ȭ
 *  				Movie[] movie={"","",""}
 *  		= ������ 
 *  			class A ==> ������ �ʱ�ȭ �޼ҵ�
 *  			{
 *  				Movie[] movie=new Movie[1938];
 *  				A()
 *  				{
 *  					for()
 *  					{
 *  						movie[i]=��
 *  					}
 *  				}
 *  			}
 *  		= �ʱ�ȭ ���: �ڵ� �ν� => �����ؼ� �������� ���ϴ� ���
 *  		  *** ����: �޼ҵ� ȣ��, ���, ����ó��, ���� �б�...
 *  		  *** ����: ��������, �޼ҵ弱��
 *  				 int a;	 int a=10;
 *  				 abstract void aaa();
 *  				 void aaa()
 *  			     {
 *  					
 *  				 }
 *  		  1. �ν��Ͻ� ���: �ν��Ͻ� ����, static ������ ���� �ʱ�ȭ
 *  		  2. static ���: static ������ ���� �ʱ�ȭ
 *  			
 *  		   ����
 *  			class A
 *  			{
 *  				int a=10;
 *  				a=100; => ���� (���� �����̱� ����)
 *  				// �ν��Ͻ� ���
 *  				{
 *  					a=100; => ���� ����
 *  				}
 *  			}
 *  
 *  			class A
 *  			{
 *  				static int a=100;
 *  				a=200;
 *  				//static ���
 *  				static
 *  				{
 *  					a=200;
 *  				}
 *  			}
 *  		
 *  2. �������� => �ݵ�� �ʱ�ȭ �� ���
 *  3. �Ű������� �޼ҵ尡 ȣ��� �� �ʱ�ȭ
 *  -----------------------------
 *  
 *  *** �ʱ�ȭ�Ǵ� ����
 *   1. Ŭ���� ����(static) => �ڵ�����(�����ڰ� ��� �ȴ�)
 *   	�⺻�� => ����� �ʱ�ȭ. Ŭ������� => ������ ====> Ŭ�������
 *   ***2. �ν��Ͻ�
 *   	�⺻�� => ����� �ʱ�ȭ. �ν��Ͻ���� => ������ ====> ������
 */
// => �߽�: ���� -> ��������Ŭ����
/*
 * 	Ŭ������ �������
 * 	-----------
 * 	 ����: ������ ����
 * 		 �������� => ��� ��ü�� �����ϰ� ��� ==> static
 * 		 ��ü����( �ν��Ͻ�����) => new �� ������ ���� �����Ǵ� ����
 * 	 �޼ҵ�: ����� �����͸� Ȱ���ϴ� ��� 
 * 	 ������: �����Ϳ� ���� �ʱ�ȭ
 * 	 ------------------- ������ ����
 * 						 �����ڰ� ���� ��쿡 �����͸� �ʱ�ȭ {}, static{}
 * 
 * 	 ==> ��ü����(����, ����) ---> 7��(������� �ܰ� list)
 * 			   ---- ����, �߰� 
 * 		 ����
 * 			=> �����ؼ� ��� = ��� 
 * 			=> �ִ� �״�� ��� = ���� 
 * 		 ����
 * 			=> ����ȭ
 * 			=> ĸ��ȭ
 * 		 ������	
 * 			=> ����
 * 			=> �߰�
 * 			-----------
 * 			�߻�ȭ 
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
// => �߽�: �޼ҵ� -> �����͸� ���� => �׼� Ŭ���� 
/*
 *  <ol class="list_movieranking">
                                    <li>
                        <div class="item_poster">
                            <div class="thumb_item">
                                <div class="poster_movie">
                                        <img src="https://img1.daumcdn.net/thumb/C408x596/?fname=https%3A%2F%2Ft1.daumcdn.net%2Fmovie%2Ff2e234313de6543bb1ba4ad0e5d6ae389a26765b" class="img_thumb" alt="�� �Ҽ�: ��ĭ�� ������">
                                    <span class="rank_num">1</span>
                                        <span class="txt_tag">
                                            <span class="ico_movie ico_see see12">12���̻������</span>
                                        </span>
                                </div>
                                <div class="poster_info">
                                    <a href="/moviedb/main?movieId=133423" class="link_story" data-tiara-layer="poster">
                                        ����ĭ�ٸ� ���Ѷ�!���Ŵ��� �� ������ �浹, ����� �� ������ ������ ���۵ȴ�! �������� ���� �Ҽ����� 'Ƽ����'�� ���� ���ļ����� ���뱹���κ��� ������ �ް� �� '��ĭ��'.'����', '����' �׸��� '��Ű��', '���ڿ�, '������'�°��� ����� ���� '��ĭ��'�� ��Ű�� ���� �ܷο� �ο��� �̾��.����, ������ �б��� �ѷ��� �̽��͸��� ����� �Բ����� �������� ����� �巯�� �ְ��� �� '���̸�'�� 'Ż��ĭ'�� �������'��ĭ��'�� ���� ������ ������ �ۺױ� �����ϴµ���
                                    </a>
                                </div>
                            </div>
                            <div class="">
                                <strong class="tit_item">
                                    <a href="/moviedb/main?movieId=133423" class="link_txt" data-tiara-layer="moviename">�� �Ҽ�: ��ĭ�� ������</a>
                                </strong>
                                <span class="txt_append">
                                    <span class="info_txt">����<span class="txt_grade">7.4</span></span>
                                    <span class="info_txt">������<span class="txt_num">69.2%</span></span>
                                </span>
                                <span class="txt_info">
							        ����<span class="txt_num">22.11.09</span>
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
		// �ʱ�ȭ(static �ʱ�ȭ)
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
		//�ν��Ͻ� ��� => �ʱ�ȭ(�ʱ�ȭ���, ������) => ��� ����
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
public class �ʱ�ȭ���_1 {

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
		System.out.println("==== �ν��Ͻ� ��� ====");
		MusicSystem ms=new MusicSystem(); //����: �ν��Ͻ��� ���� ���� �ؾ���
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
