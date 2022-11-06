/*
 *  산술연산자 => 산술변환***
 *  		  : 연산은 무조건 같은 데이터형이어야 연산처리가 됨
 *  						 -----
 *  			다른 데이터형이 연산되면 큰 데이터형으로 변형 후 연산처리를 함(자동형변환) 92page
 *  							  -------> 자동
 *  							  예)
 *  							   int + double = double
 *  							   --- double로 변경 -> double+double
 *  
 *  							   int+char = int
 *  								   ---- int로 변경 -> int+int
 *  							   *** int 이하 데이터형( byte, char)=> 결과값 int
 *  								char+byte =int
 *  								char+char=int
 *  								byte+byte=int
 *  
 *  							  작은 데이터형으로 변경후 연산처리 -> 강제
 *  							   double+int =int
 *  							   ------int로 변경 => (int)double+int
 *  		*** 여러개의 연산 되면 => 가장 큰 데이터형의 결과 가지고 옴
 *  			char + int +double = double
 *  			---- int
 *  			----------double ====> double+double
 *  
 *  			byte < char < int < long < float < double
 *  
 */
public class 산술연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int c='A'+'B';
		//System.out.println(c);
		byte b1=10;
		byte b2=20;
		byte b3=(byte)(b1+b2); // 결과값 int
		System.out.println(b3); // 오버플로우 발생할 수 있음 => 방지: int로 받아서 저장
		
		char c='A';
		int d=100;
		int k=c+d;
		// c=65 ==> 65+100=165
		System.out.println(k);
		
		//int m=10.5+10.5; -> 오류
		// m = 4byte, 10.5+10.5 = 8byte => 작은메모리에 저장 불가-> 오류 발생 (오른쪽에 있는 데이터가 작거나 같아야 함)
		int m=(int)10.5+(int)10.5;
		/*
		 *  (int)10.5 ==> 10 -> 소수점 지움
		 *  (int)10.5 ==> 10
		 *  10+10=20
		 *  (type) > 산술연산자보다 계산순서 높음
		 */
		int n=(int)(10.5+10.5); // 순위결정 시 사용
		// 지니뮤직, 멜론, Mnet ==> 
		/*
		 *  (): 최우선 순위 ==> 10.5+10.5 = 21.0
		 *  (int)21.0 = 21
		 */
		System.out.println("m="+m);
		System.out.println("n="+n);
		

	}

}
