/*
 * 	반복제어문
 * 	 1) 반복문 종료: break
 * 	 2) 특정 부분을 제거: continue
 * 	 *** 주의점
 * 	  break;
 * 	  continue; ===> 밑에는 소스 코딩을 할 수X
 * 
 * 	  예) if(i<10)
 * 		 {
 * 			break;
 * 			System.out.println("a"); --> 오류 발생 
 * 		 }
 * 
 * 		 break ===> 반복문, 선택문에서만 사용 가능. if문 불가 => 제어문 종료
 * 		 continue ===> 반복문이 있는 경우에서만 사용 가능 => 제외하고 다음 반복문 수행 
 * 
 * 		 while()
 * 		 {
 * 			break; ==> 중단
 * 		 }
 * 
 * 		 for()
 * 		 {
 * 			break; ==> 중단
 * 		 }
 * 	
 * 		 while(조건식
 * 		 {
 * 			continue; ==> 조건식으로 이동 
 * 		 }
 * 
 * 		 for(초기값;조건식;증가식)
 * 		 {
 * 			continue; ==> 증가식으로 이동 
 * 		 }
 */
//break; 1~100까지 출력 ==> 5까지 출력 후 for문 중단 
public class 반복제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++) //입력값 => q,Q ==> 게임 ESC 누르면 break
		{
			System.out.print(i+" ");
			if(i==5)
				break; //i=5면 종료
				//System.exit(0) -> 모든 프로그램 종료 
			
		}
		System.out.println();
		
		int i=1;
		while(i<=100)
		{
			System.out.print(i+" ");
			if(i==5)
				break; //whil문 종료 ==> System.exit(0)
			i++;
		}

	}

}
