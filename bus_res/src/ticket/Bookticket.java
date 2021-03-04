package ticket;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import bokking.Status;


 class Bk extends JFrame {

	 
	 String s1="Please bring a softcopy or a hardcopy of this ticket during your journey";
	public Bk(final String a,final String b,final String date1,final String t,final String d,final String f, final String l,final String c,final int adult,final int child,final double price,final String p, int tnumber) {
	

		setTitle("Ticket");
		setVisible(true);
		setSize(800, 600);
		setLayout(null);
		final String FILE = "d:/FirstPdf.pdf";
	    
	    
		Container c1 = getContentPane();
		c1.setLayout(new BorderLayout());

		JPanel Panel2 = new JPanel(null);

		Panel2.setPreferredSize(new Dimension(500, 200));

		

		JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9, jLabel10, jLabel11,
				jLabel12, jLabel13,jtimelabel,jtnum;
		JButton jprintpdf;
		
	    jLabel1=new JLabel("<html><b><font color=\"#C71585\",size=\"7\">SEED TRAVELS.</font></b></html>");
	    
	    
		  
		 jLabel2=new JLabel("<html><b><font color=\"#000000\">Name &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font></b><font color=\"#778899\">"+f+"  "+l+"</font></html>");
		  
		 jtnum=new JLabel("<html><font color=\"#000000\">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;Ticket no  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font><font color=\"#778899\">"+tnumber+"</font></html>");
		 
		  jLabel3 = new JLabel("<html><font color=\"#000000\">From&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font><font color=\"#778899\">"+a+"</font></html>"); 
		  
		 jLabel4 = new JLabel("<html><font color=\"#000000\">To &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font><font color=\"#778899\">"+b+"</font></html>" );
		  
		 jLabel5= new JLabel("<html><font color=\"#000000\">Traveling Date &nbsp;&nbsp; &nbsp; &nbsp; &nbsp;:&nbsp;</font><font color=\"#778899\">"+date1+"</font></html>" ); 
		  
		  jtimelabel=new JLabel("<html><font color=\"#000000\">Time &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;:&nbsp;</font><font color=\"#778899\">"+t+"</font></html>");		  
		  
		  jLabel6 = new JLabel("<html><font color=\"#000000\">Type &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;:&nbsp;</font><font color=\"#778899\">"+d+"</font></html>" ); 
		  
		 jLabel7= new JLabel("<html><font color=\"#000000\">Adult &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;:&nbsp;</font><font color=\"#778899\">"+adult+"</font></html>" ); 
		  
		  jLabel8= new JLabel("<html><font color=\"#000000\">Children &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font><font color=\"#778899\">"+child+"</font></html>" );
		  
		  jLabel9= new JLabel("<html><font color=\"#000000\">Contact Number   &nbsp; &nbsp; &nbsp;: &nbsp;</font><font color=\"#778899\">"+c+"</font></html>" );
		 
		  jLabel10= new JLabel("<html><font color=\"#000000\">Total Price &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: INR.&nbsp;</font><font color=\"#778899\">"+price+"</font></html>" ); 
		
		  
		
		jLabel11= new JLabel("<html><body><I><font color=\"#D2B48C\">Wish you a happy journey</font></I></body></html>");
		  
		 
		 jLabel12=new JLabel("<html><font color=\"#000000\">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;Booked By  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;:  <b>"+p+"</b> &nbsp;</font></html>");
		  
		  jLabel13= new JLabel("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		  
		  jprintpdf=new JButton("Save ticket");
		  jprintpdf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 try {

						Document d1=new Document();
						PdfWriter.getInstance(d1, new FileOutputStream(FILE));
						d1.open();
						Image img=Image.getInstance("D:///123///AWT-Bus.png");
						img.scaleAbsolute(520f, 100f);
						Font f1=new Font();
						f1.setStyle(Font.BOLD);
						
						f1.setSize(10);
						Paragraph p4 =new Paragraph("Reservation Ticket",f1);
						p4.setAlignment(Element.ALIGN_CENTER);	
						PdfPTable table=new PdfPTable(2);
						
						
						PdfPCell cell1=new PdfPCell(new Phrase("Content"));
						cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
						table.addCell(cell1);
						
						PdfPCell cell2=new PdfPCell(new Phrase("Details"));
						cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
						table.addCell(cell2);
						
						table.addCell("Name");
				        table.addCell(f+" "+l);
				        table.addCell("From");
				        table.addCell(a);
				        table.addCell("To");
				        table.addCell(b);
				        table.addCell("Travelling Date");
				        table.addCell(date1);
				        table.addCell("Time");
				        table.addCell(t);
				        table.addCell("Type");
				        table.addCell(d);
				        
				        table.addCell("Adults");
				        table.addCell(String.valueOf(adult));
				        table.addCell("Childrens");
				        table.addCell(String.valueOf(child));
				        table.addCell("Contact Number");
				        table.addCell(String.valueOf(c));
				        table.addCell("Total Price");
				        table.addCell(String.valueOf(price));
						
				        Font f2 = new Font();
				        f2.setColor(BaseColor.RED);
				        f2.setSize(12);
				        f2.setStyle(Font.BOLD);
						Paragraph p1=new Paragraph("Note:",f2);
						Paragraph p2=new Paragraph();
						p2.add(s1);
						
						
						
						
						d1.add(img);
						d1.add(new Paragraph(" "));
						d1.add(p4);
						d1.add(new Paragraph(" "));
						d1.add(new Paragraph(" "));
						d1.add(table);
						d1.add(new Paragraph(" "));
						d1.add(new Paragraph(" "));
						d1.add(p1);
						d1.add(new Paragraph(" "));
						d1.add(p2);
					d1.close();
					System.out.println("done");
	                    JOptionPane.showMessageDialog(null, "Saved to your disk");
	                    hide();
	                    bokking.Status status=new Status(p);
	            } catch (Exception e3) {
	                    e3.printStackTrace();
	            }
			}

	    // iText allows to add metadata to the PDF which can be viewed in your Adobe
	    // Reader
	    // under File -> Properties
	   	 
			
		
		
		
			
		});
		  
	  
		  jLabel1.setBounds(170,15,500,45); 
		  jLabel2.setBounds(20,80,300,20);
		  
		  jLabel3.setBounds(20,125,300,20); 
		  jLabel4.setBounds(20,170,300,20);
		  jLabel5.setBounds(20,215,300,20); 
		  jtimelabel.setBounds(20, 260, 300, 20);
		  jLabel6.setBounds(20,305,300,20);
		  jLabel7.setBounds(20,345,300,20); 
		  jLabel8.setBounds(20,385,300,20);
		  jLabel9.setBounds(20,430,300,20);
		  jLabel10.setBounds(20,460,300,20);
		  
		  jLabel11.setBounds(530,500,300,20);
		  
		  
		  jLabel12.setBounds(400,80,300,20);
		  
		  jtnum.setBounds(400, 130, 300, 20);
		  jLabel13.setBounds(3,510,1000,20);
		  jprintpdf.setBounds(200, 535, 100, 25);
		  Panel2.add(jLabel1); 
		  Panel2.add(jLabel2); 
		  Panel2.add(jLabel3);
		  Panel2.add(jLabel4); 
		  Panel2.add(jLabel5);
		  Panel2.add(jtimelabel);
		  Panel2.add(jLabel6);
		  Panel2.add(jLabel7);
		  Panel2.add(jLabel8);
		  Panel2.add(jLabel9);
		  Panel2.add(jLabel10);
		  //Panel2.add(LEmpty);
		  Panel2.add(jtnum);
		  
		  Panel2.add(jLabel11);
		  
		  Panel2.add(jLabel12); Panel2.add(jLabel13);
			Panel2.add(jprintpdf);
		 
		Panel2.setBackground(Color.white);

		c1.add(Panel2, BorderLayout.CENTER);


	}
	
}

 
 
 public class Bookticket
 {
	 public Bookticket(String a, String b, String date1, String t, String d, String f, String l, String c, int adult, int child, double price, String p, int tnumber) {
		 
		 Bk book=new Bk(a,b,date1,t,d,f,l,c,adult,child,price,p,tnumber);
	}
	 
 }