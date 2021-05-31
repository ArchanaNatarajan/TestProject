package Crm.TestCases;

import org.testng.annotations.BeforeMethod;

import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Crm.Base.TestBase;
import Crm.Pages.HomePage;
import Crm.Pages.LoginPage;
import cucumber.api.java.Before;
import junit.framework.Assert;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	public LoginPageTest()  //create constructor
	{
		super(); //It will call super class constructor from TestBase class. super class constructor call using keyword as super
	}
	
	@BeforeMethod
	public void setup()
	{
		initialize();
		loginpage= new LoginPage();  //Create a constructor for loginpage class
	}
	
	
	@Test
	public void loginPageTitletest()
	{
		String title=loginpage.ValidateLoginPageTitle();
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
	@Test
	public void loginPageTeste()
	{
		homepage = loginpage.login(prop.getProperty("uname"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();	
	}
}
