package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;


import baseTest.BaseTest;
import pageObjectEvents.LoginPage;


public class Login extends BaseTest{
	LoginPage loginpage=new LoginPage();
	public String username="Admin";
	public String password="admin123";
	@Test
	public void runLoginTest() throws InterruptedException
	{	
	loginpage.setUserName(username);
	log.info("Entered username");
	loginpage.setPassword(password);
	log.info("Entered password");
	loginpage.clickSubmit();
	Thread.sleep(2000);
	//driver.switchTo().alert().accept();
	if(driver.getTitle().equals("OrangeHRM"))
	{
		Assert.assertTrue(true);
		log.info("Login test passed");
	}
	else
	{
		Assert.assertTrue(false);
		
		log.info("Login test failed");
	
	}
	
}
}