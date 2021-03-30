package projectSampleOfRustam;

import java.awt.Color;

import javax.swing.*;

public class CancelReservation extends JPanel{
	JLabel l1=new JLabel("Seat no *");
	JLabel l2=new JLabel("Date *");
	JLabel l3=new JLabel("Time *");
	JLabel l4=new JLabel("YYYY / MM / DD");
	JTextField seat=new JTextField();
	JTextField date=new JTextField();
	JButton cancel=new JButton("Cancel");
	JComboBox jc;
	String[] am={"06:00 AM","08:00 AM","10:00 AM","12:00 PM","02:00 PM"};
	public CancelReservation()
	{
		setLayout(null);
		l1.setBounds(20, 20, 60, 30);
		seat.setBounds(100, 20, 60,30 );
		l2.setBounds(20, 60, 50, 30);
		l4.setBounds(260, 60, 100, 30);
		date.setBounds(100, 60, 150, 30);
		l3.setBounds(20, 100, 100, 30);
		jc=new JComboBox<String>(am);
		jc.setBounds(100, 100, 100, 30);
		cancel.setBounds(100, 140, 80, 30);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(seat);
		add(date);
		add(cancel);
		add(jc);
		setBackground(Color.lightGray);
	}
	
}
