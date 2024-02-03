package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.BaseTest;

public class LoginPage extends BaseTest{
WebDriver driver;
	
public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
	
	@FindBy(id="user-name")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginBtn;
	
	@FindBy(xpath="//*[@class=\"login_logo\"]")
	WebElement loginLogo;
	

	//Enter data in the username edit box
	public void enterUserName(String un) {
		userName.sendKeys(un);
	}
	
	//Enter password in the password edit box
	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	//Click on Login button
	public void clickLoginBtn() {
		loginBtn.click();
	}
	
	//This method to use for valid login
	public void validLogin(String un, String pwd) {
		userName.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
	}
	
	
}
