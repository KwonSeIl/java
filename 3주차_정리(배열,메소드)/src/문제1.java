import javax.swing.plaf.basic.BasicSplitPaneDivider;

import java.io.InvalidClassException;

/*
 * �� ������ ������ ����� ���ϴ� �޼ҵ带 �����Ͻÿ�(�Ǽ�)
 * ----�Ű�����	-----������
 */

import java.util.Scanner;
public class ����1 {
	//���� ���� ==> ����(String) ==> 7,9 => 79
	//static double div(int a,int b) ==> �ݵ�� �Ǽ��� ����
	static String div(int a,int b) //260page => ��ȿ�� �˻� 
	{
		String result=""; //����ó��(8��)
		if(b==0)
			result="0���� ���� �� �����ϴ�.";
		else 
			result=String.valueOf(a/(double)b); //������� ���ڿ��� ���� 
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("ù ��° ���� �Է�:");
		int a=scan.nextInt();
		System.out.print("�� ��° ���� �Է�:");
		int b=scan.nextInt();
		
		//����� �ޱ�
		String result=div(a, b);
		System.out.println(result);

	}

}
