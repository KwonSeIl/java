// 42page ~ 74page(����ȯ*****)
/*
 *  ����, �������� SQL�� �� �߿� => �Ӻ���� �� ����,���� ����. AWS��� FullStack(Back/Front end)
 *  															----�ڹ�,Jsp,Oracle,Spring
 *  																 -----Ajax,VueJs,ReactJs,NodeJs
 *  											-------Ŭ���� ��� 
 * �ڹ� ���� ���ι�� 
 *  1. ��������
 *  2. ������ => 3��
 *  3. ��� => 4��
 *  4. �޼ҵ� 
 *  5. Ŭ����(��ü����) => 6~7��
 *  6. ����ó��*** => 8��
 *  7. ���̺귯��***(�÷���,���׸���) => 11~12��
 *  8. IO => 15��
 *  
 *  -------------------------------------
 *  �ڹٿ��� ���� ǥ�� ���
 *   1) 10����: 10,20,30...
 *   2) 2����: 0,1
 *   3) 8����: 0~7 ==> 0~~
 *   4) 16����: 0~9 + 10(A),11(B),12(C),13(D),14(E),15(F) ==>0x~~
 *  
 *   27 ==> 2���� ��ȯ 
 *    32 16 8 4 2 1(0)
 *   	  1 1 0 1 1 => 11011
 *   11011
 *     --- 3
 *   -- 3
 *   =>033	
 *   
 *   11011
 *    ----11
 *   -1
 *   =>0x1B
 */
public class ������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.toBinaryString(27)); //2����
		System.out.println("0"+Integer.toOctalString(27)); //033 8����
		System.out.println("0x"+Integer.toHexString(27)); //0x1b 16����

	}

}
