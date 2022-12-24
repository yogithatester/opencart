package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountRegistrationPage {
	WebDriver driver;
	public AccountRegistrationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@name='firstname']")
	WebElement txtFirstName;
	@FindBy(xpath="//input[@id='input-lastname' and @name='lastname']")
	WebElement txtLastName;
	@FindBy(xpath="//input[@name='email' and @class='form-control']")
	WebElement txtEmail;
	@FindBy(xpath="//input[@name='newsletter']")
	WebElement newSetler;
	@FindBy(xpath="//input[@name='password' and @class='form-control']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@type='checkbox' and @name='agree']")
	WebElement chkdPolicy;
	@FindBy(xpath="//button[text()='Continue']")
	WebElement btnContinue;
	@FindBy(xpath="//h1[text()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	public void setFirstName(String fname) {
		// TODO Auto-generated method stub
		txtFirstName.sendKeys(fname);
		
	}
	public void setLastName(String lname) {
		// TODO Auto-generated method stub
		txtLastName.sendKeys(lname);
		
	}
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		txtEmail.sendKeys(email);
	}
	public void setPassWord(String pword) {
		// TODO Auto-generated method stub
		txtPassword.sendKeys(pword);
		
	}
	public void setNewSetlerR()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",newSetler);
		//newSetler.click();
	}
	public void setPrivacyPolicy() {
		// TODO Auto-generated method stub
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",chkdPolicy);
		
		//chkdPolicy.click();
	}
	public void clickContinue() {
		// TODO Auto-generated method stub
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",btnContinue);
		
		//btnContinue.click();
		
	}
	public String getConfirmationMsg() {
		// TODO Auto-generated method stub
		try
		{
			System.out.println(msgConfirmation.getText());
		return (msgConfirmation.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
		
	}


}
