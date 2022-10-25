/*
 * 	switch()
 * 	{
 * 		case1:
 * 			switch()
 * 			{
 * 			}
 * 	}
 */
import java.util.Scanner;
public class 제어문_선택문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자 입력
		Scanner scan=new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2):");
		int user=scan.nextInt();
		// 컴퓨터(난수)
		int com=(int)(Math.random()*3); //0~2
		/*
		 * String[]res= {"가위","바위","보"}; System.out.println("컴퓨터:"+res[com]);
		 * System.out.println("사용자:"+res[user]);
		 */
		switch (com)
		{
			case 0:
				System.out.println("컴퓨터: 가위");
				break;
			case 1:
				System.out.println("컴퓨터: 바위");
				break;
			case 2:
				System.out.println("컴퓨터: 보");
				break;
		}
		switch (user)
		{
			case 0:
				System.out.println("사용자: 가위");
				break;
			case 1:
				System.out.println("사용자: 바위");
				break;
			case 2:
				System.out.println("사용자: 보");
				break;
		}
		
		//결과값 출력
		switch(com)
		{
		case 0: //가위
			switch(user)
			{
				case 0:
					System.out.println("비김!");
					break;
				case 1:
					System.out.println("사용자 Win!");
					break;
				case 2:
					System.out.println("컴퓨터 Win!");
					break;
				
			}
			switch(user)
			{
				case 0:
					System.out.println("컴퓨터 Win!");
					break;
				case 1:
					System.out.println("비김!");
					break;
				case 2:
					System.out.println("사용자 Win!");
					
				
			}
			break;
		case 1: //바위
			switch(user)
			{
				case 0:
					System.out.println("컴퓨터 Win!");
					break;
				case 1:
					System.out.println("비김!");
					break;
				case 2:
					System.out.println("사용자 Win!");
					
				
			}
			break;
		case 2: //보
			switch(user)
			{
				case 0:
					System.out.println("사용자 Win!");
					break;
				case 1:
					System.out.println("컴퓨터 Win!");
					break;
				case 2:
					System.out.println("비김!");
					break;
				
			}
			break;
		}
		
		
	}

}
