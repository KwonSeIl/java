/*
 *  for(int i=1;i<=n;i++) ==>����
 */

public class ����11 {

	//����==>��������, �Ķ��� ==> �������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=(int)(Math.random()*100)+1; //����
		int sum=0;//��
		System.out.println("����:"+n);
		
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println("1~"+n+"������ ��:"+sum);

	}

}
