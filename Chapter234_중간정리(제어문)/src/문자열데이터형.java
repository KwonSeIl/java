/*	137page
 * 	���ڿ� => String(Ŭ����)
 * 			��������,Ŭ������(���ڿ� ���� ���)
 * 	 ����)
 * 		String ������=""
 * 	 ���)
 * 		��:equals(), equalsIgnoreCase()
 * 		    -------	  -----------------
 * 			 ��ҹ��� ����		��ҹ��� ����X
 * 		 => admin Admin(flase)	admin Admin(true)
 * 		 =>  �α���			�˻�
 * 		���ڿ� ����: length()
 * 		���� 1��: charAt() , ���° ��ġ�� �� ������ �� ��� 
 * 		--------------------
 */
public class ���ڿ��������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="Hello Java";
		System.out.println(string.length());
		System.out.println(string.charAt(5)); //5��° ���� �������� 
		
		for(int i=string.length()-1;i>=0;i--)
		{
			System.out.print(string.charAt(i));
		}

	}

}
