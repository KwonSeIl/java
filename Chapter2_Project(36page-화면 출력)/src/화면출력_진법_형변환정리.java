/*
 *  41~84page
 *  ---------> 화면출력 / 키보드 입력값 / 형변환 공부
 *  화면출력
 *    System.out.println(): 가장 많이 사용되는 화면출력기능(출력 하고 다음줄로 이동해서 출력)
 *    System.out.print(): 다음줄 이동하지 않고 출력. 바로 옆으로 출력  
 *    System.out.printf(): 출력 형식 만들어서 출력(서식 있는 출력)
 *    	=>데이터형 출력 종류: %d(정수),%f(실수),%c(문자),%s(문자열)=> %o(8진법),%x(16진법),%b(boolean)
 *    	=>%5d: 출력할 때 5칸 확보 
 *    			ex. 300 => ()()(3)(0)(0): 오른쪽 정렬
 *    				%-5d=> (3)(0)(0)()() : 왼쪽 정렬 
 *  화면입력
 *    Scanner 사용방법 (40page) =>단점: 도스에서만사용(문법) 
 *    	1) 클래스: 메모리 저장
 *    	 Scanner scan=new Scanner(System.in) =>System.in:키보드 입력값 
 *    				  ---클래스를 메모리에 저장시 반드시 사용(동적메모리 할당)
 *    					 초창기 malloc() ==> new
 *    					 초창기 free() ==> delete: GC	
 *    	2) 클래스가 가지고 있는 기능 활용
 *    	 Scanner가 가지고 있는 기능:
 *    	  정수값 받을 경우: nextInt()->입력된 정수값 읽음 (메소드: 한가지 기능을 가지고 있음) 
 *    	  문자열 받는 경우: next()
 *    	  논리형 받기: nextBoolean()
 *    	  실수형 받기: nextDouble()
 *    	--------------------------------java.io(BufferedReader)==>예외처리 반드시 해야함
 *  진법
 *   표현법: 8진법(0~), 16진법(0x~)
 *   => 2진법: 0,1 
 *   	8진법: 0~7
 *   	16진법: 0~15 => 10(a)~15(f)=> color지정 0xFF=>255(16^1*15+16^0*15)white
 *   => 음수표현(2의 보수) ==> 양수보다는 1이 큼 
 *   						70 ==> -71(~:반전 연산자)
 * ***형변환(UpCasting, DownCasting)
 * 		   ---------  -----------
 * 	   데이터형 크거나 변환   데이터형을 작게 만듦 
 * 		----------- int ==> double : 자동형변환 
 * 					 ------------ int => char
 * 		1)UpCasting(자동형변환) 
 * 		 변수 초기값
 * 		 double d=10 =>10을 실수로 변경해서 10.0저장
 * 		 ------ ---- (int) d=10.0
 * 		 int a='A';
 * 				-- int변경한 다음 대입 => int a=65
 * 		 =========> 변수의 데이터형 >= 값
 * 		 'A' 
 * 		   => char, int, long, float, double: 가급적이면 같은 데이형으로 받는 게 좋음
 * 		 	   'A'   65   65L   65.0F   65.0
 * 		 10.5F
 * 		   => float, double
 *   		   10.5F  10.5
 * 		 10.5
 * 		   => double
 * 			   10.5
 * 		 10
 * 		   => int, float, long, double
 * 			   10   10.0F  10L   10.0 
 * 		 65
 * 		   => int, char(예외)
 * 			   65   'A'
 * 		 연산자
 *  
 *  자동형변환
 *  강제형변환
 *  ======> 연산에 등장   
 */
public class 화면출력_진법_형변환정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * char c=65; System.out.println(c);
		 */
		int a=(int)10.5; //소수점 지움->10
		System.out.println(a);
		a=(int)10.5F; //10
		System.out.println(a);
		a=(int)10L; //10 ==>강제형변환 단점: 오버플로우
		System.out.println(a);
		byte b=(byte)300;
		System.out.println(b);

	}

}
