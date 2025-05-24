package testCases;

import org.testng.annotations.Test;

import baseTest.BaseTest;
import pageObjectEvents.AddUserMangement;
import pageObjectEvents.LoginPage;
import pageObjectEvents.SearchWithEdit;
import utils.Constants;

public class SearchAndEditUser extends BaseTest{

	LoginPage loginpage=new LoginPage();
	AddUserMangement addum=new AddUserMangement();
	SearchWithEdit searchUser=new SearchWithEdit();
	
	@Test
	public void SearchUserAndEdit() throws InterruptedException
	{
		loginpage.setUserName(Constants.username);
		log.info("Entered username");
		loginpage.setPassword(Constants.password);
		log.info("Entered password");
		loginpage.clickSubmit();
		Thread.sleep(2000);
		
		log.info("go to admin panel");
		addum.adminPanel();
		Thread.sleep(2000);
		searchUser.selectTheUser(Constants.User);
		searchUser.editBtnClick();
		Thread.sleep(2000);
		addum.userRoleESS();
		log.info("user role has changed to ess");
		addum.clicksubmit();
		log.info("Submitted");
		Thread.sleep(8000);
		
	}
}

