package com.sist.genrics;
/*
 * 	Generics
 * 	-------- 1.5 ����
 * 	1. (ArrayList, Vector, Map, Set) �����͸� ������ �� �� �ݵ�� ����ȯ�� �ؾ� �Ѵ�
 * 		=> �ٸ� ���������� ÷���� �� ���� �߻��ϴ� �� ����
 * 	2. ���������� ����(������ �����͸� ����� �����ϰ� ����� ==> Ÿ���� ������)
 * 	3. ���������� ����ϱ� ������ �������� ����
 * 	4. ����ȯ�� �� �ʿ䰡 ����(������ ������������ ��� �޼ҵ�, �Ű�����, �������� ����) => ������ �ڵ� ���� 
 * 	5. ����
 * 		ArrayList<type>
 * 				  ----- Ŭ������ (�⺻���� ����� �� ����)
 * 		=> ���ڿ�
 * 		ArrayList<String> list=new ArrayList<String>();
 * 		=> ������
 * 		ArrayList<int> list=new ArrayList<int>(); ====> ����(�⺻�� �� �ֱ� ����)
 * 		ArrayList<Integer> list=new ArrayList<Integer>(); => �⺻���� Wrapper
 * 		=> ����� ����Ŭ����
 * 		ArrayList<Sawon> list=new rrayList<Sawon>();
 * 		ArrayList<String> list=new ArrayList<Double>(); ===> ����
 * 		=> ���ϵ� ī��
 * 		ArrayList<?> list=new ArrayList<String>();
 * 		ArrayList<?> list=new ArrayList<Integer>();
 * 	6. ����_2
 * 		T => �ӽú���(Ŭ������)
 * 		E => Element:���(Ŭ������)
 * 			ArrayList<E>
 * 		K => key
 * 		V => value
 * 		Map<K,V> ==> Map<String, Object
 * 		Set<E> ==> Set<Music>
 * 		==> ��ü Default (Object) ==> � �����Ͱ� ���ԵǾ ��� ����
 * 		==> �ʼ�: ����� ���� ���� 
 * 		class Box<T>
 * 		{
 * 			T box;		==> T���� �������� �ʴ°��: Box box=new Box(); -> T�� default Object
 * 			void setBox(T box)
 * 			{
 * 				this.box=box;
 * 			}
 * 			T getBox()
 * 			{
 * 				return box;
 * 			}
 * 		}
 * 
 * 		Box<String> box=new Box<String>(); => T(String���� ��ȯ)
 * 		Box box=neew Box(); => T(Object)
 * 		class Box<String>
 * 		{
 * 			String box;
 * 			void setBox(String box)
 * 			{
 * 				this.box=box;
 * 			}
 * 			T getBox()
 * 			{
 * 				return box;
 * 			}
 * 		}
 * 
 */
import java.util.*;
class Music
{
	
}
public class MainClass_���׸��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���׸��� Ÿ���� ������ ���ÿ� ��ü �޼ҵ��� ������, �Ű������� �ѹ��� ����
		// ����� ����Ŭ������ ����
		ArrayList<Music> list=new ArrayList<Music>(); //Object ==> ������, �Ű������� ������ ������������ ����
		//											-----------
		// �迭 => ��� String[], Music[]
		// ���׸���: ���������� ����ȭ -> ��� ���� ���� ���
		/*
		 * list.add("ȫ�浿"); list.add("�ڹ���"); //list.add(10); //=> ���� �߻�
		 * 
		 * for(int i=0;i<list.size();i++) { String str=(String)list.get(i);
		 * System.out.println(str); }
		 */

	}

}
