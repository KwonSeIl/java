class Goods{
	String poster;
	String title;
	String text;
	int percent;
	int price;
	String first;
	int first_price;
	double avg;
	int review;
}
public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods goods=new Goods();
		goods.title="[美친특가]닥더키 종아리 공기압 마사지";
		goods.text="오늘도 수고한 나를 위한 공기압 마사지기!";
		goods.percent=60;
		goods.price=39900;
		goods.first="첫구매할인가";
		goods.first_price=37905;
		goods.avg=4.8;
		goods.review=16;
		
		System.out.println(goods.title);
		System.out.println(goods.text);
		System.out.println();
		System.out.println(goods.percent+"%"+" "+goods.price+"원");
		System.out.println(goods.first+goods.first_price+"원");
		System.out.println("★★★★★"+goods.avg+"("+goods.review+")");

	}

}
