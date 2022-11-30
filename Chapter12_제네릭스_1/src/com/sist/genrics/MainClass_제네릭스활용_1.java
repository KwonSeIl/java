package com.sist.genrics;
/*
 * 		=> �÷��ǿ� �����͸� ���� -> ���� ���������� �����ؾ� ��� ���ϴ�(���׸���): �Ѱ��� ���������� ���� ����
 * 							 --------- �迭�������� ����(���������� �����ϴ� ����)
 * 			Collection: �������̽� (1. ���������� ��� ���� 2. ǥ��ȭ 3. �ʿ�ÿ� �������̵��ؼ� ����� ����)
 * 				|
 * 			-------------------------
 * 			|			|			|
 * 		  List		  Set		   Map
 * 		List: �ߺ��� �����Ͱ� �ִ� ���, ������ ����(�ε��� -> �迭 Ȯ��(����) -> ������ -> ����)
 * 			=> ArrayList, Vector, LinkedList(����, ������ ���� ��쿡 �ַ� ���)
 * 			  ----------- Vector�� ����
 * 			  ----------------------------> �����ͺ��̽��� �ִ� �����͸� �о�ͼ� �������� ���� ����
 * 											�б�/����
 * 											�����ͺ��̽��� ���ÿ��� ArrayList�� �ִ� �����ʹ� ���� ������ ����
 * 											(����,����)
 * 											=> ���ټ��� �پ��, ���������� ������ ÷�� �� �ӵ��� ������ 
 * 		Set: �ߺ��� ���� �����͸� ������ ���(�ߺ��� ������� �ʴ´�), ���� ����
 * 			 List�� �ߺ��� �ִ� ��� => ������ �� ��� => DISTINCT
 * 			 => WebSocket: ������� ������ ����(IP,PORT) -> ��Ʈ��ũ���� �ַ� ���
 * 			 => HashSet / TreeSet(�˻�): Application -> SELECT
 * 				--------
 * 			 => ��: �˻� -> �����ͺ��̽�(�˻�:SELECT)
 * 		Map: �ΰ��� ���ÿ� ����(key,value): ���� => ISBN/å, ����:�����ȣ/�ּ�, ����/��ȭ��ȣ
 * 			 => ������ �ַ� ���Ǵ� ���: id=admin, pwd=admin1
 * 				����ڰ� ��û��, �������� �������� ����, ������ ����, �������� ����
 * 				HttpServletReques 	HttpServletResponse, HttpSesion, Cookie
 * 				Ŭ���� ����, SQL���� ã��
 * 				-------	-----------
 * 				������		���̹�Ƽ�� 
 * 			 => Hashtable / HashMap ->  Hashtable�� ���� ����
 * 
 * 		==> �����ϴ� ���������� ����Ѵ�
 * 			����)
 * 				ArrayList<String> <��������� ���������� ÷��> <?>(�Ű�����)
 * 													  ----- ��� ������
 * 				<? extends A>:A�κ��� ��ӹ��� Ŭ������(����� ���� ���׸��� => ���󵵰� ����)
 * 				
 * 				Set<String>
 * 				Map<String,Object>
 */
import java.util.*;
public class MainClass_���׸���Ȱ��_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. ArrayList
		System.out.println(" ==== ArrayList���� ���׸��� ���� ==== ");
		ArrayList<String> list=new ArrayList<String>();
		// boolean java.util.ArrayList.add(String e)
		list.add("���");
		list.add("��");
		list.add("����");
		for(String f:list) // ����ȯ�� �ʿ� ����
			System.out.println(f);
		//ArrayList<String> ==> ��������
		/*
		 * 	void display(ArrayList list)
		 */
		//HashSet set=new HashSet(); // Object(��� ���������� ���� ÷��)
		HashSet<Integer> set=new HashSet<Integer>(); //Object ��� ���������� ���� ÷�� 
		// ==> set�� ������ �� �ִ� ���������� int�� ����
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(300);
		set.add(300);
		
		for(int i:set)
			System.out.println(i); //�ߺ��� ������� �ʴ´�(Primary)=> id
		//�����ͺ��̽�: �������(table) ==> �ݵ�� �ߺ��� �ȵ� �����Ͱ� 1�� �̻� �ʿ�(�̻�����): ����, ����
		System.out.println(" ==== Vector ==== ");
		Vector<Double> vec=new Vector<Double>();
		vec.add(89.9);
		vec.add(10.5);
		vec.add(30.6);
		for(double d:vec)
			System.out.println(d);
		System.out.println(" ==== LinkedList ==== ");
		LinkedList<Character> in=new LinkedList<Character>();
		in.add('A');
		in.add('B');
		in.add('C');
		for(char c:in)
			System.out.println(c);
		
		System.out.println(" ==== Map ==== ");
		HashMap<String, Boolean> map=new HashMap<String,Boolean>();
		map.put("a", true);
		map.put("b", false);
		map.put("c", true);
		map.put("d", false);
		map.put("e", true);
		//		=================> id, boolean: �α��λ��� Ȯ��
		String[] key= {"a","b","c","d","e"};
		for(String k:key)
		{
			System.out.println(map.get(k));
		}
		
		

	}

}
