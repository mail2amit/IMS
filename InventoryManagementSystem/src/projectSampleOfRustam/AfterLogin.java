package projectSampleOfRustam;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.awt.print.Book;

import javax.swing.*;


public class AfterLogin {
	JFrame frm=new JFrame();
	JPanel top=new JPanel();
	JPanel left=new JPanel();
	JPanel right=new JPanel();
	CardLayout cl=new CardLayout();
	JLabel chk=new JLabel("Check Seat");
	JLabel book=new JLabel("Booking");
	JLabel cncl=new JLabel("Cancel Reservation");
	JLabel adsm=new JLabel("Add Sumo");
	
	CheckSeat seat=new CheckSeat();
	Booking books=new Booking();
	Check check=new Check();
	CancelReservation cancel=new CancelReservation();
	AddSumo addsumo=new AddSumo();
	
	ImageIcon img=new ImageIcon("sumo.jpg");
	JLabel im=new JLabel();
	
	public AfterLogin()
	{
		frm.setLayout(null);
		top.setLayout(null);
		im.setIcon(img);
		top.add(im);
		top.setBounds(20, 20, 1320, 150);
		im.setBounds(0, 0, 1320, 160);
		top.setBackground(Color.blue);
		////im.setBounds(25, 25, 200, 150);
		frm.getContentPane().add(top);
		
		left.setLayout(null);
		left.setBounds(20, 180, 250, 500);
		left.setBackground(Color.gray);
		chk.setBounds(30, 20, 100, 30);
		chk.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		book.setBounds(30, 80, 100, 30);
		book.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cncl.setBounds(30, 140, 130, 30);
		cncl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		adsm.setBounds(30, 200, 100, 30);
		adsm.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		left.add(chk);		
		left.add(book);
		left.add(cncl);
		left.add(adsm);
		frm.getContentPane().add(left);
		
		right.setLayout(cl);
		right.setBounds(300, 180, 1038, 500);
		right.add(seat,"Check Seat");
		right.add(books,"Book");
		right.add(check,"Check");
		right.add(cancel,"Cancel");
		right.add(addsumo,"AddSumo");
		right.setBackground(Color.orange);
		frm.getContentPane().add(right);
		frm.setVisible(true);
		frm.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		chk.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent arg0) {}
			public void mousePressed(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {}
			public void mouseClicked(MouseEvent arg0) {
				cl.show(right, "Check Seat");
				seat.setVisible(true);
			}});
		book.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
			public void mouseEntered(MouseEvent arg0) {}
			public void mouseClicked(MouseEvent arg0) {
				cl.show(right, "Book");
				books.setVisible(true);
			}});
		cncl.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
			public void mouseEntered(MouseEvent arg0) {}
			public void mouseClicked(MouseEvent arg0) {
				cl.show(right, "Cancel");
				cancel.setVisible(true);
			}});
		adsm.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
			public void mouseEntered(MouseEvent arg0) {}
			public void mouseClicked(MouseEvent arg0) {
				cl.show(right, "AddSumo");
				addsumo.setVisible(true);
			}});
		
	}
	public static void main(String args[])
	{
		new AfterLogin();
	}
	
}
