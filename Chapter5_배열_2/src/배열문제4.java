import java.util.Arrays;

/*
 *   ���� ���� 10�� �Է¹޾� �迭�� �����ϰ�, �迭�� �ִ� ���� �߿��� 3�� ����� ����ϴ� ���α׷��� �ۼ��϶�
 */
public class �迭����4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 10 �����ϴ� ���� 
		int[] arr=new int[10];
		// �ʱ�ȭ 
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		// ȭ�� ��� 
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)// �ε����� �̿��ؼ� ���� ��� �´� 
		{
			if(arr[i]%3==0)
				System.out.print(arr[i]+" ");
		}
		/*
		 *   for(int i:arr) // ���� ����� ���� ��� �´� 
		     {
			   if(i%3==0)
				System.out.print(i+" ");
		    }
		 */
	}

}