package Frameworks;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG1 {
	
	@Parameters({"URL"})
	@Test
	public void Demo(String urlname) {
		// TODO Auto-generated constructor stub
		System.out.println("hello");
		System.out.println(urlname);
	}
	@Test(timeOut=4000)
	public void TimeOut() {
		// TODO Auto-generated constructor stub
		System.out.println("Timeout issue");
	}
	
	
	@Test(enabled=false)
	public void SecondTest() {
		System.out.println("bye");
	}
	@Test(groups= {"Smoke"})
	public void B() {
		System.out.println("BBBBBBBBBB");
	}
	@Test(dependsOnMethods= {"Demo","B"})
	public void A() {
		System.out.println("AAAAAAAAAA");
	}

}
