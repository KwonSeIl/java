import java.util.Arrays;
/*
 *    �迭 , Ŭ���� ==> ���� ���� (�޸� �ּ�)
 *      �迭    ������
 *      (Stack) (Heap)
 *    �⺻�� ==> �޸� ��ü 
 *    �迭�ȿ� ����� ���� �ּҰ� ���� �Ǿ� �ִ� 
 */
public class �迭_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr={10,20,30,40,50};
        //    ---
        int[] copy=new int[arr.length];
        //    ----- �����Ͱ� ����� �ּҸ� �����ϰ� �ִ� (��������)
        System.out.println("arr="+arr);
        System.out.println("copy="+copy);
        for(int i=0;i<arr.length;i++)
        {
        	copy[i]=arr[i];
        }
        // copy=arr
        System.out.println("arr="+Arrays.toString(arr));
        System.out.println("copy="+Arrays.toString(copy));
        copy[0]=100;
        System.out.println("arr="+Arrays.toString(arr));
        System.out.println("copy="+Arrays.toString(copy));
        
	}

}
