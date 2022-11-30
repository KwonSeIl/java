package com.sist.wrapper;
import javax.swing.*;
import java.awt.event.*;
public class MainClass_Wrapper_3 extends JFrame implements ActionListener{
	JTextField tf1,tf2;
	JButton b;
	public MainClass_Wrapper_3()
	{
		tf1=new JTextField(10);
		tf2=new JTextField(10); // <input type=text> => 입력값을 받는 경우 String으로 받음 ==> 필요할 경우 정수형 변환 방법
		b=new JButton("결과");
		JPanel p=new JPanel();
		p.add(tf1);
		p.add(tf2);
		p.add(b);
		add("Center",p);
		
		setSize(300,200);
		setVisible(true);
		
		//Integer ii=100;
		//tf1.setText(ii.toString());
		tf1.setText(String.valueOf(100)); // 정수 들어가지 못함 => 오류
		tf2.setText(String.valueOf(200));
		
		b.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass_Wrapper_3();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b)
		{
			String num1=tf1.getText();
			String num2=tf2.getText();
			JOptionPane.showMessageDialog(this, "계산 결과:"+(Integer.parseInt(num1)+Integer.parseInt(num2)));
		}
		
	}

}
