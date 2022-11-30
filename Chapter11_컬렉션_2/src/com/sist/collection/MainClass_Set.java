package com.sist.collection;
/*
 * 			Collection
 * 				|
 * 				Set
 * 			------------------ interface(�������̵� ����)
 * 				|
 * 		-------------------------
 * 		|						|
 * 		HashSet					TreeSet
 * 		-----------------------------------
 * 		Ư¡) ������ ����, �������ߺ��� ������� �ʴ´�
 * 			�ߺ����� �����͸� ó��(������ ����, �帣�б�, ��ٱ���)
 * 		�ֿ�޼ҵ�)
 *  	  HashSet
 * 			add(): �߰�
 * 			remove(Object o): ����
 * 			clear(): �޸� ��ü ����
 * 			isEmpty(): ����� ���� Ȯ��
 * 			retainAll(): ������
 * 			size(): ���� ����
 * 			iterator(): �����͸� ��Ƽ� �ѹ��� ����
 * 			----------- List, Set, Properties, Map
 * 		  TreeList: �˻������� �ַ� ��� ==> LIKE, REGEXP_LIKE
 * 			headSet
 * 			tailSet
 */
import java.util.*;
/*
 *    new Person("hong",30)
 *    new Person("hong",30)
 */
class Person implements Cloneable
{
	String name;
	int age;
	
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
		//System.out.println(this);
	}
	// => toString() ==> ��ü�� �޸� �ּ�
	public String toString()
	{
		//System.out.println(this);
		return name+":"+age;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
public class MainClass_Set {
	// ��ü�� �������� ��쿡�� ��ü�� �ּҷ� �� => ���� �� ������ �־ ���� �ȵ� �� ����
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Set set=new HashSet();
		set.add("ABC");
		set.add("ABC");
		Person p1=new Person("ȫ�浿", 25);
		Person p2=new Person("ȫ�浿", 25);
		Person p3=p1;
		Person p4=(Person)p1.clone(); // ���ο� �޸𸮸� �����(p1�� ������ �ִ� �����͸� �״�� ����)
		//System.out.println("p1="+p1); // toString() ����
		//System.out.println("p2="+p2);
		set.add(p1); //1
		set.add(p2); //2
		set.add(p3); // p1�� ���� => ����
		set.add(p4); //3
		System.out.println(set);

	}

}
