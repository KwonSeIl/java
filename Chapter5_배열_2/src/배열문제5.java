import java.util.Arrays;

/*
 *  5. ������ 10�� �����ϴ� �迭�� ����� 1���� 10���� ������ ������ �����ϰ� �����Ͽ� �迭�� �����϶�. 
 *  �׸��� �迭�� �� ���ڵ�� ����� ����϶�. 
 */
public class �迭����5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ������ 10�� �����ϴ� �迭�� �����
		int[] arr=new int[10];
		// 1���� 10���� ������ ������ �����ϰ� �����Ͽ� �迭�� �����϶�
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*10)+1;
		}
		// �迭�� �� �������
		System.out.println(Arrays.toString(arr));
		// ����� ���
		int sum=0;
		for(int i:arr)
		{
			sum+=i;
		}
		
		System.out.printf("���:%.1f\n",sum/(double)arr.length);
	}

}
