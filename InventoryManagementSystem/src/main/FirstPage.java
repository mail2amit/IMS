package main;

import javax.swing.*;

public class FirstPage {
	protected JFrame f1=new JFrame("IMS");
//	protected JPanel p1=new JPanel();
	protected JLabel user=new JLabel("User Name"); 
	protected JLabel pass=new JLabel("Password ");
	protected JLabel background=new JLabel(new ImageIcon("background.jpg"));
	protected JButton login=new JButton("LOGIN");
	JTextField t1=new JTextField();
	JPasswordField t2=new JPasswordField();
	public FirstPage()
	{
		f1.setSize(500, 520);
		f1.getContentPane().add(background);
		
	//	p1.setLayout(null);
		
		background.add(user);
		user.setBounds(100, 200, 100, 30);
		background.add(t1);
		t1.setBounds(210, 200, 200, 30);
		background.add(pass);
		pass.setBounds(100, 240, 100, 30);
		background.add(t2);
		t2.setBounds(210, 240, 200, 30);
		background.add(login);
		login.setBounds(250, 280, 100, 30);
		
		/*p1.setSize(500,200);
		background.add(p1);
		p1.setBounds(0, 400, 500, 100);*/
		
		f1.setVisible(true);
		f1.setResizable(false);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setLocationRelativeTo(null);
	}
	public static void main(String args[])
	{
		new FirstPage();
	}

}
