package com.sist.exception;

import java.util.Arrays;

public class ����ó��_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int[] arr=new int[6];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=(int)(Math.random()*45)+1; //1~45
				for(int j=0;j<i;j++)
				{
					if(arr[j]==arr[i]) //�ߺ��� �ִٸ�
					{
						i--;
						break;
					}
				}
			}
			System.out.println("������ �ζ� ��ȣ:");
			Arrays.sort(arr); //ASC
			for(int i=0;i<arr.length;i++) //for(int i=arr.length-1;i>=0;i--) => DESC
			{
				System.out.print(arr[i]+" ");
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) //�浹 ����
		{
			System.out.println(e.getMessage());
		}
	}

}
