package paymentportal;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import ticket.Bookticket;

public class Portal extends JFrame {
	JLabel jLabel,jLabel2,jLabel3,company,pricel,pwd,img;
	JPasswordField field;
	JButton button;
	Connection connection;
	
	
	public Portal(final String a, final String b, final String date1,final String t,final String d,final String f,final String l,final String c,final int adult,final int child,final double price,final String p,final int tnumber, final int seat, final int j, final double bal, final String card) {
	setVisible(true);

	
	
	setLayout(null);
	img = new JLabel(new ImageIcon("C:\\Users\\HP\\workspace\\bus_res\\Images\\payy.jpg"));
	add(img);
	img.setLayout(null);
	img.setBounds(0, 0, 584, 265);
	
	
	setVisible(true);
	setLocationRelativeTo(null);	
  
	setSize(584,265);
	setLayout(null);

	
	

	jLabel=new JLabel("Verified by VISA (VBV)");
	jLabel.setBounds(175, 10, 200, 20);
	jLabel.setForeground(Color.BLUE);
	
	jLabel2=new JLabel("Merchant name :");
	jLabel2.setBounds(120, 50, 100, 25);
	jLabel2.setForeground(Color.ORANGE);
	
	company=new JLabel("SEED TRAVELS");
	company.setBounds(230, 50, 100, 25);
	company.setForeground(Color.white);
	
	jLabel3=new JLabel("Price");
	jLabel3.setBounds(120, 100, 100, 25);
	jLabel3.setForeground(Color.ORANGE);
	
	pricel=new JLabel("<html>"+price+"</html>");
	pricel.setBounds(230, 100, 100, 25);
	pricel.setForeground(Color.WHITE);
	
	pwd=new JLabel("Password");
	pwd.setBounds(120, 150, 100, 25);
	pwd.setForeground(Color.ORANGE);
	
	field=new JPasswordField();
	field.setBounds(230, 150, 100, 25);

	button=new JButton("Submit");
	button.setBounds(230, 200, 100, 25);
	button.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				
			
			connection=connector.Myconnection.getcConnection();
			PreparedStatement statement=connection.prepareStatement("select * from bank where password=?");
			statement.setString(1, field.getText());
			ResultSet rs2=statement.executeQuery();
			int count=0;
			while(rs2.next())
			{
				
				count = count +1;
			}
			if(count==1)
			{
				
				JOptionPane.showMessageDialog(null, "Transaction successfull");
				
				double bal1 = bal-price;
				
				PreparedStatement st3=connection.prepareStatement("update bus set Avablity=? where type=? and time=? and destination=?");
				
				st3.setLong(1, j);
				st3.setString(2, d);
				st3.setString(3, t);
				st3.setString(4, b);
				st3.executeUpdate();
				
				PreparedStatement st0=connection.prepareStatement("update bank set balance=? where cardnumber=?");
				st0.setDouble(1, bal1);
				st0.setString(2, card);
				st0.executeUpdate();
				
				
				PreparedStatement st=connection.prepareStatement("insert into ticketbook values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			
			
				
				
				st.setLong(1,tnumber);
				st.setString(2, p);
				st.setString(3,f);
				st.setString(4,l);
				st.setString(5,a);
				st.setString(6,b);
				st.setString(7,date1);
				st.setString(8,t);
				st.setLong(9, seat );
				st.setLong(10, (long) price);
				st.setLong(11,adult );
				st.setLong(12,child );
				st.setString(13, c);
				st.setString(14, d);
				
				st.executeUpdate();
				hide();
				ticket.Bookticket bookticket=new Bookticket(a,b,date1,t,d,f,l,c,adult,child,price,p,tnumber);
				hide();
				
				
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Please check your password");
			}
			
			}catch (Exception e8) {
				// TODO: handle exception
			}
			
		}
	});
	
	img.add(jLabel);
	jLabel.updateUI();
	
	img.add(jLabel2);
	jLabel2.updateUI();
	
	img.add(company);
	company.updateUI();
	
	img.add(jLabel3);
	jLabel3.updateUI();
	
	img.add(pricel);
	pricel.updateUI();
	
	img.add(pwd);
	pwd.updateUI();
	
	img.add(field);
	field.updateUI();
	
	img.add(button);
	button.updateUI();
	
}
	
}
