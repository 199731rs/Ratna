import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {	
		//Invoking browser
		//Chrome - ChromeDriver exten-> Methods close get
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//Firefox
		//gekodriver
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Documents/geckodriver.exe");
		
		//WebDriver driver = new FirefoxDriver();
		
		//microsoft
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\Admin\\Documents/msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.prashantchaturvedi.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//driver.quit();
	}

}
