package com.sist.collection;
// ��ü���� ����
import java.util.*;
class Sawon
{
	private int sabun;
	private String name;
	private String dept;
	private String loc;
	private int pay;
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public Sawon(int sabun, String name, String dept, String loc, int pay) {
		this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.loc = loc;
		this.pay = pay;
	}
	public Sawon()
	{
		
	}
	
}
// ������ �ߺ� ����: HashSet ==> addAll(), subList(): copy
public class MainClass_ArrayList_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		// ������ ����
		list.add(new Sawon(1,"ȫ�浿","���ߺ�","����",3000));
		list.add(new Sawon(2,"��û��","��ȹ��","���",3500));
		list.add(new Sawon(3,"�ڹ���","�����","���",3200));
		list.add(new Sawon(4,"�̼���","������","����",4000));
		list.add(new Sawon(5,"������","�ѹ���","�λ�",4500));
		
		//������ ���
		System.out.println("==== ��� ��� ====");
		for(int i=0;i<list.size();i++)
		{
			Sawon sa=(Sawon)list.get(i);
			/*System.out.println("���:"+sa.getSabun());
			System.out.println("�̸�:"+sa.getName());
			System.out.println("�μ�:"+sa.getDept());
			System.out.println("�ٹ���:"+sa.getLoc());
			System.out.println("����:"+sa.getPay());
			System.out.println("-----------------");*/
			System.out.println(sa.getSabun()+" "
					+sa.getName()+" "
					+sa.getDept()+" "
					+sa.getLoc()+" "
					+sa.getPay());
		}
		System.out.println("===============");
		
		ArrayList temp=new ArrayList();
		temp.addAll(list);// ��ü ������ ���� ==> �ߺ� ������ ���� => ���ŵ� �����͸� �޴� ��� 
	    for(int i=0;i<temp.size();i++)
	    {
	        Sawon sa=(Sawon)temp.get(i);
	        /*System.out.println("���:"+sa.getSabun());
	        System.out.println("�̸�:"+sa.getName());
	        System.out.println("�μ�:"+sa.getDept());
	        System.out.println("�ٹ���:"+sa.getLoc());
	        System.out.println("����:"+sa.getPay());
	        System.out.println("-------------------");*/
	        System.out.println(sa.getSabun()+" "
	        		+sa.getName()+" "
	        		+sa.getDept()+" "
	        		+sa.getLoc()+" "
	        		+sa.getPay());
	    }
	    //System.out.println(temp);
        // addAll() ==> Vector / LinkedList / HashSet
	    
		//Scanner scan=new Scanner(System.in);
	    /*
		System.out.print("�̸� �Է�:");
		String name=scan.next();
		
		System.out.println("===== ���� ��� ====");
		for(int i=0;i<list.size();i++)
		{
			Sawon sa=(Sawon)list.get(i);
			if(sa.getName().equals(name))
			{
				System.out.println("�̸�:"+sa.getName());
				System.out.println("�μ�:"+sa.getDept());
				System.out.println("�ٹ���:"+sa.getLoc());
				System.out.println("����:"+sa.getPay());
				break;
			}
		}
		System.out.println("==== ������ �߰� ===");
		Sawon sa=new Sawon();
		System.out.print("�̸� �Է�:");
		sa.setName(scan.next()); //= String name=scan.next();
		
		System.out.print("�μ� �Է�:");
		sa.setDept(scan.next());
		
		System.out.print("�ٹ��� �Է�:");
		sa.setLoc(scan.next());
		
		System.out.println("���� �Է�:");
		sa.setPay(scan.nextInt());
		// ��� �ڵ����� => ������
		int max=0;
		for(int i=0;i<list.size();i++)
		{
			Sawon s=(Sawon)list.get(i);
			if(max<s.getSabun())
				max=s.getSabun();
		}
		sa.setSabun(max+1); //list.size() => 4 
		list.add(sa);
		
		System.out.println("====== �߰��� �ο� Ȯ�� ======");
        for(int i=0;i<list.size();i++)
        {
        	Sawon sa1=(Sawon)list.get(i);
        	System.out.println(sa1.getSabun()+" "
        			+sa1.getName()+" "
        			+sa1.getDept()+" "
        			+sa1.getLoc()+" "
        			+sa1.getPay());
        }
        System.out.println("==========================");
        */
	    /*System.out.println("======== �μ��� ã�� ========");
        ArrayList deptList=new ArrayList();
        for(int i=0;i<list.size();i++)
        {
        	Sawon s=(Sawon)list.get(i);
        	deptList.add(s.getDept());
        }
        System.out.println(deptList);
        // �������߿� �ߺ��� ���� Set(�ߺ��� ������� ����)
        HashSet set=new HashSet();
        for(int i=0;i<deptList.size();i++)
        {
        	set.add(deptList.get(i));
        }
        //System.out.println(set);
        int i=1;
        for(Object obj:set)
        {
           System.out.println(i+"."+obj);
           i++;
        }
        
        // ������ ã�� 
        System.out.print("�μ��� �Է�:");
        String dept=scan.next();
        for(i=0;i<list.size();i++)
        {
        	Sawon s=(Sawon)list.get(i);
        	if(s.getDept().equals(dept))
        	{
        		System.out.println(s.getName()+" "+s.getDept());
        	}
        }*/
	}

}
