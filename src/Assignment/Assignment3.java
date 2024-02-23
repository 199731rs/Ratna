package Assignment;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3{
	
	public static void main(String args[]) {
		
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.cssSelector("input[id='usertype']")).click();
		//driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
		
		WebElement dropdown=driver.findElement(By.tagName("select")); 
		Select drop=new Select(dropdown);
		drop.selectByIndex(2);
		System.out.println(drop.getFirstSelectedOption().getText());
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.name("signin")).click();
		
		wait.until(ExpectedConditions.urlContains("https://rahulshettyacademy.com/angularpractice/shop"));
		
		List <WebElement> products=driver.findElements(By.cssSelector(".btn.btn-info"));
		for(int i=0;i<products.size();i++) {
			driver.findElements(By.cssSelector(".btn-info")).get(i).click();		
			} 
	
		driver.findElement(By.cssSelector(".nav-link.btn")).click();
		
	}
}