package com.sist.connect1;

import java.util.Scanner;

// �ٸ� Ŭ�������� ���ٽÿ��� import �̿� 
//import
/*
 * 	�ٸ� ��Ű���� �����ϴ� Ŭ������ ����� �� -> import
 * 	=> ���̺귯�� / ����� ���� Ŭ���� 
 * 
 * 	import ��Ű����.Ŭ������ => Ŭ���� �� ���� ������ �� ��
 * 	import ��Ű����.* => ��Ű���� �ִ� ��� Ŭ������ ������ �� ��
 * 	import static ��Ű����.Ŭ������.�޼ҵ�� => �޼ҵ� �� �� ������ �� ��
 * 	import static ��Ű����.Ŭ������.* => �޼ҵ� ��ü ��� ��
 */
// Math,String,StringBuffer,Integer,Object => �ڵ����� import�� ó�� 
/*
 * 	���� => �ڵ����� �����Ϸ��� ó��
 * 	 1) �޼ҵ�
 * 		void display()
 * 		{
 * 			return; => �����ϸ� �ڵ� �߰�
 * 		}
 * 	 2) ������
 * 		class A
 * 		{
 * 			A() => �����ÿ��� �ڵ� �߰�(�⺻ �����ڸ�)
 * 			{
 * 			}
 * 		}
 * 	 3) import��
 * 		import java.lang.* => �ڵ����� �߰�
 */
//import java.util.Scanner; //�������
//import java.util.*;
import static java.lang.Math.random;
import static java.lang.System.out;
import static java.lang.String.valueOf;
// static�� ���� ����
/*
 * 	��Ű�� ����
 * 	 package ��Ű����; => �з� ���� ���� ����
 * 	 -------------
 * 	 import
 * 	  = ��Ű����.Ŭ������
 * 	  = ��Ű����.*
 * 	
 * 	 java�ڵ� ����
 * 	  1)package => �� ���� ���
 * 	  2)import => ������ ��� ���� 
 * 	  3)class ����
 * 	 
 * 	 *** static
 * 	   import static ��Ű����.Ŭ������.�޼ҵ��
 * 	   import static ��Ű����.Ŭ������.*;
 * 
 *    static
 *    	Ŭ������.�޼ҵ��
 *    	------ ���� ���� 
 *    
 *    import�� ���̺귯���� ����ϴ� ���� �ƴ϶� ����� ���� Ŭ������ ���
 *    -----------------------------------------------
 *    ������) import ����� �ʿ���� ���
 *    		--------------------
 *    		 => ���� ��Ű���� Ŭ������ ����� ���� import�� ������� ����
 *    			-------
 *    			�ٸ� ��Ű���� �ִ� Ŭ������ ����� ���� �ݵ�� import�� ����ؾ� ��
 *    		
 *    		��Ű���� ����
 *    		com.ȸ���.�з���
 *    		------------- ������(Ű���� ���X)
 *    		 ���ĺ�, �ѱ�, ����, Ư������ ����, Ű���� �Ұ��� 
 *    		 ----�������(�ҹ���) 3~7�ڸ�
 *    
 *    		com.sist.�з�...
 *    		com.naver
 *    		com.daum
 */
public class ���������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(random()*10)+1;
		//System.out.println(a);
		//out.println(a);
		out.println(valueOf(a));
	}

}
