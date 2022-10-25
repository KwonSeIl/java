/*
 * 	90~100 A
 * 	80~89 B
 * 	70~79 C
 * 	60~69 D
 * 	60미만 F
 * ==> 다중조건문 
 * 	
 * 	면접 List
 * 	함수/메소드 창
 * 	라이브러리/프레임워크 차이
 * 	  --완제품  --레고 : 라이브러리(바꿀 수 X), 프레임워크(내 마음대로 고칠 수有, open source)
 * */

import java.util.Scanner;
public class 제어문_선택문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3개 정수(국어,영어,수학)
		Scanner scan=new Scanner(System.in);
		System.out.print("국어,영어,수학 점수 입력(80 80 80):");
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		
		//총점
		int total=kor+eng+math;
		//평균
		double avg=total/3.0;
		
		//학점
		char score='A'; // ' '도 가능 
		switch((int)(avg/10)) //문자, 문자열, 정수만 가능
		{
			//if(avg==10 || avg==9)
			case 10:
			case 9:
				score='A';
				break;
			case 8:
				score='B';
				break;
			case 7:
				score='C';
				break;
			case 6:
				score='D';
				break;
			default:
				score='F';
		}
		
		System.out.println("국어 점수:"+kor);
		System.out.println("영어 점수:"+eng);
		System.out.println("수학 점수:"+math);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg);
		System.out.println("학점:"+score);
		
		
		
		

	}

}
