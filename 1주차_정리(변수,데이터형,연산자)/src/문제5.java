/*
 * 	int num1=10;
 * 	System.out.printf("%d \n", num1); //10
 * 	num1++;
 * 	System.out.printf("%d \n", num1);
 * 	++num1;
 * 	System.out.printf("%d \n", num1);
 * 	--num1;
 * 	System.out.printf("%d \n", num1);
 * 	num1--;
 * 	System.out.printf("%d \n", num1);
 * 
 */
public class ����5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		System.out.printf("%d \n", num1); //10 => ����� �� ��� num1=10
		System.out.printf("%d \n", num1++); //10 => ����ϰ� num1=10 ���� ���� => num1=11
		System.out.printf("%d \n", ++num1); //12 : num1=11-> ++ num1=12
		System.out.printf("%d \n", --num1); //11
		System.out.printf("%d \n", num1--); //11

	}

}
