package Top10Boardgames;

import javax.swing.JOptionPane;

public class GetTop10 {

	public String[] GetTop10() throws InterruptedException {
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
			JOptionPane.showMessageDialog(null, "Data downloaded!");
			
			return GamesArray;
			
	}
}
