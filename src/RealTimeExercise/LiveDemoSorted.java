package RealTimeExercise;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LiveDemoSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.cssSelector(".table-bordered thead tr th:nth-child(1)")).click();
		//capture all webElements into list
		List<WebElement> ls=driver.findElements(By.xpath("//tr/td[1]"));
		//capture text of all webElements into new (original ) list
		List<String> newString= ls.stream().map(s->s.getText()).collect(Collectors.toList());
		// sort on the original list of step3-> sorted list
		List<String> sortedList= newString.stream().sorted().collect(Collectors.toList());
		//Compare original list vs sorted list
		Assert.assertTrue(newString.equals(sortedList));
		
		List<String> price;
		//scan the name column with get Text  -> Rice -> price of the rice
		do {
			List<WebElement> ls1=driver.findElements(By.xpath("//tr/td[1]"));
		 price = ls1.stream().filter(s->s.getText().contains("Rice"))
		.map(s->getPriceVeggie(s)).collect(Collectors.toList());
		
		price.forEach(a->System.out.println(a));
		
		//pagination
		if(price.size()<1) {
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		}
		}
		while(price.size()<1);
		
	}

	private static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		String price =s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		return price;
				
	}

}
