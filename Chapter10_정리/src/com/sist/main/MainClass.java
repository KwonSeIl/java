package com.sist.main;

/*
 *   1. 
 *      Calendar cal=(   Calendar.getInstance()                       ) 
 *      // �߻� Ŭ���� 
 *         1.�̿ϼ� Ŭ����(�ڽ��� �޸� �Ҵ��� �� �� ����) ==> new�� �̿����� ���Ѵ� 
 *         2.������ �ȵ� �޼ҵ带 ������ �ִ� (�߻�޼ҵ�)
 *         3.���� ��� 
 *           public abstract class ClassName
 *           {
 *             -----------------------------
 *              ������� (�ν��Ͻ�)
 *             -----------------------------
 *              ������ =-> �ʱ�ȭ ���� 
 *             -----------------------------
 *              ������ �޼ҵ� 
 *             -----------------------------
 *              ������ �ȵ� �޼ҵ� 
 *             -----------------------------
 *           } 
 *          4. �������� Ŭ������ ��� �Ѱ��� ��ü������ �����ؼ� ����� ���� 
 *          5. ���� ��Ӹ� �����ϴ� (extends) 
 *       // �߻� Ŭ���� Ȯ�� => �������̽� 
 *          1. �̿ϼ��� Ŭ���� 
 *          2. �޸� �Ҵ��� �� ���� 
 *          3. ���� ����� ���� (implements)
 *          4. ���� 
 *             public interface interfaceName
 *             {
 *                  *** ����,��� �޼ҵ�� public 
 *                  --------------------------
 *                    ����=> ����� ���� (�ݵ�� ���� ����)
 *                    (public static final) int a=10; 
 *                          
 *                  --------------------------
 *                    ������ �ȵ� �޼ҵ� 
 *                    (public abstract) void display();
 *                  --------------------------
 *                    ������ �� �޼ҵ� (default)
 *                    (public) default void display(){}
 *                  --------------------------
 *                    ������ �� �޼ҵ� (static)
 *                    (public) static void display(){}
 *                  --------------------------
 *             }
 *             
 *             ** �߻� Ŭ���� / �������̽� ==> �������̵� ���α׷� 
 *                                      ---------
 *                                  1) �޼ҵ�� ����
 *                                  2) �Ű����� ����
 *                                  3) ������ ���� 
 *                                  4) ���������� Ȯ�� , ��Ҵ� �� �� ����
 *                                  5) ------- �ݵ�� public���� �����Ѵ� 
 *             Calendar���� �ַ� ��� ==> ��� 
 *             = final int a=10; // ����� ����
 *             = static final int b=100; // ���
 *             Calendar.YEAR , Calendar.MONTH , Calendar.DATE , Calendar.DAY_OF_WEEK
 *             => ���� ������ get(int)
 *                ���� ������ set(int , int)
 *             => ������ ��� => �޷� , �Է��� , ���� , ������ , ������ (Date) => Calendar�� �����Ŀ� ��� 
 *         
		cal.set(  Calendar.YEAR    , year);
		cal.set(Calendar.MONTH,   month-1 ); // month�� 0������ ���� 
		cal.set(Calendar.DATE, 1);
		int week=cal.get(  Calendar.DAY_OF_WEEK  );
		int lastday=(      cal.getAuctualMaximum(Calendar.DATE))            );
		
		= ������ : �и� (��ɺ�) => ����ȭ�� ���α׷� (�ܶ��� ������ ó��) => �޼ҵ�
		         �������� (����,�߰�)
		         =======> �����丵
		= ����ȭ : �ӵ�(����) 
		         ������ => ������ 2�� (�̹��� , �ؽ�Ʈ) => + , StringBuffer => ����Ŭ (index) 
		= ���ռ�(������) : Ŭ���� ������ => �ٸ� Ŭ������ ���� 
		               ----------    ------------- ���ռ��� ���� ���α׷� 
		               new => ���ռ��� ���� ���α׷� (����) ==> ���÷��� 
		               A   B ===> display=>disp()
		               => B b=new B();
		                  b.display();
		                  
		               => AŬ������ BŬ������ ���� 
		               => ------------------- �ε� ���� ==> �̷��� �������� ���� ���α׷� (������)
		               => ������ => ���� 25 (�����ӿ�ũ)
		                  ������ ����Ʈ���� ==> ��û ==> ��� ���� ==> IoC ==> ��ƾ �Ŀ﷯ 
		                  OOP 
		               
		= ������ : �޼ҵ�� �Ѱ��� ���ɸ� �����ϰ� ����� (���뼺 , ����ó��)
		= ���뼺 : ��� , ���� 
		
		��ü��� 
		  1) getClass()
		  2) class
		  3) Class.forName()
		  4) new 
     2. Human h2=new Human().(  getClass()         ).
        		 getDeclaredConstructor().newInstance();
        h2.display();
        
        Human h3=Human.(class        ).getDeclaredConstructor().newInstance();
        
        h3.display();
        
        Human h4=(Human)Class.(  forName("Ŭ������")                ).
        		   getDeclaredConstructor().newInstance();
      3. startsWith ,endsWith , contains
      4. split 
      5. StringTokenizer st=(                            ) 
        System.out.println(            );// �ܾ� ����
        while(            ) // 
        {
        	System.out.println(           ); // �ܾ �о� �´� 
        }
        
        = split 
        = �ܾ �ڸ��� ��� => substring()
        
        
        Date / Calendar / SimpleDateFormat / DecimalFormat ==> String,format()
                         ---------------------------------- ����Ŭ���� ó��
        LocalDate , LocalTime , LocalDateTime ==> now
        
        -----------------------------------------------------------------------
                  Collection 
                     |
          ---------------------------------
          |             |                 |
         List         Set                Map
          |             |                 |
        **ArrayList   **HashSet         Hashtable
        Vector        TreeSet           ***HashMap
        LinkedList
          |
         Queue,Stack
         
       
        
 */
interface A
{
	public int max(int a,int b);
}
public class MainClass {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A aa=(int a,int b)->a>b?a:b;//���ٽ� ==> �ڹٽ�ũ��Ʈ (ȭ��ǥ�Լ�)
        System.out.println(aa.max(100, 200));
	}

}
