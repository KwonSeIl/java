// �����ڸ� ���ؼ� �ν��Ͻ��� ����
// ������
import java.util.Scanner;
class Sawon
{
	int sabun;
	String name;
	String dept; //�μ���
	String loc; //�ٹ���
	long pay; //����
	Sawon() 
	{
		//������ �ʱ�ȭ
		sabun=1;
		name="ȫ�浿";
		dept="���ߺ�";
		loc="����";
		pay=5000;
	}
	Sawon(int sabun,String name)
	{
		this(); //�ڽ��� ������ ȣ���� ������ => �Ű������� ���� ������ ȣ���� ������
		/*
		 * 	sabun=1;
		 * 	name="ȫ�浿";
		 * 	dept="���ߤ���"
		 * 	loc="����";
		 * 	pay=5000;
		 */
		//this()�� �����ڿ����� ȣ�� ���� => ���� ù �ٿ� ����� 
		this.sabun=sabun;
		this.name=name;
	}
	Sawon(String dept,String loc,long pay)
	{
		this();
		this.dept=dept;
		this.loc=loc;
		this.pay=pay;
	}
	public Sawon(int sabun, String name, String dept, String loc, long pay)
	{
		this(dept,loc,pay);
		/*this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.loc = loc;
		this.pay = pay;*/
	}
	void print()
	{
		System.out.println("���:"+sabun);
		System.out.println("�̸�:"+name);
		System.out.println("�μ�:"+dept);
		System.out.println("�ٹ���:"+loc);
		System.out.println("����:"+pay);
	}
}
public class �Ű�����������_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon sa1=new Sawon(); //1,ȫ�浿,���ߺ�,����,5000
		sa1.print();
		Sawon sa2=new Sawon(2,"�ڹ���"); //2,�ڹ���,null,null,0L
		sa2.print();
		Sawon sa3=new Sawon("�ѹ���","���",4200); //0,null,�ѹ���,���,4200
		sa3.print();
		Sawon sa4=new Sawon(3,"�����","��ȹ��","�λ�",5500);
		sa4.print();
		
	}

}
