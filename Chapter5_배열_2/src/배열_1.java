/*
 *   1. �迭 
 *      ���� ���������� ��� ���� (�����͸� ��� ���) 
 *      Object[] aaa={"aaa",10,10.5,'A',true} ==> for
 *      *** ���α׷� 
 *          1) ���� (������ ����)
 *          2) ��ɹ� 
 *             int a=10;  ==> ��ɹ� (a��� ������ 10�� �����϶�)
 *            ****** �������� �����͸� ��� , �Ѱ��� �̸����� ������ �����͸� �����ϴ� ���� ���ϴ�
 *            ---------------------------------------------------------------
 *            ----------- �����͸� ��Ƽ� ���� ==> ���� ��������(�迭),�ٸ� ��������(Ŭ����) => �������� Ŭ����
 *                                            ~VO , MovieVO
 *            ----------- ��ɾ ��Ƽ� ���� ==> �޼ҵ�
 *            --------------------------------------------------------------- Ŭ���� => �׼� 
 *                                            ~DAO , ~Service , ~Manager
 *            
 */
// 1. ������� �Է°��� �޾Ƽ� 2���� ��� ==> 16bit (32767)
// �迭 => 0������~~ , 15������
import java.util.Scanner;
public class �迭_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*Scanner scan=new Scanner(System.in);
        System.out.print("�����Է�: 0~32767���� >>");
        int input=scan.nextInt();
        // 0,1 ==> 16
        int[] binary=new int[16]; //0���� �ʱ�ȭ
        // ó�� => 0 , ������ => 15
        int index=15;// 15 , 14....
        while(true)
        {
        	binary[index]=input%2;
        	input=input/2;// 1/2=0
        	if(input==0)
        		break;
        	
            index--;
        }
        
        // ��� 
        for(int i=0;i<binary.length;i++)
        {
        	if(i%4==0 && i!=0)
        		System.out.print(" ");
        	System.out.print(binary[i]);
        }*/
	}
	
	static void toBinary()
	{
		Scanner scan=new Scanner(System.in);
        System.out.print("�����Է�: 0~32767���� >>");
        int input=scan.nextInt();
        // 0,1 ==> 16
        int[] binary=new int[16]; //0���� �ʱ�ȭ
        // ó�� => 0 , ������ => 15
        int index=15;// 15 , 14....
        while(true)
        {
        	binary[index]=input%2;
        	input=input/2;// 1/2=0
        	if(input==0)
        		break;
        	
            index--;
        }
        
        // ��� 
        for(int i=0;i<binary.length;i++)
        {
        	if(i%4==0 && i!=0)
        		System.out.print(" ");
        	System.out.print(binary[i]);
        }
	}

}
