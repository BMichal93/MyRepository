import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetCurrencyValue {
	
	public double GetCurrencyValue (String curr) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");           
		ChromeOptions options = new ChromeOptions();
			//options.addArguments("--headless");
			
		WebDriver driver = new ChromeDriver(options); 
		try {
			Thread.sleep(500);
		} catch (InterruptedException e1) {
			System.out.println("Website didnt open");
			e1.printStackTrace();
		} 
			
		if (curr == "EUR") {
			driver.get("https://www.google.com/search?q=currency+converter&rlz=1C1AVFC_enPL907PL907&oq=currency+converter&aqs=chrome.0.69i59l2j0i512j0i395i512j0i20i263i395i512j69i60l3.11664j1j7&sourceid=chrome&ie=UTF-8");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e3) {
				System.out.println("Website didnt open");
				e3.printStackTrace();
			} 
			
		String curres = driver.findElement(By.xpath("//*[@id=\"knowledge-currency__updatable-data-column\"]/div[1]/div[2]/span[1]")).getText();
		double exchangerate = Double.parseDouble(curres);
		driver.close();
		return exchangerate;}
		
		
		
		else if (curr == "CHF") {
			driver.get("https://www.google.com/search?q=pln+to+chf&rlz=1C1AVFC_enPL907PL907&oq=pln+to+chf&aqs=chrome..69i57j0i512j0i22i30l8.1608j1j9&sourceid=chrome&ie=UTF-8");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e4) {
				System.out.println("Website didnt open");
				e4.printStackTrace();
			} 
			
		String curres = driver.findElement(By.xpath("//*[@id=\"knowledge-currency__updatable-data-column\"]/div[1]/div[2]/span[1]")).getText();
		double exchangerate = Double.parseDouble(curres);
		driver.close();
		return exchangerate;}
		
		else if (curr == "GBP") {
			driver.get("https://www.google.com/search?q=pln+to+gbp&rlz=1C1AVFC_enPL907PL907&oq=pln+to+gbp&aqs=chrome..69i57j0i512l3j0i20i263i512j0i512l4j0i390.1872j1j7&sourceid=chrome&ie=UTF-8");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e5) {
				System.out.println("Website didnt open");
				e5.printStackTrace();
			} 
			String curres = driver.findElement(By.xpath("//*[@id=\"knowledge-currency__updatable-data-column\"]/div[1]/div[2]/span[1]")).getText();
		double exchangerate = Double.parseDouble(curres);
		driver.close();
		return exchangerate;}
		
		else if (curr == "USD") {
			driver.get("https://www.google.com/search?q=pln+to+usd&rlz=1C1AVFC_enPL907PL907&oq=pln+to+usd&aqs=chrome..69i57j0i512l5j0i20i263i512j0i512l3.2488j1j7&sourceid=chrome&ie=UTF-8");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e6) {
				System.out.println("Website didnt open");
				e6.printStackTrace();
			} 
			String curres = driver.findElement(By.xpath("//*[@id=\"knowledge-currency__updatable-data-column\"]/div[1]/div[2]/span[1]")).getText();
		double exchangerate = Double.parseDouble(curres);
		driver.close();
		return exchangerate;}
		
		else {
			driver.close();
			return (Double) null;
		}
		
		
		
		
	}
}
