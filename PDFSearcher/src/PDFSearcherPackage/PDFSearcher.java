package PDFSearcherPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class PDFSearcher {
	static JTextField t1=new JTextField(); 
	static JButton b1 = new JButton("Search");
	static JTextField t2=new JTextField();  
	static JTextField t3=new JTextField();  
	
	public static void CreateWindow() {
		JFrame f= new JFrame("PDF Searcher"); 
		t1.setBounds(30,100,200,30);   
		f.add(t1);  
		f.setSize(300,400);  
		f.setLayout(null);  
		f.setVisible(true);  
		
		JLabel l1 = new JLabel("PDF location");
		l1.setBounds(30,70,100,30);
		f.add(l1);
		l1.setVisible(true);
		//t1.enable(false);
		
		f.add(b1);
		b1.setBounds(30,300,100,30);
		b1.setVisible(true);
		
		t2.setBounds(30,180, 100,30);   
		f.add(t2);  
		
		JLabel l2 = new JLabel("Searched word");
		l2.setBounds(30,150,200,30);
		f.add(l2);
		l2.setVisible(true);
		
		JLabel l3 = new JLabel("PDF SEARCHER");
		l3.setBounds(120,10,200,30);
		f.add(l3);
		l3.setVisible(true);
		
		JLabel l4 = new JLabel("Searches for matching words in PDF document");
		l4.setBounds(10,20,300,30);
		f.add(l4);
		l4.setVisible(true);
		
		JLabel l5 = new JLabel("Result");
		l5.setBounds(30,210,200,30);
		f.add(l5);
		l5.setVisible(true);
		
		t3.setBounds(30,240, 100,30);   
		f.add(t3); 
		t3.enable(false);
	}

	public static void main(String[] args) throws IOException {
			CreateWindow();//To add filelocation
			//String searchedword = "Word";
			//String filelocation = "Desktop/Karta_postaci.pdf";
			b1.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	String filelocation = t1.getText();
	    			String searchedword = t2.getText();
	            	ParsePDF searcher = new ParsePDF();
	    			Boolean result;
					try {
						JOptionPane.showMessageDialog(null, searchedword);
						JOptionPane.showMessageDialog(null, filelocation);
						result = ParsePDF.ParsePDF(searchedword, filelocation);
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(null, "Exception " + e1.toString());
						e1.printStackTrace();
					}
	    			if (result = true) { t3.setText("True");}
	    			else {t3.setText("False");}
	        			} 
					});
			

}
}
