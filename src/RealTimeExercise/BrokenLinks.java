package RealTimeExercise;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		//broken URL
		//Step-1 -IS to get all URLs tied up to the links using Selenium
		//java methods will call URL's and gets you the status code
		//if status code >400 then that URL is not working --> link which tied to URL is broken
		//$('a[href="soap"]')
		
		//one single link
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String url=driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int resCode= conn.getResponseCode();
		System.out.println(resCode);
		
		//for all link
		
		List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for(WebElement link: links ) {
			
			String url1=link.getAttribute("href");
			HttpURLConnection con = (HttpURLConnection) new URL(url1).openConnection();
			con.setRequestMethod("HEAD");
			con.connect();
			int resCode2= con.getResponseCode();
			System.out.println(resCode2);
			if (resCode2>400)
			{
				System.out.println("The link with Text "+ link.getText()+"is broke with code" +resCode2);
				Assert.assertTrue(false);
			}
		}
		
		
		
	}
	
}