package login;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class Regisration_page extends JFrame{

	JLabel img,jLabel1,jLabel2,jLabel3,jLabel4,jLabel5,jLabel6;
	JButton button1,button2;
	JTextField field1,field2,field3;
	JPasswordField passwordField1,passwordField2;
	Connection connection=null;
	int i=0;
	
	public Regisration_page() {


		
		
		setSize(347,346);
		setVisible(true);
		setLayout(null);
		
		img = new JLabel(new ImageIcon("C:\\Users\\HP\\workspace\\bus_res\\Images\\regi.jpg"));
		add(img);
		img.setLayout(null);
		img.setBounds(0, 0, 347, 346);
		img.updateUI();
		setLayout(null);
		setLocationRelativeTo(null);
		setTitle("Registration Form");
		
		
		jLabel1=new JLabel("First Name");
		jLabel1.setBounds(50,35,150,30);
		img.add(jLabel1);
		jLabel1.updateUI();
		jLabel1.setForeground(Color.black);
		
		
		field1=new JTextField();
		field1.setBounds(115, 40,150,20);
		img.add(field1);
		field1.updateUI();
		field1.setForeground(Color.LIGHT_GRAY);
		
	
		jLabel2=new JLabel("Last Name");
		jLabel2.setBounds(50,75,150,30);
		img.add(jLabel2);
		jLabel2.updateUI();
		jLabel2.setBackground(Color.WHITE);
		
		
		field2=new JTextField();
		field2.setBounds(115, 80,150,20);
		img.add(field2);
		field2.updateUI();
		field2.setForeground(Color.LIGHT_GRAY);
		
		jLabel3=new JLabel("Username");
		jLabel3.setBounds(50,115,150,30);
		img.add(jLabel3);
		jLabel3.updateUI();
		jLabel3.setForeground(Color.black);
		
		
		field3=new JTextField();
		field3.setBounds(115, 120,150,20);
		img.add(field3);
		field3.setForeground(Color.LIGHT_GRAY);
		field3.updateUI();		
		
		
		jLabel4=new JLabel("Password");
		jLabel4.setBounds(50,155 , 150, 30);
		img.add(jLabel4);
		jLabel4.updateUI();
		
		
		passwordField1=new JPasswordField(10);
		passwordField1.setBounds(115, 160, 150, 20);
		img.add(passwordField1);
		passwordField1.updateUI();		
		
		jLabel5=new JLabel("Confirm Password");
		jLabel5.setBounds(5,198,150,20);
		img.add(jLabel5);
		jLabel5.updateUI();
		
		
		passwordField2=new JPasswordField();
		passwordField2.setBounds(115,200,150,20);
		img.add(passwordField2);
		passwordField2.updateUI();
		
		button1=new JButton("Submit");
		button1.setBounds(70,250,80,30);
		img.add(button1);
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				
				if(field1.getText().equals("")||field2.getText().equals("")||field3.getText().equals("")||passwordField1.getText().equals("")||passwordField2.getText().equals(""))
				{JOptionPane.showMessageDialog(null, "Fill some details");}
				
				else if(passwordField1.getText().equals(passwordField2.getText()))
				{
					connection=connector.Myconnection.getcConnection();
					
					
				PreparedStatement count=connection.prepareStatement("SELECT * FROM registration");
				
				count.executeQuery();
				
				PreparedStatement st=connection.prepareStatement("insert into registration values(?,?,?,?,?)");
				
				
		
			
				st.setString(1, field1.getText());
				st.setString(2, field2.getText());
				st.setString(5, field3.getText());
				st.setString(3, passwordField1.getText()); 
				st.setString(4, passwordField2.getText());
				
				
				st.executeUpdate();
				
				JOptionPane.showMessageDialog(null, "Successfully Registered");

				Login login=new Login();
				System.out.println("done");
				field1.setText(null);
				field2.setText(null);
				field3.setText(null);
				passwordField1.setText(null);
				passwordField2.setText(null);
				hide();
				
				
				}else
				{
					JOptionPane.showMessageDialog(null, "password missmatch! try again");
					passwordField1.setText(null);
					passwordField2.setText(null);
				}
				}
				catch(Exception e2)
				{
					e2.printStackTrace();
				}
				
			}
		});

		
		button2 =new JButton("Reset");
		button2.setBounds(190,250,80,30);
		img.add(button2);
button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				field1.setText(null);
				field2.setText(null);
				field3.setText(null);
				passwordField1.setText(null);
				passwordField2.setText(null);
				
			}
		});
		
		
	}
	public static void main(String[] args) {
		 new Regisration_page(); 
		 
	}
}
