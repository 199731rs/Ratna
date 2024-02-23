package Frameworks;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG3 {
	@Parameters({"URL","APIKey/username"})
	@Test
	public void WebLoginHOmeLoan(String urlname ,String key) {
		System.out.println("weblogincarHOMEPersonal Loan");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@Test(dataProvider="getData")
	public void MobileLogicHomeLoan(String username,String password) {
		System.out.println("Mobile login HOME");
		System.out.println(username);
		System.out.println(password);
	}
	@Test
	public void LoginAIHomeLoan() {
		System.out.println("loanloginHOME");
		Assert.assertTrue(false);
	}
	
	@DataProvider
	public Object[][] getData() {
		//1st combination-username password - good credit history
		//2nd username password - no credit history
		//3rd fraudelent-credit history
		Object[][] data= new Object[3][2];
		data[0][0]="firstusername";
		data[0][1]="password";
		//columns in the row are nothing but values for that particular combination
		//2nd set
		data[1][0]="secondsetusername";
		data[1][1]="secondpassword";
		//3rd Set
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";	
		return data;

	}
	
	
}
