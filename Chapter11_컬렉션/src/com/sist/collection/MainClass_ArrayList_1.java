package com.sist.collection;
// ���� ���� 
import java.util.*; // ArrayList
public class MainClass_ArrayList_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList list=new ArrayList(); // ���� ���� 
        list.add(7); // 0
        list.add(4); // 1
        list.add(3); // 2
        list.add(6); // 3
        list.add(2); // 4
        list.add(5); // 5
        list.add(1); // 6 ==> index��ȣ�� add�ϴ� ������ �����ȴ� 
        for(Object i:list) // �������� ��ġ (ũ��)
        {
        	System.out.println(i);
        }
        System.out.println("======= ���� =======");
        //Collections.sort(list);
        for(Object i:list) // �������� ��ġ (ũ��)
        {
        	System.out.println(i);
        }
        System.out.println("======= Copy ======");
        /*
         *   list.add(7); // 0
	        list.add(4); // 1
	        list.add(3); // 2
	        list.add(6); // 3
	        list.add(2); // 4
	        list.add(5); // 5
	        list.add(1); // 6
         */
        ArrayList list2=new ArrayList(list.subList(1, 5));
        // �迭 ==> copy ==> arraycopy() , clone()
        for(Object i:list2) // �������� ��ġ (ũ��)
        {
        	System.out.println(i);
        }
        // ���ϴ� �κи� copy ==> subList ==> ������ ������ 
        // CURD  => Create(add) Update(set) Read(get) Delete(remove) => ���� �ٽ� 
        
	}

}

