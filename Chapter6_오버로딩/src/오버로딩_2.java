/*
 * 	add(int a,int b)
 * 	add(double d1,double d2)
 * 	add(float f1,float f2)
 * 	add(char c1,char c2)
 * 	add(String s1,String s2)
 * 	add(double d, int i)
 * 	add(float f,char c)
 * 	...
 * 
 * 	add(Object o1, Object o2)
 * 
 * 	// �ٸ� ���������� ������ -> Object
 *	// ������ ������ -> ...
 */
public class �����ε�_2 {
	/*void names(String n1)
	{
		System.out.println(n1);
	}
	void names(String n1,String n2)
	{
		System.out.println(n1+" "+n2);
	}
	void names(String n1,String n2,String n3)
	{
		System.out.println(n1+" "+n2+" "+n3);
	}
	void names(String n1,String n2,String n3,String n4)
	{
		System.out.println(n1+" "+n2+" "+n3+" "+n4);
	}
	void names(String n1,String n2,String n3,String n4,String n5)
	{
		System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n5);
	}*/
	//���� �Ű����� => ��-> ����ڰ� ������ �����͸� �޴� ��� 
	void names(String...name)
	{
		for(String s:name)
		{
			System.out.print(s+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		�����ε�_2 a=new �����ε�_2();
		a.names("ȫ�浿");
		a.names("ȫ�浿","�ڹ���");
		a.names("ȫ�浿","�ڹ���","�̼���");
		a.names("ȫ�浿","�ڹ���","�̼���","�����");
		a.names("ȫ�浿","�ڹ���","�̼���","�����","������"); 
		//System.out.printf("%d",10);
		//System.out.printf("%d%d%d%f%s",10,20,30,30.0,"");
		//int a=10;
		Object o=10;
		o="";
		o='A';
		o=10.5;
		o=true;
		o=a;
		o=new int[10];
		//	  =========> var a=10 a='' a=[]
	}

}
