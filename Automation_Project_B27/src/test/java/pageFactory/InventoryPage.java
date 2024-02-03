package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utility.BaseTest;

public class InventoryPage extends BaseTest{
WebDriver driver;

public InventoryPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}












}
