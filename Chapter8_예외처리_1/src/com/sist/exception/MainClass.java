package com.sist.exception;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MainClass  extends JFrame implements ActionListener{
	//					-------------Ŭ����			------------ �������̽�(���߻��)
	private JTextArea ta;	// ����
	private JTextField tf;
	private JButton b1,b2;
	private int[] com=new int[3];
	private int[] user=new int[3];
	private int s,b;
	//���۰� ���ÿ� ��ġ
	public MainClass()
	{
		ta=new JTextArea();
		JScrollPane js=new JScrollPane(ta);
		tf=new JTextField(10);
		b1=new JButton("start");
		b2=new JButton("Exit");
		add("Center",js);
		JPanel p=new JPanel();
		p.add(tf);
		p.add(b1);
		p.add(b2);
		add("South",p);
		
		//ũ��
		setSize(450,420);
		setVisible(true);
		
		// �̺�Ʈ ���
		b1.addActionListener(this); //Ŭ�� ==> �ý��ۿ� ���ؼ� �ڵ����� ȣ��(Callback)
		tf.addActionListener(this); //����
		
	}
	public void getRand()
	{
		for(int i=0;i<3;i++)
		{
			com[i]=(int)(Math.random()*9)+1; ///1~9
			for(int j=0;j<i;j++)
			{
				if(com[j]==com[i])
				{
					i--;
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			getRand();
			JOptionPane.showMessageDialog(this, "������ �����մϴ�");
		}
		else if(e.getSource()==tf)
		{
			// �Է��� �� �о�´�
			String input=tf.getText();
			// ���������� ���� ==> ����� ���� 
			try 
			{
				int m=Integer.parseInt(input);
			} catch (Exception ex) {
				//����
				JOptionPane.showMessageDialog(this, "���ڸ� ������ �Է�");
				tf.setText("");
				tf.requestFocus();
				return;
			}
			
		}
	}

}
