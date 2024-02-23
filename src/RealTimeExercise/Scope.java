package RealTimeExercise;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// 1 Give me the count of links on page
		// 2.count of footer sections

		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
	//limitscope of driver or make mini driver or subset driver
		
		//System.out.println(driver.findElement(By.id("gf-BIG")));
	
		WebElement footerdriver= driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		//3.only first column link
		
		WebElement coloumnDriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumnDriver.findElements(By.tagName("a")).size());
	
		int sizelimit = coloumnDriver.findElements(By.tagName("a")).size();
		//4.click on each link in the column and check if the pages are opening.
		
		for(int i=1;i<sizelimit;i++) {
			
			
			String clickonlinkTab= Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			coloumnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			
			Thread.sleep(5000L);
		}//open all the tab
			Set<String> abc=driver.getWindowHandles();
			Iterator<String> it=abc.iterator();
			
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			//gives the title of tab
			
		
		
	
	}

}
