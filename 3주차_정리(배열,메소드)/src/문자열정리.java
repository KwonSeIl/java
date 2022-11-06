import java.util.Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/*
 * 	���ڿ��� �����ϴ� ��������
 * 	----------------- ''(char):���� �� �� ����, ""(String):���� ������ ���ÿ� ���� (char[] ==> ���� �ٷ�� ���� Ŭ������ ����)
 *						int => Integer, double => Double, boolean => Boolean
 *						������������ Ŭ������ ����(Wrapper)
 *						char[] => String
 *	=> String: ��������(���� ����� �������� �ּҰ� ������ ����)
 *	   ------
 *	   ����
 *		1) �Ϲ� ��������ó�� ���
 *			String s=""; ==> ���� ���� ��� 
 *			------ - --
 *			�������� ������ ��;
 *		2) Ŭ������ó�� ��� 	
 *			String s=new String(""); //���ο� �޸𸮸� ���� ���(new => �޸𸮰� �ٸ� �޸� ����)
 *		3) Ŭ���� ==> ���(�޼ҵ�)
 *			=> ��ȯ
 *				1) toUpperCase(): ���ڿ� �빮�ڷ� ��ȯ 
 *				2) toLowerCase(): ���ڿ� �ҹ��ڷ� ��ȯ
 *				***3) replace(): ������ ����(���ڿ�)�� ����
 *				***4) replaceAll(): ���Խ��� �̿��ؼ� ���� (�󵵼� ���ϱ�, AI ê��)
 *												    -------- �ϵ�, ����ũ
 *								 ---- ���ڿ��� ����(��õ,ũ�Ѹ� �� ���� ���)
 *								 ��) ���ְ�, ���ְ�, ���ִ�... => ����+
 *									ȫ.�� => ������ ���� ����-> ȫ�浿, ȫ�赿...
 *			=> ����
 *				***1) trim(): �¿쿡 �ִ� ���� ���� (����� �Է�)
 *				***2) substring(): ���ڿ��� �ڸ� ��쿡 �ַ� ���(...)
 *				3) concat(): ���ڿ� ����(+ ���=> ���� ����X)
 *			=> �˻�
 *				***1) StartsWith(): ���ξ�(�����ϴ� ���ڿ�) ==> ��(��Ű)��� 
 *				2) endsWith(): ���̾�(������ ���ڿ�)
 *				***3) contains(): ���� ���ڿ�(�ڹٽ�ũ��Ʈ -> SearchBar ���� �� ������)
 *				***4) equals(): ���� ���ڿ� ����(��ҹ��� ����) => ID,PWD ã�� 
 *			=> ��Ÿ
 *				***1) valueOf(): ��� ���������� ���ڿ��� ��ȯ 
 *				***2) toSting(): ���ڿ� ��ȯ 
 *				***3) length(): ���ڿ� ���� 
 *					
 */
public class ���ڿ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. ���ڿ� ���� 
		String name="ȫ�浿�Դϴ�";
		System.out.println("name:"+name);
		System.out.println("������ ����:"+name.length());
		char[] arr=name.toCharArray(); //char�� ��ȯ
		System.out.println(Arrays.toString(arr));
		String temp=String.valueOf(arr);  //char[] -> String���� ����
		System.out.println(temp);
				
		if(name.contains("ȫ")) //������ �Ǿ� ����-> true. �ȵǾ� ����-> false
		{
			System.out.println("�����ϰ� �ִ�.");
		}
		else
		{
			System.out.println("�������� �ʴ´�.");
		}
		System.out.println("=============================");
		if(name.startsWith("ȫ")) //������ �Ǿ� ����-> true. �ȵǾ� ����-> false
		{
			System.out.println("�����ϴ� ���ڿ��Դϴ�.");
		}
		else
		{
			System.out.println("�����ϴ� ���ڿ��� �ƴմϴ�.");
		}
		System.out.println("============================");
		if(name.endsWith("ȫ")) //������ �Ǿ� ����-> true. �ȵǾ� ����-> false
		{
			System.out.println("������ ���ڿ��Դϴ�.");
		}
		else
		{
			System.out.println("������ ���ڿ��� �ƴմϴ�.");
		}
			
	}

}
