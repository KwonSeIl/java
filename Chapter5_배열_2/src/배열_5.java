import java.util.Arrays;

// �迭 ���� 
public class �迭_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {100,200,300,400,500};
        int[] copy=new int[arr.length*2];// �迭�� �ִ� ���� ���� (�ּҴ� �ٸ���)
        
        System.arraycopy(arr, 2, copy, 3, 3);
        // arr�� �ε���   , copy �ε���
        System.out.println("arr="+Arrays.toString(arr));
        System.out.println("copy="+Arrays.toString(copy));   
	}
}
