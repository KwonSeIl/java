package com.sist.lang;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
public class ���̺귯��_3 extends JFrame implements ItemListener {
	JComboBox box=new JComboBox();
	JLabel la=new JLabel();
	public ���̺귯��_3()
	{
		//��ü����/��ġ
		box.addItem("m1.jpg");
		box.addItem("m2.jpg");
		box.addItem("m3.jpg");
		box.addItem("m4.jpg");
		box.addItem("m5.jpg");
		box.addItem("m6.jpg");
		box.addItem("m7.jpg");
		
		add("North",box);
		add("Center",la);
		setSize(350,450);
		setVisible(true);
		
		// ���
		box.addItemListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ���̺귯��_3();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==box) //�޺����� ������ �� ��쿡 ó��
		{
			//�޼ҵ忡�� �������� Object�� ��� -> ���ڿ� ��ȯ�� �� ��� ==> toString()
			// 1. ��������� �Y�Ⱚ Ȯ�� ==> �������̵��� �ؼ� ���
			// 2. Object�� String���� ��ȯ 
			String image=box.getSelectedItem().toString(); //Object�� String���� ����
			la.setIcon(new ImageIcon("C:\\javaDev\\"+image));
		}
	}

}
