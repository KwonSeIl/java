class Food{
	int fno;
	String[] poster;
	String title;
	double avg;
	String address1;
	String address2;
	String tel;
	String food;
	String price;
	String car;
	String time;
	String[] menu;
}
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food food=new Food();
		
		food.title="조점례남문피순대";
		food.address1="전라북도 전주시 완산구 풍남문2길 39 남부시장";
		food.address2="전라북도 전주시 완산구 전동3가 2-246 남부시장";
		food.tel="063-232-5006";
		food.food="탕/찌개/전골";
		food.price="만원 미만";
		food.car="무료주차가능";
		food.time="06:00-24:00";
		
		
		System.out.println(food.title);
		System.out.println();
		System.out.println("주소"+" "+food.address1+"\n"+food.address2);
		System.out.println("전화번호"+" "+food.tel);
		System.out.println("음식종류"+" "+food.food);
		System.out.println("가격대"+" "+food.price);
		System.out.println("주차"+" "+food.car);
		System.out.println("영업시간"+" "+food.time);

	}

}
