package testCases;

import org.testng.annotations.Test;

import pageFactory.LoginPage;
import utility.BaseTest;

public class VerifyLoginFunctionality extends BaseTest{

	@Test
	public void verifyValidLogin() {
		LoginPage login=new LoginPage(driver);
		login.validLogin("standard_user", "secret_sauce");
	}
	
	
}
