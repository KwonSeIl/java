package com.sist.io;
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
// �����͸� �����Ҷ� => �м� , ���̴� => ����ġ�α� 
/*
 *    Serializable : ����ȭ (Object��ü)
 *    transient : ����ȭ ���� 
 *    synchronized : ����ȭ 
 *    -------------------- ���� => ������ ���߸� � �ذ��� ���ΰ�? => ���ؽ� , �������� 
 */
class Student implements Serializable
{
	private int hakbun;
	private String name;
	transient private String subject;
	// ����ȭ���� ���� 
	private int kor,eng,math;
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public Student(int hakbun, String name, String subject, int kor, int eng, int math) {
		this.hakbun = hakbun;
		this.name = name;
		this.subject = subject;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public Student() {}
	
}
class School{
	private static ArrayList<Student> list=new ArrayList<>();
	// �޴� 
	/*static
	{
		list.add(new Student(1, "ȫ�浿", "���а�", 80, 90, 78));
		list.add(new Student(2, "�����", "���а�", 85, 92, 70));
		list.add(new Student(3, "�ڹ���", "���а�", 86, 93, 60));
		try
		{
			ObjectOutputStream oos=
					new ObjectOutputStream(new FileOutputStream("c:\\java_data\\student.txt"));
			oos.writeObject(list);
			oos.close();
		}catch(Exception ex){}
	}*/
	// �޴� 
	public int menu()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("===== �л����� �޴� =====");
		System.out.println("1.��Ϻ���");
		System.out.println("2.�󼼺���");
		System.out.println("3.�˻�");
		System.out.println("4.�л����");
		System.out.println("5.����");
		System.out.println("=====================");
		System.out.print("�޴� ����:");
		return scan.nextInt();
	}
	// �л� ���� 
	public void studentSave(Student s)
	{
		list.add(s);
		try
		{
			ObjectOutputStream oos=
					new ObjectOutputStream(new FileOutputStream("c:\\java_data\\student.txt"));
			oos.writeObject(list);
			oos.close();
		}catch(Exception ex){}
	}
	// �л� ��� 
	public ArrayList<Student> studentListData()
	{
		try
		{
			ObjectInputStream ois=
					new ObjectInputStream(new FileInputStream("c:\\java_data\\student.txt"));
			list=(ArrayList<Student>)ois.readObject();
			// �÷����� ����ȯ ==> ���׸������� ���� 
			ois.close();
		}catch(Exception ex){}
		return list;
	}
	// �л� �󼼺��� 
	public Student studentDetailData(int hakbun)
	{
		Student s=new Student();
		for(Student ss:list)
		{
			if(ss.getHakbun()==hakbun)
			{
				s=ss;
				break;
			}
		}
		return s;
	}
	// �л� ã�� 
	public ArrayList<Student> studentFindData(String name)
	{
		ArrayList<Student> sList=new ArrayList<Student>();
		for(Student ss:list)
		{
			if(ss.getName().contains(name))
			{
				sList.add(ss);
			}
		}
		return sList;
	}
	// ���� => ���Ͽ� ���� 
	public void exit()
	{
		try
		{
			ObjectOutputStream oos=
					new ObjectOutputStream(new FileOutputStream("c:\\java_data\\student.txt"));
			oos.writeObject(list);
			oos.close();
			System.out.println("���� �Ϸ�!!");
			// �� => ��ٱ��� ==> Cookie (�ֱ� �湮)
		}catch(Exception ex) {}
	}
	// ArrayList(����) ==> ����� ����
	
	public void process()
	{
		while(true)
		{
			int m=menu();
			switch(m)
			{
			  case 1: // ��Ϻ���
			  {
				  ArrayList<Student> sList=studentListData();
				  for(Student s:sList)
				  {
					  System.out.println(s.getHakbun()+" "
							  +s.getName()+" "
							  +s.getKor()+" "
							  +s.getEng()+" "
							  +s.getMath()+" "
							  +(s.getKor()+s.getEng()+s.getMath())+" "
							  +String.format("%.2f", (s.getKor()+s.getEng()+s.getMath())/3.0));
				  }
			  }
			  break;
			  case 2: // �󼼺���
			  {
				  Scanner scan=new Scanner(System.in);
				  String hak="";
				  for(Student s:list)
				  {
					  hak+=s.getHakbun()+",";
				  }
				  hak=hak.substring(0,hak.lastIndexOf(","));
				  System.out.print(hak+"�߿� �Ѱ��� �����ϼ���:");
				  int i=scan.nextInt();
				  Student ss=studentDetailData(i);
				  System.out.println("===== �󼼺��� =====");
				  System.out.println("�й�:"+ss.getHakbun());
				  System.out.println("�̸�:"+ss.getName());
				  System.out.println("����:"+ss.getKor());
				  System.out.println("����:"+ss.getEng());
				  System.out.println("����:"+ss.getMath());
			  }
			  break;
			  case 3: // �˻� 
			  {
				  Scanner scan=new Scanner(System.in);
				  System.out.print("�˻��� �Է�:");
				  String name=scan.next();
				  ArrayList<Student> sList=studentFindData(name);
				  System.out.println("===== �˻� ��� =====");
				  for(Student s:sList)
				  {
					  System.out.println(s.getHakbun()+" "
							  +s.getName()+" "
							  +s.getKor()+" "
							  +s.getEng()+" "
							  +s.getMath()+" "
							  +(s.getKor()+s.getEng()+s.getMath())+" "
							  +String.format("%.2f", (s.getKor()+s.getEng()+s.getMath())/3.0));
				  }
			  }
			  break;
			  case 4: // �߰� 
			  {
				  Scanner scan=new Scanner(System.in);
				  int max=0;
				  // Sequence : �ڵ� ������ȣ (����Ŭ) 
				  for(Student s:list)
				  {
					  if(s.getHakbun()>max)
						  max=s.getHakbun();
				  }
				  
				  Student s=new Student();
				  s.setHakbun(max+1);
				  
				  System.out.print("�̸� �Է�:");
				  s.setName(scan.next());
				  System.out.print("���� �Է�:");
				  s.setKor(scan.nextInt());
				  System.out.print("���� �Է�:");
				  s.setEng(scan.nextInt());
				  System.out.print("���� �Է�:");
				  s.setMath(scan.nextInt());
				  
				  studentSave(s);
				  
			  }
			  break;
			  case 5:
			  {
				  exit();
				  System.out.println("���α׷� ����");
				  System.exit(0);
				  
			  }
			  default:
			  {
				  System.out.println("�޴��� �����ϴ�!!");
			  }
			}
		}
	}
}

public class MainClass_ObjectOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        School s=new School();
        s.process();
	}

}
