import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.w3c.dom.Text;
public class ����_���ǹ� {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
		Elements title=doc.select("td.info.a.title");
		Scanner scan=new Scanner(System.in);
		System.out.print("�˻���:");
		String fd=scan.next();
		for(int i=0;i<title.size();i++)
		{
			if(title.get(i).text().contains(fd))
			System.out.println((i+1)+"."+title.get(i).text());
		}
		

	}

}
