package com.sist.collection;
import java.util.*;
public class MainClass_ArrayList_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add("����");
		list.add("���");
		list.add("�ٳ���");
		list.add("����");
		list.add("��");
		
		for(Object obj:list)
		{
			System.out.println(obj);
		}
		System.out.println("---------");
		for(int i=0;i<list.size();i++)
		{
			Object obj=list.get(i);
			System.out.println(obj);
		}
		System.out.println("==== ��� =====");
		System.out.println(list);
		System.out.println("=== ��� =====");
		list.forEach((obj)->System.out.println(obj)); //���ٽ�(�Լ�������)
	}

}
