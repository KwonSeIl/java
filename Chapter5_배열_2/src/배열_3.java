import java.util.Arrays;
/*
 *      int[] arr={};
 *      int[] copy=arr; ==> arr,copy ���� �ּҸ� ���� 
 *      
 *      int a=10;
 *      int b=a;  ==> a,b�� �ٸ� �޸�
 */
public class �迭_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr={10,20,30,40,50};
        int[] copy=arr;// Call By Reference (�ּҿ� ���� ����)
        // Call By Value ==> �⺻�� 
        System.out.println("arr="+arr);
        System.out.println("copy="+copy);
        // �ּ� ==> �ּ� (���� �޸𸮸� ����)
        /*
         *   int a=10;
         *   int b=a;
         */
        System.out.println("arr="+Arrays.toString(arr));
        System.out.println("copy="+Arrays.toString(copy));
        
        copy[0]=100;
        // arr[0]
        System.out.println("arr="+Arrays.toString(arr));
        System.out.println("copy="+Arrays.toString(copy));
	}

}
