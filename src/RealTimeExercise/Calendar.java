package RealTimeExercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
		WebElement element=driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click();
		while(!driver.findElement(By.cssSelector("div[class='flatpickr-month']")).getText().contains("jan"))
		{
			driver.findElement(By.cssSelector("[class='flatpickr-current-month'] th[class='cur-month']")).click();
		}
		List<WebElement> dates=driver.findElements(By.className("flatpickr-day"));
		int count=driver.findElements(By.className("flatpickr-day")).size();
		for(int i=0;i<count;i++) {
			String Text=driver.findElements(By.className("flatpickr-day ")).get(i).getText();
			if(Text.equalsIgnoreCase("23")) {
				driver.findElements(By.className("flatpickr-day")).get(i).click();
				break;
			}
			
		}
		
	}
}
		