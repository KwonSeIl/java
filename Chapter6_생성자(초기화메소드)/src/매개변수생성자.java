import java.util.Scanner;
class Student
{
	String name; //null �ʱ�ȭ
	int kor,eng,math; // 0,0,0 �ʱ�ȭ
	/*Student(String n,int k,int e,int m)
	{
		name=n; //������ �浹���� ���� �� this �����ص� �� -> ���� �տ� this �������� 
		kor=k;
		eng=e;
		math=m;
	}*/
	Student(String name,int kor,int eng,int math)
	{
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	//�ν��Ͻ� �޼ҵ�
	void print()
	{
		//this�� ����ϴ� ��: ������, �ν��Ͻ� �޼ҵ�(static�޼ҵ�� ����� �Ұ���)
		System.out.println("�̸�:"+name);
		System.out.println("����:"+kor);
		System.out.println("����"+eng);
		System.out.println("����"+math);
		System.out.println("����:"+(kor+eng+math));
		System.out.printf("���:%.2f\n",(kor+eng+math)/3.0);
		
		
	}
	//this():�ڽ��� ������, this:�ڽ��� ��ü ==> 295page
	// =>���̺귯��
}
public class �Ű����������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("�̸� �Է�:");
		String name=scan.next();
		System.out.print("���� �Է�:");
		int kor=scan.nextInt();
		System.out.print("���� �Է�:");
		int eng=scan.nextInt();
		System.out.print("���� �Է�:");
		int math=scan.nextInt();
		
		// �л� �Ѹ� ����
		//Student s=new Student(); ��� �Ұ�
		Student hong=new Student(name, kor, eng, math);
		//�ν��Ͻ���.�޼ҵ��() => �޼ҵ� ȣ�� ����
		hong.print();
		
	}

}
