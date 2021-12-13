package Top10Boardgames;

import javax.swing.JOptionPane;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetBoardgame extends Top10Boardgames {
	  
	
	
	public static String GetBoardgame (String gamepath) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");	
		WebDriver driver = new ChromeDriver(options); 
		driver.get("https://webcache.googleusercontent.com/search?q=cache:KiTZuxtExzYJ:https:%2F%2Fboardgamegeek.com%2Fbrowse%2Fboardgame%20&cd=5&hl=en&ct=clnk&gl=pl");
		try {
			Thread.sleep(2000);} 
		catch (InterruptedException e1) {
			System.out.println("Website didnt open");
			JOptionPane.showMessageDialog(null, "Exception " + e1.toString());
		} 
		String Game = driver.findElement(By.xpath(gamepath)).getText();
		driver.close();
		return Game;
		
	}
}
