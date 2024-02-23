package Frameworks;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS {
	
	public void doThis() {
		
		System.out.println("i am here");
	}
	
	@BeforeMethod
	public void beforeRun() {
		System.out.println("Run me first");
	}
	@AfterMethod
	public void afterRun() {
		System.out.println("Run me last");
	}
	
}
