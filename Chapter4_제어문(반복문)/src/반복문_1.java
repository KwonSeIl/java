//1~100������ �� ���ϱ� 
public class �ݺ���_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===for��===");
		//���� -> 1~100���� �����ϴ� ���� �ʿ�
		int sum=0;
		for(int i=1;i<=100;i++) 
		{
			sum+=i;
			System.out.println("i="+i+"sum"+sum);
		}
		System.out.println("1~100������ ��:"+sum);
		System.out.println("===while��===");
		sum=0;
		int i=1;
		while(i<=100)
		{
			sum+=i;
			System.out.println("i="+i+"sum"+sum);
			i++;
		}
		System.out.println("1~100������ ��:"+sum);
		System.out.println("===do~while��===");
		sum=0;
		i=1;
		do {
			sum+=i;
			System.out.println("i="+i+"sum"+sum);
			i++;
		}while(i<=100);
		System.out.println("1~100������ ��:"+sum);
		//��ɹ��� ����. ������ �ٸ�
		
		
		
		
	}

}
