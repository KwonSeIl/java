import java.util.Arrays;

/*
 *   int[] num = { 94, 85, 95, 88, 90 }; ���� �迭���� �ִ밪,�ּҰ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
 
 */
public class �迭����6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ������ ���� 
		int[] num = { 94, 85, 95, 88, 90 };
		int max=num[0];
		int min=num[0];
		
		System.out.println(Arrays.toString(num));
		
		for(int i:num)
		{
			if(max<i)
				max=i;
			if(min>i)
				min=i;
		}
		
		System.out.println("�ִ밪:"+max);
		System.out.println("�ּҰ�:"+min);
		
	}

}
