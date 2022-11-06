/*두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 
    출력하는 프로그램을 작성하시오
*/
import java.util.Scanner;
public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.print("2~12사이의 정수를 입력:");
		int hap=6;//scan.nextInt();
		
		for(int i=1;i<=6;i++) //첫번째 주사위
		{
			for(int j=1;j<=6;j++) //두번째 주사위
			{
				if(i+j==hap)
				{
					System.out.println("["+i+","+j+"]");
				}
			}
		}

	}

}
