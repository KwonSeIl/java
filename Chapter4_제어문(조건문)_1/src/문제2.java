/*
 *  ����2. ���� �� ���� �Է¹޾Ƽ�, �� ���� 3�� ������� �Ǵ��غ���.
 *  
 *  ==>if~else ==> num%3==0
 *  
 */
import java.util.Scanner;
public class ����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �� �� �Է�:");
		int num=scan.nextInt();
		
		if(num%3==0)
			System.out.println(num+"��(��) 3�� ����Դϴ�.");
		else 
			System.out.println(num+"��(��) 3�� ����� �ƴմϴ�.");
		
		
		
		/*
		 * int num=(int)(Math.random()*100)+1; if(num%3==0) System.out.println("3�� ���");
		 * else System.out.println("3�� ���X");
		 */

	}

}
