//����ڰ� ���� 10�� �Է�-> �Է°� ������ ���
import java.util.Scanner;
public class �ݺ���_while4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int sum=0;
		/*
		System.out.print("1��° ���� �Է�:");
		int num=scan.nextInt();
		// sum�� ����
		sum+=num;
		
		System.out.print("2��° ���� �Է�:");
		num=scan.nextInt();
		// sum�� ����
		sum+=num;
		
		System.out.print("3��° ���� �Է�:");
		num=scan.nextInt();
		// sum�� ����
		sum+=num;
		//...7
		*/
		
		int i=1;
		while(i<=10)
		{
			System.out.print(i+"��° ���� �Է�:");
			int num=scan.nextInt();
			//sum�� ����
			sum+=num;
			i++; //10���� ����
		}
		System.out.println("sum="+sum);
		
		String[] arr= {"ȫ�浿","��û��","������","�ڹ���","�̼���"};
		for(i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
