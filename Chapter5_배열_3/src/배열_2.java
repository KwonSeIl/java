import java.util.Arrays;

// 1~100������ ������ 10���� ���� ==> �ִ밪,�ּҰ��� ���ϰ� ���� ��� (�ִ밪-�ּҰ�)
public class �迭_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(int)(Math.random()*100)+1;
        }
        // ��� 
        System.out.println(Arrays.toString(arr));
        // �ִ밪 , �ּҰ� 
        // �ִ밪 => ���� ���� ��
        int max=1; // arr[0]
        // �ּҰ� => ���� ū ��
        int min=100; // arr[0]
        /*
         *     a=1,b=2,c=3,d=4,e=5;
         *     max=1;
         *     if(max<a)
         *        max=a;
         *     if(max<b)
         *        max=b;
         *        --
         */
        for(int i:arr)
        {
        	if(max<i)
        		max=i;
        	else if(min>i)
        		min=i;
        }
        //
        int index=0,index1=0;
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]==max)
        	{
        		index=i;// �ε��� ��ȣ Ȯ�� 
        		//break;
        	}
        	else if(arr[i]==min)
        	{
        		index1=i;
        		//break;
        	}
        }
        /*int index1=0;
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]==min)
        	{
        		index1=i;// �ε��� ��ȣ Ȯ�� 
        		break;
        	}
        }*/
        System.out.println("�ִ밪:"+max+",���� ��ġ�� "+(index+1)+"�Դϴ�");
        System.out.println("�ּҰ�:"+min+",���� ��ġ�� "+(index1+1)+"�Դϴ�");
        System.out.println("�ִ밪�� �ּҰ��� ��:"+(max-min));
        
	}

}