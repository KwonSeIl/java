import java.util.Arrays;

import javax.xml.stream.events.Namespace;

/*
 * 	206page
 * 	���ڿ� �迭: ���ڿ� �������� ������ �� �ִ� ����. "���ڿ��� �ּҴ�!"
 * 	 1) ����
 * 		���1: String[] �迭��;
 * 		���2: String �迭��[];
 * 	 2) �ʱ�ȭ
 * 		���1: String[] �迭��=new String[10]; ==> String�� �ʱⰪ�� null: �ּ� ���� ����
 * 		���2: String[] �迭��={"ȫ�浿","�̼���","������"}
 * 		
 */
public class ���ڿ��迭_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("ȫ�浿".length()); �� ����
		String[] names= {"ȫ�浿","�̼���","������","�ڹ���","�����"};
		//���
		for(int i=0;i<names.length;i++)
		{
			System.out.print(names[i]+" ");
		}
		System.out.println();
		for(String name:names)
		{
			System.out.print(name+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(names));

	}

}
