/*
 * 	���� �Ѱ��� �����ϰ� ���ĺ� => �빮��, �ҹ���, ���ĺ� �ƴ��� Ȯ��
 * 	
 */
public class ���ǹ�_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='A';
		if(c>='A' && c<='Z') //�빮�ڶ��
		{
			System.out.println(c+"��(��) �빮���Դϴ�.");
		}
		if(c>='a' && c<='z') //�ҹ��ڶ��
		{
			System.out.println(c+"��(��) �ҹ����Դϴ�.");
		}
		if(!(c>='A' && c<='Z' || c>='a' && c<='z')) //���ĺ��� �ƴ϶��
		{
			System.out.println(c+"��(��) ���ĺ��� �ƴմϴ�.");
		}
				

	}

}
