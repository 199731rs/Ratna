package Frameworks;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testng2 {

	@Parameters({"URL"})
	@BeforeClass
	public void BfClass(String url){
		System.out.println("------------");
		System.out.println(url);
	}
	
	@AfterClass
	public void AfClass() {
		System.out.println("**********************");
	}
	@Test(groups= {"Smoke"})
	public void MobileWebLoginCarLoan() {
		System.out.println("weblogincar");
	}
	
	@BeforeSuite
	public void bfSuite(){
		System.out.println("i am no one");
	}
	
	@AfterSuite
	public void afsuite() {
		System.out.println("i am the last");
	}
	
	@BeforeMethod
	public void  beforeEvery() {
	 System.out.println("I will Execute every methods :)");	
	}
	
	@AfterMethod
	public void AFterMethod(){
		System.out.println("i will run last byee :(:(:(");
	}
	@Test
	public void MobileLogiccarLoan() {
		System.out.println("Mobile login");
	}
	@Test(groups= {"Smoke"})
	public void MobileLoginAIcarLoan() {
		System.out.println("loanlogincar");
	}
	@BeforeTest
	public void prequiste(){
		System.out.println("i will run first");
	}
	
	@AfterTest
	public void lastExecute(){
		System.out.println("i will run last");
	}
	
}
