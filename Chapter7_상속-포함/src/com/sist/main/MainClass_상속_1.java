package com.sist.main;
class Board
{
	public void list() {}
	public void insert() {}
	public void update() {}
	public void detail() {}
	public void find() {}
}
class ReplayBoard extends Board{
	/*public void list() {}
	public void insert() {}
	public void update() {}
	public void detail() {}
	public void find() {}*/
	public void reply() {}
}
class GalleryBoard extends Board
{
	/*public void list() {} //
	public void insert() {} //
	public void update() {}
	public void detail() {} //
	public void find() {}*/
}
class DataBoard extends Board
{
	/*public void list() {}
	public void insert() {} //
	public void update() {}
	public void detail() {} //
	public void find() {}*/
}
/*
 * 	반복 코딩 제거 방법
 * 	 1) 반복문 for/while
 *   2) 메소드
 *   3) 상속 (is-a) => 위로 올라갈수록 ~이다라는 관계 성립
 *   4) 제작이 어려운 클래스 -> 상속으로 처리 
 *   5) 포함 (has-a)=> 포함하고 있다 *****
 */
public class MainClass_상속_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
