import java.util.Arrays;

// 5�� ������ ������ ������ ==> ���� / ���  ==> 196
// ���� ==> 3���� �л� ����,���� ,���� ==> ����/���/���� ==> ���
// ���� �߱� ���� 

public class �迭����_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] score=new int[5];//���� 
        for(int i=0;i<score.length;i++)// �ʿ��� ���� ����
        {
        	score[i]=(int)(Math.random()*71)+30;//30~100
        	//              0~79 ==> 30~100
        }
        System.out.println(Arrays.toString(score));
        // ���� / ��� 
        int total=0;
        //double avg=0.0;
        for(int i:score)
        {
        	total+=i;
        }
        // ���
        System.out.println("����:"+total);
        System.out.printf("%.2f\n",total/(double)score.length);
	}

}