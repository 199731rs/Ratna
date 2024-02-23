package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[1]/input")).click();
		String opt=driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[1]")).getText();
		
		WebElement drop=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select s=new Select(drop);
		s.selectByVisibleText(opt);
		
		driver.findElement(By.id("name")).sendKeys(opt);
		driver.findElement(By.id("alertbtn")).click();
		String text=  driver.switchTo().alert().getText();
		
		  if(text.contains(opt))
		  {
			  System.out.println("Alert message success");

		   }
		    else
		    	System.out.println("Something wrong with execution");
		 
		}

}
