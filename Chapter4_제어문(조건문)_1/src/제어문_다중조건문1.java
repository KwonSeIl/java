/*
 * 	�������ǹ�(�ش� ���ǹ� 1���� ����) -> 141page
 * 	 1) ����
 * 	  if(���ǹ�)
 * 	  {
 * 		���� true�϶��� �����ϴ� ���� ---> ����
 * 			��false
 * 
 * 	  }
 * 	  else if(���ǹ�)
 * 	  {
 * 		���� true�϶��� �����ϴ� ���� ---> ����	
 * 			��false
 * 	  }
 *    ...
 * 	  else
 * 	  {
 * 		//���� ����
 * 		�ش� ���� ���� ��� ������ ����
 * 	  }
 * 
 * 	1~100������ ������ 3�� ���, 5�� ���, 7�� ��� ���
 *    			===================> ���� ���ǹ� 
 *    
 */

public class ���_�������ǹ�1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=(int)(Math.random()*51)+50; //0~100 ����
		//		 	  ------------------0.0~100.0 =>0~100
		int eng=(int)(Math.random()*51)+50;
		int math=(int)(Math.random()*51)+50;
		
		int avg=(kor+eng+math)/3;
		
		char hakjum='A';
		if(avg>=90)
			hakjum='A';
		else if(avg>=80)
			hakjum='B';
		else if(avg>=70)
			hakjum='C';
		else if(avg>=60)
			hakjum='D';
		else
			hakjum='F';
		// if ������ ��� �� -> ������ ����(�������ǹ� ������), �� ���� ����(�������ǹ�)
		
		System.out.println("����:"+kor);
		System.out.println("����:"+eng);
		System.out.println("����:"+math);
		System.out.println("����"+hakjum);
	}

}
