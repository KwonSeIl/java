import java.util.Arrays;

/*
 *    ���� ���� : ������ �ͳ��� ����
 *    
 *    F  V  M  K  H
 *    -  -
 *    F  V
 *       -  -
 *       M  V
 *          -  -
 *          K  V
 *             -  -
 *             H  V
 *               --- ���� 
 *   --------------------
 *    F  M  K  H 
 *    -- -
 *    F  M
 *       -  -
 *       K  M
 *          -  -
 *          H  M
 *             ---- ���� 
 *   ---------------------
 *    F  K  H
 *    -- -
 *    F  K
 *       -  -
 *       H  K 
 *          ----- ���� 
 *    -------------------
 *    F H
 *    - -
 *    F H 
 *      ------------���� 
 *    
 */
public class �迭����_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr=new char[10];
        // �ʱ�ȭ 
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(char)((Math.random()*26)+65);
        }
        System.out.println("���� ��:");
        System.out.println(Arrays.toString(arr));
        
        for(int i=0;i<arr.length;i++)
        {
        	for(int j=0;j<arr.length-1-i;j++)
        	{
        		if(arr[j]>arr[j+1])
        		{
        			char temp=arr[j];
        			arr[j]=arr[j+1];
        			arr[j+1]=temp;
        		}
        	}
        }
        System.out.println("���� ��:");
        System.out.println(Arrays.toString(arr));
	}

}