// ����ڰ� �������� ��û -> ���� �Ѱ���(�Ű�����: ��)
/*
 * 	��ü���
 * 	���� �Ѱ���
 */
import java.util.Scanner;
import javax.naming.spi.DirStateFactory.Result;
public class �޼ҵ�_2 {
	
	static void gugudan(int dan)
	{
		for(int i=1;i<=9;i++)
		{
			System.out.println(dan+" * "+i+" = "+dan*i);
		}
	}
	
	static String gugudan2(int dan)
	{
		String result="";
		for(int i=1;i<=9;i++)
		{
			//System.out.println(dan+" * "+i+" = "+dan*i);
			result+=dan+" * "+i+" = "+(dan*i)+"\n";
		}
		return result;
 	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�:");
		int dan=scan.nextInt();
		gugudan(dan);
		
		System.out.println("===================");
		String result=gugudan2(dan);
		System.out.println(result);

	}

}
