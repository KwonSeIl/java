/*
 * 	�ݺ����
 * 	 1) �ݺ��� ����: break
 * 	 2) Ư�� �κ��� ����: continue
 * 	 *** ������
 * 	  break;
 * 	  continue; ===> �ؿ��� �ҽ� �ڵ��� �� ��X
 * 
 * 	  ��) if(i<10)
 * 		 {
 * 			break;
 * 			System.out.println("a"); --> ���� �߻� 
 * 		 }
 * 
 * 		 break ===> �ݺ���, ���ù������� ��� ����. if�� �Ұ� => ��� ����
 * 		 continue ===> �ݺ����� �ִ� ��쿡���� ��� ���� => �����ϰ� ���� �ݺ��� ���� 
 * 
 * 		 while()
 * 		 {
 * 			break; ==> �ߴ�
 * 		 }
 * 
 * 		 for()
 * 		 {
 * 			break; ==> �ߴ�
 * 		 }
 * 	
 * 		 while(���ǽ�
 * 		 {
 * 			continue; ==> ���ǽ����� �̵� 
 * 		 }
 * 
 * 		 for(�ʱⰪ;���ǽ�;������)
 * 		 {
 * 			continue; ==> ���������� �̵� 
 * 		 }
 */
//break; 1~100���� ��� ==> 5���� ��� �� for�� �ߴ� 
public class �ݺ����_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++) //�Է°� => q,Q ==> ���� ESC ������ break
		{
			System.out.print(i+" ");
			if(i==5)
				break; //i=5�� ����
				//System.exit(0) -> ��� ���α׷� ���� 
			
		}
		System.out.println();
		
		int i=1;
		while(i<=100)
		{
			System.out.print(i+" ");
			if(i==5)
				break; //whil�� ���� ==> System.exit(0)
			i++;
		}

	}

}
