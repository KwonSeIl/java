/*
 * 	for/while
 * 	A~Z까지 출력
 * 	--- for/while ==> 패턴이 있어야 함(수열)
 * 	AAABCCCDDDFUION -> 패턴X -> 루프 못돌림
 * 	1 3 5 7 9 11... -> O
 * 	112333458999000 -> X
 */
public class 반복문_for2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char ch='A';ch<='Z';ch++)
		{	
			System.out.print(ch+" ");
		}
		
		System.out.println();
		char ch='A';
		while(ch<='Z')
		{
			System.out.print(ch+" ");
			ch++;
		}
	}

}
