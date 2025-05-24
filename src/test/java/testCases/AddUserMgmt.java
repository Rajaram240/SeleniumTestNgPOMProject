 package testCases;

import org.testng.annotations.Test;

import baseTest.BaseTest;
import pageObjectEvents.AddUserMangement;
import pageObjectEvents.LoginPage;
import utils.Constants;

public class AddUserMgmt extends BaseTest {

	LoginPage loginpage=new LoginPage();
	AddUserMangement addum=new AddUserMangement();
	
	@Test
	public void AddUser() throws InterruptedException
	{
		loginpage.setUserName(Constants.username);
		log.info("Entered username");
		loginpage.setPassword(Constants.password);
		log.info("Entered password");
		loginpage.clickSubmit();
		Thread.sleep(2000);
		
		log.info("go to admin panel");
		addum.adminPanel();
		addum.clickAdd();
		log.info("clicked add");
		addum.userRole();
		log.info("Entered userrole");
		addum.employeeName();
		log.info("Entered empname");
		addum.selectStatus();
		log.info("selected status");
		addum.username(Constants.User);
		log.info("Entered username");
		addum.password("hello@123");
		log.info("Entered password");
		addum.confirmPassword("hello@123");
		log.info("Entered confirm password");
		addum.clicksubmit();
		log.info("Submitted");
		Thread.sleep(100000);
		
	}
}
