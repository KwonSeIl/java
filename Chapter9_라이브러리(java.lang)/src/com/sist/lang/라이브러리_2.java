package com.sist.lang;
// ��ü�� ���ڿ��� ��ȯ => toString()
/*
 * 	1. toString�� ������ �� �ִ�
 * 	2. �������̵�: ����ϴ� ������ ����
 * 	3. String���� ����ȯ�� �ʿ����
 * 		class A
 * 		A aa=new A();
 * 		String a=(String)aa;
 * 		String a=String.valueOf(aa)
 * 		String a=aa.toString()
 */
class Main2
{
	private String name;
	private String sex;
	private int age;
	public Main2(String name,String sex,int age)
	{
		this.name=name;
		this.sex=sex;
		this.age=age;
	}
	// �����ͺ��̽� => toString()
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�̸�:"+name+", ����:"+sex+", ����:"+age;
	}
	
}
public class ���̺귯��_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main2 m=new Main2("ȫ�浿","����",30);
		System.out.println(m); //�ּҰ� ��� ==> toString()�� �ڵ� ȣ��ȴ�
		System.out.println(m.toString()); //toString ���� ����
	}

}
