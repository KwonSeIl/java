import java.util.Arrays;

public class �迭����_9 {
    // 204 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[100];
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(int)(Math.random()*10); //0~9
        }
        System.out.println(Arrays.toString(arr));
        // �󵵸� �����ϴ� �迭 (0~9)
        int[] result=new int[10];
        for(int i=0;i<arr.length;i++)
        {
        	result[arr[i]]++;
        }
        // ��� 
        for(int i=0;i<result.length;i++)
        {
        	System.out.println(i+"=>"+result[i]);
        }
	}

}