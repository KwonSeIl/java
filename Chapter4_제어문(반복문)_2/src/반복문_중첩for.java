/*
 * 	1) 조건문 중첩
 * 	 if(조건문) ==>로그인
 * 	 {
 * 		if(조건문)
 * 		{
 * 			=============> if(조건문 && 조건문) ==> Admin 메뉴 
 * 		}
 * 		else ==> User
 * 		{
 * 			=============> User 메뉴
 * 		}
 * 	 }
 * 	 else
 * 	 {
 * 		Guest	==========> 일반 메뉴 
 * 	 }
 * 
 * 	2) 선택문 중첩 ===> 게임, 네트워크에서 사용多
 * 	 switch(값)
 * 	 {
 * 		case 값:
 * 			switch(변수)
 * 			{
 * 				case 값:
 * 			}
 * 			break;
 * 	 }
 * 	3) 반복문 중첩 
 * 	 	======> for
 * 		for()
 * 		{
 * 			for()
 * 			{
 * 			}
 * 		}
 * 
 * 		for()
 * 		{
 * 			while()
 * 			{
 * 			}
 * 		}
 * 
 * 		while()
 * 		{
 * 			for()
 * 			{
 * 			}
 * 		}
 * 		while()
 * 		{
 * 			while()
 * 			{
 * 			}
 * 		}
 * 		=======================
 * 		이중 for문
 * 		for() 	=====> 줄 수 출력
 * 		{
 * 			for()
 * 			{
 * 				실제 출력물
 * 			}
 * 			\n
 * 		}
 * 
 * 		예)
 * 		A
 * 		AB
 * 		ABC
 * 		ABCD
 * 		ABCDE
 * 		ABCDEF ==> 6줄 
 * 
 * 
 * 		===> 변수위치
 * 		*****
 * 		*****
 * 		*****
 * 		*****
 * 
 * 		형식)
 * 					 |false-> for문 종료
 * 				 1  -> 2 -> 7  
 * 			for(초기값;조건식;증감식;)
 * 			{
 * 					  |true
 * 			-------------------
 * 						 |false -> 1차 for문의 증가식으로 올라감 
 * 					 3 -> 4  <- 6
 * 				for(초기값;조건식;증가식)
 * 				{
 * 						|true ↗
 * 					실행문장 5
 * 				}
 * 			---------------------
 * 			}
 * 
 * 			==> 예) for(int i=1;i<=3;i++)
 * 					{
 * 						for(int j=1;j<=3;j++)
 * 						{
 * 						}
 * 					}
 * 				
 * 					i=1 --> j=1,2,3
 * 					i=2 --> j=1,2,3
 * 					i=3 --> j=1,2,3
 * 					i가 false면 종료 
 */
public class 반복문_중첩for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("★★★★★");
		System.out.println("★★★★★");
		System.out.println("★★★★★");
		System.out.println("★★★★★");
		System.out.println("★★★★★");
		
		//1차 for문
		for(int i=1;i<=5;i++)
			System.out.print("☆");
		System.out.println();
		for(int i=1;i<=5;i++)
			System.out.print("☆");
		System.out.println();
		for(int i=1;i<=5;i++)
			System.out.print("☆");
		System.out.println();
		for(int i=1;i<=5;i++)
			System.out.print("☆");
		System.out.println();
		for(int i=1;i<=5;i++)
			System.out.print("☆");
		System.out.println();
		
		//2차 for문
		System.out.println("2차 For문 이용");
		//줄수 ==>5
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
				System.out.println("★");
			System.out.println();
		}
		

	}

}
