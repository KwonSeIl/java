/*
 * if(avg<0 || avg>100)
 * {
 * 	���
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
public class ����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade, score;
		grade=(int)(Math.random()*4);
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�(0~100):");
		score=scan.nextInt();
		// if(score<0 || score>100){���} else{}
		if(score>=0 && score<=100) //�����Է�
		{
			if(grade==4) 
			{
				if(score>=70)
					System.out.println("�հ�"+grade);
				else 
				{
					System.out.println("���հ�"+grade);
				}
			}
			else //1,2,3
			{
				if(score>=60)
					System.out.println("�հ�"+grade);
				else
				{
					System.out.println("���հ�"+grade);
				}
			}
		}
		else
		{
			System.out.println("�߸��� �Է��Դϴ�.");
		}

	}

}
