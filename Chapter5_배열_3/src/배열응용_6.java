import java.util.Arrays;
/*
 *     ���� ���� 
 *     
 *     20 30 10 50 40 
 *     -- --
 *     20 30
 *        -- --
 *        10 30
 *           -- --
 *           30 50
 *              -- --
 *              40 50
 *     -----------------  1 round (for 1ȸ ����)  0-4
 *     20 10 30 40 50
 *     -- --
 *     10 20
 *        -- --
 *        20 30
 *           -- --
 *           30 40
 *     ----------------- 2 round (for 2ȸ ����)  1-3
 *     10 20 30 40 50
 *     -- --
 *     10 20
 *        -- --
 *        20 30
 *     ----------------- 3 round (for 3ȸ ����)  2-2
 *     10 20 30 40 50
 *     -- --
 *     10 20
 *     ----------------- 4 round (for 4ȸ ����) 3-1
 *        
 *     i+j=4
 *     j=4-i
 *           
 */
public class �迭����_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		// �ʱ�ȭ 
		for(int i=0;i<arr.length;i++)
		{
		   arr[i]=(int)(Math.random()*100)+1;
		}
		// ��� 
		System.out.println("���� ��:");
		System.out.println(Arrays.toString(arr));
		// ���� ���� ���� 
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("���� ��:");
		System.out.println(Arrays.toString(arr));
	}

}