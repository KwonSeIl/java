package com.sist.io;
import java.util.*;
import java.io.*;
/*
 * 	Input / Reader => 읽기
 * 	Output / Writer => 쓰기
 * 	------
 * 	| 파일 전송 / 파일 복사 ==> 영문,숫자,특수문자: 정상수행
 * 						   ------------ 1byte, 2byte 동시에 사용 가능  
 */
public class MainClass_BufferedInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			BufferedInputStream bis=
					new BufferedInputStream(new FileInputStream("c:\\java_data\\student.txt"));
			int i=0;
			while((i=bis.read())!=-1) //-1 EOF
			{
				System.out.print((char)i);
				
			}
			bis.close();
		}catch(Exception ex) {}

	}

}
