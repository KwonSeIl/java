
public class 문제20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12;                
		System.out.println("num : " + num); //12                                
		num = num + 3;                
		System.out.println("num : " + num);     //15                           
		num += 3;        //연산 속도가 더 빠름, 메모리에 직접 연산 수행                
		System.out.println("num : " + num);         //18                      
		 num -= 5;        //num = num - 5;                
		System.out.println("num : " + num);       //13                         
		num *= 2;        //num값 2배 증가               
		System.out.println("num : "+ num);       //26                         
		num /= 2;        //num값 2배 감소               
		 System.out.println("num : " + num); //13


	}

}
