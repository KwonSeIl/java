/*
 * 
 * 
정수 3개를 입력받아 총점과 평균 구하고 학점을 구하는 프로그램
작성(90이상이면 A, 80이상이면 B, 70이상이면 C, 60이상이면 D, 
97 이상A+ 94점이상 A0, 90점 이상A-
87 이상B+ 84점이상 B0, 80점 이상B-
77 이상C+ 74점이상 C0, 70점 이상C-
67 이상D+ 64점이상 D0, 60점 이상D-

 */
import java.util.Scanner;
public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("국어,영어,수학 입력(80 80 80):");
        int kor=scan.nextInt();
        int eng=scan.nextInt();
        int math=scan.nextInt();
        int total=kor+eng+math;
        double avg=total/3.0;
        
        int avg2=(int)avg;
        char grade=' ',opt='-';
        
        if(avg2>=90)
        {
        	grade='A';
        	if(avg2>=97)
        		opt='+';
        	else if(avg2>=94)
        		opt='0';
        	else
        		opt='-';
        }
        else if(avg2>=80)
        {
        	grade='B';
        	if(avg2>=87)
        		opt='+';
        	else if(avg2>=84)
        		opt='0';
        	else
        		opt='-';
        }
        else if(avg2>=70)
        {
        	grade='C';
        	if(avg2>=77)
        		opt='+';
        	else if(avg2>=74)
        		opt='0';
        	else
        		opt='-';
        }
        else if(avg2>=60)
        {
        	grade='D';
        	if(avg2>=67)
        		opt='+';
        	else if(avg2>=64)
        		opt='0';
        	else
        		opt='-';
        }
        else
        {
        	grade='F';
        }
        System.out.println("국어:"+kor);
        System.out.println("영어:"+eng);
        System.out.println("수학:"+math);
        System.out.println("총점:"+total);
        System.out.printf("평균:%.2f\n",avg);
        System.out.println("학점:"+grade+""+opt);//145page

	}

}
