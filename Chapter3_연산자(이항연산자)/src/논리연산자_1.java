/*
 * 	논리연산자: &&, || ==> 결과값이 항상 boolean(true/false)
 * 	 		(조건) && (조건)
 * 			----     ----
 * 			  |        |
 * 			  ----------
 * 				   |&&, ||
 * 				 결과값 도출
 * 			&&: 직렬(조건 두개가 true일 경우만 true)
 * 			(조건) || (조건)
 * 			||: 병렬(조건 중 한개 이상 true-> ture)
 * 	*** &&: 범위나 기간이 포함할 때 사용 90~100 A
 *  *** ||: 범위나 기간이 미포함할 때 사용. 
 *  *** 효율적인 연산 처리 *********
 *  
 *  실행 결과
 *    --------------------------------------------
 *  					&& 			||
 *    --------------------------------------------
 *     true true  		true		true		
 *    --------------------------------------------
 *     ture false		false		true
 *    --------------------------------------------
 *     false true		false		true
 *    --------------------------------------------
 *     false false		flase		flase
 *     
 *    &&연산자(직렬): 두개의 조건이 true일 경우에만 true
 *     (조건) && (조건)
 *     ----
 *     false ========> false. 다음조건 따지지X-> 속도 빠름 (효율적) 
 *     
 *    ||연산자(병렬): 두개의 조건 중에 1개 이상 true일 경우 true
 *     (조건) || (조건)
 *     -----
 *      true ========> true. 다음조건 처리하지X -> 효율적인 계산 
 *      
 */
public class 논리연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 효율적인 연산
		int a=10;
		int b=9;
		
		/*// boolean -> true/false
		boolean result=(a>b)&&++b==a; //false
		//				true ==> 조건처리
		//				false ==> 조건처리X 결과값 출력
		System.out.println(result);
		System.out.println("a="+a);
		System.out.println("b="+b);*/
		
		boolean result=(a<b)||++b==a;
		//		true ==> 조건처리X
		//		false ==> 조건처리
		System.out.println(result);
		System.out.println("a="+a);
		System.out.println("b="+b);

	}

}
