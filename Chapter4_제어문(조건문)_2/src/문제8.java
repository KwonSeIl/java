/*
 * 	for(�ʱⰪ;����;������)
 * 		 2	 100  2
 * 
 * 	=> ���� ���ؼ� ����ϴ� ����
 * 
 * 	1. �������� ==> i, j
 * 	2. ��������	 ==> sum ==> sum+=i --> 0���� �ʱ�ȭ(����) ==> sum(hit)
 * 	3. �����׺��� ==>flag ==> 1111 22 1111 22 1111 22
 */
public class ����8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=2;i<=100;i+=2)
		{
			sum+=i;
			System.out.println("2+4+6+....100������ ������ ��:"+sum);
		}
	}

}
