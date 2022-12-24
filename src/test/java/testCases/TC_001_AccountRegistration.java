package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistration extends BaseClass {
	@Test
	public void test_account_Registration()
	{
		//i am software test engineer;
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		HomePage hp=new HomePage(driver);
		hp.clickMyaccount();
		hp.clickRegister();
		AccountRegistrationPage repage=new AccountRegistrationPage(driver);
		repage.setFirstName("john");
		repage.setLastName("Canedy");
		repage.setEmail(randomestring()+"@gmail.com");
		repage.setPassWord("abcxyz");
		repage.setNewSetlerR();
	repage.setPrivacyPolicy();
		repage.clickContinue();
		String confmsg=repage.getConfirmationMsg();
		if(confmsg.contains("your Account Has Been Created"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		//msgConfirmation.getText();

	}

}
