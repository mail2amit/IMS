package main;

import java.awt.Color;

import javax.swing.*;

public class Menu {
	protected JFrame f1=new JFrame("IMS");
	protected JPanel head=new JPanel();
	protected JPanel body=new JPanel();
	
	public Menu()
	{
		f1.setSize(1000, 700);
		f1.setLayout(null);
		
		f1.add(head);
		head.setBackground(Color.BLACK);
		head.setBounds(0, 0, 1000, 200);
		
		f1.add(body);
		body.setBackground(Color.gray);
		body.setBounds(0, 200, 1000, 500);
		
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setLocationRelativeTo(null);
	}
	public static void main(String args[])
	{
		new Menu();
	}

}
