/*
 * 	while (167page)
 * 	------> ���ѷ��� ��뿡 ���� ����(�����ͺ��̽����� ���� ����)
 *  Ư¡
 *   1) ���������� ���� 
 *    ����) �ʱⰪ
 *    	  while(���ǽ�) : ������ true�� �� {}�ݺ�, false ���� 
 *    	  {
 *    		�ݺ����๮��
 *    		������
 *    	  }
 *    	  ==>for(�ʱⰪ;���ǽ�;������)
 *    			�ݺ� ���๮�� 
 *    ������)
 *    		for(;;) ==> while(true)
 *    		while() ==> �ݵ�� ���ǹ��� �����ؾ� �� 
 *    			 --����(�񱳿�����,��������,����������), true/fasle
 */
public class �ݺ���_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A-Z, Z-A
		char c='A';
		while(c<='Z') 
		{
			System.out.print(c+" ");
			c++;
		}
		//Z+1 ==> [
		
		System.out.println();
		c='Z'; //�ʱ�ȭ
		while(c>='A') 
		{
			//�빮�� �ҹ��� ==>32 ���� 'A'=65 'a'=97
			System.out.print(c+" ");  //�ҹ���-> ((char)(c+32)+" ")
			c--;
		}
		System.out.println();
		int i=1;
		while(i<=100) 
		{
			i++;
		}
		System.out.println("i="+i);

	}

}
