import java.util.Arrays;

/*
 *   1. ���� 
 *      ���ĺ� �빮�� ��ü�� ���� ==> ���� ==> ���۰� ���ÿ� �޸𸮸� Ȯ�� 
 *      char[] alpha=new char[26] ==> ' '
 *      ������ 10�� ���� 
 *      int[] arr=new int[10];  ==> 0
 *      �Ǽ��� 10�� ���� 
 *      double[] arr=new double[10]; ==> 0.0
 *      true/false => 10�� => ����� 
 *      boolean[] seat=new boolean[100] ==> false
 *      -------            ------------ �޸� ���� ���� ���� ==> �ڵ� �ʱ�ȭ 
 *   2. �ʱ�ȭ 
 *      1) ������� �ʱ�ȭ 
 *         ���� 5�� ���� 
 *         int[] arr={10,20,30,40,50};
 *         int[] arr=new int[5];
 *         arr[0]=10;
 *         arr[1]=20;
 *         ..
 *         ..
 *      2) ���� ==> �ζ�
 *         int[] arr=new int[5];
 *         arr[0]=(int)(Math.random()*100)
 *         ..
 *         ..
 *      3) �Է°� 
 *         int[] arr=new int[3];
 *         arr[0]=scan.nextInt()
 *         ..
 *         ..
 *      4) ���� ������ �б� : Jsoup ==> ����ó�� , String 
 *   3. ��� 
 *      �Ϲ� for ==> ������ ������ ���� (�ε�����ȣ�� �̿��ؼ� ����)
 *      for(int i=0;i<����;i++)
 *      {
 *         �տ������� ~~
 *      }
 *      for(int i=����-1;i>=0;i--)
 *      {         -----
 *         �ڿ������� ~~  ===> ���ٷ� ��� , ������ (����)
 *      }
 *      forEach(���� for)==> jdk1.5�̻� ==> readonly(�б�����)
 *      ==> ���� ������ 0������
 *      ��������[] arr=new ��������[10];
 *      ------
 *           =
 *          ------ 
 *      for(�������� ������:�迭��) : ��¿����� �ַ� ��� 
 *      {              ------ �迭�� ==> ���� ����� �����͸� �о� �´� 
 *      
 *      }
 *   4. �迭���� 
 *      �迭��.length
 *   ---------------------------- ���õ� ������?
 */
public class �迭_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // char[] alpha={'A','B'....}
		char[] alpha=new char[26];
		// �ʱ�ȭ 
		char c='A';
		for(int i=0;i<alpha.length;i++)// �迭 => �ݵ�� �ε����� �̿��ϰ� 
		{
			alpha[i]=c;
			c++;
		}
		// ��� 
		for(char ch:alpha)// ������ ������ �Ұ��� (�迭�� ����� ������)
		{
			//ch=(char)(ch+32);
			System.out.print(ch);
		}
		// ���� �ҹ��ڷ� ���� 
		System.out.println();
		// �迭�� �ִ� �����͸� ���� ==> �ε��� 
		for(int i=0;i<alpha.length;i++)
		{
			alpha[i]=(char)(alpha[i]+32);
		}
		/*
		 *   char c='A';
		 *   c='a'
		 */
		//System.out.println(alpha[0]);
		/*
		 *    �迭�� �ִ� ���� �����Ͱ� ���� ==> �ε����� �̿��Ѵ� => for�� �Ϲ� for
		 *    �迭�� �ִ� ���� �����Ͱ��� �д´� ==> for�� forEach (���� ������ ������ �Ұ���) readonly
		 *    ����)  Ŭ������ ���� ������ ���� 
		 */
		System.out.println();
		// ���� 30�� ���� (0,1,2)
		int[] arr=new int[30];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*3);
		}
		System.out.println(Arrays.toString(arr));
		// �󵵼� ���ϱ� (���)
		int a=0,b=0,d=0;
		for(int i:arr)
		{
			if(i==0) a++;
			else if(i==1) b++;
			else if(i==2) d++;
		}
		System.out.println("0=>"+a);
		System.out.println("1=>"+b);
		System.out.println("2=>"+d);
	}

}
