import java.util.Scanner;
public class 문제16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12)>>");
		int month=scan.nextInt();
		
		if(month>=3 && month<=5)
			System.out.println("봄");
		else if(month>=6 && month<=8)
			System.out.println("여름");
		else if(month>=9 && month<=11)
			System.out.println("가울");
		else if(month==12 || month==1 || month==2)
			System.out.println("겨울");
		else 
			System.out.println("잘못 입력");
		
		/*
		 *  switch(문자,문자열,정수)
		 *  {
		 *  	case '', "", 1:
		 *  		출력;
		 *  		break;
		 *  	default: 생략
		 *  }
		 */
		
		//case 라벨: 라벨은 중복 사용이 불가
		//			실수 사용X ==> 게임, 메뉴<a>
		switch(month)
		{
			case 12:case 1:case 2:
				System.out.println("겨울");
				break;
			case 3:case 4:case 5:
				System.out.println("봄");
				break;
			case 6:case 7:case 8:
				System.out.println("여름");
				break;
			case 9:case 10: case 11:
				System.out.println("가을");
				break;
			default:
				System.out.println("잘못 입력했습니다.");
				
		}
		
	}

}
