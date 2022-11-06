import java.util.Arrays;

import javax.xml.stream.events.Namespace;

/*
 * 	206page
 * 	문자열 배열: 문자열 여러개를 저장할 수 있는 공간. "문자열은 주소다!"
 * 	 1) 선언
 * 		방식1: String[] 배열명;
 * 		방식2: String 배열명[];
 * 	 2) 초기화
 * 		방식1: String[] 배열명=new String[10]; ==> String의 초기값은 null: 주소 없는 상태
 * 		방식2: String[] 배열명={"홍길동","이순신","강감찬"}
 * 		
 */
public class 문자열배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("홍길동".length()); 도 가능
		String[] names= {"홍길동","이순신","강감찬","박문수","김두한"};
		//출력
		for(int i=0;i<names.length;i++)
		{
			System.out.print(names[i]+" ");
		}
		System.out.println();
		for(String name:names)
		{
			System.out.print(name+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(names));

	}

}
