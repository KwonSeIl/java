/*
 * 	�񱳿�����: �⺻���� �񱳰��� 
 * 			---- ����/�Ǽ�/����/��
 * 			     ���ڿ���(equals) => �α���, ID �ߺ�üũ (������: �迭,Ŭ����)
 * 	  1) ==: ����
 *    2) !=: ���� �ʴ�
 *    3) < : �۴�
 *    4) > : ũ��
 *    5) <=: �۰ų� ����(<,==) 6<=6 ==>true
 *    6) >=: ũ�ų� ���� (>,==)
 *    ---------->������ ����� boolean(true/false) => ���ǹ�, �ݺ������� �ַ� ���
 *    
 *    ��) 6==6 true
 *    	 6!=6 false
 *    	 6<6  false
 *    	 6>6  false
 *    	 6<=6 true
 *    	 6>=6 true 	=> if, false, ���׿����ڿ��� ���� ��� 
 *     -------------------------------------------
 *      true==ture => true
 *      
 */
public class �񱳿�����_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������
		int a=(int)(Math.random()*5)+1;
		//	        0.0~0.99 => *5	=>0~4 => +1 -> 1~5
		int b=(int)(Math.random()*5)+1;
		System.out.println("a="+a+",b="+b);
		System.out.println("a==b:"+(a==b));
		System.out.println("a!=b:"+(a!=b));
		System.out.println("a<b:"+(a<b));
		System.out.println("a>b:"+(a>b));
		System.out.println("a<=b:"+(a<=b));
		System.out.println("a>=b:"+(a>=b));

	}

}
