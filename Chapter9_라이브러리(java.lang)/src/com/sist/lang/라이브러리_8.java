package com.sist.lang;
// Class ��ü ���
class Card
{
	private int number;
	private String type;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
public class ���̺귯��_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �޸� �Ҵ�
		Card card1=new Card();
		card1.setNumber(1);
		card1.setType("��");
		
		System.out.println("card1.number:"+card1.getNumber());
		System.out.println("card1.type:"+card1.getType());
		
		//�޸� �Ҵ� 2
		try
		{
			Class clsName=Class.forName("com.sist.lang.Card"); //�����ͺ��̽� => Driver
			// CheckedException ==> ClassNotFoundException ==> ����ó�� �ʿ���
			// Ŭ���� �̸����� �޸𸮸� �Ҵ�
			Object obj=clsName.getDeclaredConstructor().newInstance();
			//Object obj2=clsName.newInstance(); // ���(������ �ǰ�)
			
			Card c2=(Card)obj;
			c2.setNumber(2);
			c2.setType("��");
			
			System.out.println(c2.getNumber());
			System.out.println(c2.getType());
		}catch(Exception ex) {}
		

	}

}
