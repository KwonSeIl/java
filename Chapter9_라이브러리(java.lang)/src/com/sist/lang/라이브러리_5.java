package com.sist.lang;
//Ŭ���� �����ÿ� �������̽��� ���� 
class Sawon implements Cloneable
{
	//ĸ��ȭ �ڵ� ==> �����ʹ� private, �б�/����(getter/setter)
	private String name;
	private String dept;
	private String loc;
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
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	// ���̺귯���� ����ó���� �ʿ��� �κ��� �����ؼ� ����
}
/*
 * 	Object (����)
 * 	  |
 * 	Sawon (����)
 * 
 * 	=> ����ȯ
 */
public class ���̺귯��_5 {
	//throws CloneNotSupportedException, throws Exception, throws Throwable
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Sawon sa=new Sawon();
		// Sawon sa1=new Sawon()
		
		sa.setName("ȫ�浿");
		sa.setDept("���ߺ�");
		sa.setLoc("����");
		// Sawon copy=sa; -> ����
		Sawon copy=(Sawon)sa.clone(); //���� ���� ==> ���̺귯�� �޼ҵ� ȣ��ÿ� ��κ� Object
		Sawon sa2=sa;
		Sawon sa1=new Sawon(); //�ʱⰪ
		
		System.out.println("sa:"+sa);
		System.out.println("copy:"+copy);
		System.out.println("sa1:"+sa1);
		System.out.println("sa2:"+sa2);
		
		System.out.println("sa.name="+sa.getName());
		System.out.println("sa.dept="+sa.getDept());
		System.out.println("sa.loc="+sa.getLoc());
		System.out.println("sa1.name="+sa1.getName());
		System.out.println("sa1.dept="+sa1.getDept());
		System.out.println("sa1.loc="+sa1.getLoc());
		System.out.println("copy.name="+copy.getName());
		System.out.println("copy.dept="+copy.getDept());
		System.out.println("copy.loc="+copy.getLoc()); // �ƹ�Ÿ
		
		
	}

}
