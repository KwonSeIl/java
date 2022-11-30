package com.sist.exception;

import java.io.IOException;

/*
 * 	1. try~catch
 * 	2. throws
 * 		-------
 * 		예외 선언(예외회피) => 시스템에 예외 알려준다
 * 		형식)
 * 			public void display() throws NumberFormatException,RuntimeException, Exception
 * 										 --------------------------------------------------
 * 										 catch: 순서 있음. throws: 순서 없음
 * 			=> 라이브러리는 예상된 예외를 throws를 이용해서 등록
 * 				==>				 ---------------- 처리하면서 사용을 해야 한다
 * 			=> 사용법 2가지
 * 			  1) try~catch: 직접 처리하는 방법
 * 			  2) throws: 선언만 처리하는 방법 
 * 
 * 			  public void display() throws Exception ==> display를 호출 시에는 Exception 처리한 후 사용한다
 * 			  {
 * 
 * 			  }
 * 
 * 			  public void aaa()
 * 			  {
 * 				display() //오류코드
 * 			  }
 * 
 * 			  1) 
 * 				public void aaa()
 * 				{
 * 					try
 * 					{
 * 						display();
 * 					}catch(Exception e) {}
 * 				}
 * 			  2)
 * 				public void aaa() throws Exception
 * 				{
 * 					display();
 * 				}
 * 			 ----------------------------------------
 * 			 public void aaa() throws NumberFormatException, ArrayIndexOutOfBoundsException
 * 			 {
 * 			 }
 * 
 * 			 main()
 * 		 	 {
 * 				aaa(); //정상수행 
 * 			 }
 * 			
 * 			// Exception / Throwable
 * 				모든 예외를 처리할 수 있는 클래스 
 * 		
 * 				void aaa() throws IOException, ClassNotFoundException
 * 
 * 				void bbb() throws IOException, ClassNotFoundException
 * 				void bbb() throws Exception ==> 확대
 * 				void bbb() throws Throwable  ==> 확대
 * 
 * 				void aaa() throws Throwable ==> 축소
 * 		
 * 				void bbb() throws Exception   ====> 오류 발생ㅇ
 * 
 * 						Throwable
 * 							|
 * 					-------------------
 * 					|				  |
 * 				  Error				Exception
 * 										RuntimeException ==> 예외처리를 생략할 수 있다
 * 											|
 * 										NumberFormatException, NullPointerException
 */
public class MainClass_예외처리_1 {
	//CheckException => 컴파일러가 예외처리가 되었는지 확인 ==> 반드시 예외처리해서 사용해야 함
	public static void aaa() throws InterruptedException, IOException
	{
		
	}
	//UnCheckException => 컴파일러가 예외처리를 확인하지 않음 ==> 예외처리를 생략할 수 있음 
	public static void bbb() throws NumberFormatException, NullPointerException
	{
		
	}
	public static void main(String[] args) throws Exception {
		//								간접 ==> 자바시스템에서 처리 요청
		// TODO Auto-generated method stub
		/* bbb();
		 * try
		 *  {
		 *  	aaa();
		 *  }catch(Exception ex) {} */
		///aaa();
		try 
		{
			Thread.sleep(1000);
		}catch(Exception ex) {} //프로그래머가 직접 처리해서 사용
	}

}
