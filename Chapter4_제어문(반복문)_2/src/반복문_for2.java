/*
 * 	for/while
 * 	A~Z���� ���
 * 	--- for/while ==> ������ �־�� ��(����)
 * 	AAABCCCDDDFUION -> ����X -> ���� ������
 * 	1 3 5 7 9 11... -> O
 * 	112333458999000 -> X
 */
public class �ݺ���_for2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char ch='A';ch<='Z';ch++)
		{	
			System.out.print(ch+" ");
		}
		
		System.out.println();
		char ch='A';
		while(ch<='Z')
		{
			System.out.print(ch+" ");
			ch++;
		}
	}

}
