package com.sist.main;
import java.text.SimpleDateFormat;
/*
 *	1. ������ ���� 
 *		***�Ѱ� ���� : ����
 *      	= ���� ����
 *           1) �������� (�޼ҵ�ȿ����� ����ϴ� ����,�Ű�����) => �ڵ����� ������� 
 *           2) ������� (�ν��Ͻ� ����) 
 *           3) �������� (Ŭ�������� : static) => static �޸𸮰����� 1���� �����   
 *      ���� ���� : �迭 => 1�� �迭 
 *      ***�ٸ� ������ : Ŭ���� 
 *           => Ŭ���� 
 *              1) ���� ��� 
 *                 ------------------------------------------
 *                   ���� : Ŭ�����ȿ��� ���α׷� ����ñ��� ���Ǵ� ����
 *                         ��) ���� 
 *                            ��ȭ�� (String)
 *                            ����� (String)
 *                            ������ (Date)
 *                            �ð�  (String)
 *                            �ο�  (int)
 *                            �ݾ�  (int) 
 *                            --------------- id, ���Ź�ȣ
 *                 ------------------------------------------
 *                  ��� (�޼ҵ�) 
 *                        ��) ��ȭ ���� 
 *                           ���� ���� 
 *                           ��¥ ����
 *                           �ð� ���� 
 *                           �ο� ���� 
 *                           ���� ��û
 *                           ���� ���� ���   
 *                 -----------------
 *                  ������ �ʱ�ȭ : ������ (id => id �б�,���Ź�ȣ => �ڵ� ó��) ==> ������Ʈ 
 *                 -----------------
 *                 ������Ʈ(Ŭ����=> �Ѱ��� ��ü����� ������ �ִ�) ==> ������ 
 *                 ==> ��ü ������ Ư���� ÷�� (���������� ���ϰ� ����� => ���� ������ �ƴϰ� �������)
 *                     ĸ��ȭ : ������ ��ȣ => �����͸� ����ȭ , �޼ҵ带 ���ؼ� ���� ��� 
 *                                        -----------   -------------------
 *                                        private           �б�/���� => getter/setter
 *                     ���/���� : ���� (�ҽ� �ߺ� ����)
 *                     ������ : ���� �ʿ�ÿ��� �������� ���� , ��� �߰� 
 *                                              (�������̵�) (��������)
 *                 ==> Ŭ������ ���� 
 *                     = �߻� Ŭ���� 
 *                     ***= �������̽� : ���������� ����� ���� , ���� �ٸ� Ŭ������ �����ؼ� ��� (������)
 *                          ���ռ��� ���� ���α׷��� ���� 
 *                          ---- Ŭ������ ���� (Ŭ������ �����ÿ� �ٸ� Ŭ������ ����) ==> ������
 *                          ������  
 *                          ---- �޼ҵ���� (�Ѱ��� ���) ==> ���� ���� 
 *                     = ���� Ŭ���� (������,�����쿡�� �ַ� ���) => �ϵ� (������)
 *                          ===> �͸��� Ŭ���� (����� ���� �������̵�)
 *                          
 *                     *** �߻� Ŭ���� / �������̽��� �޸� �Ҵ��� �Ұ����ϴ�
 *                         => �ݵ�� ����� �޾Ƽ� ������ Ŭ������ �̿��Ѵ� 
 *                         => �������̽��� �߻� Ŭ������ ���� => �߻� Ŭ������ ������ ���� 
 *                         => ��� ��� 
 *                            ��� : �߻� Ŭ������ ���� ��� (extends)
 *                                  �������̽��� ���� ����� ���� (implements)
 *                                  ��)
 *                                      abstract class A
 *                                      class B extends A
 *                                      ------------------
 *                                      B b=new B(); // Ȯ��� Ŭ���� ��� 
 *                                      A a=new B();
 *                                      A a=new A(); // ���� 
 *                                      
 *                                      interface A
 *                                      interface B
 *                                      interface C extends A,B
 *                                      ------------------------
 *                                      
 *                                      interface A
 *                                      interface B
 *                                      class C implements A,B
 *                                      ------------------------
 *                                      ==> �������� ���õ� Ŭ������ �Ѱ��� �������̽��� ���� 
 *                                      *** ���α׷� : �������� �׳� ����ϸ� => ������ ����� �� �ִ� 
 *                                                  ------ �Ѱ��� �̸����� ���� 
 *                                                  ������ => �迭�� 
 *                                                  Ŭ���� ������ => �������̽� 
 *                  => �޸� �Ҵ� 
 *                  class Human
 *                  { 
 *                     public void display(){}
 *                  }
 *                  
 *                  1) Human h=new Human(); // ���������� ���� => ���ռ��� ���� ���α׷� 
 *                  2) Human h2=new Human().getClass().getDeclearedContstructor().newInstance()
 *                  3) Human h3=Human.class.getDeclearedContstructor().newInstance()
 *                  ***4) Human h4=(Human)Class.forName("Human")
 *                        => ����/�޼ҵ� ���� (���÷���)
 *                  => ���������� 
 *                     private : �ڽ��� Ŭ���������� ����� ����  
 *                     default : ���� ��Ű���� �ִ� Ŭ���������� ��� 
 *                     protected : ���� ��Ű���� �ִ� Ŭ���������� ���, �ٸ� ��Ű�� ����� �ִ� ���
 *                     public : ��� Ŭ������ ���� ���� 
 *                  => Ŭ���� => Ŭ������ Ŭ������ ���� ���� (��ü����) => public 
 *                     �޼ҵ� => Ŭ������ Ŭ������ ����� �ϴ� ��� => public 
 *                     ����  => ������ ��ȣ : private 
 *                     ������ => Ŭ������ ����� ���ö� ���(�ٸ� Ŭ������ �޸� �Ҵ�) => public
 *                                      
 *                 
 *      ***���ϴ� ���� : �÷��� (11��~12��) : **List , Set(�ߺ��� �����͸� ����) , **Map(����) => Ŭ���� ����
 *                                     ------- �����ͺ��̽�                => �� �����ϴ� ��� Ŭ����
 *                                                                      Request,Response , Session
 *                                                                      Cookie  
 *         *** 12�� (������̼�) => �������� ��ü ������̼�  
 *      ---------------- �޸� ���� 
 *      ���� (15��) => ���� ����� : File / FileReader / FileWriter / FileInputStream / FileOutputStream
 *                   ObjectInputStream / ObjectOutputStream / BufferdReader / BufferedWriter
 *      ***RDBMS (����Ŭ) => DML/DDL/DCL/TCL => SQL
 *                         ---- JOIN / SUBQuery / Index / View(�ζ��κ�)
 *                         �⺻) �����ͺ��̽� �𵨸� 
 *                         ------------------- JDBC (�ٽ�) => �ڹٷ� ����Ŭ ���� 
 *   2. ������ Ȱ�� : ������ / ��� / �޼ҵ� 
 *                 ������
 *                  = ���������� / ���������� / ����ȯ������ 
 *                    ++ , --     !       (type)
 *                  = ��������� / �񱳿����� / �������� / ���Կ����� 
 *                    +,-,*,/, %  ==, != , < , > , <= , >= , && , || , = , += ,-=
 *                  = ���׿����� => if~else ==> �ҽ��� ���̴� ��쿡 �ַ� ��� 
 *                      (����)?��:�� 
 *                  = instanceof , equals 
 *                    ��ü ��       ���ڿ� �� 
 *                    
 *                  ��� 
 *                  = ���ǹ� (if , if~else , if~else if , else if~else)
 *                  = �ݺ��� (for , while) 
 *                         ----- for�� ���� 
 *                  = �ݺ���� (break)
 *                  
 *                  �޼ҵ� 
 *                  ����) 
 *                     [����������][�����] ������ �޼ҵ��(�Ű�����..) ����� 
 *                     {
 *                         ������ 
 *                     }
 *                     [����������] => ���������� ��ü (public,default,protected,private)
 *                                              -------
 *                     [�����] => abstract , final , static 
 *                     
 *                     => void�ܴ� �ݵ�� return�� ����Ѵ� (return => �޼ҵ� ����)
 *                     => ������ : ��ûó���� ���� ����� 
 *                               �������� �Ѱ��� ������ ���� (������ �����͸� ����)
 *                               -------------------- Ŭ���� ���� , �迭 ���� 
 *                     => �Ű����� : ����� ��û�� => ������ ���� �� �ִ� 
 *                     => �Ű����� ���۹� => Call By Reference , Call By Value => �������� ����(���ο� �޸𸮿� ���� ����)
 *                                                                  �⺻�� / String
 *                                      ------------------ �ּ� ���� (�迭,Ŭ����)
 *   3. ������ ��� : ������ ��� (�� ���α׷�) => HTML/CSS (�������ȿ��� �ڹٴ� �Ϲ� �ؽ�Ʈ)
 *                                         JAVA => HTML�� ��ȯ (JSP/SERVLET)
 *                                         ==> MVC���� (Spring�� MVC�� ����)
 *                                         ==> Web(JSP=> �ڹ�+HTML)
 *                                         ==> �ڹٿ� HTML �и��ؼ� �۾� 
 *   4. �ڹٿ��� �����ϴ� ���̺귯�� 
 *      java.lang 
 *        Object : clone , finalize , toString , equals , getClass
 *        String : length , substring , trim , indexOf , lastInexOf , contains , startsWith
 *                 equals , valueOf 
 *        StringBuffer : append
 *        Math : ceil , random , round 
 *        Wrapper : ���������� Ŭ����ȭ => Integer / Double / Boolean 
 *                                  parseInt   parseDouble parseBoolean
 *        System : gc
 *      java.util
 *         StringTokenizer => hasMoreTokens / nextToken / countTokens 
 *         Random => nextInt(int bounds)
 *         ------------------
 *         Date 
 *         Calendar 
 *         List
 *         Map 
 *         Set 
 *         -----------------
 *      java.util.regex
 *         Pattern / Matcher (find,matchers,group) 
 *         ------- compile()
 *      java.io
 *      java.net
 *      java.sql 
 *      java.text
 *        = SimpleDateFormat : ��¥ ��ȯ 
 *        = ChoiceFormat 
 *        = MessageFormat : 
 *      ----------------
 *      ����Ŭ 
 *        String name,sex,addr,tel,post,content
 *        int age 
 *        
 *        String sql="INSERT INTO member VALUES('"+name+"','"+sex+"','"+addr+"',"+age+",'"
 *                  +tel+"','"+post+"','"+content+"')";
 *                  
 *       10,000,000,000
 */
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy�� MM�� dd��");
        System.out.println(sdf.format(date));
	}

}