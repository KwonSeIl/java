/*
 *     int[] arr=new int[15];
 *     
 *     for(int i=0;i<15;i++)
 *     {
 *     }
 *     (X) ===> �����ϱ� ��ƴ� 
 *     
 *     ==> �迭�� ������ �о� �´� : length
 *     ==> arr.length
 */
public class �迭_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr={10,20,30,40,50,60,70,80,90};
        System.out.println("�迭�� ����:"+arr.length);
        for(int i=0;i<arr.length;i++)
        {
        	System.out.println(arr[i]);
        }
	}

}
