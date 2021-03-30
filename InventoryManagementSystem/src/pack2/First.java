package pack2;

import java.awt.Color;

import java.sql.SQLException;

import javax.swing.*;

public class First{
	JFrame f1=new JFrame("IMS");
	JPanel main=new JPanel();
	JPanel banner=new JPanel();
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	AddUser ad=new AddUser();
	public First() throws ClassNotFoundException, SQLException
	{
		f1.setSize(600, 600);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setLocationRelativeTo(null);
		f1.getContentPane().add(main);
	//	main.setSize(600, 600);
		
		main.setLayout(null);
		banner.setBounds(0, 0, 600, 100);
		banner.setBackground(Color.gray);
		main.add(banner);
		
		ad.setBounds(50, 100, 600, 200);
	//	p1.setBackground(Color.blue);
		main.add(ad);
		
		
		p2.setBounds(0, 300, 600, 300);
		p2.setBackground(Color.DARK_GRAY);
		main.add(p2);
		
	}
	public static void main(String args[]) {
		try {
			new First();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
