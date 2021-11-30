import javax.swing.*;  
import java.awt.*;
import java.awt.event.*;

public class GameGIUI2 {

	public static void main(String[] args) {
		//Create interface
		JFrame f= new JFrame("Guess the number!");  
	    JTextField t1;  
	    t1=new JTextField();  
	    t1.setBounds(90,100, 200,30);   
	    f.add(t1);  
	    f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true);  
	    //Create label
	    JLabel l1 = new JLabel("Is it 1,2, or 3?");
	    l1.setBounds(90,70,200,30);
	    f.add(l1);
	    l1.setVisible(true);
	    //Create button
	    JButton b1 = new JButton("Check result!");
	    f.add(b1);
	    b1.setBounds(90,200,200,30);
	    b1.setVisible(true);
	    //Function to button
	    b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	int input=Integer.parseInt(t1.getText());  
        	    GenerateNumber randomnumber = new GenerateNumber();
        	    if (input > 3||input < 1) { JOptionPane.showMessageDialog(null, "Provide number 1-3!");}
        	    else {
        	    boolean guess = randomnumber.GenerateNumber(input);
        	    	if (guess == true) {
        	    		JOptionPane.showMessageDialog(null, "Correct!");
        	    	}
        	    	else {
        	    		JOptionPane.showMessageDialog(null, "Incorrect!");
        	    	}}
            }
        });
	    
	    
	    
	}

}
