package pack1;

import java.awt.Color;

import javax.swing.*;

public class first {
	JFrame f1=new JFrame();
	JPanel main=new JPanel(); 
	JPanel banner=new JPanel();
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	//first fst=new first();
	login lg=new login();
	public first () 
	{
		f1.getContentPane().add(main);
		main.setLayout(null);
		banner.setBackground(Color.gray);
		banner.setBounds(5, 5, 500, 100);
		main.add(banner);
		p1.add(lg);
		p1.setBounds(5, 110, 500,50 );
		p1.setBackground(Color.BLUE);
		main.add(p1);
		
		p2.setBounds(5, 165, 500,200 );
		p2.setBackground(Color.darkGray);
		main.add(p2);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setSize(500, 500);
		f1.setLocationRelativeTo(null);
		
		
	}
	public static void main(String args[]) {
		new first();
	}

}
