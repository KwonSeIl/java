package com.sist.string;
import java.util.Scanner;
import java.io.*;
public class ���̺귯��_2 {
	public static String[] musicAllData()
	{
		String[] music=new String[100];
		// IO ==> ��� Ŭ������ �����Ͽ���(CheckedException) -> �ݵ�� ����ó���� �ϰ� ����Ѵ�(���ϸ�, ��θ�)
		// ���� ó�� ==> try~catch~finally
		/*try(FileReader fr=new FileReader("");) //������ �ڵ����� �ݴ´�
		{
			
		}catch(Exception ex) {}*/
		FileReader fr=null;
		try 
		{
			fr=new FileReader("c:\\javaDev\\genie.txt");
			int i=0;
			String data="";
			while((i=fr.read())!=-1) //������ ���� ������ �б�
			{
				data+=String.valueOf((char)i);
			}
			//System.out.println(data);
			String[] musicData=data.split("\n");
			// split ==> �����ں��� �ܾ �迭�� ����
			int k=0;
			for(String m:musicData)
			{
				String[] tmp=m.split("\\|");
				music[k]=tmp[1]; //���� ����
				
				k++;
			}
		}catch(Exception ex)
		{
			//���� Ȯ��
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				if(fr!=null)
					fr.close();
			}catch(Exception ex) {}
		}
		return music;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] title=musicAllData();
		//startsWith ==> ���ξ�(�����ϴ� ���ڿ� Ȯ��)
		// ����: public boolean startsWith(String prefix) ==> LIKE => A%
		Scanner scan=new Scanner(System.in);
		System.out.print("�˻��� �Է�:");
		String fd=scan.next();
		
		/*for(String s:title)
		{
			if(s.startsWith(fd)) //�ִ� ��찡 true => true�� �� ����
			{
				System.out.println(s);
			}
		}*/
		// ����: public boolean endsWith(String suffix) => ���̾� ==> %A
		/*for(String s:title)
		{
			if(s.endsWith(fd)) //������ ���ڿ��� ���� ��쿡 ��� (�������� ��뵵 ����)
			{
				System.out.println(s);
			}
		}*/
		//contains ==> ����. ����: public boolean contains(String s) => ���� �˻�
		for(String s:title)
		{
			if(s.contains(fd))
			{
				System.out.println(s);
			}
		}
		
	}

}
