/*
 * ������ ���ڸ� �����Ͽ� �빮������ �ҹ������� Ȯ���ϴ� ���α׷� �ۼ�
 */
public class ����6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=(int)(Math.random()*2);
		int no=(int)(Math.random()*26)+65;
		char c=' ';
		
		if(i==0) //0�̸� �빮�� ���
		{
			c=(char)no;
		}
		else //1 ������ �ҹ��� ���
		{
			c=(char)(no+32);
		}
		
		System.out.println("c="+c);
		
		if(c>='A' && c<='Z')
			System.out.println(c+"�� �빮��");
		else
			System.out.println(c+"�� �ҹ���");

	}

}
