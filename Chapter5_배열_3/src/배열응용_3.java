// ���ھ߱� ���� 
/*
 *     765 => 167 ==> 1S-1B ==> 3S ==> ���� 
 */
// ����ڰ� �Է� 
import java.util.Arrays;
import java.util.Scanner;
public class �迭����_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*
         *    1. ���� ==> ���� 3�� ==> �ߺ����� ���� ==> int => 3
         *    2. ����� �Է� 
         *    3. �� 
         *    4. ��Ʈ 
         *       S:��
         *       B:�ۡ�
         *    5. ���� ���� Ȯ�� 
         */
		// ���� => ���� , ����� �Է� 
		int[] com=new int[3]; // ���ӿ� �ʿ��� ���� ����
		int[] user=new int[3];// ����� �Է°� ���� 
		// �ߺ����� ���� ==> ���� 
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1; // 1~9���� ���� �߻� 
			for(int j=0;j<i;j++)
			{
				if(com[i]==com[j])
				{
					i--;
					break;
				}
			}
		}
		
		int count=0;
		//System.out.println(Arrays.toString(com));
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			// ����� �Է��� �޴´� 
			System.out.print("���ڸ� ������ �Է��ϼ���:");
			int input=scan.nextInt();
			// ���� ó��
			if(input<100 || input>999)
			{
				System.out.println("�߸��� �Է��Դϴ�!!");
				continue; // ���ǽ����� �̵� ==> ó������ �ٽ� �����Ѵ� 
			}
			// �迭�� ����
			/*
			 *    765/100 ==> 7
			 *    765%100 ==> 65/10 ==> 6
			 *    765%10  ==> 5
			 */
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			// ���� ó�� 
			// 1. ���� ���� �Է�(X) , 0�� �Է��ϸ� �ȵȴ� 
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2])
			{
				System.out.println("���� ���� ����� �� �����ϴ�!!");
				continue;
			}
			
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("0�� ����� �� �����ϴ�!!");
				continue;
			}
			
			count++;
			
			int s=0,b=0; // s=> ���� �ڸ��� , b=�ٸ� �ڸ��� 
			// �� 
			for(int i=0;i<3;i++) // com
			{
				for(int j=0;j<3;j++) //user
				{
					if(com[i]==user[j])
					{
						if(i==j) 
							s++;
						else
							b++;
					}
				}
			}
			// ��Ʈ 
			//System.out.printf("Input Number:%d,Result:%dS-%dB\n",input,s,b);
			System.out.println("=======��Ʈ=======");
			System.out.print("S:");
			for(int i=0;i<s;i++)
			{
				System.out.print("��");
			}
			System.out.print("\nB:");
			for(int i=0;i<b;i++)
			{
				System.out.print("��");
			}
			System.out.println("\n=================");
			// ���Ῡ�� Ȯ�� 
			if(s==3)
			{
				System.out.println("�Է�Ƚ��:"+count);
				System.out.println("Game Over!!");
				break;
			}
		}
	}

}