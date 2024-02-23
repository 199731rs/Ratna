import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Implicit_Base {

	public static void main(String args[]) throws InterruptedException {
		String text = "Ratna";

		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;//expected
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		String[] itemsNeed={"Cucumber","Brocolli","Beetroot"};
		int itemsize=itemsNeed.length;
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		addItems(driver,itemsNeed, itemsize);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("promoBtn")).click();
		//explicut wait
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		/*
		 * List<WebElement> products=
		 * driver.findElements(By.cssSelector("h4.product-name")); for(int
		 * i=0;i<products.size();i++) { String[] name=
		 * products.get(i).getText().split("-"); //format the name String
		 * formatting=name[0].trim();
		 * 
		 * // check whether name you extracted is present in array or not- //convert
		 * array into array list for easy search: because of saving memory List
		 * itemsNeededList=Arrays.asList(itemsNeed);
		 * 
		 * if(itemsNeededList.contains(formatting)) { j++;
		 * driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i)
		 * .click(); if(j==itemsize) { break; } } }
		 */
			
	}
	
	public static void addItems(WebDriver driver,String[] itemsNeed,int itemsize )
	{
		int j=0;
		List<WebElement> products= driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<products.size();i++) {
			String[] name= products.get(i).getText().split("-");
			//format the name 
			String formatting=name[0].trim();
			
			// check whether name you extracted is present in array or not-
			//convert array into array list for easy search: because of saving memory
			List itemsNeededList=Arrays.asList(itemsNeed);
			
			if(itemsNeededList.contains(formatting))
			{	
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemsize) {
					break;
				}
			}
		}
		
		
	}
	
}