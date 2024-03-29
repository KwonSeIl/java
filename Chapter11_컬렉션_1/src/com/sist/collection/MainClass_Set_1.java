package com.sist.collection;
// ArrayList, HashSet, HashMap
import java.util.*;
// 자바: CBD ==> Component Base Developer
// 이미 만들어진 라이브러리를 이용해서 프로그램을 조립해 만듦
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
		// sort 사용 위해서는 List로 변환
		List list=new ArrayList(set); // sort이용 -> Set을 List로 변환 
		Collections.sort(list);
		System.out.println(list);
		for(int i=list.size()-1;i>=0;i--)
		{
			System.out.print(list.get(i)+" ");
		}
		
		
	}

}
