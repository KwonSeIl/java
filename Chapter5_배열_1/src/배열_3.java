// ==> �ʱ�ȭ (����)  => {��....}
public class �迭_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // �迭 ���� 
		int[] arr=new int[5];
		//    arr[0] ~ arr[4] = 0
		for(int i=0;i<5;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		// ���� ��� 
		// ���� for�� ===> ��� ���� (forEach����) 
		/*
		 *     for(�������� ����:�迭��) ==> �����Ͱ� �� ����ϸ� �ڵ����� for���� �����Ѵ� 
		 *         ---------
		 *          ���� �迭�� ����� ���� �о� �´� (��� ���� ���������̳� ū���������� ����Ѵ�)
		 *          int[]  ==> int , long , double
		 *          char[] ==> int , long , double , char
		 *          double[] ==> double
		 *          long[] ==> long,double
		 */
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		// forEach ==> �迭 / �÷��� ==> ȭ�� ��� (���� ȭ�� ��½ÿ��� forEach)
		
		// �迭 �����Ŀ� �ٽ� ��� 
		System.out.println();
		/*arr[0]=arr[0]+1;
		arr[1]=arr[1]+2;
		arr[2]=arr[2]+3;
		arr[3]=arr[3]+4;
		arr[4]=arr[4]+5;*/
		for(int i=0;i<5;i++)
		{
			arr[i]=arr[i]+(i+1);
		}
		// readonly
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		/*
		 * 
		 *     List<String> list;
		 *     
		 *     for(int i=0;i<list.size();i++)
		 *     {
		 *        String s=list.get(i)
		 *        ���
		 *     }
		 *     
		 *     for(String s:list)
		 *     {
		 *        ��� 
		 *     }
		 */
		
		
	}

}
