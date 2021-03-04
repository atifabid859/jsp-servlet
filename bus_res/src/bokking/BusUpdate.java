package bokking;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class BusUpdate extends JFrame {
	JLabel label1,label2,label3,label4,label5,label6,label7,label8,img;
	JTextField field1;
	JComboBox box1,box2,box3,box4,box5,box6,box7;
	JDateChooser ch;
	JButton button1;
	String[] type= {"select","AC","NON-AC"};
			String[] time= {"select","6.00 AM","5.00 PM"};
			String[] source= {"select","MUMBAI","PUNE"};
			String[] dest= {"select","CHENNAI","DELHI","GOA","BANGALORE"};
			
	Connection connection=null;
public BusUpdate(final String p) {
	
	setLayout(null);
	img = new JLabel(new ImageIcon("C:\\Users\\HP\\workspace\\bus_res\\Images\\up.jpg"));
	add(img);
	img.setLayout(null);   
	img.setBounds(0, 0, 300, 600);
	
	
	setVisible(true);
	setSize(300,600);
	setLocationRelativeTo(null);	

	setLayout(null);

	label1=new JLabel("Type");
	label1.setBounds(20, 50, 70, 25);
	label1.setForeground(Color.white);
	box1=new JComboBox<>(type);
	box1.setBounds(100, 50, 100, 25);
	
	
	
	label2=new JLabel("Time");
	label2.setBounds(20, 100, 70, 25);
	label2.setForeground(Color.white);
	box2=new JComboBox<>(time);
	box2.setBounds(100, 100, 100, 25);
	
	
	label3=new JLabel("Source");
	label3.setBounds(20, 150, 70, 25);
	label3.setForeground(Color.white);
	box3=new JComboBox<>(source);
	box3.setBounds(100, 150, 100, 25);
	
	
	label4=new JLabel("Destination");
	label4.setBounds(20, 200, 70, 25);
	label4.setForeground(Color.white);
	box4=new JComboBox<>(dest);
	box4.setBounds(100, 200, 100, 25);
	
	
	label5=new JLabel("Availablity");
	label5.setBounds(20, 250, 70, 25);
	label5.setForeground(Color.white);
	field1=new JTextField("40");
	field1.setBounds(100,250,100,25);
	field1.setEditable(false);
	
	
	label6=new JLabel("Price");
	label6.setBounds(20, 300, 70, 25);
	label6.setForeground(Color.white);
	box5=new JComboBox<>();
	box5.setBounds(100, 300, 100, 25);
	box5.addItem("select");
	box5.addItem(800);
	box5.addItem(1100);
	box5.addItem(1200);
	box5.addItem(1500);
	box5.addItem(1700);
	box5.addItem(1800);
	box5.addItem(2000);
	box5.addItem(2200);
	box5.addItem(2700);
	box5.addItem(3000);
	box5.addItem(4000);
	
	
	label7=new JLabel("Date");
	label7.setBounds(20, 350, 70, 25);
	label7.setForeground(Color.white);
	ch=new JDateChooser("dd/MM/yyyy", "", '-');
	ch.setMinSelectableDate(new java.util.Date());
	final DateFormat df;
	ch.setBounds(100,350,100,25);
	df = new SimpleDateFormat("dd/MM/yyyy");
	
	
	button1=new JButton("Submit");
	button1.setBounds(100, 400, 100, 25);
	button1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			
			if(box1.getSelectedItem().equals("select") || box2.getSelectedItem().equals("select") || box3.getSelectedItem().equals("select") ||
					box4.getSelectedItem().equals("select") || box5.getSelectedItem().equals("select") )
			{
				 
				JOptionPane.showMessageDialog(null, "plzz fill All Details !!! Try Again????");			
			}
			
			
			
			String date1=df.format(ch.getDate());
			String type1=(String) box1.getSelectedItem();
			String time=(String) box2.getSelectedItem();
			String source=(String) box3.getSelectedItem();
			String dest=(String) box4.getSelectedItem();
			int price=(int) box5.getSelectedItem();
			try {
			System.out.println("actn");
				
			connection=connector.Myconnection.getcConnection();
			System.out.println("after connectn");
			PreparedStatement st=connection.prepareStatement("insert into bus(type,source,destination,time,Avablity,price,date) values(?,?,?,?,?,?,?)");

System.out.println("prst");
			//st.setInt(1, i);
			st.setString(1, type1);
			st.setString(2, source);
			st.setString(3, dest);
			st.setString(4, time);
			st.setString(5, field1.getText());
			st.setLong(6, price);
			
			st.setString(7, date1);
			st.executeUpdate();
			JOptionPane.showMessageDialog(null, "done");
			
			
		//	Status status=new Status(p);
		//	hide();
			
			
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			}
	});
	
	JButton button2=new JButton("Back");
	button2.setBounds(100, 450, 100, 25);
	img.add(button2);
	button2.updateUI();
	button2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {


		Status status=new Status(p);
		hide();
			
		}
	});
	
	
	
	img.add(label1);
	label1.updateUI();
	img.add(box1);
	box1.updateUI();
	img.add(label2);
	label2.updateUI();
	img.add(box2);
	box2.updateUI();
	img.add(label3);
	label3.updateUI();
	img.add(box3);
	box3.updateUI();
	img.add(label4);
	label4.updateUI();
	img.add(box4);
	box4.updateUI();
	img.add(label5);
	label5.updateUI();
	img.add(field1);
	field1.updateUI();
	img.add(label6);
	label6.updateUI();
	img.add(box5);
	box5.updateUI();
	img.add(label7);
	label7.updateUI();
	img.add(ch);
	ch.updateUI();
	img.add(button1);
	button1.updateUI();
	
	
}

}
