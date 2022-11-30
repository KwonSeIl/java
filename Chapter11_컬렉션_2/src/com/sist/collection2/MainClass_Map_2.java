package com.sist.collection2;

import java.util.*;

interface Model
{
	public void execute();
}
class BoardModel implements Model
{
	public void execute()
	{
		System.out.println("�Խ��� ó��");
	}
}
class NoticeModel implements Model
{
	public void execute()
	{
		System.out.println("�������� ó��");
	}
}
class ReserveModel implements Model
{
	public void execute()
	{
		System.out.println("���� ó��");
	}
}
/*
 * 	clear()
 * 	get()
 * 	***keySet(): Ű ��ü�� ��Ƽ� ����
 * 	***put(): ������ ���� put(Object key, Object obj)
 * 	isEmpty()
 * 	size()
 * 	values()
 * 
 * 	==> ���� / �б� / ���� 
 */
class Container
{
	private Map map=new HashMap();
	public Container()
	{
		map.put("board", new BoardModel());
		map.put("notic", new NoticeModel());
		map.put("reserve", new ReserveModel());
		
	}
	public Model getBean(String key)
	{
		return (Model)map.get(key);
	}
}
// Spring
public class MainClass_Map_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Container c=new Container();
		Scanner scan=new Scanner(System.in);
		System.out.print("�޴� ����:");
		String menu=scan.next();
		
		Model m=c.getBean(menu);
		m.execute();
				

	}

}
