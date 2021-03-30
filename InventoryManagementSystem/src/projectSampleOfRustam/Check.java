package projectSampleOfRustam;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.jws.Oneway;
import javax.swing.*;
import javax.swing.border.*;

public class Check extends JPanel{
	JPanel p1=new JPanel();
	JLabel l1=new JLabel("1");
	JLabel l2=new JLabel("2");
	JLabel l3=new JLabel("3");
	JLabel l4=new JLabel("4");
	JLabel l5=new JLabel("5");
	JLabel l6=new JLabel("6");
	JLabel l7=new JLabel("7");
	JLabel l8=new JLabel("8");
	JLabel l9=new JLabel("9");
	JLabel l10=new JLabel("10");
	JLabel driver=new JLabel("Driver");
	JLabel booked=new JLabel("Booked");
	JLabel free=new JLabel("Free");
	JLabel b=new JLabel();
	JLabel f=new JLabel();
	Border border = BorderFactory.createLineBorder(Color.BLUE, 2);
	Border boo = BorderFactory.createLineBorder(Color.red, 10);
	Border frr = BorderFactory.createLineBorder(Color.green, 10);
	//JButton cancel=new JButton("Cancel");
	//CheckSeat seat=new CheckSeat();
	public Check()
	{
		
		setLayout(null);
		l1.setBounds(40, 80, 20, 30);
		l2.setBounds(100, 80, 20, 30);
		driver.setBounds(160, 80, 50, 30);
		l3.setBounds(40, 160, 20, 30);
		l4.setBounds(100, 160, 20, 30);
		l5.setBounds(160, 160, 20, 30);
		l6.setBounds(220, 160, 20, 30);
		l7.setBounds(40, 240, 20, 30);
		l8.setBounds(100, 240, 20, 30);
		l9.setBounds(160, 240, 20, 30);
		l10.setBounds(220, 240, 30, 30);
		b.setBounds(150, 310, 20, 20);
		booked.setBounds(180, 310, 50, 20);
		//cancel.setBounds(40, 333, 80,30);
		b.setBorder(boo);
		f.setBorder(frr);
		free.setBounds(180, 340, 50, 20);
		f.setBounds(150, 340, 20, 20);
		l1.setBorder(border);
		l2.setBorder(border);
		l3.setBorder(border);
		l4.setBorder(border);
		l5.setBorder(border);
		l6.setBorder(border);
		l7.setBorder(border);
		l8.setBorder(border);
		l9.setBorder(border);
		l10.setBorder(border);
		driver.setBorder(border);
		//p1.setBounds(0, 0, 340, 400);
		setBackground(Color.lightGray);
		//p1.setVisible(false);
		//add(p1);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);
		add(l9);
		add(l10);
		add(driver);
		add(b);
		add(f);
		add(booked);
		add(free);
		
		//setSize(300, 400);
		//setResizable(false);
		//setLocationRelativeTo(null);
		//setDefaultCloseOperation(3);
	}
	

}
