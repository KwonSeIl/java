/*
 * if(avg<0 || avg>100)
 * {
 * 	경고
 * }
 * else
 * {
 * 	if(grade==4)
 * 	{
 * 		if(score>70)
 * 		{
 * 		}
 * 		else
 * 		{
 * 		}
 * }
 * 	else
 * 	{
 * 		if(score>60)
 * 		{
 * 		}
 * 		else
 * 		{
 * 		}
 */
import java.util.Scanner;
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade, score;
		grade=(int)(Math.random()*4);
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력(0~100):");
		score=scan.nextInt();
		// if(score<0 || score>100){경고} else{}
		if(score>=0 && score<=100) //정상입력
		{
			if(grade==4) 
			{
				if(score>=70)
					System.out.println("합격"+grade);
				else 
				{
					System.out.println("불합격"+grade);
				}
			}
			else //1,2,3
			{
				if(score>=60)
					System.out.println("합격"+grade);
				else
				{
					System.out.println("불합격"+grade);
				}
			}
		}
		else
		{
			System.out.println("잘못된 입력입니다.");
		}

	}

}
