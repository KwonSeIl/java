/*
 * 	조건식
 * 	 1) 90이상 ~ 100이하(&&)
 * 	  num>=90 && num<=100
 *   2) 0보다 작고 100보다 크다(||)
 *    num<0 || num>100 =========> 잘못된 입력
 *   3) y,Y
 *    num=='y'||num=='Y'(비교연산자: 정수,실수,논리,문자)
 *    ***문자열(equals) => id,pwd(로그인 처리) ***웹(문자열 중심) 
 *   
 *    
 * 	  
 */
// 3개의 점수를 받아 평균, 총점, 학점 구해서 출력하는 프로그램 
// 90이상:'A', 80:B, 70:C, 60:D, 이하는 F

import java.util.Scanner;
public class 제어문_조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("국어, 영어, 수학 입력(80 80 80):");
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		
		//총점
		int total=kor+eng+math;
		//평균
		double avg=total/3.0;
		
		//결과 출력
		System.out.println("국어 점수:"+kor);
		System.out.println("영어 점수:"+eng);
		System.out.println("수학 점수:"+math);
		
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg);
		// 단일 조건문: 중복적으로 처리할 때 사용多
		/*
		 *  3,5,7배수 -> 단일if문 
		 *  if를 많이 사용시 => 속도가 느림
		 *   => 검색 시 사용  ==> WHERE 
		 */
		char c='A';
		//학점 출력
		if(avg>=90 && avg<=100) 
			c='A';
		if(avg>=80 && avg<90) 
			c='B';
		if(avg>=70 && avg<80) 
			c='C';
		if(avg>=60 && avg<70) 
			c='D';
		if(avg<60)
			c='F';
		
		System.out.println("학점:"+c);

	}

}


