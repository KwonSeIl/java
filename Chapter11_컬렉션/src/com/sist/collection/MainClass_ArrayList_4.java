package com.sist.collection;
/*
 * 	ArrayList
 * 	----------
 * 	interface List extends Collection
 * 	class ArrayList implements List
 * 		 ----------- ������ Ŭ������ ������� �ִ�
 * 			Collection: add(), get(), set(), size(), remove()
 * 				|
 * 			   List
 * 				|
 * 		-------------------------
 * 		|			|			|
 * 		ArrayList   Vector	  LinkedList
 * 		----------------------------------------
 * 	������
 * 		1) ������ ����(�ε�����ȣ) => �ڵ����� ����(�׻� ���������� ����)
 * 		2) �ߺ��� ������ ���
 * 		3) List(�������̽�)�� �����ϱ� ������ ��� �޼ҵ尡 ����
 * 	������
 * 		1) ������(ArrayList / Vector => �񵿱�ȭ, ����ȭ) -> Vector�� ������ Ŭ����: ArrayList
 * 			��������� Vector���ٴ� ArrayList�� ����ϴ� ���̤� ����
 * 		2) ������ �� �ε�����ȣ ����(ArrayList) => ����ϰ� ����, �߰��� ���� ��쿡�� LinkedList
 * 	==> ���ó�� DB���� ���� �����͸� ���� -> ���������� ���
 * 	==> �ַ�: ArrayList, HashMap
 * 		Vector => ��Ʈ��ũ(���� => �������������) 
 */
/*
 *    Movie  ==> ��ȭ �Ѱ��� ���� ��� ���� 
 *           ==> �޸𸮸� �ٸ��� ���� (new)
 *           ==> ������ (�迭 , List)
 *                    ----   ----- ���  
 */
import java.util.*;
public class MainClass_ArrayList_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1=new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		ArrayList list2=new ArrayList();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add('A');
		list2.add('B');
		list2.add('C');
		System.out.println("list1="+list1);
		System.out.println("list2="+list2);
		
		//����(�ߺ��� �����͸� ���ܳ��� �������� ����:retainAll)
		list1.retainAll(list2);
		System.out.println("list1="+list1);
		System.out.println("list2="+list2);

		list1.containsAll(list2);
		System.out.println("list1="+list1);
		System.out.println("list2="+list2);
		//add,size,get,remove,set,retainAll, containsAll,subList,addAll
		/*
		 * 	add(): ������ �߰�
		 * 	size(): ����� ����
		 *  get(): ����� ������ �б�
		 *  remove(): ����
		 *  set(): ����
		 *  containsAll(): �ΰ��� ArrayList���� �ߺ��� �����͸�����
		 *  retainAll(): �ΰ��� ArrayList���� �ߺ��� �����͸� ����� 
		 *  addAll(): ��ü �����͸� ������ ���
		 *  subList(): �κ������� �����͸� ������ �� ���
		 *  clear(): ��ü ���� 
		 */
	}

}
