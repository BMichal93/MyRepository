import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetCurrencyValue {
	
	public double GetCurrencyValue (String curr) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");           
		ChromeOptions options = new ChromeOptions();
			//options.addArguments("--headless");
			
		WebDriver driver = new ChromeDriver(options); 
		driver.get("https://businessinsider.com.pl/finanse/kursy-walut");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			System.out.println("Website didnt open");
			e1.printStackTrace();
		} 
		
		WebElement consent = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[2]/div/div[6]/button[2]"));
		boolean consentexist= driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[2]/div/div[6]/button[2]")).isDisplayed();
		//If popup appear click button
			if(consentexist) {
				consent.click();
			}
			else {
				System.out.println("No consent window");
			}
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e2) {
				System.out.println("Exception1");
				e2.printStackTrace();
			} 
			
		if (curr == "EUR") {String curres = driver.findElement(By.xpath("/html/body/div[3]/main/section[4]/div//div/div/div/div/table/tbody/tr[36]/td[5]")).getText();
		double exchangerate = Double.parseDouble(curres);
		driver.close();
		return exchangerate;}
		
		else if (curr == "CHF") {String curres = driver.findElement(By.xpath("//*[@id=\"notoria-shadow-root\"]/div/div/div/table/tbody/tr[13]/td[5]")).getText();
		double exchangerate = Double.parseDouble(curres);
		driver.close();
		return exchangerate;}
		
		else if (curr == "GBP") {String curres = driver.findElement(By.xpath("//*[@id=\"notoria-shadow-root\"]/div/div/div/table/tbody/tr[26]/td[5]")).getText();
		double exchangerate = Double.parseDouble(curres);
		driver.close();
		return exchangerate;}
		
		else if (curr == "USD") {String curres = driver.findElement(By.xpath("//*[@id=\"notoria-shadow-root\"]/div/div/div/table/tbody/tr[41]/td[5]")).getText();
		double exchangerate = Double.parseDouble(curres);
		driver.close();
		return exchangerate;}
		
		else {
			driver.close();
			return (Double) null;
		}
		
		
		
		
	}
}
