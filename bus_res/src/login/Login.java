package login;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JWindow;
import javax.swing.border.EtchedBorder;

public class Login extends JFrame {

	JLabel jLabel1, jLabel2, jLabel3, jLabel4;
	JButton button1, button2, button3;
	JTextField field1;
	JPasswordField field2;
	Connection connection=null;
	
	public Login() {
		JWindow j=new JWindow();
		
		setVisible(true);
		setSize(660, 275);
		j.getRootPane().setBorder(new EtchedBorder(EtchedBorder.RAISED));

		setLocationRelativeTo(null);

		setLayout(null);
		jLabel2 = new JLabel(new ImageIcon("C:\\Users\\HP\\workspace\\bus_res\\Images\\lll.jpg"));
		add(jLabel2);
		jLabel2.setLayout(null);
		jLabel2.setBounds(0, 0, 640, 275);
		
		jLabel1=new JLabel("User Name");
		jLabel1.setBounds(10, 0, 100, 30);
		jLabel2.add(jLabel1);
		
		field1=new JTextField(10);
		field1.setBounds(80,3,100,20);
		jLabel2.add(field1);
		field1.setBackground(Color.LIGHT_GRAY);
		

		
		jLabel4=new JLabel("password");
		jLabel4.setBounds(190, 0, 100, 30);
		jLabel2.add(jLabel4);
		jLabel2.updateUI();
		
		
		
		field2=new JPasswordField(10);
		field2.setBounds(250,3,100,20);
		jLabel2.add(field2);
		field2.setBackground(Color.LIGHT_GRAY);
		
		button1=new JButton("Login");
		button1.setBounds(390,150,100,20);
		jLabel2.add(button1);
		button1.updateUI();
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
				connection=connector.Myconnection.getcConnection();
				PreparedStatement st = connection.prepareStatement("select * from registration where username=? and password=?");

				String p=field1.getText();//2
				
				st.setString(1,field1.getText());
				st.setString(2,field2.getText());
			
				ResultSet r1 = st.executeQuery();
				int count=0;
				while(r1.next())
				{
					count=count+1;
				}
					if(count==1) {
						JOptionPane.showMessageDialog( null, "Username and password is correct");
						bokking.Status status=new bokking.Status(p);
						status.main(null);
						
	  					hide();
				}else
					if(count>1)
					{
						JOptionPane.showMessageDialog(null, "Duplicate username and password");
						
					}else
					{
						JOptionPane.showMessageDialog(null, "Invalid username and password ! Try again");
					}
					
			
			}catch(Exception e2)
			{}

			}	
			
		});
		
		
		
		button2=new JButton("Reset");
		button2.setBounds(500, 150, 100, 20);
		jLabel2.add(button2);
		button2.updateUI();
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					
				field1.setText(null);
				field2.setText(null);

				
			}
		}); 

		
		
		button3=new JButton("Registration");
		button3.setBounds(410, 180, 190, 20);
		jLabel2.add(button3);
		button3.updateUI();
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				
				Regisration_page form=new Regisration_page();
		
				hide();
			}
		});

	}


}
