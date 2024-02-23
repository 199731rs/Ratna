import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

//TestNG is one of the testing framework
public class autoSuggestDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		  Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected()); //Assert.assertFalse(false);
		 System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		 driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		 driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click(); 
		 driver.findElement(By.cssSelector("input[id*='IndArm']")).click();
		  System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		  
		  Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
		  
		  //count the CHECK BOXES of page
		  System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		  
		  //Auto suggest method Dropdown
		  
		  driver.findElement(By.id("autosuggest")).sendKeys("ind"); Thread.sleep(3000);
		  List<WebElement>options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		  for(WebElement option: options)
		  { 
			  if(option.getText().contentEquals("India"))
			  {
				  option.click();
				  break;
			  } 
		  }
		  
		  
		  //select
		  
		  driver.findElement(By.id("divpaxinfo")).click(); Thread.sleep(2000L);
		  
			/*
			 * int i=1; while(i<5) { driver.findElement(By.id("hrefIncAdt")).click(); i++; }
			 * 
			 * System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			 */ 
		  
		 for(int i=1;i<5;i++)
		 {  
			 driver.findElement(By.id("hrefIncAdt")).click();
		 }
		 driver.findElement(By.id("btnclosepaxoption")).click();
		  
		  Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
		  System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		  //System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		  
		  
		  System.out.println("------radio button----------");
		 System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		  System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		 if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		 {
			 System.out.println("its enabled");
			 	Assert.assertTrue(true);
		 
		 }
		 else
		 {
			 Assert.assertTrue(false);
		 }
		  
		 // System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		 

//		driver.close();

	}

}