package utility;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	Properties prop=new Properties();
	public static WebDriver driver;

	@BeforeSuite
	//Read Config.properties file and data
	public void readConfigFile() throws Exception {
		FileInputStream file=new FileInputStream("C:\\Selenium_Project_2024\\Automation_Project_B27\\src\\test\\resources\\Configurations\\config.properties");
		prop.load(file);
	}

	@BeforeTest
	//Launch browser and app
	public void launchApp() {
		String browserName=prop.getProperty("browser");
		if (browserName.equals("Chrome")) {
			driver=new ChromeDriver();
		}else if (browserName.equals("Firefox")) {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@AfterTest
	//Close the browser
	public void closeApp() {
		driver.quit();
	}





}
