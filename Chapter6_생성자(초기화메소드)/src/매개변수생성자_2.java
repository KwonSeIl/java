/*
 * 	int a=100;
 * 	void aaa(int b)
 * 	{
 * 		a=b;
 * 	}
 * 
 * 	aaa(300); //a=300
 * 	a=200;
 * 
 */
class Member
{
	int mno=1; //0
	String name="ȫ�浿"; //null
	String address="����"; //null
	String tel="010-1111-1111"; //null
	Member() {
		// TODO Auto-generated constructor stub
	}
	Member(String name,String address,String tel)
	{
		mno=++mno;
		this.name=name;
		this.address=address;
		this.tel=tel;
	}
	
	Member(int mno, String name, String address, String tel) {
		this(name,address,tel);
		/*this.mno = mno;
		this.name = name;
		this.address = address;
		this.tel = tel;*/
	}

	//�޸� �Ҵ�ÿ� -> �ʱ�ȭ
	
	void print()
	{
		System.out.println("ȸ����ȣ:"+mno);
		System.out.println("�̸�:"+name);
		System.out.println("�ּ�:"+address);
		System.out.println("��ȭ��ȣ:"+tel);
	}
}
public class �Ű�����������_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1=new Member(1,"ȫ�浿","����","010-1111-1111");
		m1.print();
		Member m2=new Member(2,"�ڹ���","���","010-2222-2222");
		m2.print();
		Member m3=new Member(3,"�̼���","�λ�","010-3333-3333");
		m3.print();
		Member m4=new Member("������","��õ","010-4444-4444");
		m4.print();
	}

}
