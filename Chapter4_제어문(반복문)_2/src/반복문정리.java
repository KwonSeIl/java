/*
 * 	�ڹ� / ����Ŭ / JSP / Spring / JavaScript(Ajax, VueJS, ReactJS)
 * 										 --------------------javascript ���̺귯��
 * 	--------------------------------------AWS
 * 		����Ŭ <==> �ڹ�(JDBC=>MyBatis,JPA) =>JSTL/Thymeleaf(VueJS) �����ϴ� �κ� �ٽ�
 * 												v-for,	th:each
 * 												v-if,	th:if 
 * 	�ڹ� / ����Ŭ / JSP / Spring / JavaScript(Ajax,HTML5/CSS,AWS) ==> ������
 * 	---------------------------------------------------------------------------
 * 	156~157page: for
 * 		=> �ݺ�Ƚ���� �˰� �ִ� ���� (ȭ��UI)
 * 		=> ����
 * 			= �ʱⰪ
 * 			= ���ǽ�
 * 			  ���� ����==> Ƚ��
 * 			= ������(++,--) => ��Ű�� ����
 * 			  ������ ==> ���� ���Կ����� ��� +=,-=
 * 			  for(�ʱⰪ;���ǹ�;������)
 * 			  {
 * 				��³���
 * 			  }
 * 					   false-> ���� 
 * 			  �ʱⰪ ==> ���ǹ� ==> ��� ���� ==> ������
 * 						^ true   			|
 * 						|--------------------	
 * 	167~168page: while
 * 		=> �����ͺ��̽�, Ƚ���� �𸣴� ����
 * 		=> ������) ���ǹ� ���� �Ұ� 
 * 		�ʱⰪ
 * 		while(���ǽ�) --> ���ѷ���
 * 		{
 * 			�ݺ����๮��
 * 			������
 * 		}
 * 	
 * 		----------------
 * 		while(treu) --> ó������ ���ư���
 * 		{
 * 			�ݺ����๮��
 * 			if()
 * 			{
 * 				���� ����
 * 			}
 * 		}
 * 	175page: break ==> switch~case, �ݺ��������� ��� ����, break�� �ִ� �ݺ����� ��� ���� 
 * 						=> �ݺ����� ����(for,while)
 * 	176page: continue ==> �ݺ��������� ��� ����, continue�� �ִ� �ݺ����� ���� ���� 
 * 						=> Ư���κ��� ���� �� ��, ó������ �ٽ� ������ �� 
 * 						=> for->���������� �̵�. while,do~while->���ǽ����� �̵� 
 */
public class �ݺ������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String msg="Hello java";
		System.out.println(msg);
		for(int i=msg.length()-1;i>=0;i--)
		{
			System.out.print(msg.charAt(i));
		} */
		int a=10;
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j==2)
					break;
			}
		}
		//i=1,j=1,i=2,j=1
	
	
	}

}
