import java.util.Arrays;

public class �迭����_5 {

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
		System.out.println("���� ��:");
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
