/*
 * 	��������: &&, || ==> ������� �׻� boolean(true/false)
 * 	 		(����) && (����)
 * 			----     ----
 * 			  |        |
 * 			  ----------
 * 				   |&&, ||
 * 				 ����� ����
 * 			&&: ����(���� �ΰ��� true�� ��츸 true)
 * 			(����) || (����)
 * 			||: ����(���� �� �Ѱ� �̻� true-> ture)
 * 	*** &&: ������ �Ⱓ�� ������ �� ��� 90~100 A
 *  *** ||: ������ �Ⱓ�� �������� �� ���. 
 *  *** ȿ������ ���� ó�� *********
 *  
 *  ���� ���
 *    --------------------------------------------
 *  					&& 			||
 *    --------------------------------------------
 *     true true  		true		true		
 *    --------------------------------------------
 *     ture false		false		true
 *    --------------------------------------------
 *     false true		false		true
 *    --------------------------------------------
 *     false false		flase		flase
 *     
 *    &&������(����): �ΰ��� ������ true�� ��쿡�� true
 *     (����) && (����)
 *     ----
 *     false ========> false. �������� ������X-> �ӵ� ���� (ȿ����) 
 *     
 *    ||������(����): �ΰ��� ���� �߿� 1�� �̻� true�� ��� true
 *     (����) || (����)
 *     -----
 *      true ========> true. �������� ó������X -> ȿ������ ��� 
 *      
 */
public class ��������_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ȿ������ ����
		int a=10;
		int b=9;
		
		/*// boolean -> true/false
		boolean result=(a>b)&&++b==a; //false
		//				true ==> ����ó��
		//				false ==> ����ó��X ����� ���
		System.out.println(result);
		System.out.println("a="+a);
		System.out.println("b="+b);*/
		
		boolean result=(a<b)||++b==a;
		//		true ==> ����ó��X
		//		false ==> ����ó��
		System.out.println(result);
		System.out.println("a="+a);
		System.out.println("b="+b);

	}

}
