import java.util.Arrays;
import java.util.Scanner;
/*
 *    1. ������ ���� : ���� , �迭 
 *    2. �ʱ�ȭ 
 *    3. ���� (����� ��û) ===> 
 *    4. ���� ����� ���   ===> 
 *    
 *    ���������� == ������ ���� === ��� (����,������ ,�����)
 *                 |
 *               �޼ҵ�ȭ 
 */
// => O , X ==> 10���� 
public class �迭_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char[] munje=new char[10];
        char[] user=new char[10];
        for(int i=0;i<munje.length;i++)
        {
        	int a=(int)(Math.random()*2);
        	if(a==0)
        		munje[i]='O';
        	else
        		munje[i]='X';
        }
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<user.length;i++)
        {
        	System.out.print((i+1)+"��° O,X�Է�:");
        	char dap=scan.next().charAt(0);
        	if(!(dap=='O' || dap=='X'))
        	{
        		System.out.println("�߸��� �Է��Դϴ�!!");
        		i--;
        		continue;// ���������� �ö󰣴� 
        	}
        	user[i]=dap;
        }
        System.out.println(Arrays.toString(munje));
        System.out.println(Arrays.toString(user));
        // Ȯ�� 
        int count=0;
        for(int i=0;i<user.length;i++)
        {
        	if(munje[i]==user[i])
        		count++;
        }
        System.out.println("����:"+count+"�� �Դϴ�");
	}

}