/*
 * 	���� 6�� ���� -> �� ���ϱ� 
 *  --1~100;
 */
public class �ݺ���_while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		/*
		int a=(int)(Math.random()*100)+1; //1~100 ������ ���� �� �� ����
		sum+=a;
		a=(int)(Math.random()*100)+1; //1~100 ������ ���� �� �� ����
		sum+=a;
		a=(int)(Math.random()*100)+1; //1~100 ������ ���� �� �� ����
		sum+=a;
		a=(int)(Math.random()*100)+1; //1~100 ������ ���� �� �� ����
		sum+=a;
		a=(int)(Math.random()*100)+1; //1~100 ������ ���� �� �� ����
		sum+=a;
		a=(int)(Math.random()*100)+1; //1~100 ������ ���� �� �� ����
		sum+=a;
		
		System.out.println("sum="+sum); */
		
		int i=1;
		while(i<=6) 
		{
			int a=(int)(Math.random()*100)+1;
			//a������ while �� �� ����ø��� ���ο� ������ 
			System.out.println(i+". "+a);
			sum+=a;
			i++;
		}//a�� �޸𸮿� ���ؼ� �ڵ� ���� 
		//System.out.println("a="+a); -> �����߻� 
		System.out.println("sum="+sum);
		/*
		 * 	int=1; --->�� �־�� ���� �ȳ� 
		 * 	for(int i=1;i<=100;i++)
		 * 	{
		 * 	}
		 * 	system.out.println("i="+i) => ����
		 */

	}

}
