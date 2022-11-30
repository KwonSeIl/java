package com.sist.main;
// JSP 
import java.util.*;
import com.sist.movie.*;
public class MainClass_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int curpage=1;// ���� ������
        MovieSystem ms=new MovieSystem();
		int totalpage=ms.movieTotalPage();
		Scanner scan=new Scanner(System.in);
		System.out.print("������ �Է�(1~"+totalpage+"):");
		curpage=scan.nextInt();
		// �ش� �������� �ִ� ��ȭ��� ���
		ArrayList list=ms.movieAllData(curpage);
		System.out.println("======"+curpage+"page ��ȭ���======");
		for(int i=0;i<list.size();i++)
		{
			Movie m=(Movie)list.get(i);
			System.out.println(m.getMno()+"."+m.getTitle());
		}
		
		System.out.println("==================================");
		/*System.out.print("�󼼺� ��ȭ ��ȣ �Է�:");
		int mno=scan.nextInt();
		
		Movie m=ms.movieDetailData(mno);
		System.out.println("����:"+m.getMno());
		System.out.println("��ȭ��:"+m.getTitle());
		System.out.println("�⿬��:"+m.getActor());
		System.out.println("����:"+m.getDirector());
		System.out.println("�帣:"+m.getGenre());
		System.out.println("���:"+m.getGrade());
		System.out.println("������:"+m.getRegdate());*/
		System.out.println("======== �˻� =========");
		System.out.println("1. ���� �˻�");
		System.out.println("2. �⿬ �˻�");
		System.out.println("3. �帣 �˻�");
		System.out.println("======================");
		System.out.print("�˻� Ÿ�� ����:");
		int type=scan.nextInt();
		System.out.print("�˻��� �Է�:");
		String fd=scan.next();
		ArrayList fList=ms.movieFind(type, fd);
		System.out.println("�˻� ���:"+fList.size()+"�� �˻�");
		for(int i=0;i<fList.size();i++)
		{
			Movie m=(Movie)fList.get(i);
			System.out.println("����:"+m.getTitle());
			System.out.println("�帣:"+m.getGenre());
			System.out.println("�⿬:"+m.getActor());
		}
		
	}

}