package RealTimeExercise;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
public class MiscelleanousScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//delete all cookies
		driver.manage().deleteAllCookies();
		//delete only one cookies
		driver.manage().deleteCookieNamed("sessionKeys");
		//click on any link login page verify login url
	//	driver.manage().addCookie(null);
		driver.get("https://google.com");
		
		File src=  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("D://screenshot.png"));
		
	}
}
	