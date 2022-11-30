package com.sist.lang;
/*
 * 	java.lang: ���α׷����� ���� ���� ���Ǵ� �⺻�� �Ǵ� Ŭ������ ����
 * 	---------	------------------ import�� ������ �� ����
 * 	java.util, java.text, java.io, java.net (2��)
 * 	---------------------------------------
 * 	java.lang �ֿ� Ŭ����
 * 	 1. Object: ��� Ŭ������ ���� Ŭ���� => ���̺귯��/��������� ==> ��� Ŭ������ Object�κ��� ����� �޴´� 
 *   2. String: ���ڿ��� �����ϴ� Ŭ����(char[]�� �̿��ؼ� ���� Ŭ����)
 *   3. StringBuffer: ����ȭ(���ڿ� ����)
 *   4. Wrapper: �� ���������� Ŭ����ȭ
 *   	------ Integer(int), Double(double), Boolean(boolean), Byte, Short, Float
 *   5. Math: ���а���
 *   6. System: ����� / GC
 *   -------------------------------------------------------------------------------
 *   ���̺귯��: 1) ��Ű�� 2) Ŭ������ 3) �ֿ�޼ҵ�
 *   						     ------ 1.��� 2.�޼ҵ�� 3.������ 4.�Ű����� 5.���ܼ���
 *   									----------------------------------- ����
 *   --------------�ڹ�(1,2��) --> 1���ڹ�
 *   2���ڹ�: ����Ŭ����(java.sql)
 *   3���ڹ�: ������(java.http.servlet.*)
 *   4���ڹ�: Spring����
 *   ---------------------------
 *   �ڹ� -> ����Ŭ -> HTML/CSS(JSP) -> Spring -> Spring-Boot
 *   ----------		----------
 *   	����
 *   -------------------------
 *   			����
 *   --------------------------------------
 *   						����
 *   -----------------------------------------------------
 *   									����
 *   
 *   1) Object: ��� Ŭ������ Object�κ��� ����� �޴´�(Object�� ������ �ִ� ��� ����� ����� �� �ִ�)
 *   	class A (extends Object)
 *   	{
 *   	}
 *   
 *   	class A ==> Object, A
 *   	class B extends A ==> B,A,Object
 *   	***Object�� ��� ���������� ������ �ִ�
 *   	Object obj=1; obj='A' obj=new A()...
 *   	----------------------------------------> �ڹٿ��� �����ϴ� �޼ҵ� ��κ��� Object�� �����Ѵ�
 *   											=> ����ȯ
 *   2) Object �ֿ� �޼ҵ� 
 *   	***1. ���� ���: ���� ���� ���� �޸𸮸� ���Ӱ� ������ش�(������: prototype)
 *   		protected Object clone();
 *   				  ------  ------
 *   	***2. ��ü�� ���ڿ�ȭ
 *   		public String toString();	==> ���� ���� �������̵���
 *   	***3. �Ҹ���: ��ü �޸� ����
 *   		protected void finalize();	==> �޼ҵ� �Ҹ��ڰ��� �� �ڵ� ȣ��
 *   	4. ��ü ��: (==) => equals() / (!=)=> !equals()
 *   		public boolean equals(Object obj)
 *   	***5. ��ü�� ������ �޼ҵ�(��ü����): getClass()
 *   		public Class getClass()
 *   
 *   
 */
// �Ҹ��� ����
/*
 * 	1. Ŭ���� ����
 * 	2. ��ü����(Ŭ�������� ����)
 * 	3. ��ü Ȱ��(��ü�� ������ �ִ� �޼ҵ�, ����)
 * 	4. ��ü �Ҹ�
 * 	5. �Ҹ꿩�� Ȯ��(GC) ==> fianllize() ȣ��Ǿ����� Ȯ�� 
 */
class Main{
	private int a=10;
	public Main(int a)
	{
		this.a=a;
		System.out.println("Main Ŭ���� �޸� �Ҵ�..(��ü ����)");
	}
	public void display()
	{
		System.out.println("Main Ŭ���� ��ü Ȱ��..");
	}
	// �Ҹ��� �� �� �ڵ� ȣ��
	/*
	 * 	class A
	 * 	{
	 * 		public A() {new}
	 * 		public ~A() {delete} ==> �ڵ�ó�� GC => �����Ǵ� �ð�(�޸𸮴���) -> gc() ȣ��
	 * 		// ��ü�� null�� ����
	 * 		// ������� �ʴ� ��� gc ���
	 */
	@Override
	protected void finalize() throws Throwable {
		System.out.println("��ü �Ҹ�(�޸� ����)");
	}
	//object�� ������ �ִ� �޼ҵ�
	
	
}
public class ���̺귯��_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m=new Main(10); //��ü ����
		// ����� �޸𸮿��� �ʿ��� ������ ����
		m.display(); //��ü Ȱ��
		m=null; 
		// �޸� ���� ���
		System.gc();

	}

}
