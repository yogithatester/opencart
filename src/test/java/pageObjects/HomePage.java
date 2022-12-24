package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//span[@class=\"d-none d-md-inline\"][text()=\"My Account\"]")
	WebElement lnkMyaccount;
	@FindBy(xpath="//a[@class=\"dropdown-item\"][text()=\"Register\"]")
	WebElement lnkRegister;
	@FindBy(xpath="//a[@class=\"dropdown-item\"][text()=\"Login\"]")
	WebElement lnkLogin;
	public void clickMyaccount()
	{
		lnkMyaccount.click();
	}
	public void clickRegister() {
		lnkRegister.click();
		
	}
	public void clickLogin()
	{
		lnkLogin.click();
	}

}
