// ���ĺ��� �Է� �޾� �빮��/�ҹ��� ==> && (���� ����) 
import java.util.Scanner; //�ܺο� �ִ� Ŭ������ �о�� �� ��� 
// Math, System ==> java.lang(������ ����)  => �ڵ��ν� 
public class ��������_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("���ĺ� �Է�:");
		char c=scan.next().charAt(0); //�Էµ� ���ĺ� 1�� ������ �� (Scanner�� ����: ����1���� ������)
		boolean b1=c>='A' && c<='Z'; //�빮�� ����
		boolean b2=c>='a' && c<='z'; //�ҹ�������
		//boolean b1=scan.next().charAt(0)>='A' && scan.next().charAt(0)<='Z';
		
		// (c>='A' && c<='Z') || (c>=='a' && c<='z') ==>���ĺ� ���� 
		System.out.println("b1="+b1+"=>�빮��");
		System.out.println("b2="+b2+"=>�ҹ���");
	}

}
