package com.sist.collection2;
/*
 * 	properties
 * 	----------
 * 	 ������ �о �����͸� ������ �´�
 * 	=> �߿��� �����Ͱ� �ִ� ��� (DB����)
 * 						------- ����Ŭ ��ġ, ID, Password
 * 	=> ��ȿ�� �˻� �� ���� ��� 
 * 	-------------------------- ���̹�Ƽ��, ������... (XML, properties)
 * 	Spring 4 => XML ���
 * 	Spring 5 => Java
 * 	------------------- �ڵ� ����(Spring-Boot)
 * 	1) ��ü ����
 * 	2) ���� �б�
 * 	3) Ű => ���б�
 */
import java.util.*;
import java.io.*;
public class MainClass_Properties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Properties prop=new Properties();
			//���� �б�(660page *****)
			prop.load(new FileInputStream("C:\\javaDev\\javaStudy\\Chapter11_�÷���_2\\src\\com\\sist\\collection2\\info.properties"));
			String name=prop.getProperty("name");
			String address=prop.getProperty("address");
			String tel=prop.getProperty("tel");
			System.out.println(name+" "+address+" "+tel);
			//663page
			Properties props=System.getProperties();
			System.out.println(props.getProperty("java.version"));
			System.out.println(props.getProperty("user.language"));
			props.list(System.out);
			//System�� ����� ����
			//662page
			Properties props2=new Properties();
			props2.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
			props2.setProperty("url", "jdbc:oracle:thin:@localhost:1521:XE");
			props2.setProperty("username", "hr");
			props2.setProperty("password", "happy");
			try
			{
				props2.store(new FileOutputStream("db.properties"), "�����ͺ��̽� ����");
				props2.storeToXML(new FileOutputStream("db.xml"), "database info");
			}catch(Exception ex) {}
		}catch(Exception ex) {}

	}

}
