//163page
/*
 * 	2*1=2 ---------- 9*1=9
 * 	-
 * 	-
 * 	2*9=18			9*9=81
 * 
 * 	줄수(i) -> 9줄
 * 	한줄에 출력하는 개수(j) -> 8
 * 	
 */
public class 반복문_중첩for5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("구구단 출력");
		
		for(int i=1;i<9;i++) //2*1~2*9
		{
			for(int j=2;j<=9;j++)
			{
				System.out.printf("%2d *%2d=%2d\t",j,i,j*i);
			}
			System.out.println();
		}

	}

}
