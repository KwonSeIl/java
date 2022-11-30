package com.sist.music;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		MusicSystem ms=new MusicSystem();
		System.out.print("���Ϲ���(1), ���(2) ����:");
		int cno=scan.nextInt();
		
		ArrayList<Music> list=ms.musicCategoryData(cno);
		if(cno==1)
			System.out.println("==== ���Ϲ��� Top100 ====");
		else
			System.out.println("==== ��й��� Top50 ====");
		
		for(Music m:list)
		{
			System.out.println(m.getMno()+"."+m.getTitle()+" "+m.getSinger());
			
		}

	}

}
