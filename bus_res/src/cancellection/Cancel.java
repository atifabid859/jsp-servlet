package cancellection;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import bokking.Status;

public class Cancel extends JFrame{

	JLabel img,jLabel1,jLabel2;
	JTextField textfld1,textfld2;
	JButton jButton1,jButton2;
	int i=1,a,b;
	String tnumber;
	Connection connection=null;
	
	 String t  ;
	 String ty;
	 String d;
	public Cancel(final String p) {
		
		setSize(400,250);
		setVisible(true);
		setLayout(null);
		
		img = new JLabel(new ImageIcon("C:\\Users\\HP\\workspace\\bus_res\\Images\\co.jpg"));
		add(img);
		img.setLayout(null);
		img.setBounds(0, 0, 400, 250);
		
		setLayout(null);
		setLocationRelativeTo(null);
		setTitle("cancellation Form");
		
		
		jLabel1=new JLabel("Ticket Number");
		jLabel1.setBounds(50,75,150,30);
		img.add(jLabel1);
		jLabel1.setForeground(Color.black);
		
		
		textfld1=new JTextField();
		textfld1.setBounds(150, 80,150,20);
		img.add(textfld1);
		textfld1.setForeground(Color.LIGHT_GRAY);
		
		
		
		jButton1=new JButton("Submit");
		jButton1.setBounds(80, 120, 100, 25);
		img.add(jButton1);
		jButton1.setBackground(Color.red);
		jButton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
				tnumber=textfld1.getText();
				System.out.println(tnumber);
				java.util.Date s=Calendar.getInstance().getTime();
				DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
				String date1=df.format(s);
				String tdate = null;
				
				try {
				connection=connector.Myconnection.getcConnection();
				
				PreparedStatement st3=connection.prepareStatement("select date from ticketbook where tnumber=?");
				st3.setString(1, tnumber);
				ResultSet rs2=st3.executeQuery();
				
				while(rs2.next())
				{
					tdate=rs2.getString("date");
				
				}
				
				if(tdate.compareTo(date1)<0)
				{
					JOptionPane.showMessageDialog(null, "Cannot cancel");
				}
				
				
				PreparedStatement statement1=connection.prepareStatement("select seatsbook,time,dest,type from ticketbook where tnumber=?");
				
				statement1.setString(1, tnumber);
				ResultSet rs=statement1.executeQuery();
				while(rs.next())
				{
					 a=rs.getInt("seatsbook");
					 System.out.println(a);
					t=rs.getString("time");
					d=rs.getString("dest");
					ty=rs.getString("type");
					System.out.println(t);
					System.out.println(d);
					System.out.println(ty);


				}
				PreparedStatement stat=connection.prepareStatement("delete from ticketbook where tnumber=?");
				stat.setString(1, tnumber);
				stat.executeUpdate();
				
				PreparedStatement statement2=connection.prepareStatement("select Avablity from bus where  time=? and destination=? and type=?");
				statement2.setString(1, t);
				statement2.setString(2, d);
				statement2.setString(3, ty);
				statement2.executeQuery();
				ResultSet resultSet=statement2.getResultSet();
				
				while(resultSet.next()) {
					
					b=resultSet.getInt("Avablity");
				}
				
				 b=b+a;

				 PreparedStatement statement3=connection.prepareStatement("update  bus set Avablity=? where time=? and type=? and destination=?");
				statement3.setInt(1, b);
				statement3.setString(2, t);
				statement3.setString(3, ty);
				statement3.setString(4, d);
				statement3.executeUpdate();
				
				
				JOptionPane.showMessageDialog(null, "Your Ticket has been cancelled !!!!");
				}catch (Exception e) {
					// TODO: handle exception
				}
			 bokking.Status status=new Status(p);	
			 hide();
			}
		});
		
		jButton2=new JButton("Reset");
		jButton2.setBounds(250, 120, 100, 25);
		img.add(jButton2);
		jButton2.setBackground(Color.green);
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textfld1.setText(null);
				
				}
		});
		
	}
	
}
