package com.sist.lang;
class Student
{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Student(String name)
	{
		this.name=name;
	}
	// equals => �������̵� -> �ּҺ�X, ��ü�� ������ �ִ� �̸�(���ڿ�)
	// Object���� equals�� ���󵵰� ���� ���� String(Object���) => �α���/IDüũ...
	// Object������ �ּҰ� ��(new), String => ���� ����� ���ڿ� �� 
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) //��ü ũ�� ���� �� ��� instancof
			/*
			 * 	(Student)obj.name => ����
			 * 	--------    - => .�� �켱����
			 * 	((Student)obj).name => ���� ���� 
			 */
			return name==((Student)obj).name; //���� �̸��̸� true ==> ���ڿ�(�̸� ��) 
		else
			return false;
	}
	
}
public class ���̺귯��_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("ȫ�浿");
		Student s2=new Student("ȫ�浿");
		
		if(s1.equals(s2))
		{
			System.out.println("���� �л��Դϴ�");
		}
		else
		{
			System.out.println("�ٸ� �л��Դϴ�");
		}

	}

}
