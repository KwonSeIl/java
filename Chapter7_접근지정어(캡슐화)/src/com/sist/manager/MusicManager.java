package com.sist.manager;
// ����� ���� Ÿ��(MusicVO-> Ȱ��) => �޼ҵ�

import com.sist.vo.MusicVO;
// ���� ���α׷� 
/*
 * 	����
 * 	---
 * 	 �⺻�� ����(int,double...)
 * 	 ������ ����(�迭,Ŭ����)
 * 	----------------------> �ݵ�� �ʱ�ȭ�� �Ѵ�
 * 
 * 	=> �����ʹ� ������ ����ȭ(Ŭ�������� ����Ǵ� ��� ���� private) -> ������ ���� ����
 * 	=> ���(�ٸ� Ŭ������ ����) -> �޼ҵ� ��� => public
 * 	=> �޸� �Ҵ� -> ������ => public
 * 	----------------------------------
 * 	=> ��Ű���� �ٸ� ��쿡�� public�� ������ �� ���� 
 * 	   ---- ���õ� ����� ��Ƽ� �����ϴ� ���� 
 * 	   ---- �ݵ�� import�� �̿��ؼ� Ŭ������ �о��
 * 			(���� ��Ű���� �ִ� Ŭ������ import ���� �ʴ´�)
 * 	=> ĸ��ȭ�� ������ ��ȣ ���� => �ݵ�� ��� ������ private => ���(getter/setter)
 * 	=> ������� �ʱ�ȭ�� �Ұ��� �� ������ �ݵ�� �ʱ�ȭ ���/�����ڸ� �̿��Ѵ�
 * 	=> ���� ����
 * 	  ***1) �ڽ��� Ŭ�������� ���: private => �ν��Ͻ�, static �������
 * 	  2) ���� ��Ű������ ���: default
 * 	  ***3) ��ü���� ���: public => ������, Ŭ����, �޼ҵ� 
 * 	  *** ����
 * 		[����������] �������� ������;
 * 	  �޼ҵ�
 * 		[����������] ������ �޼ҵ��(�Ű�����);
 * 	  Ŭ����
 * 		[����������] class ClassName
 * 		*** Ư���� ��찡 �ƴϸ� ����Ʈ�� ������� �ʴ´�
 * 		*** ���������� ��������� ����
 * 
 */
import java.io.*;
public class MusicManager {
	private static MusicVO[] music=new MusicVO[100]; //�ٸ� ��Ű���� �ֱ� ������ import �ݵ�� �־�� �� //�ʱ�ȭ
	static
	{
		try
		{
			FileReader fr=new FileReader("c:\\JavaDev\\genie.txt");
			String mu="";
			int i=0; //read(): ���� 1�� ���� �� ���� ��� ==> i:���ڹ�ȣ => (char)i
			while((i=fr.read())!=-1) //-1: ���� ��(EOF)
			{
				mu+=String.valueOf((char)i);
			}
			fr.close();
			
			String[] m=mu.split("\n");
			i=0;
			for(String s:m)
			{
				String[] ss=s.split("\\|");
				music[i]=new MusicVO();
				music[i].setMno(Integer.parseInt(ss[0]));
				music[i].setTitle(ss[1]);
				music[i].setSinger(ss[2]);
				//������ ���� ������ �Ұ����ϱ� ������ �޼ҵ带 �̿��ؼ� ���� ==> setXxx()
				music[i].setAlbum(ss[3]);
				music[i].setKey(ss[4]);
				i++;
			}
		}catch(Exception ex) {}
	}
	// �ʱ�ȭ ��� / ������ ==> ���� �б�(����) => Ŭ���� �������� �� �� ����
	/*
	 * 	  ������ �ʱ�ȭ
	 * 		�ν��Ͻ� ����
	 * 		���� ����(static)
	 * 	   --------------
	 * 		  ������� �ʱ�ȭ int a=10;
	 * 		  �ʱ�ȭ ���, ������ �̿� => ������ �о �ʱ�ȭ, �ܺο� ũ�Ѹ� ...
	 * 		  -------
	 * 			�ν��Ͻ� ��: �ν��Ͻ����� �ʱ�ȭ 
	 * 			{
	 * 				�ν��Ͻ� ����, static���� �ʱ�ȭ ���� 
	 * 			}
	 * 			
	 * 			static: static �ʱ�ȭ
	 * 			{
	 * 				static������ �ʱ�ȭ(�ν��Ͻ������� ����� �ȵ�)
	 * 			}
	 * 
	 * 			������ => �ν��Ͻ�, static ������� �ʱ�ȭ ����
	 * 	
	 * 			*** static -> static ���
	 * 			*** �ν��Ͻ� -> �����ڸ� �̿��ؼ� �ʱ�ȭ 
	 */
	// 1. ��� => ��� ���
	public MusicVO[] musicListData()
	{
		return music;
	}
	// 2. ������ ����
	public String musicDetailData(int index)
	{
		return music[index].getKey();
	}
	// 3. �˻�
	// 4. ������ �˻�

}
