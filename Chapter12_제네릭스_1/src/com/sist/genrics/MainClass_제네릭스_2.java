package com.sist.genrics;
class Box<T> //T => �ӽ����� Ŭ������ ������: T�� ������ ������������ ����(������� �ʴ� ��쿡�� Object)
{
	T item;
	// Box<String> ==> T -> String 
	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	
}
public class MainClass_���׸���_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box=new Box(); //T => Object
		box.setItem("aaa");
		String s=(String)box.getItem(); //String s=box.getItem(); ���� �߻�
		Box<String> box1=new Box<String>(); //T=> String
		box1.setItem("");
		s=box1.getItem(); //����ȯ�� �ʿ� ����
		Box<Integer> box2=new Box<Integer>(); //T => Integer
		box2.setItem(1);
		int i=box2.getItem(); //��ڽ� 
		// Integer i=100; int ii=i;
		/*
		 *  Wrapper
		 *  Ŭ������ = �⺻������: �ڽ�
		 *  �⺻�� = Ŭ������: ��ڽ� 
		 *  ------------------- ȣȯ
		 *  Integer
		 *  int = Integer
		 *  Integer = int
		 */
		Integer ii=100;
		int aa=ii;

	}

}
