package Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2{
	
	public static void main(String args[]) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("ratna");
		driver.findElement(By.name("email")).sendKeys("ratna@1234");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("1234");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement dropdown= driver.findElement(By.id("exampleFormControlSelect1"));
		Select drop= new Select(dropdown);
		drop.selectByIndex(0);
		System.out.println(drop.getFirstSelectedOption().getText());
	//-------------------------------------------------------------------------
			driver.findElement(By.id("inlineRadio1")).click();
			
			driver.findElement(By.cssSelector("input[type='date']")).sendKeys("31/07/1999");
			driver.findElement(By.className("btn")).click();
			System.out.println(driver.findElement(By.className("alert")).getText());
		
	}
}
