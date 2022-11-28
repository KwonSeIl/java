package com.sist.io2;
/*
 * 	문자 스트림: 2byte로 읽기/쓰기
 * 	--------
 * 	 Reader		Writer
 * 	   |		  |
 * 	 FileReader   FileWriter
 * 	 ----------	  -----------
 * 	 보조스트림: BufferedReader/BufferedWriter
 * 	 -----------------------------------
 * 	 
 * 	 File, FileInputStream(BufferedInputStream)
 * 		   FileOutputStream(BufferedOutputStream) => 바이트 스트림(한글 외에 다른 파일 제어)
 * 													zip, .png...
 * 		   FileReader(BufferedReader)
 * 		   FileWriter(BufferedWriter) => 문자 스트림(문자 자체를 제어)
 * 										크롤링 후 파일 저장, 파일에 입력
 * 	 ObjectInputStream / ObjectOutputStream
 * 	 -----------------------------------------
 * 
 * 
 */
import java.io.*;
import java.util.*;
class Student
{
	private int hakbun;
	private String name;
	private int eng,math,kor;
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
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	
}
public class MainClass_FileWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//학생 목록
		ArrayList<Student> list=new ArrayList<Student>();
		// 파일 읽기
		try
		{
			String data="1|홍길동|90|80|90\n"
					+"2|박문수|75|88|87\n"
					+"3|심청이|60|98|88\n"
					+"4|이순신|90|55|66\n"
					+"5|강감찬|87|86|92";
			// 저장
			FileWriter fw=new FileWriter("c:\\java_data\\student.txt"); //Create
			/*
			 * new FileWriter("c:\\java_data\\student.txt"); ==> create
			 * new FileWriter("c:\\java_data\\student.txt",true); ==> append
			 * => 문자 스트림: char[], String
			 */
			fw.write(data); //file 저장
			fw.close(); // 파일 닫기
			/*
			 * 	FileWriter => write, close()
			 * 	FileReader => read, close()
			 * 	-1:EOF
			 */
			System.out.println("데이터 저장 완료!");
		}catch(Exception ex) {}
		

	}

}
