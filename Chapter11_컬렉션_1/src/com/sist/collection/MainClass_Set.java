package com.sist.collection;
/*
 *  	Collection
 *  		|
 *  	------------------
 *  	|				 |
 *  	HashSet			TreeSet
 *  	-------			------- �˻�(����X)
 *  	Ư¡) �� ���� => Set(WebSocket)
 *  		������ ����
 *  		������ �ߺ��� ������� �ʴ´�
 *  		�ߺ������� ���� =========> DISTINCT
 *  	���) �߰�: add()
 *  		����: remove()
 *  		����: addAll()
 *  		��ü����: clear()
 *  		���翩��: isEmpty()
 *  		ũ��(�����Ͱ���)Ȯ��: size()
 *  		�ΰ��� Set�� �ִ� ���, ���� �����͸� �����(������): retainAll()
 *  		---------------- 631������
 *  
 */
import java.util.*;
public class MainClass_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"ȫ�浿","��û��","�ڹ���","�̼���","������","�����","������","�����","ȫ�浿","�ڹ���"}; 
		Set set=new HashSet();
		/*for(String name:names)
		{
			set.add(name); //�ߺ��� ���� => �ߺ��� �����Ͱ� �ִ� ��쿡 �߰��� �� ����
		}
		System.out.println(set);*/
		List list=Arrays.asList(names); // �迭�� List�� ��ȯ
		set.addAll(list); //list�� �ִ� ������ ��ü ����
		System.out.println(set); //set�� ����� ������ ���
		
		System.out.println("=== ���� ====");
		set.remove("�ڹ���");
		System.out.println(set);
		System.out.println("==== ��ü ���� ====");
		set.clear();
		if(set.isEmpty())
			System.out.println("�����Ͱ� �����ϴ�:"+set.size());

	}

}
