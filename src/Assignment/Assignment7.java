package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				WebDriver driver=new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				//no of rows
				JavascriptExecutor ja=(JavascriptExecutor)driver;
				ja.executeScript("window.scrollBy(0, 500)");
				System.out.println(driver.findElements(By.cssSelector(".table-display tr")).size());
				//no of column
				System.out.println(driver.findElements(By.cssSelector(".table-display tr:nth-child(1) th")).size());
				//print2row content
				List<WebElement> value=driver.findElements(By.cssSelector(".table-display tr:nth-child(3)"));
				
				System.out.println(value.get(0).getText());
				System.out.println(value.get(1).getText());
				System.out.println(value.get(2).getText());
				
	}

}
