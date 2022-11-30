/*
 *   컬렉션 ==> java.util.* ==> 668page
 *   데이터를 수집 ==> ArrayList
 *   데이터 전송 ==> Map
 *   데이터 중복 제거 ==> Set
 *   --------------------
 *   	List
 *   		ArrayList
 *   			= 배열 기반(인덱스 번호를 가지고 있음) => 순차적으로 생성 
 *   										  -----------
 *   			= 단점) 추가나 삭제 시 속도가 느려짐
 *   			= 순차적으로 추가할 때는 컬렉션 중 가장 빠름
 *   			  ----------------------------
 *   			= 데이터에 접근하는 접근성이 뛰어나다
 *   			  ------------------------
 *   			*** 순서를 가지고 있다 / 중복데이터를 허용
 *   			*** 데이터베이스 연동 시 가장 많이 사용되는 컬렉션 
 *   			*** 주요기능: 
 *   				add():추가 
 *   				get():읽기 
 *   				size():저장개수
 *   				isEmpty():데이터존재 여부
 *   				clear():전체삭제
 *   				*** 크롤링 
 *   				 
 *   		Vector: 동기화(네트워크에서 주로 사용) 
 *   				Vector의 단점을 보완 => ArrayList임 (그래서 ArrayList가 주로 사용됨)
 *   		LinkedList: 연결기반(메모리 크기가 큼 => 다음에 있는 데이터 주소와 본인 데이터 주소를 가지고 있기 때문)
 *   					데이터 추가, 삭제시에 속도가 빠름. But 데이터에 대한 접근성이 낮음 
 *   				*** 메소드가 동일 (ArrayList와) 
 *   		===========> List list=new ArrayList()
 *   					list=new LinkedList()
 *   					list=new Vector()
 *   	Set
 *   		HashSet: 중복이 없는 데이터 저장, 순서가 존재하지 않는다
 *   				주요기능) add,get,remove,isEmpty,clear
 *   				=> List에서 중복된 데이터를 제거할 때 많이 사용 
 *   	Map
 *   		HashMap: (key,value) 동시에 저장됨
 *   				key는 저장된 값을 읽을 때 사용
 *   				key는 중복할 수 없음
 *   				value는 중복 가능 
 *   				주요기능) put(추가), get(값 읽기), isEmpty(), clear() 
 *   	Porperties: 파일로 만들어진다
 *   				load(): 파일 읽기, getProperty():파일에서 데이터 읽기
 *   				setProperty(): 파일에 저장할 내용 세팅(설정)
 */
public class Collection_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
