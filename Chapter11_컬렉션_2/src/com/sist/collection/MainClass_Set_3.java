package com.sist.collection;
import java.util.*;
//��õ => ��α� / ī�� , ����� ���� (ê��) => ���� (600����) => ��� 
public class MainClass_Set_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set1=new HashSet();
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("D");
		set1.add("E");
		set1.add("F");
		set1.add("G");
		
		Set set2=new HashSet();
		set2.add("L");
		set2.add("M");
		set2.add("N");
		set2.add("D");
		set2.add("E");
		set2.add("O");
		set2.add("P");
		System.out.println("====== set1�� ���� =======");
		System.out.println(set1);
		System.out.println("====== set2�� ���� =======");
		System.out.println(set2);
		
		
		System.out.println("====== ������ ==========");
		//set1.retainAll(set2);
		//System.out.println("set1 �� set2"+set1);
		System.out.println("======== ������ =========");
		//set1.removeAll(set2);
		//System.out.println("set1-set2"+set1);
		System.out.println("======== ������ ==========");
		set1.addAll(set2);
		System.out.println("set1+set2"+set1);
		/*Iterator it=set2.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/


	}

}
