package Top10Boardgames;
import javax.swing.JOptionPane;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Top10Boardgames {         
	
	public static void main(String[] args) throws InterruptedException {
		GetBoardgame getgame = new GetBoardgame();
		String [] GamesArray = new String [11];
for (int i = 1; i <=10; i++) {
		try {
				String game = GetBoardgame.GetBoardgame("//*[@id=\"results_objectname" + i + "\"]/a"); 
				GamesArray [i] = game;
				System.out.println(game); 
				}
		
		catch (InterruptedException e) {
				JOptionPane.showMessageDialog(null, "Exception in game" + i + ": " + e.toString());
				}
			}
			JOptionPane.showMessageDialog(null, GamesArray);
	}
	

}
