package projectSampleOfRustam;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.*;
import javax.swing.border.Border;

public class Booking extends JPanel{
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
	JLabel seat=new JLabel("Seat no *");
	JLabel name=new JLabel("Name *");
	JLabel address=new JLabel("Address *");
	JLabel phone=new JLabel("Phone no ");
	
	JLabel date =new JLabel("Date *");
	JLabel time=new JLabel("Time");
	JTextField dd=new JTextField();
	JComboBox jc;
	String[] am={"06:00 AM","08:00 AM","10:00 AM","12:00 PM","02:00 PM"};
	
	JTextField t1=new JTextField();
	JTextField t2=new JTextField();
	JTextField t3=new JTextField();
	JTextField t4=new JTextField();
	JButton b1=new JButton("Book");
	Border border = BorderFactory.createLineBorder(Color.BLUE, 4);
	
	public Booking()
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
		
		jc=new JComboBox<String>(am);
		seat.setBounds(280, 80, 80, 30);
		t1.setBounds(350, 80, 50, 30);
		name.setBounds(280, 120, 50, 30);
		t2.setBounds(350, 120, 200, 30);
		address.setBounds(280, 160, 95, 30);
		t3.setBounds(350, 160, 200, 30);
		phone.setBounds(280, 200, 80, 30);
		t4.setBounds(350, 200, 200, 30);
		
		date.setBounds(280, 240, 80, 30);
		dd.setBounds(350, 240, 200,30 );
		time.setBounds(280, 280, 60, 30);
		jc.setBounds(350, 280, 100, 30);
		b1.setBounds(400, 320, 80, 30);
		add(date);
		add(dd);
		add(time);
		add(jc);
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
		add(seat);
		add(name);
		add(address);
		add(phone);
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(b1);
		setBackground(Color.lightGray);
	}
	

}
