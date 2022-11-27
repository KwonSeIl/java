/*
 * 	252page
 * 	** �޼ҵ�
 * 		1) �ν��Ͻ� �޼ҵ�: �ν��Ͻ� ������ �̿��� �� ���
 *  	2) ���� �޼ҵ�, �����޼ҵ�(static): �ν��Ͻ� ������ �̿����� ���� ��쿡 �ַ� ��� 
 *  	��) String s="Hello Java!!";
 *  	   s.substring()
 *  	   String.valueOf(10)
 *  
 *  	class Member
 *  	{
 *  		String id,pwd; //Heap�� ����
 *  		boolean isLogin(String id,String pwd)	//Stack�� ����
 *  		{
 *  			this.id id
 *  		}
 *  	}
 *  
 *  	*** static: ����
 *  	*** instance: ����
 *  	===================> �޼ҵ�(static, instance)
 *  1. �޼ҵ� ����
 *  	1) �ν��Ͻ�
 *  		������ �޼ҵ��(�Ű�����..)
 *  		{
 *  			return ��; => ������ ����  ==> ����� ���� ���: void -> return ���� ����
 *  		}
 *  	2) ���� (static)
 *  		static ������ �޼ҵ��(�Ű�����...)
 *  		{
 *  			return ��;
 *  		}
 *  2. �޼ҵ� ȣ�� ��� 
 *  	1) �ν��Ͻ�: new�� �̿��� �޼ҵ尡 �����
 *  		A a=new A();
 *  			--- a�� �޸� �ּ��� ��Ī -> a��� ������ �޼ҵ�, ������ ����
 *  		��)
 *  			class A
 *  			{
 *  				int age;
 *  				String name;
 *  		
 *  				void insert(int age, String name)
 *  				{
 *  				}
 *  				void update(int age,String name)
 *  				{
 *  				}
 *  				void list()
 *  				{
 *  				}
 *  			}
 *  
 *  			A a=new A();
 *  	
 * 		 			a ==> ----------------------
 *  						age						
 *		  				------------------------
 *							name
 *							------------------
 *							insert()
 *							--------------
 *							update()
 *							-----------
 *							list()
 *							-----------
 *					a.age, a.insert(), a.update(), a.list()
 *					---------------------------------------> �ν��Ͻ� ����, �ν��Ͻ� �޼ҵ�
 *
 *		2) ����(static): �����Ϸ��� ���ؼ� �޸� ����
 *			class A
 *			{
 *				static int a;
 *				static void list() {}
 *				---------------------- ������ �Ϸ�
 *			}
 *			Ŭ������.a, Ŭ������.list()
 *			---------------------> Ŭ��������, Ŭ���� �޼ҵ� 
 *
 *			���̺귯�� => Ŭ������.�޼ҵ�()
 *					  Math.random(), String.valueOf()
 *
 *	3. ������ / �Ű�����(����� -> Ŭ��, ����, �Է�: �ּ�â �̿�) => ���ϸ�?
 *	   ----	  ------
 *	  ȭ�� ���
 *		
 *		������: �⺻��(int, double..), �迭, Ŭ����
 *		�Ű�����: �⺻��(int, double..), �迭, Ŭ����
 *			   ------------------   --------
 *			  Call By Value(������)  Call By Reference(�ּ�)
 */
class Names{
	String name1;
	String name2;
	
}
public class �޼ҵ�_1 {
	// �޼ҵ� ���� => �����ε�: ���� Ŭ�������� ���� �޼ҵ带 �̿��ؼ� ���ο� ��� ÷��
	// �޼ҵ���� ����, �Ű������� ����, ���������� �ٸ��� �ٸ� �޼ҵ�� �ν�
	void swqp(int a,int b)
	{
		int temp=a;
		a=b;
		b=temp;
		System.out.println("swap:a="+a+","+b);
	}
	void swap(String name1,String name2)
	{
		String temp=name1;
		name1=name2;
		name2=temp;
		System.out.println("swap:name1="+name1+",name2="+name2);
		
	}
	void swap(String[] names)
	{
		String temp=names[0];
		names[0]=names[1];
		names[1]=temp;
		System.out.println("swap:names[0]="+names[0]+",names[1]="+names[1]);
	}
	void swap(Names name)
	{
		String temp=name.name1;
		name.name1=name.name2;
		name.name2=temp;
		System.out.println("name1="+name.name1+",name2="+name.name2);
	}
	//Names n=new Names(); ==> Names name=n; -> Call By Reference
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		�޼ҵ�_1 m=new �޼ҵ�_1();
		//swap => m�� ÷��
		int x=10;
		int y=20;
		System.out.println("main:x="+x+",y="+y);
		m.swqp(x, y);
		System.out.println("main:x="+x+",y="+y); //Call By value(���� ����) => �޼ҵ� �ȿ����� ����
		// x,y �޸� => �޼ҵ� ȣ��(�Ű������� �ٸ� �޸𸮰� ����) => ���纻(������ �״�� ���纻 �ȿ����� ����) 
		// Ŭ����, �迭 => ������ ����(����: String)
		String name1="ȫ�浿";
		String name2="�ڹ���";
		m.swap(name1, name2);
		System.out.println("main:name1="+name1+",name2="+name2);
		
		String[] names= {"�̼���","������"};
		m.swap(names);
		System.out.println("main:names[0]="+names[0]+",names[1]="+names[1]);
		/*
		 *  ���� ����(�޼ҵ� �ȿ����� ����): �Ϲ� �����Ͱ�(�⺻��), String 
		 *  ��ü ����(�ּ�): Ŭ����(����� ���� Ŭ����),�迭 
		 */
		Names n=new Names();
		n.name1="ȫ�浿";
		n.name2="�����";
		m.swap(n);
		System.out.println("name1="+n.name1+",name2="+n.name2);
		//�Ű����� => Ŭ����, �迭, �Ϲ� ������
		//������ => �⺻��/ �迭,Ŭ����(�������� ��� ��)
	}

}
