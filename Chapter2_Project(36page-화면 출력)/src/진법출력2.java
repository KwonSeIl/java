/*
 *  2진법: 0,1
 *  8진법: 011,012...
 *  16진법: 0x~~
 *  -----프로그램(10진법 사용)
 *  
 *  165
 *  --- 2진법 변환
 *   128 64 32 16 8 4 2 1(0)
 *    1   0  1  0 0 1 0 1 =>10100101
 *   10100101 
 *   ---------8진법 변환
 *   	  ---- 5
 *     ---4
 *   --2
 *   =>0245 
 *   10100101
 *   --------16진법 변환
 *   	 ----5
 *   ----a
 *   =>0xa5
 *
 *  음수 표현 => 1~~
 *   10
 *    =>2진법: 00001010
 *    	1의 보수로 변환: 11110101
 *    	2의 보수:		+	    1 => 11110110
 *    	2의 보수 ==> 00001010
 *    			   ------
 *    			   11110110
 *     -------------------------------정보처리, 코테
 *  Application / 임베디드(모바일) / WEB
 *  							---초점 -> web에 필요한 자바    
 *  2장==>41page공부 
 *  	 42~71page ==> 스킵
 *  	 72page 공부 (형변환)
 *  
 *  형변환: int -> double
 *  	  double -> int
 *  	  char -> int, double 
 *  	  => 자동형변환, 강제형변환 (데이터형, 클래스) 
 *  		----------------------------
 *  		int + double 
 *  		---> double
 *  		=>double+double => double => 연산시에는 항상 큰데이터형으로 변경 => 연산 
 *  
 *  		char + int
 *  		----> int
 *  		=> int+int => int
 *  		===========================
 *   		변수에 값을 입력할 때 
 *   		 int a='A'
 *   				--> int로 변환(65) ==> 65
 *   		 변수 = 값
 *   		 --- 값보다 크거나 같아야 함 
 *   
 *   		 int a=10.5 -> 오류 => (int)10.5로 수정 (강제변환) 
 *   			   ----double 
 *   		 double d=10; ==> d=10.0
 *   		 double d='A' ==> d=65.0 ==> 자동으로 변환 
 *   		--------------------------------------
 *   		byte + char = int
 *   		byte + byte = int
 *   		=> int 이하 데이터형이 연산되면 int 
 *   		   ---- byte, short, char 
 *   
 *   		'A'+'B' ==>
 *   		--- ---
 *   		65	66 ==> 131
 *  			
 */
public class 진법출력2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.out.println(Integer.toBinaryString(165));
		 * System.out.println(Integer.toOctalString(165));
		 * System.out.println(Integer.toHexString(165)); System.out.println(~165); // ~:
		 * 음수출력
		 */
		byte b1=10;
		byte b2=20;
		//int b3=(byte)(b1+b2); /=>오버플로우 발생
		int b3=(b1+b2); // int, long, double, float
		System.out.println(b3);
	}

}
