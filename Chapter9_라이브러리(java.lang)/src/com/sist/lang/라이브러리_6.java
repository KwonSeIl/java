package com.sist.lang;
// equals => ���ڿ� ��(������)
// �ּҰ� ��: ==
// ����: public boolean equals(Object obj)
// ���̺귯��: �޼ҵ��, ���, ������, �Ű����� => �ʿ�ÿ��� �������̵� ���� 
class Member
{
	private String name;
	public Member(String name) //����ڷκ��� �Է°��� �޾Ƽ� ���� �ʱ�ȭ�� �Ѵ�
	{
		this.name=name;
	}
	public String getName() { //�б�
		return name;
	}
	public void setName(String name) { //����
		this.name = name;
	}
	
}
public class ���̺귯��_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1=new Member("ȫ�浿");
		Member m2=new Member("ȫ�浿");
		System.out.println("m1="+m1);
		System.out.println("m2="+m2);
		if(m1.equals(m2))
		{
			System.out.println("���� ȸ���Դϴ�");
		}
		else
		{
			System.out.println("�ٸ� ȸ���Դϴ�");
		}
		
		m2=m1;
		if(m1.equals(m2))
		{
			System.out.println("���� ȸ���Դϴ�");
		}
		else
		{
			System.out.println("�ٸ� ȸ���Դϴ�");
		}

	}

}
