// ȭ�� 
import java.util.*;// ���̺귯�� �̿� 
public class �迭_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr={10,20,30,40,50,60,70,80,90};
        int[] arrcopy=new int[arr.length*2];
        for(int i=0;i<arr.length;i++)
        {
        	System.out.print(arr[i]+" ");
        }
        
        System.out.println();
        
        for(int i:arr)
        {
        	System.out.print(i+" ");
        }
        
        System.out.println();
        System.out.println(Arrays.toString(arr));
	}

}
