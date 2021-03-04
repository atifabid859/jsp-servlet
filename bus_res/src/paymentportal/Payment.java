package paymentportal;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Payment extends JFrame {
	JLabel cardnumber, cvvcode, exp_date,img;
	JTextField cardnum, cvv;
	JComboBox comboBox1, comboBox2;
	JButton submit;
	Connection connection=null;
	double bal=0.0d;

	public Payment(final String a, final String b, final String date1, final String t, final String d, final String f,
			final String l, final String c, final int adult, final int child, final double price, final String p,
			final int tnumber, final int seat, final int j) {
		
		


		setLayout(null);
		img = new JLabel(new ImageIcon("C:\\Users\\HP\\workspace\\bus_res\\Images\\fcard1.png"));
		add(img);
		img.setLayout(null);   
		img.setBounds(0, 0, 487, 314);
		
		
		setVisible(true);
		setSize(500,350);
		setLocationRelativeTo(null);	

		setLayout(null);
	
		
		
		cvvcode = new JLabel("CVV/CVV2 Code:");
		cvvcode.setBounds(10, 95, 100, 20);
		cvvcode.setForeground(Color.white);

		exp_date = new JLabel("Expiry Date:");
		exp_date.setBounds(20, 160, 100, 20);
		exp_date.setForeground(Color.white);
		
		cardnum = new JTextField();
		cardnum.setBounds(110, 60, 200, 20);

		cvv = new JTextField();
		cvv.setBounds(110, 95, 150, 20);

		comboBox1 = new JComboBox<>();
		comboBox1.addItem("MM");
		comboBox1.addItem("1");
		comboBox1.addItem("2");
		comboBox1.addItem("3");
		comboBox1.addItem("4");
		comboBox1.addItem("5");
		comboBox1.addItem("6");
		comboBox1.addItem("7");
		comboBox1.addItem("8");
		comboBox1.addItem("9");
		comboBox1.addItem("10");
		comboBox1.addItem("11");
		comboBox1.addItem("12");
		comboBox1.setBounds(115, 160, 70, 20);

		comboBox2 = new JComboBox<>();
		comboBox2.addItem("YYYY");
		comboBox2.addItem("2018");
		comboBox2.addItem("2019");
		comboBox2.addItem("2020");
		comboBox2.addItem("2021");
		comboBox2.addItem("2022");
		comboBox2.addItem("2023");

		comboBox2.setBounds(200, 160, 70, 20);

		submit = new JButton("SUBMIT");
		submit.setBounds(170, 205, 100, 25);
		submit.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("inside");
				try {
					connection = connector.Myconnection.getcConnection();
					
					
					PreparedStatement st9=connection.prepareStatement("select balance from bank where cardnumber=?");
					st9.setString(1, cardnum.getText());
					ResultSet rs9=st9.executeQuery();
					while(rs9.next())
					{
						bal=rs9.getDouble("balance");
					}
					String card=cardnum.getText();
					
					//System.out.println("inside1");
					PreparedStatement preparedStatement = connection.prepareStatement(
							"select * from bank where cardnumber=? and cvv=? and dd=? and yyyy=?");
					System.out.println("inside3");
					preparedStatement.setString(1, cardnum.getText());
					preparedStatement.setString(2, cvv.getText());
					preparedStatement.setString(3, (String) comboBox1.getSelectedItem());
					preparedStatement.setString(4, (String) comboBox2.getSelectedItem());
					//System.out.println(cardnum.getText() + "" + cvv.getText() + "" + comboBox1.getSelectedItem() + ""
					//		+ comboBox2.getSelectedItem());
					ResultSet rs = preparedStatement.executeQuery();
 					int count = 0;
					while (rs.next()) {
						count = count + 1;
					//	System.out.println("insidewhile");
					}
					if (count == 1) {
						hide();
						JOptionPane.showMessageDialog(null, "click here to proceed");
						Portal pt1 = new Portal(a, b, date1, t, d, f, l, c, adult, child, price, p, tnumber, seat, j,bal,card);
						hide();
					} else {
						JOptionPane.showMessageDialog(null, "Invalid credentials");
					}
				} catch (Exception e) {
					// TODO: handle exception
				}

			}
		});

		img.add(cardnum);
		cardnum.updateUI();

	
		img.add(cvvcode);
		cvvcode.updateUI();
		img.add(cvv);
		cvv.updateUI();
		img.add(exp_date);
		exp_date.updateUI();
		img.add(comboBox1);
		comboBox1.updateUI();
		img.add(comboBox2);
		comboBox2.updateUI();
		img.add(submit);
		submit.updateUI();

		

	}
}
