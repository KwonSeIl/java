package com.sist.genrics;
import java.util.*;
class Sawon
{
	private int sabun;
	private String name;
	private String dept;
	private String loc;
	private int pay;
	public int getSaubun() {
		return sabun;
	}
	public void setSaubun(int saubun) {
		this.sabun = saubun;
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
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public Sawon(int sabun, String name, String dept, String loc, int pay) {
		this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.loc = loc;
		this.pay = pay;
	}
	public Sawon() {} //default������
	//�ڵ����� �����ڸ� ÷������ ����
}
public class MainClass_���׸���Ȱ��_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Sawon> list=new ArrayList<Sawon>(); //���� ���� ���Ǵ� ����(��������ǵ������� => ���׸���)
		list.add(new Sawon(1,"ȫ�浿","���ߺ�","����",300));
		list.add(new Sawon(2,"�ڹ���","��ȹ��","�λ�",300));
		list.add(new Sawon(3,"�̼���","�����","����",300));
		list.add(new Sawon(4,"������","������","����",300));
		list.add(new Sawon(5,"������","���ߺ�","����",300));
		
		//���
		System.out.println("===== ��� ��� =====");
		for(Sawon sa:list)
		{
			System.out.println(sa.getSaubun()+" "
					+sa.getName()+" "
					+sa.getDept()+" "
					+sa.getLoc()+" "
					+sa.getPay());
		}

	}

}
