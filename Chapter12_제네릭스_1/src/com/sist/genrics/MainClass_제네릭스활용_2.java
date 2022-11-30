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
	public Sawon() {} //default생성자
	//자동으로 생성자를 첨부하지 않음
}
public class MainClass_제네릭스활용_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Sawon> list=new ArrayList<Sawon>(); //가장 많이 사용되는 형식(사용자정의데이터형 => 제네릭스)
		list.add(new Sawon(1,"홍길동","개발부","서울",300));
		list.add(new Sawon(2,"박문수","기획부","부산",300));
		list.add(new Sawon(3,"이순신","자재부","서울",300));
		list.add(new Sawon(4,"강감찬","영업부","제주",300));
		list.add(new Sawon(5,"박지성","개발부","서울",300));
		
		//출력
		System.out.println("===== 사원 목록 =====");
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
