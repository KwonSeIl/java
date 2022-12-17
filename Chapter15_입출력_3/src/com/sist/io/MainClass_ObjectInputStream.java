package com.sist.io;
/*
 *    �ڹ�/����Ŭ => ��(80%)
 *    -------------------
 *    IO (InputStream,OuptutStream)
 *    => ����� 
 *        = �޸� ����� 
 *          System.in / System.out 
 *          BufferedReader 
 *        = ���� ����� (���� ���� ���Ǵ� �����) ==> �� 
 *          FileInputStream / FileOutputStream 
 *          FileReader / FileWriter
 *          ObjectInputStream / ObjectOutputStream 
 *          => ���� ��Ʈ�� 
 *             BufferedInputStream / BufferedOutputStream 
 *             BufferdReader       / BufferedWriter
 *             *** InputStream / OutputStream  ==> ����Ʈ ��Ʈ�� (�б�/���� => 1byte) => �ѱ���� �ƴ϶� 
 *                                                                   => ���� ���� / ���ε� / �ٿ�ε� 
 *                                                                   => zip,mpg...
 *                                                                   => �׸����� , ������ 
 *             *** Reader / Writer  ==> ���� ��Ʈ�� (�б�/���� => 2byte) => �ѱ� ��� / �ѱ� �б� 
 *                 ---------------------------------------------------------------------
 *        = ��Ʈ��ũ ����� : ��Ʈ��ũ => �����Ҷ� 1byte(OutputStream) , �޴� ��� 2byte (Reader)
 *                                 => Stream(1byte) => Reader(2byte)
 *                                    InputStreamReader
 *        = ��ü���� ������ ����� 
 *          ----------------
 *          �Է� => ObjectInputStream
 *          ��� => ObjectOutputStream 
 *          ����ȭ / ������ȭ 
 *          --------------
 *          ����ȭ : ��ü�� ������ ��Ʈ������ �����
 *                      ---------- �б�/���� (�޸𸮰� ���������� ����)
 *          ������ȭ : �������� �޸� ���� ==> ��ü ���·� ���� 
 *          ==> ��ü���¸� => �迭���·� ���� 
 *          ==> ����Ǵ� ������ : Serializable (interface)
 *          class Sawon implements Serializable 
 *          {
 *          }
 *          => ��ü���� ���� 
 *          => readObject() 
 *          => writeObject()
 *          => close()
 */
import java.util.*;
import java.io.*;
class Sawon implements Serializable
{
	private int sabun;
	private String name;
	private String dept;
	private String loc;
	private String job;
	// sabun name dept loc job : ������ ��Ʈ��(�������� �޸𸮿� ����) 
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Sawon(int sabun, String name, String dept, String loc, String job) {
		this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.loc = loc;
		this.job = job;
	}
	public Sawon() {}
	
}
public class MainClass_ObjectInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*ArrayList<Sawon> list=new ArrayList<Sawon>();
        list.add(new Sawon(1,"ȫ�浿","���ߺ�","����","�븮"));
        list.add(new Sawon(2,"�����","��ȹ��","�λ�","���"));
        list.add(new Sawon(3,"�̼���","�����","����","����"));
        list.add(new Sawon(4,"������","�ѹ���","��õ","���"));
        list.add(new Sawon(5,"������","���ߺ�","����","����"));
        // ArrayList��ü�� ���� 
        try
        {
        	ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("c:\\java_data\\sawon.txt"));
        	oos.writeObject(list);
        	oos.close();
        	System.out.println("���� �Ϸ�!!");
        }catch(Exception ex) {}*/
		// ������ �б� => ȭ�� ��� 
		ArrayList<Sawon> list=new ArrayList<Sawon>();
		try
		{
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream("c:\\java_data\\sawon.txt"));
			list=(ArrayList<Sawon>)ois.readObject();
			ois.close();
			
			// ��� 
			for(Sawon s:list)
			{
				System.out.println(s.getSabun()+" "
						+s.getName()+" "
						+s.getDept()+" "
						+s.getLoc()+" "
						+s.getJob());
			}
		}catch(Exception ex){}
	}

}