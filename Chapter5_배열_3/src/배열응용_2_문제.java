import java.util.Arrays;

// A~Z������ ���ڸ� 10�� ���� ==> ���� ū��,���� ���� �� ��� 
public class �迭����_2_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char[] alpha=new char[10];
        for(int i=0;i<alpha.length;i++)
        {
        	alpha[i]=(char)((Math.random()*26)+65);
        }
        System.out.println(Arrays.toString(alpha));
        //�ʱ�ȭ
        char max='A';
        char min='Z';
        for(char c:alpha)
        {
        	if(max<c)
        		max=c;
        	else if(min>c)
        		min=c;
        }
        // �ʿ��� �����͸� ã�� ���� ���� 
        System.out.println("���� ū ����:"+max);
        System.out.println("���� ���� ����:"+min);
        // ã�� ������ ��� 
        /*
         *   �����͸� ������ ���� 
         *   --------------- �� (�ʱ�ȭ)
         *   1) ã�� 
         *   2) ���� ����(sort)
         *   3) ��� 
         */
	}

}
