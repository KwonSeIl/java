/*
 *    182page 
 *    �迭 ==> �������� ������ �ϳ��� ���Ƽ� �����ϴ� ��Ȱ
 *    ------------> �����迭 , �������迭, ���� �迭 
 *                  ------ 
 *    �迭 
 *      ���� : ���� �������� �Ѱ��� �̸����� ���� (�ݺ����� ����ϱ� ����)
 *            ���������� �޸� ��ġ (�ε�����ȣ�� �̿��ؼ� ó���� ����)
 *      ���� : �������̴� ==> ������ (�÷���==> 12��)
 *            ���� ���������� ��Ƽ� ����
 *            ---------
 *            
 */
public class �迭_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*int a=80,b=70,c=50,d=60,e=100;
        int max=0;
        // if=> 5�� �ݺ� 
        if(max<a)
        	max=a;
        if(max<b)
        	max=b;
        if(max<c)
        	max=c;
        if(max<d)
        	max=d;
        if(max<e)
        	max=e;
        // ��� ==> 5�� �ݺ� 
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
        System.out.println("e="+e);
        System.out.println("max="+max);*/
		// ���� �����Ͱ� 3���̻� ==> �迭 
		int[] arr={80,70,50,60,100};
		/*
		 *     arr
		 *     -----            --------------------------------------------
		 *     100����              80       70       50      60      100
		 *     -----           |----------|---------|-------|-------|-----------
		 *                   100        104        108    112      116
		 *                   arr+0*4   arr+1*4      arr+2*4   arr+3*4   arr+4*4
		 *                       arr[0]     arr[1]     arr[2]  arr[3]  arr[4]
		 *                       ---           ---
		 *                       �迭��          �޸� ��ġ (�ε���)
		 *                                     ---------------- ���������� ���� ==> for
		 *                       �迭�� �������� 1���� ���� (�ε�����ȣ�� 0������ ����)
		 *                       ������ (�ε�����ȣ�� �ʰ��Ǵ� ������ �߻�)
		 */
		int max=0;
		for(int i=0;i<5;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("arr["+i+"]="+arr[i]);
		}
		System.out.println("max="+max);
	}

}
