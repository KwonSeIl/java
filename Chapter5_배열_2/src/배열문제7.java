/*
 *   arr �迭 �߿��� �ε����� 1�� ���� ���� ����غ���.
     int[] arr = { 10, 20, 30, 50, 3, 60, -3 };  
       ==> arr[1]
     arr �迭 �߿��� ���� 60�� ���� �ε����� ����غ���. 
     int[] arr = { 10, 20, 30, 50, 3, 60, -3 };  
 
 */
public class �迭����7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,50,3,60,-3};
		System.out.println(arr[1]);
		int i;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==60)
			{
				
				System.out.println("�ε����� "+i);
				break;
			}
		}
		
		
	}

}