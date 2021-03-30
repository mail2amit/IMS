package pack2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;

public class LoginValidation {
	JFrame frm = new JFrame();
	JPanel p1 = new JPanel();
	JLabel l1 = new JLabel("UserName:");
	JLabel l2 = new JLabel("Password:");
	JTextField t1 = new JTextField();
	JPasswordField pss = new JPasswordField();
	JButton bt1 = new JButton("Login");
	JButton bt2 = new JButton("Cancel");

	public LoginValidation() throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection cnn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/ims", "root", "root");
		final Statement stm = cnn.createStatement();
		frm.getContentPane().add(p1);

		p1.add(l1);
		t1.setColumns(10);
		pss.setColumns(10);
		p1.add(t1);
		p1.add(l2);
		p1.add(pss);
		p1.add(bt1);
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1 = t1.getText();
				String str2 = pss.getText();
				if (str1.isEmpty() && str2.isEmpty()) {
					JOptionPane.showMessageDialog(frm, "Error");
				} else {
					// frm.disable();

					String sql = "SELECt * FROM user WHERE uname='" + str1+"' AND pass='"+str2+"'";
					try {
						ResultSet result = stm.executeQuery(sql);
						if(result.next())
						{
							
						//	new MenuItem();
							JOptionPane.showMessageDialog(null, "SUCCESS!");
							frm.dispose();
						}
						else
						{
							JOptionPane.showMessageDialog(null,"USername or password incorrect");
						}
					} catch (SQLException g) {
						JOptionPane.showMessageDialog(null, g.getMessage());
					}
				}

			}
		});

		p1.add(bt2);
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				System.exit(0);

			}
		});
		frm.setUndecorated(true);
		frm.setVisible(true);
		frm.setSize(200, 90);
		frm.setResizable(false);
		frm.setLocationRelativeTo(null);

	}

	/*public static void main(String args[]) throws ClassNotFoundException,
			SQLException {
		new LoginValidation();
	}*/

}
