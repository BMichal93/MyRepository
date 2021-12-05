import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;
import javax.swing.*;

public class CurrencyConverter {
	static JTextField t1=new JTextField(); 
	static JButton b1 = new JButton("Calculate");
	static JTextField t2=new JTextField();  
	static String[] CurrenciesString = { "USD", "GBP", "EUR", "CHF" };
	static JComboBox d1 = new JComboBox(CurrenciesString);
	static String[] PLN = { "to PLN", "from PLN" };
	static JComboBox d2 = new JComboBox(PLN);

	
	public static void CreateGUI() {
		JFrame f= new JFrame("Currency converter"); 
		t1.setBounds(30,100, 100,30);   
		f.add(t1);  
		f.setSize(400,300);  
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
	public static void main(String[] args) {
		CreateGUI();
		
		b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String amountvaluestr = t1.getText();	
        			isNumeric validation = new isNumeric();
        			boolean validateinput = validation.isNumeric(amountvaluestr);
        			if (validateinput == false) {
        				 JOptionPane.showMessageDialog(null, "Exception - input should be numbers!");
        				 System.exit(0);
        			}
        			
            	String ch1 = (String)d1.getSelectedItem();
            	String ch1val = d1.getSelectedItem().toString();
            	GetCurrencyValue toconvert = new GetCurrencyValue();
            	double exrange = toconvert.GetCurrencyValue(ch1val);
            	String ch2 = (String)d2.getSelectedItem();
            	String ch2val = d2.getSelectedItem().toString();
            		
            	double amountvalue = Double.parseDouble(amountvaluestr); 
            	
            	if (ch2val == "to PLN") {
					String resultfin = Double.toString(Math.round((amountvalue/exrange)*100.0) / 100.0);
				    t2.setText(resultfin);
				}
				else {
					String resultfin = Double.toString(Math.round((amountvalue*exrange)*100.0) / 100.0);
				    t2.setText(resultfin);
				}
            	
            }
		});
		
		


	}

	

}
