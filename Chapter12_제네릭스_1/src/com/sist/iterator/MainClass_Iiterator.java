package com.sist.iterator;
import java.util.*;
/*
 * 	Iterator / ListIterator
 * 	---------------------------> �ܹ���(�����͸� ���� �� ó��-��), �����(ó��-��, ��-ó��)
 * 	= �÷��ǿ� ����Ǿ� �ִ� �����Ϳ� ����
 *  = ǥ��ȭ(ArrayList,Vector, LinkedList, HashSet,HashMap)
 *  Iterator�� �ֿ� �޼ҵ�
 *  ----------------- hasNext(), next(), remove()
 *  				 --------- �����Ͱ� �ִ� ��� T,F ==> while���� ���� ���
 *  ListIterator�� �ֿ�޼ҵ�
 * 	------------------------ hasNext(), next(), remove(), hasPrevious()
 * 
 */
public class MainClass_Iiterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("���");
		list.add("��");
		list.add("����");
		list.add("�ٳ���");
		list.add("��");
		System.out.println("=== �Ϲ�");
		for(String f:list)
			System.out.println(f+" ");
		System.out.println(" === Iterator");
		Iterator<String> it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next()+" ");
		}
		System.out.println("\n==== Vector");
		Vector<String> vec=new Vector<String>();
		vec.add("hong");
		vec.add("shim");
		vec.add("park");
		vec.add("lee");
		vec.add("kang");
		Iterator<String> it2=vec.iterator();
		while(it2.hasNext())
		{
			System.out.println(it2.next()+" ");
		}
		System.out.println("\n=== LinkedList");
		LinkedList<Integer> list2=new LinkedList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		Iterator<Integer> it3=list2.iterator();
		while(it3.hasNext())
		{
			System.out.println(it3.next()+" ");
			
		}
		System.out.println("===hasSet()");
		Set<Integer> set=new HashSet();
		Iterator<Integer> it4=set.iterator();
		while(it4.hasNext())
		{
			System.out.println(it4.next()+" ");
		}

	}

}
