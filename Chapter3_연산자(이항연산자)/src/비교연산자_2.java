import java.util.Scanner;

/*
 * 	char ��: char�� ���������� ���� �� ��
 * 	------------------------------
 * 	 'A'<'B'
 * 	 ---  --
 *    65   66
 *    
 *    1 > '0' => false
 *    --   ---
 *    		48 -> 1>48 ==> '1'=48 '2'=50
 *    ��� ���ڸ��� ��ȣ ����(�ƽ�Ű �ڵ�) 
 *    -------------------------
 *    �ƽ�Ű �ڵ� | ��ĵ�ڵ� (Ű�����ȣ)
 *      8bit	 8bit =======> ����Ʈ������ 
 *    -------------------------
 *    C��� / �ڹ� 
 *    => C���� ���� ����� ���� 
 *    => �ڹٴ� ���ϴ� ��ġ���� ���� ���� ���� 
 */
import java.util.Scanner;
public class �񱳿�����_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a='A'; //65
		char b='a'; // 97
		
		System.out.printf("%c == %c : %b\n",a,b,a==b);
		System.out.printf("%c == %c : %b\n",a,b,(a+32)==b);
		// ��ҹ����� ���� ==> 32
		System.out.printf("%c != %c : %b\n",a,b,a!=b);
		// %b ==> boolean ���
		/*
		 *  %d ==> �����ϴ� �����ʹ� ����
		 *  %c ==> ����
		 *  %f ==> �Ǽ�
		 *  %s ==> ���ڿ�(���ڴ� '', ���ڿ��� "")
		 *  %b ==> boolean (true/false)
		 */
		int c=98;
		System.out.printf("%d == %c : %b\n",c,b,c==b); //char�� ��� ������ �ִ� ��� ������ ����
		// == !=, <, >, <=, >= �� ����
		// ==, != (boolean) true,false
		
		boolean b1=true;
		boolean b2=false;
		System.out.printf("%b == %b : %b\n",b1,b2,b1==b2);
		System.out.printf("%b != %b : %b\n",b1,b2,b1!=b2);
		//System.out.printf("%b < %b : %b\n",b1,b2,b1<b2); -> �����߻� 
		//eclipse: �ҽ� �ڵ��ø��� ��������(��). ��� ������->�ӵ� ������(��)
		
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�:");
		int k=scan.nextInt();
		System.out.println((k%2==0)?"¦��":"Ȧ��"); //���׿����� ==> ����

	}

}
