/*
 * 
 */
public class �ݺ���_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=(int)(Math.random()*101); //0~100
		int num2=num;
		System.out.println("num="+num);
		System.out.println(Integer.toBinaryString(num)); //2���� ���
		
		String result="";
		System.out.println("===== for�� �̿��� ������ ��� =====");
		for(;;) //Ƚ���� �𸣱� ������ ���ѷ���
		{
			//2�� ������ ������ ����
			int a=num%2;
			result+=a;
			// 2�� ����
			num=num/2;
			// 0���� ���� Ȯ�� ==> break;
			if(num==0) break;
		}
		//System.out.print(result) �� ������ٸ� 
		for(int i=result.length()-1;i>=0;i--)
		{
			System.out.print(result.charAt(i));
		}
		System.out.println();
		System.out.println("===== while�� �̿��� ������ ��� =====");
		//num=0, result="0111011"
		result="";
		// �ʱ�ȭ �κ� �߿� 
		while(true)
		{
			int a=num2%2;
			result+=a;
			num2=num2/2;
			if(num2==0) break;
			
		}
		for(int i=result.length()-1;i>=0;i--)
		{
			System.out.print(result.charAt(i));
		}

	}

}
