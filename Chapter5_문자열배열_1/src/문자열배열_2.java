import java.util.Scanner;
public class ���ڿ��迭_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] books= {
				"Java And Oracle",
				"Java And JSP",
				"HTML5 & CSS3",
				"Spring & vueJS",
				"SpringBoot & ReactJS",
				"JPA�� Java",
				"MyBatis & Java",
				"ȥ�� ���� �ڹ�",
				"Java�� ����"
		};
		//1. ��ü ��� ���
		System.out.println("========= ��ü ��� ===========");
		for(int i=0;i<books.length;i++)
		{
			System.out.println((i+1)+"."+books[i]);
		}
		System.out.println("============================");
		//2. �˻�: contains �̿�
		Scanner scan=new Scanner(System.in);
		System.out.print("�˻��� �Է�:");
		String fd=scan.next();
		for(String book:books)
		{
			if(book.contains(fd)) //�����: true/false. Oracle: LIKE '%Java%'
			{
				System.out.println(book);
			}
		}
		///////////////// ������Ʈ
		//3. ���۹���/������ �������� ==> �ڵ��ϼ���
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
