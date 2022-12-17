import java.util.Arrays;
/*
 *    ���� ( ASC / DESC )
 *         ----- �ø����� / �������� 
 *     = ��������
 *       30 10 40 50 20
 *       -- --
 *       10 30
 *       --    --
 *       10    40
 *       --       --
 *       10       50
 *       --          --
 *       10          20
 *       ----------------- 1 round (for 1ȸ ����)
 *       10  30  40 50 20
 *           --  --
 *           30  40
 *           --     --
 *           30     50
 *           --        --
 *           20        30
 *       ------------------ 2 round (for 2ȸ ����)
 *       10  20  40  50 30
 *               --  --
 *               40  50
 *               --     --
 *               30     40
 *       ------------------ 3 round (for 3ȸ ����)
 *       10  20  30  50  40
 *                   --  --
 *                   40  50
 *       ------------------ 4 round (for 4ȸ ����)
 *       10 20 30 40 50
 *                   --
 *     = �������� 
 */
public class �迭����_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ���� ��� 
		int[] arr=new int[5];
		// �ʱ�ȭ 
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		// ��� 
		System.out.println("���� ��:");
		System.out.println(Arrays.toString(arr));
		// ����
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				// 10 20 30 40 50
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println((i+1)+":"+Arrays.toString(arr));
		}
		System.out.println("���� ��:");
		System.out.println(Arrays.toString(arr));
	}

}
