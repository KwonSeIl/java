/*
 * 	if / for
 *  --(������� �����)
 *  
 *  1) ������	=======================> 2�� for��
 *  2) ������ ������ (�� ������ ��) =======> 1�� for�� (���ǹ� ==> &&���)
 *  
 *  ���� �߻� => 1~100����. 50<
 *  ���ĺ� => k>		&& �ΰ����� ���ÿ� ����
 *  
 */
public class ��������_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1;
		// 			0.0~0.99 ==>0.0~99.0 => 0~99
		//char b=(char)(Math.random()*26)+65;
		//		 ----------------------char => char + int = int
		char b=(char)((Math.random()*26)+65); //0~25 + 65 => 65~90. �ҹ���-> +97
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		boolean result=a>50 || b<'k';
		System.out.println(result);
		// ���ǰ˻�
		
		

	}

}
