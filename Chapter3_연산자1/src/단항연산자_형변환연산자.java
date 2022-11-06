/*
 *  형변환연산자: (type)
 *  		  -----데이터형
 *  		  (int),(double),(char)...
 *  		  ----2byte
 *  
 *  		크기
 *  		byte < char < int < long < double (float, short)
 *  		----------------------------------> boolean은 형변환 할 수X => 사용자정의 데이터형(class)
 *  		1) 실수 -> 정수로 변환
 *  			(int)10.5 -> 10
 *  		2) 정수 -> 문자로 변환
 *  			(char)65 -> 'A'
 *  		3) 10 -> 10.0 =======>사용거의X, 자동형변환 가능하기 때문
 *  			(double)10 -> 10.0 ==> double d=10; =>d=10.0 저장
 *  		4) 10.5 + 10.5 ==> 21.0
 *  			(int)10.5+(int)10.5 ==> 20
 * 				---------  --------
 * 					10	 +   10  
 *  			(int)(10.5+10.5) ==> 21
 *  		  ==> 최우선순위연산자 이용: ()
 *  
 *  			서울시 강남구 역삼동
 *  			String addr="서울 강남구 역삼동" ==>char[]
 *  			
 */
public class 단항연산자_형변환연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수 선언
		int a;
		//난수
		a=(int)(Math.random()*100)+1; //데이터값 넘겨줄 때 double형 많음 -> 정수형으로 변형
		//		-----------------1순서 => Math.random() ==> 0.0~0.99*100 => 0.0~99.0
		// ----2순서 ==>0~99
		//  					  --3 ==> 1~100사이 숫자
		
		System.out.println(a);
		
		char c;
		c=(char)((Math.random()*25)+65);
		//        ----------------0~24 + 65 = 65~89
		System.out.println(c); //대문자 
		
		char d='A';
		// char d1=(d+32); -> 에러
		char d1=(char)(d+32);
		System.out.println(d1); //소문자
		
		//char d='a';
		//char d1=(char)(d-32);
		//System.out.println(d1); 대문자로 변경
		
		//자동형변환
		// 다른 데이터형에 값을 대입
		int i='A'; // 'A'=>65로 변경
		long l=100; // long <= int (int는 long으로 변경) => l=100L
		int i2=(int)10.5;
		/*
		 * 변수 = 값							변수	=	값	
		 * --   --							---     --
		 * 큼 	작음 -> 자동변환=>upCasting		작음		큼 => 자동변환 불가능(강제변환) => Downasting(강제형변환)
		 * 
		 * 프로그램에서 필요시에 의해서 데이터형을 변경해서 사용 가능 
		 * ======================================
		 * 형변환: 외부에서 데이터 가지고 올 때(파일, 오라클, 라이브러리)
		 * 
		 * int a='A'; ==> int a=65(이것 선호) 
		 *  
		 * 
		 */
		int m=10;
		int n=3;
		System.out.println(m/n); // 정수/정수=정수(실수X)
		// ->System.out.println(m/(double)n);
		// ->System.out.printf("%.2f\n",m/(double)n);
		
		// 음수/양수 (-/+)
		int k=10;
		System.out.println(-k); // .(주소 접근지정 연산자), [](배열)
		
	}

}
