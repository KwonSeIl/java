package com.sist.movie;
//�������� ==> ĸ��ȭ, ���(���õ� ������ ��Ƽ� ����)
public class MovieVO {
	private int mno; //��ȭ��ȣ
	private String title;
	private String genre;
	private String actor;
	private String grade;
	private String regdate;
	private double score;
	private int showUser;
	private double reserve;
	// ���� ����ȭ => ������ ��ȣ (��ŷ,����) => �޸𸮿� ���ٰ� ����(private)
	// �ٸ� Ŭ�������� ����� �Ұ� => ������ ��ɸ� ÷��(�б�,����): �б�(getXxx()), ����(setXxx())
	//													getther	 	setter
	// ==========> MyBatis / Spring ==> setter�� ���� �ڵ����� ä���ش�
	
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public int getShowUser() {
		return showUser;
	}
	public void setShowUser(int showUser) {
		this.showUser = showUser;
	}
	public double getReserve() {
		return reserve;
	}
	public void setReserve(double reserve) {
		this.reserve = reserve;
	}
}