/*
 * 	���� 1�� �Է¹޾� +5�� �� ���� �� ���
 */
import java.util.Scanner;
public class ���Կ�����_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�:");
		int num=scan.nextInt();
		//num=num+5;
		num+=5;
		System.out.println("num="+num);
		// num=15 --> -5�� ���� ���� �� ���
		//num=num-5;
		num-=5;
		System.out.println("num="+num);
		// num=10 --> *5�� �� ���� �� ���
		//num=num*5;
		num*=5;
		System.out.println("num="+num);
		// num=50 --> /5�� �� ���� �� ���
		//num=num/5
		num/=5;
		System.out.println("num="+num);
		//num=10 --> &5�� �� ���� �� ���
		//num=num&5;
		num&=5;
		/*
		 *  1010
		 *  0101
		 *  -----&
		 *  0000
		 */
		System.out.println("num="+num);
		//num=0 --> |5�� �� ���� �� ���
		//num=num|5;
		num|=5;
		/*
		 *  000
		 *  101
		 *  ---|
		 *  101 ==>5
		 */
		System.out.println("num="+num);
		//num=5 --> ^5�� �� ���� �� ���
		//num=num^5;
		num^=5;
		/*
		 * 	101
		 * 	101
		 * -----^
		 * 	000 ==> 0
		 */
		System.out.println("num="+num);
		//num=0 --> <<5�� �� ���� �� ���
		//num=num<<5;
		num<<=5;
		System.out.println("num="+num);
		//num=0 --> >>5�� �� ���� �� ���
		//num=num>>5;
		num>>=5;
		System.out.println("num="+num);
		// =,+=,-=,*=,/=
		// =, +=(����,������ ���� �� ������) 

	}

}
