import java.util.Arrays;
import java.util.Random;

public class �޼ҵ�_2 {
	// �ν��Ͻ� => ��ü ����
	int[] rand(int no) //������
	{
		int[] com=new int[no]; //�迭�� �������� ����
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++)
			{
				if(com[i]==com[j])
				{
					i--;
					break;
				}
			}
		}
		return com; //�迭-> ���������� �����ϸ� �ּ�(�迭��) 
		
	}
	void rand(int[] com) //�Ű����� 
	{
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++)
			{
				if(com[i]==com[j])
				{
					i--;
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] arr= {1,2,3,4,5};
		int[] temp=arr;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
		temp[0]=100;
		temp[1]=200;
		temp[2]=300;
		temp[3]=400;
		temp[4]=500;
		System.out.println(Arrays.toString(arr));*/
		�޼ҵ�_2 m=new �޼ҵ�_2(); //rand()=>����
		int[] arr=m.rand(6); //���� �� ���������� �� ���� // ������� �޾ƿ´� 
		System.out.println(Arrays.toString(arr));
		
		int[] arr1=new int[6]; //arr1 => �ּ�(�ּҸ� ���� -> �ش� �ּҿ� ���� ä���޶�) 
		m.rand(arr1); //�Ű����� �̿��ؼ� �� ���� 
		System.out.println(Arrays.toString(arr1));
		// Ŭ����, �迭 => ���� ���� ���(������, �Ű�����) 
		// �⺻�� => ������ ������ 
		/*
		 * 	�⺻�� �Ű�����: (int,double,char,boolean), String => read only
		 * 				�������� �б⸸�� �� ����(���� �Ұ���)
		 * 	������ �Ű�����: ��������� Ŭ����, �迭 (�ּ� �̿�) => read, write
		 * 				������ �б�, ������ ���� 
		 * 	*** �Ű������� 3�� �̻��̸� Ŭ����, �迭 �̿� 
		 */
		

	}

}
