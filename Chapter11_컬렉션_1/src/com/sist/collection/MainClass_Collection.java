package com.sist.collection;
/*
 * 	�÷��� �����ӿ�ũ
 * 	----------- �����͸� ��Ƽ� �����ϱ� ���� ���̺귯�� ����(Ŭ������ ����)
 * 									------ ǥ��ȭ 
 * 				Collection
 * 					|
 * 			-------------------------
 * 			|			|			|
 * 		  List		  Set			Map
 * 		=======================================
 * 		�䱸����
 * 			java����, Oracle ����, JSP ����
 * 			Spring ���� ================ �ʼ�
 * 			���: AWS, Front(Vue,React) => ��ٳ�Ƽ��, ����ó��
 * 		====================================
 * 		1) List
 * 		  Ư¡) 1. ���� ������ ����(�ε���)
 * 			  2. �ߺ� �����͸� ���
 * 			   3. �����ͺ��̽����� �ַ� ��� 
 * 			  4. ������ Ŭ����
 * 				***ArrayList
 * 					�����ͺ��̽��� �ִ� �����͸� ��Ƽ� �������� ����
 * 				Vector
 * 					����ȭ(��Ʈ��ũ���� �ַ� ���) => ���� ������
 * 				LinkedList
 * 					C��� ȣȯ
 * 				Stack
 * 					�̷�(LIFO) => �޸� ����
 * 				Queue
 * 					FIFO => ��Ʈ��ũ, �ü�� �����췯
 * 		2) Set
 * 		  Ư¡) 1. ������ ����
 * 			  2. ������ �ߺ��� ������� ����
 * 			  3. Map�� ������ �б�, �������� �ߺ��� ������ �� �ַ� ���	
 * 			  4. TreeSet / ***HashSet
 * 				 ------- �˻� 
 * 		3) Map
 * 		  Ư¡) 1. Key, value�� �������(�ΰ��� ���ÿ� ����)
 * 				Key�� �ߺ� ����, value�� �ߺ� ����
 * 				Map<K,V>
 * 			  2. ���ó �پ�(�Ϲ� ������, ���̹�Ƽ�� ==> Map) ==> id, value
 * 						 ------- Ŭ���� ��� �� ���� ���(������ => Ŭ���� ����) 
 * 			  = Hashtable / HashMap ==> Hashtable�� ���� ���� -> �ַ� ���
 * 		------------------------------------------------------------ 11��
 * 		ArrayList / HashSet / HashMap
 * 		-----------------------------
 * 		4) ��Ÿ: properties(���� ó�� => DB(����, PWD)) => Map
 * 			id=aaa
 *          pwd=1234
 *          	=> �������� �ַ� ���(��ȿ�� �˻�)
 *          	=> ���̹�Ƽ��(DB ���� ����)
 *      ----------------------------------------------------
 *      12�� => �÷��� �����ӿ�ũ�� ���� ��� �����ϰ� ����
 *      		-------------------------- Object(����ȯ / ����ȯ���� ���=> ���׸���)
 *      		Ŭ����<String>
 *      		***=������̼�: ������ ���
 *      		= ������ 
 *      1) �ֿ� �޼ҵ� (�޸𸮿��� �����͸� ���� ==> �߰�, ����, ����, �˻�)
 *      	------
 *      	ArrayList(����: �޸𸮰� Ŀ��, �޸� �������� �߻� . But ���� ����, �ӵ� ������ ������ �ַ� ���)
 *      		�߰�:add(Object o)
 *      		����:set(int index, Ojbect o)
 *      		����:remove(int index)
 *      		�˻�:get(int index)
 *      		����Ȯ��:size()
 *      		��ü����:clear()
 *      		Ȯ��: isEmpty()
 *      	--------------------> Vector, LinkedList
 *      	HashSet: �ߺ������� ����
 *      		add(), remove, clear, isEmpty
 *      	HashMap
 *      		�߰�: push(key,��)
 *      		���б�:get(key)
 *      	-----------------------------------------
 *      	=> removeAll()(MINUS), addAll()(UNION,UNIONALL), retainAll()
 *      		----------  -------   -------------
 *      		������			 ������		������
 */
// Vector => ������ ���ߵ� ȣȯ -> ����(ArrayList)
import java.util.*;
public class MainClass_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Vector ����
		Vector list=new Vector();
		// List�������̽� ���� , Vector�� ������ �ִ� �޼ҵ� 
		/*
		 *   �ڷᱸ�� (������ ����) => �޸� 
		 *     �߰� : add()  ===============> addElement()
		 *     ���� : set()  ===============> set()
		 *     ���� : remove() =============> remove(),removeAll(), clear()
		 *     �б� : get()  ===============> elementAt()
		 *     ���� : size()
		 */
		// �߰� 
		list.addElement("ȫ�浿"); // index => 0
		list.addElement("��û��"); // 1
		list.addElement("������");
		list.addElement("�̼���");
		list.addElement("�ڹ���");// list.add("�ڹ���")
		System.out.println("====== �Ϲ� for ======");
		// 1.��� 
		for(int i=0;i<list.size();i++)
		{
			String name=(String)list.elementAt(i);// ����� �����͸� 1�� �б� list.get(i)
			System.out.println(name);
		}
		System.out.println("====== ���ٽ� ======");
		// 2.��� 
		list.forEach((name)->System.out.println(name));
		// 3.���
		System.out.println("==== forEach ======");
		for(Object obj:list)
		{
			System.out.println(obj);
		}
		
		// ArrayList���� 
		// 1.���
		ArrayList list2=new ArrayList(list);
		System.out.println("=====1. Vector ==> ArrayList�� ����");
		System.out.println(list2);
		// 2.���
		ArrayList list3=new ArrayList();
		list3.addAll(list);
		System.out.println("=====2. Vector ==> ArrayList�� ����");
		System.out.println(list3);
		
		System.out.println("===== Vector���� ������ ���� =====");
		list.setElementAt("��������", 2); //list.set(index,"")
		/*
		 *  ȫ�浿(0)
			��û��(1)
			������(2) ==> �������� 
			�̼���(3)
			�ڹ���(4)
		 */
		System.out.println(list);
		
		System.out.println("===== Vector���� ������ ���� =====");
		list.removeElementAt(1);// remove(index)
		/*
		 *  ȫ�浿(0)
			��û��(1) ==> ����
			��������(2) 
			�̼���(3)
			�ڹ���(4)
			
			ȫ�浿(0)
			��������(1) 
			�̼���(2)
			�ڹ���(3)
		 */
		System.out.println(list);
		System.out.println("=====Vector���� ������ ��ü ���� =====");
		list.removeAllElements();//clear()
		System.out.println(list);

	}

}
