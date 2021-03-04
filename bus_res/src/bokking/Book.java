package bokking;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import login.Login;
import paymentportal.Payment;
import ticket.Bookticket;

class Booking extends JFrame{
	
	JLabel jLabel1, jLabel2,jLabel3,jLabel4,jLabel5,jLabel6,jLabel7,jLabel8,jLabel9,jLabel10,jLabel11,img;
	JTextField field1,field2,field3,field4,field5,field6,field7;
	JButton button1,button2;
	/*JDateChooser chooser;*/
	JComboBox comboBox1,comboBox2,comboBox3,jComboBox4,jComboBox5,jComboBox6;
	Connection connection=null;
	double price,cprice;
	int tnumber=2017001,size,j, seatad=0,seatchd=0,seat=0;
	

	String[] sItem1={"select","BANGALORE", "CHENNAI", "DELHI", "GOA"};
	String[] sItem2= {"select","MUMBAI"};
	String[] sItem3={"select","AC","NON-AC"};
	String[]  time= {"select","6.00 AM","5.00 PM"};
	
	
	public Booking(final String a, final String b, final String date1,final String d,final String p) {
	
		setLayout(null);
		img = new JLabel(new ImageIcon("C:\\Users\\HP\\workspace\\bus_res\\Images\\booo.jpg"));
		add(img);
		img.setLayout(null);
		img.setBounds(0, 0, 1366, 768);
		
		
		setVisible(true);
		setSize(getMaximumSize());
		setLayout(null);
		setLocationRelativeTo(null);

		
		

		
		
		jLabel1=new JLabel("<HTML><font size=\"5000\" color=\"\"><u>SEED TRAVELS.</u></font></HTML>");
		jLabel1.setBounds(550, 30, 400,100);
		img.add(jLabel1);
		jLabel1.setForeground(Color.BLACK);
		
		jLabel2=new JLabel("<HTML><font size=\"3000\" color=\"#330000\">Booking</font></HTML>");
		jLabel2.setBounds(650,130,150,50);
		img.add(jLabel2);
		
		jLabel3=new JLabel("From");
		jLabel3.setBounds(290,200,100,30);
		img.add(jLabel3);
		
		jLabel6=new JLabel("First name");
		jLabel6.setBounds(890,200,100,30);
		img.add(jLabel6);
		
		field4=new JTextField();
		field4.setBounds(970,200,150,25);
		img.add(field4);
		
		
		comboBox1=new JComboBox(sItem2);
		comboBox1.setSelectedItem(a);
		comboBox1.disable();
		comboBox1.setBounds(340,207,100,20);
		img.add(comboBox1);
		
		jLabel4=new JLabel("To");
		jLabel4.setBounds(305,280,100,30);
		img.add(jLabel4);
		
		jLabel7=new JLabel("Last Name");
		jLabel7.setBounds(890,280,100,30);
		img.add(jLabel7);
		
		field5=new JTextField();
		field5.setBounds(970,280,150,25);
		img.add(field5);
		
		comboBox2=new JComboBox(sItem1);
		comboBox2.setSelectedItem(b);
		comboBox2.disable();
		comboBox2.setBounds(340,287,100,20);
		img.add(comboBox2);
		
		jLabel5=new JLabel("Booking Date");
		jLabel5.setBounds(250,355,100,30);
		img.add(jLabel5);
		
		jLabel8=new JLabel("Contact No.");
		jLabel8.setBounds(890,360,100,30);
		img.add(jLabel8);
		
		field6=new JTextField();
		field6.setBounds(970,360,150,25);
		img.add(field6);
		

		field7=new JTextField(date1);
		// chooser.setDate(c);
		field7.setEditable(false);
		field7.setBounds(340,360,100,20);
		img.add(field7);
		
		jLabel6=new JLabel("Time");
		jLabel6.setBounds(300,440,100,30);
		img.add(jLabel6);
		
		jComboBox6=new JComboBox(time);
		jComboBox6.setBounds(340,440,100,20);
		img.add(jComboBox6);
		
		
		jLabel11=new JLabel("Type");
		jLabel11.setBounds(300,530,100,30);
		img.add(jLabel11);
		
		comboBox3=new JComboBox(sItem3);
		comboBox3.setSelectedItem(d);
		comboBox3.disable();
		comboBox3.setBounds(340,530,100,20);
		img.add(comboBox3);
		
		
		
		jLabel9=new JLabel("Adult(12+)");
		jLabel9.setBounds(890,440,100,20);
		jComboBox4=new JComboBox();
		jComboBox4.addItem(0);
		jComboBox4.addItem(1);
		jComboBox4.addItem(2);
		jComboBox4.addItem(3);
		jComboBox4.addItem(4);
		jComboBox4.addItem(5);
		jComboBox4.addItem(6);
		jComboBox4.setBounds(970,440,100,20);
		img.add(jLabel9);
		img.add(jComboBox4);
		
		jLabel10=new JLabel("Childrens(5-11)");
		jLabel10.setBounds(860,530,100,20);
		jComboBox5=new JComboBox();
		jComboBox5.addItem(0);
		jComboBox5.addItem(1);
		jComboBox5.addItem(2);
		jComboBox5.addItem(3);
		jComboBox5.addItem(4);
		jComboBox5.addItem(5);
		jComboBox5.addItem(6);
		img.add(jLabel10);
		jComboBox5.setBounds(970,530,100,20);
		img.add(jComboBox5);
		
		button1=new JButton("Book");
		button1.setBounds(500,620,100,30);
		img.add(button1);
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				connection=connector.Myconnection.getcConnection();
				
				String f=field4.getText();
				String l=field5.getText();
				String c=field6.getText();
				int csize=c.length();
				String t=(String) jComboBox6.getSelectedItem();
				int adult=(int) jComboBox4.getSelectedItem();
				int child=(int) jComboBox5.getSelectedItem();
				if(field4.getText().equals("")||field5.getText().equals("")||field6.getText().equals("")||jComboBox6.getSelectedItem().equals("select")||jComboBox4.getSelectedItem().equals(0)||comboBox1.getSelectedItem().equals("select")||comboBox2.getSelectedItem().equals("select")||comboBox3.getSelectedItem().equals("select"))
				{
					JOptionPane.showMessageDialog(null, "Please fill/select the details");
				}
			
			
				try {
				PreparedStatement stat=connection.prepareStatement("select * from bus where destination=? and type=? and time=?");
				stat.setString(1,b);
				stat.setString(2, d);
				stat.setString(3, t);
				ResultSet rs=stat.executeQuery();
				while(rs.next())
				{
					price=rs.getInt("price");
					System.out.println(price);
				}

				
				for(int i=0;i<=6;i++)
				{
					if(jComboBox4.getSelectedItem().equals(i))		
				{	price=price*i;
					seatad=i;
				System.out.println("adseat"+seatad);}
					if(jComboBox5.getSelectedItem().equals(i))
					{cprice=cprice*i;
						seatchd=i;
					System.out.println("chdst"+seatchd);
						}
				}
					
				
				seat = seatad+seatchd;
				System.out.println("total seat"+seat);
			//	System.out.println("c"+cprice+"\ni"+iprice+"p"+price);
				price=price+cprice;
				
				
					
				
					
					//for availability of seats
				
				PreparedStatement st4=connection.prepareStatement("Select Avablity from bus where type=? and destination=? and time=? ");
				
				st4.setString(1, d);
				st4.setString(2, b);
				st4.setString(3, t);
				ResultSet rs2=st4.executeQuery();
				
				
				while(rs2.next())
				{
				j=rs2.getInt("Avablity");
				//System.out.println("av total"+j);
				
				}
				j=j-seat;
				//System.out.println("available seat"+j+"seats booked"+seat);
				//end of available seats in j and seat=seats booked
				
				if(j>=0 && csize>=10) {
				//Ticket number
				PreparedStatement st2=connection.prepareStatement("Select * from ticketbook");
				ResultSet rs1=st2.executeQuery();
				rs1.last();
				size=rs1.getRow();
				
				if(size>=0)
				{
					tnumber=tnumber+size;
				}
				//end of ticket number in tnumber
				

				hide();
				paymentportal.Payment pt=new Payment(a,b,date1,t,d,f,l,c,adult,child,price,p,tnumber,seat,j);
				}
				else if(csize<10)
				{JOptionPane.showMessageDialog(null, "Enter 10 digit mobile number");}
				else
				{
					JOptionPane.showMessageDialog(null, "Not enough Seats Available!!!!!!!");
				}
				}catch (Exception e) {
					// TODO: handle exception
				}
				
				
				
				
			}
		});

		button2=new JButton("Reset");
		button2.setBounds(690,620,100,30);
		img.add(button2);
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {


				field4.setText(null);
				field5.setText(null);
				field6.setText(null);
				jComboBox4.setSelectedItem(0);
				jComboBox5.setSelectedItem(0);
				
			}
		}); 
		
		JButton button2=new JButton("Back");
		button2.setBounds(890, 620, 100, 30);
		img.add(button2);
		button2.updateUI();
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {


			Status status=new Status(p);
			hide();
				
			}
		});

		
		JButton button5=new JButton("Logout");
		button5.setBounds(1200,150,100,25);
		img.add(button5);
		button5.updateUI();
		button5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				login.Login login=new Login();
				hide();
				
				
			}
		});

	}
	
}
public class Book {

	public Book(String a, String b, String date1, String d, String p) {
		Booking booking=new Booking(a,b,date1, d,p);
	}

	public static void main(String[] args) {
	
	
		
	}
}
