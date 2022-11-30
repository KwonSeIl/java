package com.sist.genrics;
/*
 * 	Generics
 * 	-------- 1.5 도입
 * 	1. (ArrayList, Vector, Map, Set) 데이터를 가지고 올 때 반드시 형변환을 해야 한다
 * 		=> 다른 데이터형을 첨부할 때 오류 발생하는 것 방지
 * 	2. 데이터형이 고정(지정된 데이터면 사용이 가능하게 만든다 ==> 타입의 안정성)
 * 	3. 데이터형을 명시하기 때문에 가독성이 좋다
 * 	4. 형변환을 할 필요가 없다(지정된 데이터형으로 모든 메소드, 매개변수, 리턴형이 변경) => 간결한 코드 가능 
 * 	5. 사용법
 * 		ArrayList<type>
 * 				  ----- 클래스형 (기본형은 사용할 수 없음)
 * 		=> 문자열
 * 		ArrayList<String> list=new ArrayList<String>();
 * 		=> 정수형
 * 		ArrayList<int> list=new ArrayList<int>(); ====> 오류(기본형 들어가 있기 때문)
 * 		ArrayList<Integer> list=new ArrayList<Integer>(); => 기본형은 Wrapper
 * 		=> 사용자 정의클래스
 * 		ArrayList<Sawon> list=new rrayList<Sawon>();
 * 		ArrayList<String> list=new ArrayList<Double>(); ===> 오류
 * 		=> 와일드 카드
 * 		ArrayList<?> list=new ArrayList<String>();
 * 		ArrayList<?> list=new ArrayList<Integer>();
 * 	6. 사용법_2
 * 		T => 임시변수(클래스형)
 * 		E => Element:요소(클래스형)
 * 			ArrayList<E>
 * 		K => key
 * 		V => value
 * 		Map<K,V> ==> Map<String, Object
 * 		Set<E> ==> Set<Music>
 * 		==> 전체 Default (Object) ==> 어떤 데이터가 대입되어도 상관 없음
 * 		==> 필수: 저장된 값을 지정 
 * 		class Box<T>
 * 		{
 * 			T box;		==> T값을 지정하지 않는경우: Box box=new Box(); -> T는 default Object
 * 			void setBox(T box)
 * 			{
 * 				this.box=box;
 * 			}
 * 			T getBox()
 * 			{
 * 				return box;
 * 			}
 * 		}
 * 
 * 		Box<String> box=new Box<String>(); => T(String으로 변환)
 * 		Box box=neew Box(); => T(Object)
 * 		class Box<String>
 * 		{
 * 			String box;
 * 			void setBox(String box)
 * 			{
 * 				this.box=box;
 * 			}
 * 			T getBox()
 * 			{
 * 				return box;
 * 			}
 * 		}
 * 
 */
import java.util.*;
class Music
{
	
}
public class MainClass_제네릭스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 제네릭스 타입은 지정과 동시에 전체 메소드의 리턴형, 매개변수를 한번에 통일
		// 사용자 정의클래스도 가능
		ArrayList<Music> list=new ArrayList<Music>(); //Object ==> 리턴형, 매개변수가 지정된 데이터형으로 변경
		//											-----------
		// 배열 => 명시 String[], Music[]
		// 제네릭스: 데이터형을 통일화 -> 사용 쉽게 만든 기능
		/*
		 * list.add("홍길동"); list.add("박문수"); //list.add(10); //=> 오류 발생
		 * 
		 * for(int i=0;i<list.size();i++) { String str=(String)list.get(i);
		 * System.out.println(str); }
		 */

	}

}
