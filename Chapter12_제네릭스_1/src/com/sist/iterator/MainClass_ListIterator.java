package com.sist.iterator;
// ArrayList, Vector, LinkedList
// ��������� ������ ���� ���� 
import java.util.*;
public class MainClass_ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
		ListIterator<Integer> it=list.listIterator();
		//ũ�Ѹ� ==> <tr><td> 
		while(it.hasNext())
		{
			System.out.println(it.next()+" ");
		}
		System.out.println("\n==");
		while(it.hasPrevious())
		{
			System.out.println(it.previous()+" ");
		}

	}

}
