import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.Assert;

public class Scrolled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js =(JavascriptExecutor)driver; 
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		List<WebElement> value=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));	
		int sum=0;
		for(int i=0;i<value.size();i++) {
			sum=sum+ Integer.parseInt(value.get(i).getText());	 
			
		}
		System.out.println(sum);
		
		//System.out.println(driver.findElement(By.className("totalAmount")).getText().split(":"));
		int value1= Integer.parseInt(driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim());
		
		Assert.assertEquals(sum, value1);
		
	}
	

}
