package com.sist.exception;
import java.util.Arrays;
import java.util.Scanner;
/*
 * 	try~catch
 * 	throws
 * 	-------
 */
public class ����ó��_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���ھ߱�����
		int[] com=new int[3]; //����
		int[] user=new int[3]; //����� �Է°�
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1; //1~9
			for(int j=0;j<i;j++)
			{
				if(com[i]==com[j])
				{
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(com));
		//����� �Է�
		Scanner scan=new Scanner(System.in);
		while(true) //�ݺ�Ƚ�� ���� ���
		{
			try
			{
				//�Է°� �ޱ�'
				System.out.print("���ڸ� ���� �Է�:");
				int input=scan.nextInt();
				if(input<100 || input>999)
				{
					throw new Exception("���ڸ� ������ �Է��� �����մϴ�"); //catch�� �̵�
					// �ҽ� �ڵ��� �Ұ���
					/*
					 * 	��ɹ� => �ؿ� �ڵ��� �ȵǴ� Ű����
					 * 	throw
					 * 	continue
					 * 	return
					 * 	---------------
					 * 	���� �ڵ��� �Ұ����� Ű����
					 * 	this(), super()
					 * 	
					 */
				}
				user[0]=input/100;
				user[1]=(input%100)/10;
				user[2]=input%10;
				// 111
				/*
				 * 	Exception e=new Exception();
				 * 	throw e;
				 * 
				 * 	=>	throw new Exception()
				 * 
				 * 	Thread t=new Thread()
				 * 	t.start()
				 * 	
				 * 	=> new Thread().start()
				 * 
				 */
				
				if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2])
				{
					throw new Exception("���� ���� �Է��� �Ұ����մϴ�"); //���� �������� �ʴ� ����ó��
					//���ܸ� ���Ƿ� �߻� ==> �ʿ�ÿ��� ��� 
				}
				if(user[0]==0 || user[1]==0 || user[2]==0)
				{
					throw new Exception("0�� �Է��� �� �����ϴ�");
					// ���Ƿ� �߻� ==> �׽��� �� ���� ����
				}
				
				int s=0,b=0;
				for(int i=0;i<3;i++)
				{
					for(int j=0;j<3;j++)
					{
						if(com[i]==user[j]) //���� ���� ����
						{
							if(i==j) //�ڸ����� ���� ���
								s++;
							else  //�ڸ����� �ٸ� ���
								b++;
						}
					}
				}
				// ��Ʈ ���
				System.out.printf("Input Number:%d,Result:%dS-%dB\n",input,s,b);
				//���� ����
				if(s==3)
				{
					System.out.println("Game Over");
					break;
				}
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
			
	}

}
