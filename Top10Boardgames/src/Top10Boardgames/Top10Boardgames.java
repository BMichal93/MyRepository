package Top10Boardgames;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Top10Boardgames {         
	static JTextField game1=new JTextField(); 
	static JTextField game2=new JTextField(); 
	static JTextField game3=new JTextField(); 
	static JTextField game4=new JTextField(); 
	static JTextField game5=new JTextField(); 
	static JTextField game6=new JTextField(); 
	static JTextField game7=new JTextField(); 
	static JTextField game8=new JTextField(); 
	static JTextField game9=new JTextField(); 
	static JTextField game10=new JTextField(); 
	
	public static void main(String[] args) {
		//Create app windows
		JFrame framewindow= new JFrame("Top 10 games"); 
		framewindow.setSize(300,550);  
		framewindow.setLayout(null);  
		framewindow.setVisible(true);  
		
		//Add title
		JLabel Title = new JLabel("Top 10 games");
		Title.setBounds(100,10,100,30);
		framewindow.add(Title);
		Title.setVisible(true);
		
		//Create textboxes
		game1.setBounds(10,90,270,30);
		game1.setVisible(true);
		game1.enable(false);
		framewindow.add(game1);
		
		game2.setBounds(10,130,270,30);
		game2.setVisible(true);
		game2.enable(false);
		framewindow.add(game2);
		
		game3.setBounds(10,170,270,30);
		game3.setVisible(true);
		game3.enable(false);
		framewindow.add(game3);
		
		game4.setBounds(10,210,270,30);
		game4.setVisible(true);
		game4.enable(false);
		framewindow.add(game4);
		
		game5.setBounds(10,250,270,30);
		game5.setVisible(true);
		game5.enable(false);
		framewindow.add(game5);
		
		game6.setBounds(10,290,270,30);
		game6.setVisible(true);
		game6.enable(false);
		framewindow.add(game6);
		
		game7.setBounds(10,330,270,30);
		game7.setVisible(true);
		game7.enable(false);
		framewindow.add(game7);
		
		game8.setBounds(10,370,270,30);
		game8.setVisible(true);
		game8.enable(false);
		framewindow.add(game8);
		
		game9.setBounds(10,410,270,30);
		game9.setVisible(true);
		game9.enable(false);
		framewindow.add(game9);
		
		game10.setBounds(10,450,270,30);
		game10.setVisible(true);
		game10.enable(false);
		framewindow.add(game10);
		
		//Create button
		JButton searchbutton=new JButton("Search!");
		searchbutton.setBounds(90,50,100,30);
		searchbutton.setVisible(true);
		framewindow.add(searchbutton);
		
		searchbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	GetTop10 getgames = new GetTop10();
            	try {
					String[] topgames = getgames.GetTop10();
						game1.setText(topgames[1]);
						game2.setText(topgames[2]);
						game3.setText(topgames[3]);
						game4.setText(topgames[4]);
						game5.setText(topgames[5]);
						game6.setText(topgames[6]);
						game7.setText(topgames[7]);
						game8.setText(topgames[8]);
						game9.setText(topgames[9]);
						game10.setText(topgames[10]);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Exception: " + e1.toString());
				}
            }
		
		});
		

		
	}
}
	
	

