/*
 * ���ڿ��� �ҹ��ڸ� �빮�ڷ� �ٲٴ� �޼ҵ带 �����Ͻÿ�
 * 		----�Ű�����
 * 				--- ���?
 * 
 * 	retrun s.toUpperCase()
 */
import java.util.Scanner;
public class ����2 {
	static String chage(String alpha)
	{
		return alpha.toUpperCase();
		/* 
		 *  String s="";
		 *  for(int i=0;i<alpha.length();i++
		 *  {
		 *  	char a=alpha.charAt(i);
		 *  	a=(char)(a+32);
		 *  	s+=a;
		 *  }
		 */
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("���ĺ� �Է�:");
		String alpha=scan.next();
		String s=chage(alpha);
		System.out.println(s);
	}

}
