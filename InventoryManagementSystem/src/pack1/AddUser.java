package pack1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.sql.*;

import javax.swing.*;

public class AddUser extends JPanel{
	
	JPanel base=new JPanel();
	JLabel l1=new JLabel("User Name");
	JLabel l2=new JLabel("Password");
	JLabel l3=new JLabel("Re-Password");
	JTextField t1=new JTextField(20);
	JPasswordField t2=new JPasswordField(20);
	JPasswordField t3=new JPasswordField(20);
	JButton add=new JButton("ADD");
	JButton cancel=new JButton("CANCEL");
	
	public AddUser() 
	{				
	//	setLayout(new CardLayout());
	//	add(base);
	//	base.setSize(600, 200);
		
		base.setVisible(true);
		base.setLayout(null);
		add(base);
		
	//	l1.setBounds(10, 5,100, 20);
		base.add(l1);
	//	t1.setBounds(110, 5, 200, 20);
		base.add(t1);
	//	l2.setBounds(10, 30, 100, 20);
		base.add(l2);
	//	t2.setBounds(110, 30, 200, 20);
		base.add(t2);
	//	l3.setBounds(10,55,100,20);
		base.add(l3);
	//	t3.setBounds(110,55,200,20);
		base.add(t3);
	//	add.setBounds(10,80,100,20);
		base.add(add);
	//	cancel.setBounds(110,80,200,20);
		base.add(cancel);
		
	/*	add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1=t1.getText();
				String s2=t2.getText();
				String s3=t3.getText();
				if(s1.isEmpty()||s2.isEmpty()||s3.isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Please enter valid data");
				}
				else if(s2.equals(s3)==false)
				{
					JOptionPane.showMessageDialog(null, "Re entered password incorrect!");
				}
				else if(s2.equals(s3))
				{
					String sql="INSERT INTO user VALUES('"+s1+"','"+s2+"')";
					try {
						stm.execute(sql);
					} catch (SQLException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage());
					}
					JOptionPane.showMessageDialog(null, "Data inserted!!");
					t1.setText(null);
					t2.setText(null);
					t3.setText(null);
				}
			}
		
		});
		
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
	*/	
		
	}
	
	public static void main(String args[])
	{
		
		
	}

}
