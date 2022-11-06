/*
 *  단항연산자 
 *   1. 증감연산자: ++,--
 *   	++: 값을 1 증가(무조건 증가)
 *   	--: 값을 1 감소(무조건 감소)
 *   	 1) 전치 연산자
 *   		++a ==> 다른 변수에 대입시 => 먼저 증가 후 대입
 *   				b=++a ==> b=a
 *   				  ---순서1
 *   				--순서2
 *   	 2) 후치 연산자 
 *   		a++ ==> 다른 변수에 대입시 => 대입 먼저 한 후 나중에 증가
 *   				b=a++
 *   				---순서1
 *   				  ----순서2 
 *   2. 부정연산자: ! => boolean만 사용 가능(treu => false, false =>true)
 *   3. 형변환연산자: (type)
 *   	자동형변환 => 변수에 값을 대입,연산처리 시 
 *   			  int a='A';
 *   			  double d=10;
 *   			  int + double = double
 *   			  char + char = int
 *   
 *   	강제형변환 ==> 라이브러리에서 데이터 추출 -> 강제로 변경 
 *   		(double)10 => 10.0
 *   		(int)'A' => 65
 *   		(char)65 => 'A'
 */
public class 단항연산자정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.out.println("1" + "2"); System.out.println(true + "");
		  System.out.println('A' + 'B'); System.out.println('1' + 2);
		  System.out.println('1' + '2'); System.out.println('J' + "ava" );
		 

	}

}
