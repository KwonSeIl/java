package com.sist.collection;
import java.util.*;
/*
 *                	�б�     �߰� / ����   ���ó
 *    **ArrayList   ������    �ӵ��� ������   �ַ� ��¿� / ������ ����  ==> �����ͺ��̽� 
 *    LinkedList    ������    �ӵ��� ������   �����Ϳ��� ����,������ ���� ��� 
 *    
 *    �� => ArrayList
 *    Application ==> LinkedList
 */
public class MainClass_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.println("====== ���� ======");
        list.set(1, 20);
        System.out.println(list);
        System.out.println("====== ���� ======");
        list.remove(3);
        System.out.println(list);
        System.out.println("====== ��ü���� =====");
        list.clear();
        if(list.isEmpty())
        	System.out.println("�����Ͱ� �����ϴ�");

	}

}
