/*
 * ����ڷκ��� �� ���� ������ �Է¹޾�, �� ������ �ִ밪�� �ּҰ�, �հ�� ����� ���غ���.
         
   int a,b,c;
   	int max=0;
   	if(max<a) max=a;
   	if(max<b) max=b;
   	if(max<c) max=c;
   	
   	int min=100;
   	if(min>a) min=a;
   	if(min>b) min=b;
   	if(min>c) min=c;
 */
import java.util.Scanner;
public class ����4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1;
		int b=(int)(Math.random()*100)+1;
		int c=(int)(Math.random()*100)+1;
		
		System.out.println("a="+a+",b="+b+",c="+c);
		
		int max=a;
		if(max<b) max=b;
		if(max<c) max=c;
		System.out.println("�ִ�:"+max);
		
		int min=a;
		if(min>b) min=b;
		if(min>c) min=c;
		System.out.println("�ּڰ�:"+min);
		
		int total=a+b+c;
		System.out.println("�հ�:"+total);
		
		double avg=total/3.0;
		System.out.printf("���:%.2f\n",avg);
		
		
	


	}

}
