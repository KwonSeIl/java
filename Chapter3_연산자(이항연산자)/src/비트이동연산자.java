/*
 *  ��Ʈ�̵�������(<<:����, >>:������)
 *    10<<3 ==> 1010(000) => 1010000=>64+16=80
 *    ------10*2^3(8) = 10*8 = 80
 *    
 *    10>>3 ==> 1010 =>> 1 => 1
 *    			 ---����
 *    
 *    39<<2 ==> 100111(00) => 10011100 (39*4) =>4+8+16+128= 156
 *    39>>2 ==> 100111 => 1001(39/4) => 8+1=9
 */
public class ��Ʈ�̵������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10<<3);
		System.out.println(10>>3);
		System.out.println(39<<2);
		System.out.println(39>>2);

	}

}
