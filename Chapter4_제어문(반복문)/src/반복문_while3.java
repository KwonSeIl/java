import java.util.Scanner;

import javax.management.relation.InvalidRelationServiceException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class �ݺ���_while3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(true) //�����ϴ� ���α׷��� �ݵ�� ��� �� 
		{
			System.out.println("==== Menu ====");
			System.out.println("1. �α���"); //String
			System.out.println("2. ȸ������"); //IO
			System.out.println("3. ��ȭ���"); //try~catch => Jsoup
			System.out.println("4. ��ȭ ��");
			System.out.println("5. ��ȭ ����");
			System.out.println("6. ����");
			System.out.println("==============");
			System.out.print("�޴��� �����ϼ���:");
			int menu=scan.nextInt();
			switch(menu)
			{
			case 1:
				break;
			case 2:
				break;
			case 3:
				movieList();
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			default:
				System.out.println("�������� �ʴ� �޴��Դϴ�.(404)");
			}
			
			
		}

	}
	//��ȭ ��� ��±�� ==> �޼ҵ� (�迭, �޼ҵ�, Ŭ����(����+�޼ҵ�))
	
	//<span class="info_txt">������<span class="txt_num">24.7%</span></span>
	static void movieList() 
	{
		try 
		{
			Document doc=Jsoup.connect("https://movie.daum.net/ranking/reservation").get();
			Elements title=doc.select("strong.tit_item a.link_txt");
			Elements reserve=doc.select("span.info_txt span.txt_num");
			for(int i=0;i<title.size();i++) 
			{
				System.out.println((i+1)+"."+title.get(i).text()+"("+reserve.get(i).text()+")");
			}
		}catch(Exception e) {} //8��
	}

}
