

// continue: Ư���κ� ����
// 1~10���� ��� -> 5,9 ����
public class �ݺ����_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			if(i==5 || i==9)
				continue; //i==5 -> i++�� �̵�, i==9 -> i++�� �̵� ==> �Ϲ� �ڹٿ����� �ַ� ���. break�� �ַ� ���
			System.out.print(i+" ");
		}
		
		System.out.println();
		//���ѷ����ÿ� �ַ�  ��� 
		int i=1;
		while(i<=10)
		{
			System.out.print("Hello ");
			if(i==5 || i==9)
				continue;
			System.out.print(i+" ");
			i++;
		}	//���ѷ��� -> 

	}

}
