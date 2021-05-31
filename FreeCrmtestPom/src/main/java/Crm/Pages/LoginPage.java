package Crm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Crm.Base.TestBase;

public class LoginPage extends TestBase {
	
	//PageFactory - OR
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[text()='Login']")
	WebElement loginBtn;
	

	
	/*
	@FindBy(xpath="//*[@class='header item']")
	WebElement crmLogo; */
	
	public LoginPage() //Create a constructor
	{
		//Initializing the pageFactory
		PageFactory.initElements(driver, this);  //driver is coming from TestBase.jave class & This for current class objects initialized this driver.
	}
	
	//Actions
	public String ValidateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	/*
	public boolean validateCrmLogo()
	{
		return crmLogo.isDisplayed();
	}
	*/
	
	public HomePage login(String emai, String pwd) {
		email.sendKeys(emai);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
	}

}
