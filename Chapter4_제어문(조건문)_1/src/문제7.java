/*
 * 
 * 
���� 3���� �Է¹޾� ������ ��� ���ϰ� ������ ���ϴ� ���α׷�
�ۼ�(90�̻��̸� A, 80�̻��̸� B, 70�̻��̸� C, 60�̻��̸� D, 
97 �̻�A+ 94���̻� A0, 90�� �̻�A-
87 �̻�B+ 84���̻� B0, 80�� �̻�B-
77 �̻�C+ 74���̻� C0, 70�� �̻�C-
67 �̻�D+ 64���̻� D0, 60�� �̻�D-

 */
import java.util.Scanner;
public class ����7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("����,����,���� �Է�(80 80 80):");
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
        System.out.println("����:"+kor);
        System.out.println("����:"+eng);
        System.out.println("����:"+math);
        System.out.println("����:"+total);
        System.out.printf("���:%.2f\n",avg);
        System.out.println("����:"+grade+""+opt);//145page

	}

}
