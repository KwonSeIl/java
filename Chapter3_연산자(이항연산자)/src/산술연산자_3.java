/*
 *  % ������ ��������  ==> �ڹٽ�ũ��Ʈ (%), ����Ŭ(MOD()), EL(5 mod 2)
 *  -------------------------------------------------------
 *   �ڹٽ�ũ��Ʈ: �ڹ�(==), ����Ŭ(=), �ڹٽ�ũ��Ʈ(===): ES5(==), ES6(===), ES8
 *   										  var		let, const
 *   ����: JSP ==> HTML�� ��� (ThymeLeaf ���)
 *   Fornt		Back
 *   ȭ�����		����    => �Ｚ(SpringBoot<=>VueJS), ����(SpringBoot<=>React)
 *   DB: JDBC/MyBatis/JPA
 *   
 *  => ��ȣ(������� ������ ��ȣ�� ����) 
 */
public class ���������_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=2;
		
		System.out.printf("%d%%%d=%d\n",a,b,a%b);
		System.out.printf("%d%%%d=%d\n",-a,b,-a%b);
		System.out.printf("%d%%%d=%d\n",a,-b,a%-b);
		System.out.printf("%d%%%d=%d\n",-a,-b,-a%-b);
		// -5*-5 = 25, -5*5=-25 ==>*,/�� �Ϲ� ���� ����
		
		int c=367;
		System.out.println(c%10);
		System.out.println((c%100)/10);
		// ===> 367%100 ==>67. 67/10==>6
		System.out.println(c/100);
		
		// �Է� �޾� ���⿩�� Ȯ�� ==> �˰��� ����(����,����) ==> && ||
		

	}

}
