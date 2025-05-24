package testCases;

import org.testng.annotations.Test;

import baseTest.BaseTest;
import pageObjectEvents.*;
import utils.Constants;

public class DeleteTheUser extends BaseTest{

	LoginPage loginpage=new LoginPage();
	AddUserMangement addum=new AddUserMangement();
	SearchWithEdit searchUser=new SearchWithEdit();
	DeleteTheRecord deleteUser=new DeleteTheRecord();
	
	@Test
	public void deleteUserData() throws InterruptedException
	{
		loginpage.setUserName(Constants.username);
		log.info("Entered username");
		loginpage.setPassword(Constants.password);
		log.info("Entered password");
		loginpage.clickSubmit();
		Thread.sleep(2000);
		addum.adminPanel();
		log.info("User is in admin panel");
		Thread.sleep(2000);
		addum.username(Constants.User);
		log.info("User entered the record to be searched");
		deleteUser.searchRecordsTodelete();
		log.info("The record is been searched");
		deleteUser.deleteTheUser();
		log.info("record is deleted");
		refreshPage();
		addum.username(Constants.User);
		log.info("Entered username to search");
		deleteUser.searchRecordsTodelete();
		log.info("The record is been searched");
		searchUser.checkNumberOfUsers(Constants.User);
		Thread.sleep(2000);
		deleteUser.logoutOHRM();
		log.info("Logged Out.....");

	}
	
}
