package bokking;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

import com.toedter.calendar.JDateChooser;

import cancellection.Cancel;
import login.Login;

class Bo extends JFrame {

	JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, img;
	JTextField field1, field2, field3;
	JButton button1, button2, button3,button4;
	JDateChooser chooser;
	JComboBox comboBox1, comboBox2, comboBox3;
	Connection connection = null;
	Vector data = new Vector();
	Vector columnName = new Vector();
	Vector row = new Vector();
	JPanel jPanel;

	String[] sItem1 = { "select", "BANGALORE", "CHENNAI", "DELHI", "GOA", };
	String[] sItem2 = { "select", "MUMBAI","PUNE" };
	String[] sItem3 = { "select", "AC", "NON-AC" };
	
	public Bo(final String p) {

		setLayout(null);
		img = new JLabel(new ImageIcon("C:\\Users\\HP\\workspace\\bus_res\\Images\\both.png"));
		add(img);
		img.setLayout(null);
		img.setBounds(0, 0, 1366, 768);

		setVisible(true);
		setSize(getMaximumSize());
		setLayout(null);
		setLocationRelativeTo(null);

		jPanel = new JPanel();
		jPanel.setBounds(400, 150, 550, 400);
		jLabel1 = new JLabel("<HTML><font size=\"5000\" color=\"#ffffff\">WELCOME</font></HTML>");
		jLabel1.setBounds(600, 30, 400, 40);
		img.add(jLabel1);

		jLabel2 = new JLabel("<HTML><font size=\"1000\" color=\"#ffffff\">CHECK-STATUS</font></HTML>");
		jLabel2.setBounds(550, 70, 400, 40);
		img.add(jLabel2);

		jLabel3 = new JLabel("From");
		jLabel3.setBounds(100, 200, 100, 30);
		jLabel3.setForeground(Color.WHITE);
		img.add(jLabel3);

		comboBox1 = new JComboBox(sItem2);
		comboBox1.setBounds(140, 207, 100, 20);
		img.add(comboBox1);

		jLabel4 = new JLabel("To");
		jLabel4.setBounds(115, 280, 100, 30);
		img.add(jLabel4);
		jLabel4.setForeground(Color.WHITE);

		comboBox2 = new JComboBox(sItem1);
		comboBox2.setBounds(140, 287, 100, 20);
		img.add(comboBox2);

		jLabel5 = new JLabel("Bokking Date");
		jLabel5.setBounds(50, 355, 100, 30);
		img.add(jLabel5);
		jLabel5.setForeground(Color.white);

		chooser = new JDateChooser("dd/MM/yyyy", "", '-');
		chooser.setBounds(140, 360, 100, 20);
		chooser.setMinSelectableDate(new java.util.Date());
		img.add(chooser);
		final DateFormat df;
		df = new SimpleDateFormat("dd/MM/yyyy");

		jLabel6 = new JLabel("Type");
		jLabel6.setBounds(100, 440, 100, 30);
		img.add(jLabel6);
		jLabel6.setForeground(Color.white);

		comboBox3 = new JComboBox(sItem3);
		comboBox3.setBounds(140, 447, 100, 20);
		img.add(comboBox3);

		button1 = new JButton("Status");
		button1.setBounds(100, 540, 100, 30);
		img.add(button1);
		button1.setBackground(Color.white);

		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(comboBox1.getSelectedItem().equals("select")||comboBox2.equals("select")||comboBox3.getSelectedItem().equals("select"))
				{
					JOptionPane.showMessageDialog(null, "invalid");
				}
				
				String date1 = df.format(chooser.getDate());
				try {
					connection = connector.Myconnection.getcConnection();
					PreparedStatement pre = connection
							.prepareStatement("select * from bus where type=? and destination=? and date=?");
					pre.setString(1, (String) comboBox3.getSelectedItem());
					pre.setString(2, (String) comboBox2.getSelectedItem());
					pre.setString(3, date1);
					pre.executeQuery();

					ResultSet resultSet = pre.getResultSet();
					
					ResultSetMetaData metaData = resultSet.getMetaData();
					int columns = metaData.getColumnCount();

					for (int i = 1; i <= columns; i++) {
						columnName.addElement(metaData.getColumnName(i));

					}
					while (resultSet.next()) {
						row = new Vector(columns);
						for (int i = 1; i <= columns; i++) {
							row.addElement(resultSet.getObject(i));
						}
						data.addElement(row);
						
					}
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				System.out.println();
				JTable jTable = new JTable(data, columnName);
				for (int i = 1; i < jTable.getColumnCount(); i++) {
					TableColumn tableColumn = jTable.getColumnModel().getColumn(i);
					tableColumn.setMaxWidth(300);
					
				}
				JScrollPane scrollPane = new JScrollPane(jTable);
				scrollPane.updateUI();
				jPanel.add(scrollPane);
				jPanel.updateUI();
				img.add(jPanel);
				img.updateUI();
				
			
			}
			
		});

		button2 = new JButton("Booking");
		button2.setBounds(260, 540, 100, 30);
		img.add(button2);
		button2.setBackground(Color.WHITE);

		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String a = (String) comboBox1.getSelectedItem();
				String b = (String) comboBox2.getSelectedItem();

				String date1 = df.format(chooser.getDate());
				String d = (String) comboBox3.getSelectedItem();
				if(data.size()<=0)
				{
					JOptionPane.showMessageDialog(null, "Bus not available");
				
					
				}
				else {
					bokking.Book book = new bokking.Book(a, b, date1, d, p);	
					hide();
				
					
				}

			}
		});

		button3 = new JButton("Ticket  Cancellation");
		button3.setBounds(150, 600, 150, 30);
		img.add(button3);
		button3.setBackground(Color.WHITE);
		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				cancellection.Cancel cancell = new Cancel(p);
				hide();

			}
		});

		button4=new JButton("Add Bus !!!");
		button4.setForeground(Color.RED);
		button4.setBounds(1200,200,100,25);
		img.add(button4);
		button4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
				BusUpdate busUpdate=new BusUpdate(p);
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

public class Status {

	public Status(String p) {
		Bo bo = new Bo(p);
	}

	public static void main(String[] args) {

	}
}
