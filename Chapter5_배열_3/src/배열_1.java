/*
 *   �迭 ���� , �ʱ�ȭ , for
 *   �����Ͱ� ���� : �Ϲ� for , ������ ��� : forEach
 *               -------- back        -------- front
 *               
 *   1) ������ ���� 
 *   2) ������,��� 
 *   3) ����� ��� 
 */
public class �迭_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ���ĺ��� ���� ==> ��� 26 
		char[] alpha=new char[26];  //  '\u0000'
		/*
		 *    new ==> �޸� ������� Ȯ�� 
		 *    int ====> 0
		 *    long ===> 0L
		 *    float ==> 0.0F
		 *    double ==> 0.0
		 *    char ==> '\u0000'
		 *    boolean ===> false
		 */
		// �迭�� ���� ���� 
		// �迭 ==> �ε����� �̿��Ѵ� ==> int (0)
		char c='A';
		for(int i=0;i<alpha.length;i++) // �迭 ���� �ʰ��� �����߻� ==> ���������� ���ؼ� length
		{
			alpha[i]=c++;
		}
		// ������ �� �ִ� 
		// ��� 
		for(char ch:alpha) // �迭(����) , �÷���(����)�� ����� ����
		{
			System.out.print(ch+" ");
		}
		
	}

}