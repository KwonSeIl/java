//263page
public class �޼ҵ�_3 {
	static void aaa() //static�� ȣ�� ����. instance�� ȣ�� �Ұ��� 
	{
		// static������ �ν��Ͻ�����, �޼ҵ� ȣ�� �� �ݵ�� �޸� �Ҵ��� �� �� ����ؾ� �� 
		�޼ҵ�_3 m=new �޼ҵ�_3();
		m.first();
	}
	void first() //static, instance ȣ����  ����
	{
		aaa();
		System.out.println("fisrt() ����.."); //����1
		second();
		System.out.println("first() ����.."); //����6
	}
	void second()
	{
		aaa();
		System.out.println("second() ����.."); //����2
		last();
		System.out.println("second() ����.."); //����5
	}
	void last()
	{
		System.out.println("last() ����.."); //����3
		System.out.println("last() ����..");	//����4
	}
	/*
	 * 	last
	 * 	-------
	 * 	second			second
	 * 	-------			------
	 * 	first			first		first
	 * 	-------			------		------		-----
	 * 	main			main		main		main		=> -------- -> ���α׷� ����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �޼ҵ尡 �޸𸮿� ������ �ȵ� 
		System.out.println("main() ����..");
		�޼ҵ�_3 m=new �޼ҵ�_3(); //�޼ҵ尡 ����Ǵ� ����
		System.out.println("�޸� ���� m="+m);
		System.out.println(m+" �޸� �ּҿ� �޼ҵ尡 ��ü ����");
		m.first();
		System.out.println("main() ����..");
		

	}

}
