package com.sist.collection;
// ArrayList, HashSet, HashMap
import java.util.*;
// �ڹ�: CBD ==> Component Base Developer
// �̹� ������� ���̺귯���� �̿��ؼ� ���α׷��� ������ ����
public class MainClass_Set_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set=new HashSet();
		for(int i=0;i<6;i++)
		{
			int r=(int)(Math.random()*45)+1;
			set.add(r);
			if(set.size()==6)
				break;
		}
		System.out.println(set);
		// sort ��� ���ؼ��� List�� ��ȯ
		List list=new ArrayList(set); // sort�̿� -> Set�� List�� ��ȯ 
		Collections.sort(list);
		System.out.println(list);
		for(int i=list.size()-1;i>=0;i--)
		{
			System.out.print(list.get(i)+" ");
		}
		
		
	}

}
