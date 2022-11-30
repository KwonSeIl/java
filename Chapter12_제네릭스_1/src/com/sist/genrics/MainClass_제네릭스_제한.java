package com.sist.genrics;
import java.util.*;
class A
{
	
}
class B extends A
{
	
}
class C extends A
{
	
}
class D extends C
{
	
}
class E
{
	
}
/*
 * 			<? extends A>
 * 				A
 * 				|
 * 			--------
 * 			|		|
 * 			B		C
 * 					|
 * 					D => ��Ӱ� ���õ� Ŭ������ ����
 * 			E
 * 
 * 	<?>: ��� Ŭ������ ����(Object) ==> �Ѱ��� �޼ҵ带 �̿��ؼ� �������� �����͸� �޴� ���
 *  ArrayList
 *  ArrayList<?>
 *  
 *  **** ���������� �� �𸥴�: Object ����
 *  **** Ŭ������ ������: �Ѱ��� ����(Object)
 *  **** ����ü(�迭, �÷���): ���������� �����ؼ� ����ؾ� �����ϱ� ����
 *  **** �������� �����͸� �������� ������ ���� ����� -> �Ѱ��� �̸����� ����
 *  int a=10, b=20, c=30, d=40, e=50...;
 *  int[] arr={a,b,c,d...}
 *  
 *  class A
 *  class B
 *  class C
 *  	...
 *  	...
 *  
 *  Object[] obj={A,B,C....}
 *  
 *  interface E
 *  class A implements E
 *  class B implements E
 *  class C implements E
 *  	...
 *  	...
 *  
 *  �Ϲ� ���������� ���Ͻÿ� �迭
 *  �Ϲ� Ŭ����  ���Ͻÿ��� �ַ� �������̽� ���(�������� Ŭ������ ��� ����)
 */
public class MainClass_���׸���_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<? extends A> list1=new ArrayList<A>(); //A�� ����� ���� �ڽ�Ŭ�������� ����� ����
		ArrayList<? extends A> list2=new ArrayList<B>();
		ArrayList<? extends A> list3=new ArrayList<C>();
		ArrayList<? extends A> list4=new ArrayList<D>();
		//ArrayList<? extends A> list5=new ArrayList<E>(); //����

	}

}
