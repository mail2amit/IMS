package pack1;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class login extends JPanel{
	JLabel l1=new JLabel("user");
	JLabel l2=new JLabel("password");
	JTextField t1=new JTextField(20);
	JTextField t2=new JTextField(20);
	JButton login=new JButton("Login");
	public login()
	{
		setLayout(new GridLayout(3, 2));
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(login);
		
	}
/*public static void main(String args[])
{
	JFrame f1=new JFrame();
	f1.setSize(500, 500);
	f1.setVisible(true);
	f1.setDefaultCloseOperation(3);
	f1.add(new login());
}*/
}
