package com.sist.string;

public class ���̺귯��_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// equals: ���� ��쿡 true / �ٸ� ��쿡 false
		// ����: public boolean equals(String s) 
		// ==> �Ϲ� ���ڿ��� ���� ���ڸ� �ּҰ� �����ϴ�
		String s1="Hello"; //"Hello"��� �ּҰ� s1�� ����
		String s2="Hello"; //"Hello"��� �ּҰ� s2�� ����
		// ==> s1�� s2�� ���� �ּҸ� ������ �ִ�
		//new�� �̿�ÿ��� �ٸ� �޸𸮿� ������ �ȴ�
		if(s1==s2) //�޸� �ּҰ��� ����?
		{
			System.out.println("s1==s2");
		}
		else
		{
			System.out.println("s1!=s2");
		}
		String s3=new String("hello"); //���ο� �޸𸮿� ����
		
		if(s1==s3)
		{
			System.out.println("s1==s3");
		}
		else
		{
			System.out.println("s1!=s3");
		}
		// 	==============================> �ּҰ� ��
		// �������� ��
		if(s1.equals(s3)) //equals ==> ���� ����Ǿ� �ִ� ���� �� (��ҹ��� ��) => �α���
		{
			System.out.println("equals:���� ���ڿ��� ������ �ִ�");
		}
		else 
		{
			System.out.println("equals:�ٸ� ���ڿ��� ������ �ִ�");
		}
		// ��ҹ��� ���о��� �� equalsIgnoreCase
		// ����: public boolean equalsIgnoreCase(String s)
		if(s1.equalsIgnoreCase(s3))  //=> �˻�
		{
			System.out.println("equalsIgnoreCase:���� ���ڿ��� ������ �ִ�");
		}
		else 
		{
			System.out.println("equalsIgnoreCase:�ٸ� ���ڿ��� ������ �ִ�");
		}
	}

}
