/*
 * 	자바 / 오라클 / JSP / Spring / JavaScript(Ajax, VueJS, ReactJS)
 * 										 --------------------javascript 라이브러리
 * 	--------------------------------------AWS
 * 		오라클 <==> 자바(JDBC=>MyBatis,JPA) =>JSTL/Thymeleaf(VueJS) 연동하는 부분 핵심
 * 												v-for,	th:each
 * 												v-if,	th:if 
 * 	자바 / 오라클 / JSP / Spring / JavaScript(Ajax,HTML5/CSS,AWS) ==> 교재有
 * 	---------------------------------------------------------------------------
 * 	156~157page: for
 * 		=> 반복횟수를 알고 있는 상태 (화면UI)
 * 		=> 형식
 * 			= 초기값
 * 			= 조건식
 * 			  범위 지정==> 횟수
 * 			= 증감식(++,--) => 쿠키에 저장
 * 			  여러개 ==> 복합 대입연산자 사용 +=,-=
 * 			  for(초기값;조건문;증가식)
 * 			  {
 * 				출력내용
 * 			  }
 * 					   false-> 종료 
 * 			  초기값 ==> 조건문 ==> 출력 내용 ==> 증가식
 * 						^ true   			|
 * 						|--------------------	
 * 	167~168page: while
 * 		=> 데이터베이스, 횟수를 모르는 상태
 * 		=> 주의점) 조건문 생략 불가 
 * 		초기값
 * 		while(조건식) --> 무한루프
 * 		{
 * 			반복수행문장
 * 			증가식
 * 		}
 * 	
 * 		----------------
 * 		while(treu) --> 처음으로 돌아간다
 * 		{
 * 			반복수행문장
 * 			if()
 * 			{
 * 				종료 조건
 * 			}
 * 		}
 * 	175page: break ==> switch~case, 반복문에서만 사용 가능, break가 있는 반복문만 제어가 가능 
 * 						=> 반복문을 종료(for,while)
 * 	176page: continue ==> 반복문에서만 사용 가능, continue가 있는 반복문만 제어 가능 
 * 						=> 특정부분을 제외 할 때, 처음으로 다시 시작할 때 
 * 						=> for->증가식으로 이동. while,do~while->조건식으로 이동 
 */
public class 반복문정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String msg="Hello java";
		System.out.println(msg);
		for(int i=msg.length()-1;i>=0;i--)
		{
			System.out.print(msg.charAt(i));
		} */
		int a=10;
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j==2)
					break;
			}
		}
		//i=1,j=1,i=2,j=1
	
	
	}

}
