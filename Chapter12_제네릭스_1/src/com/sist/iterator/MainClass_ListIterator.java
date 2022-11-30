package com.sist.iterator;
// ArrayList, Vector, LinkedList
// 양방향으로 데이터 접근 가능 
import java.util.*;
public class MainClass_ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
		ListIterator<Integer> it=list.listIterator();
		//크롤링 ==> <tr><td> 
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
