package login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

class Splash_Screen extends JWindow {

	JLabel lbl_img;
	JDesktopPane dp;
	JProgressBar pb;

	public Splash_Screen() {
		Container c = getContentPane();  
		c.setLayout(null);

		lbl_img = new JLabel();
		lbl_img.setIcon(
				new ImageIcon("C:\\\\Users\\\\HP\\\\workspace\\\\bus_res\\\\Images\\\\SPLASH.JPG"));
		lbl_img.setBounds(0, 0, 548, 278);

		pb = new JProgressBar(0, 100);
		pb.setStringPainted(true);
		pb.setForeground(Color.GREEN);
		pb.setBounds(0, 270, 548, 10); 

		c.add(pb);
		c.add(lbl_img);
		getRootPane().setBorder(new EtchedBorder(EtchedBorder.RAISED));
		setSize(548, 278);
		setLocationRelativeTo(null);
		setVisible(true);
		
		
		for (int i = 0; i <= 100; i = i + 5) {
				pb.setString("");
			
			pb.setValue(i);    
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	//	new Welcome();
		setVisible(false);
		
		login.Login login=new Login();
	}

	public static void main(String args[]) {
		new Splash_Screen();
	}
}
