package com.sist.collection2;
/*
 * 			Collection
 * 				|
 * 			   Map
 * 			------------------> �������̽�
 * 				|
 * 		--------------------
 * 		|					|
 * 		Hashtable			HashMap(***)
 * 
 * 		Ư¡) �� ���� ���ÿ� ������ 
 * 			=> key�� �ߺ��� �� ����, value�� �ߺ� ���� 
 * 			=> 1)key�� ���ڿ�, value�� ��� ����
 * 			   2)���ó: ������ �����ϴ� ��� Ŭ����( Map�������� �Ǿ� ����)
 * 					=> HttpServletRequest, HttpServletResponse, HttpSession, Cookie
 * 						request.setAttribute("id","addmin");
 * 						id="admin" pwd="1234"
 * 					=> �ܺο��� �����ϴ� ���̺귯�� : ������,���̹�Ƽ��
 * 					��) ("movieAllData","SELECT * FROM movie")
 * 				 ������ => Ŭ���� ����("a",new A())
 * 			=> �ֿ�޼ҵ�
 * 				����: put(key,��)
 * 				�б�: get(key)
 * 				-------------------> �ֽ� �湮 ��ȭ  
 */
import java.util.*;
public class MainClass_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		map.put("id", "admin");
		map.put("password", "1234");
		map.put("name", "ȫ�浿");
		map.put("sex", "����");
		map.put("age", 25);
		map.put("password", "4567");// ����� 
		
		//�� ���
		/*System.out.println("ID:"+map.get("id"));
		System.out.println("Password:"+map.get("password"));
		System.out.println("�̸�:"+map.get("name"));
		System.out.println("����:"+map.get("sex"));
		System.out.println("����:"+map.get("age"));*/
		Set s=map.keySet(); //map�� ����� key�� ���� 
		System.out.println(s);
		for(Object obj:s)
		{
			String key=(String)obj;
			System.out.println(key+":"+map.get(key));
		}
		

	}

}
