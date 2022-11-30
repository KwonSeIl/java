/*
 * 	578page => �÷���
 * 				---- ������ ��Ƽ� �޸� ����(�ڷᱸ��: �޸𸮿� ����� �����͸� ���� ����)
 * 				�÷��� �����ӿ�ũ: ǥ��ȭ(�����ϰ� ���)
 * 								|
 * 							�������̽� 
 * 						
 * 					Collection
 * 						|
 * 				-----------------
 * 				|		|		|
 * 			  List	   Set	   Map
 * 				|		|		|
 * 					  HashSet  HashMap
 * 		---------------------
 * 		|			|		|
 * 	***ArrayList  Vector  LinkedList
 * 		
 * 		int[]
 * 		index=0
 * 		---------------------------------
 * 		List: ������ ����, ������ �ߺ� ��� 
 * 			ArrayList, Vector, LinkedList, Stack, Queue:�ڵ�
 * 			=> �����ͺ��̽� ����, ��Ʈ��ũ ��������� ����, C��� ȣȯ
 * 				-------
 * 		----------------------------------------------
 * 		Set: ���� ����, ������ �ߺ� ������� ����
 * 			HashSet, TreeSet
 * 			------- �ߺ� ����
 * 		----------------------------------------------
 * 		Map: key, value => ������ ����
 * 			key�� �ߺ��� �� ����, value�� �ߺ� ����
 * 			put("id","admin")
 * 			=> ����(����) ISBN, session, cookie
 * 			=> Spring, MyBatis, JPA
 * 			=> HashMap, Hashtable, Properties
 * 		----------------------------------------------
 * 	
 * 		Collection(�ڷᱸ�� => CURD)
 * 		=> add(): ������ �߰�
 * 		=> set(): ������ ����
 * 		=> remove(): ������ ����
 * 		=> get(): ������ �б�
 * 		=> size(): ����
 * 		
 * 		ArrayList
 * 		--------- ����: �ε��� ��ȣ�� �ڵ����� ���� -> ���������� ����: ������ ������
 * 						=> Object -> ����ȯ
 * 						=> ������ �䱸
 * 							------ ���׸���
 * 							ArrayList<String> => Object(String)
 */
import java.util.*;
public class Collection_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        System.out.println(list);
        list=new Vector();
        list.add(1);
        list.add(2);
        System.out.println(list);
        list=new LinkedList();
        list.add(1);
        list.add(2);
        System.out.println(list);

	}

}
