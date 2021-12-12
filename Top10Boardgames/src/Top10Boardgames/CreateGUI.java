package Top10Boardgames;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CreateGUI {
	static JTextField t1=new JTextField(); 
	static JButton b1 = new JButton("Calculate");
	static JTextField t2=new JTextField();  
	static String[] CurrenciesString = { "USD", "GBP", "EUR", "CHF" };
	static JComboBox d1 = new JComboBox(CurrenciesString);
	static String[] PLN = { "to PLN", "from PLN" };
	static JComboBox d2 = new JComboBox(PLN);
	
	public static void CreateGUI (String game1, String game2, String game3, String game4, String game5, String game6, String game7, String game8, String game9, String game10) {
		JFrame f= new JFrame("Top 10 games"); 
		t1.setBounds(30,100, 100,30);   
		f.add(t1);  
		f.setSize(1000,300);  
		f.setLayout(null);  
		f.setVisible(true);  
		
		JLabel l1 = new JLabel("Amount");
		l1.setBounds(30,70,200,30);
		f.add(l1);
		l1.setVisible(true);
		//Create button
		
		f.add(b1);
		b1.setBounds(150,200,100,30);
		b1.setVisible(true);
		
		
		t2.setBounds(270,100, 100,30);   
		f.add(t2);  
		
		JLabel l2 = new JLabel("Amount calculated");
		l2.setBounds(270,70,200,30);
		f.add(l2);
		l2.setVisible(true);
		
		JLabel l3 = new JLabel("Currency converter");
		l3.setBounds(140,30,200,30);
		f.add(l3);
		l3.setVisible(true);
		
		
		f.add(d1);
		d1.setSelectedIndex(3);
		d1.setBounds(30,140,100,30);
		d1.setVisible(true);
		
		
		f.add(d2);
		d2.setSelectedIndex(0);
		d2.setBounds(270,140,100,30);
		d2.setVisible(true);
		
	
		
	}
}
