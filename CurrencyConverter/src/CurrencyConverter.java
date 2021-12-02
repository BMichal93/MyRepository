import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.text.JTextComponent;
public class CurrencyConverter {
	
	public static String[] CreateGUI() {
		JFrame f= new JFrame("Currency converter");    
		JTextField t1=new JTextField();  
		t1.setBounds(30,100, 100,30);   
		f.add(t1);  
		f.setSize(400,300);  
		f.setLayout(null);  
		f.setVisible(true);  
		//Create label amount 1
		JLabel l1 = new JLabel("Amount");
		l1.setBounds(30,70,200,30);
		f.add(l1);
		l1.setVisible(true);
		//Create button
		JButton b1 = new JButton("Calculate");
		f.add(b1);
		b1.setBounds(150,200,100,30);
		b1.setVisible(true);
		
		JTextField t2=new JTextField();  
		t2.setBounds(270,100, 100,30);   
		f.add(t2);  
		//Create label amount 1
		JLabel l2 = new JLabel("Amount calculated");
		l2.setBounds(270,70,200,30);
		f.add(l2);
		l2.setVisible(true);
		
		JLabel l3 = new JLabel("Currency converter");
		l3.setBounds(140,30,200,30);
		f.add(l3);
		l3.setVisible(true);
		
		String[] CurrenciesString = { "USD", "GBP", "EUR", "CHF" };
		JComboBox d1 = new JComboBox(CurrenciesString);
		f.add(d1);
		d1.setSelectedIndex(3);
		d1.setBounds(30,140,100,30);
		d1.setVisible(true);
		
		String[] PLN = { "PLN" };
		JComboBox d2 = new JComboBox(PLN);
		f.add(d2);
		d2.setSelectedIndex(0);
		d2.enable(false);
		d2.setBounds(270,140,100,30);
		d2.setVisible(true);
		
		String amount1 = t1.getText();
		String amount2 = t2.getText();
		String curr1 = (String) d1.getSelectedItem();
		String curr2 = (String) d2.getSelectedItem();
		  
		String[] results = new String[4];

		    results[0] = amount1;
		    results[1] = amount2;
		    results[2] = curr1;
		    results[3] = curr2;
		
		return results;
		
	
		
		
	}
	public static void main(String[] args) {
		CreateGUI();
		GetCurrencyValue toconvert = new GetCurrencyValue();
		double result = toconvert.GetCurrencyValue("EUR");
		JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, result);
		

	}

	

}
