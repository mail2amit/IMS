package projectSampleOfRustam;

import java.awt.Color;

import javax.swing.*;

public class AddSumo extends JPanel{
	JLabel l1=new JLabel("Sumo No");
	JLabel l2=new JLabel("Time");
	JTextField no=new JTextField();
	//JTextField t1=new JTextField();
	JButton b1=new JButton("ADD");
	JButton b2=new JButton("UPDATE");
	JComboBox jc;
	String[] am={"06:00 AM","08:00 AM","10:00 AM","12:00 PM","02:00 PM"};
	public AddSumo()
	{
		setLayout(null);
		l1.setBounds(20, 20, 70, 30);
		no.setBounds(100, 20, 100, 30);
		l2.setBounds(20, 60, 70, 30);
		jc=new JComboBox<String>(am);
		jc.setBounds(100, 60, 100, 30);
		b1.setBounds(45, 100, 60, 30);
		b2.setBounds(120, 100, 80, 30);
		add(l1);
		add(l2);
		add(no);
		add(jc);
		add(b1);
		add(b2);
		setBackground(Color.lightGray);
		//setVisible(true);
		//setSize(300, 300);
		//setDefaultCloseOperation(3);
	}
	

}
