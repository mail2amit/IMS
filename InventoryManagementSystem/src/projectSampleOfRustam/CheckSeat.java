package projectSampleOfRustam;
import projectSampleOfRustam.AfterLogin.*;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CheckSeat extends JPanel {
	JPanel p1=new JPanel();
	CardLayout cl=new CardLayout();
	JLabel date =new JLabel("Date");
	JLabel time=new JLabel("Time");
	JTextField t1=new JTextField();
	JButton check=new JButton("Check");
	JButton back=new JButton("Back");
	JComboBox jc;
	String[] am={"06:00 AM","08:00 AM","10:00 AM","12:00 PM","02:00 PM"};
	Check chk=new Check();
	
	//AfterLogin lng=new AfterLogin();
	public CheckSeat()
	{
		setLayout(null);
		JLabel lvl=new JLabel("YYYY / MM / DD");
		date.setBounds(20, 20, 30, 30);
		t1.setBounds(60, 20, 100,30 );
		lvl.setBounds(170, 20, 100, 30);
		time.setBounds(20, 60, 60, 30);
		jc=new JComboBox<String>(am);
		jc.setBounds(60, 60, 100, 30);
		check.setBounds(60, 100, 80, 30);
		back.setBounds(150, 100, 80, 30);
		p1.setBounds(280, 20, 300, 400);
		p1.setBackground(Color.black);
		add(p1);
		add(date);
		add(t1);
		add(time);
		add(lvl);
		add(jc);
		add(check);
		add(back);
		back.setVisible(false);
		p1.setVisible(false);
		p1.setLayout(cl);
		p1.add(chk,"Check");
		check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cl.show(p1,"Check");
				p1.setVisible(true);
				check.setVisible(false);
				back.setVisible(true);
			}});
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				p1.setVisible(false);
				check.setVisible(true);
				back.setVisible(false);
			}
		});
		setBackground(Color.lightGray);
	}	
}
