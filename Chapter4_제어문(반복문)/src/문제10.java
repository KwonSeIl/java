/*
 * 1~100������ ���� �� 4�� ����� �հ踦 ���϶�
 */
public class ����10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<=100;i++)
		{
			if(i%4==0)
				sum+=i;
		}
		System.out.println("4�� ��� �հ�:"+sum);
	}

}
