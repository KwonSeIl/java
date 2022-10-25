/*
 *  for(int i=1;i<=n;i++) ==>누적
 */

public class 문제11 {

	//갈색==>지역변수, 파랑색 ==> 멤버변수
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=(int)(Math.random()*100)+1; //범위
		int sum=0;//합
		System.out.println("범위:"+n);
		
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println("1~"+n+"까지의 합:"+sum);

	}

}
