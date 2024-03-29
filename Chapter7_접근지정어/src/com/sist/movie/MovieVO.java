package com.sist.movie;
//정보은닉 ==> 캡슐화, 경계(관련된 데이터 모아서 관리)
public class MovieVO {
	private int mno; //영화번호
	private String title;
	private String genre;
	private String actor;
	private String grade;
	private String regdate;
	private double score;
	private int showUser;
	private double reserve;
	// 변수 은닉화 => 데이터 보호 (해킹,변질) => 메모리에 없다고 가정(private)
	// 다른 클래스에서 사용이 불가 => 변수의 기능만 첨부(읽기,쓰기): 읽기(getXxx()), 쓰기(setXxx())
	//													getther	 	setter
	// ==========> MyBatis / Spring ==> setter에 값을 자동으로 채워준다
	
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