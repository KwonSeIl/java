package com.sist.manager;
// 사용자 정의 타입(MusicVO-> 활용) => 메소드

import com.sist.vo.MusicVO;
// 관리 프로그램 
/*
 * 	변수
 * 	---
 * 	 기본형 변수(int,double...)
 * 	 참조형 변수(배열,클래스)
 * 	----------------------> 반드시 초기화를 한다
 * 
 * 	=> 데이터는 무조건 은닉화(클래스에서 선언되는 모든 변수 private) -> 데이터 노출 방지
 * 	=> 통신(다른 클래스와 연결) -> 메소드 사용 => public
 * 	=> 메모리 할당 -> 생성자 => public
 * 	----------------------------------
 * 	=> 패키지가 다른 경우에는 public만 연결할 수 있음 
 * 	   ---- 관련된 기능을 모아서 관리하는 영역 
 * 	   ---- 반드시 import를 이용해서 클래스를 읽어옴
 * 			(같은 패키지에 있는 클래스는 import 하지 않는다)
 * 	=> 캡슐화는 데이터 보호 목적 => 반드시 모든 변수를 private => 기능(getter/setter)
 * 	=> 명시적인 초기화가 불가능 할 때에는 반드시 초기화 블록/생성자를 이용한다
 * 	=> 접근 범위
 * 	  ***1) 자신의 클래스에서 사용: private => 인스턴스, static 멤버변수
 * 	  2) 같은 패키지에서 사용: default
 * 	  ***3) 전체에서 사용: public => 생성자, 클래스, 메소드 
 * 	  *** 변수
 * 		[접근지정어] 데이터형 변수명;
 * 	  메소드
 * 		[접근지정어] 리턴형 메소드명(매개변수);
 * 	  클래스
 * 		[접근지정어] class ClassName
 * 		*** 특별한 경우가 아니면 디폴트는 사용하지 않는다
 * 		*** 지역변수는 접근지정어가 없다
 * 
 */
import java.io.*;
public class MusicManager {
	private static MusicVO[] music=new MusicVO[100]; //다른 패키지에 있기 때문에 import 반드시 있어야 함 //초기화
	static
	{
		try
		{
			FileReader fr=new FileReader("c:\\JavaDev\\genie.txt");
			String mu="";
			int i=0; //read(): 문자 1개 읽을 때 쓰는 방식 ==> i:문자번호 => (char)i
			while((i=fr.read())!=-1) //-1: 파일 끝(EOF)
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
				//변수에 직접 접근이 불가능하기 때문에 메소드를 이용해서 저장 ==> setXxx()
				music[i].setAlbum(ss[3]);
				music[i].setKey(ss[4]);
				i++;
			}
		}catch(Exception ex) {}
	}
	// 초기화 블록 / 생성자 ==> 파일 읽기(구현) => 클래스 영역에서 할 수 없음
	/*
	 * 	  변수의 초기화
	 * 		인스턴스 변수
	 * 		정적 변수(static)
	 * 	   --------------
	 * 		  명시적인 초기화 int a=10;
	 * 		  초기화 블록, 생성자 이용 => 파일을 읽어서 초기화, 외부에 크롤링 ...
	 * 		  -------
	 * 			인스턴스 블럭: 인스턴스변수 초기화 
	 * 			{
	 * 				인스턴스 변수, static변수 초기화 가능 
	 * 			}
	 * 			
	 * 			static: static 초기화
	 * 			{
	 * 				static변수만 초기화(인스턴스변수는 사용이 안됨)
	 * 			}
	 * 
	 * 			생성자 => 인스턴스, static 상관없이 초기화 가능
	 * 	
	 * 			*** static -> static 블록
	 * 			*** 인스턴스 -> 생성자를 이용해서 초기화 
	 */
	// 1. 기능 => 목록 출력
	public MusicVO[] musicListData()
	{
		return music;
	}
	// 2. 동영상 실행
	public String musicDetailData(int index)
	{
		return music[index].getKey();
	}
	// 3. 검색
	// 4. 가수명 검색

}
