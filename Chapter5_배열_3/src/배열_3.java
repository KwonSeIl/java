import java.util.Arrays;

public class �迭_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] lotto=new int[6];
        for(int i=0;i<lotto.length;i++)
        {
        	lotto[i]=(int)(Math.random()*45)+1; // 1~45
        	for(int j=0;j<i;j++) // ��ó�� �߻��� ���� ����
        	{
        		if(lotto[i]==lotto[j])
        		{
        			i--;// �������� �ʴ´� 
        			break;// �ٽ� 1�� ==> �ٽ� ���� �߻� 
        		}
        	}
        }
        System.out.println(Arrays.toString(lotto));
	}

}