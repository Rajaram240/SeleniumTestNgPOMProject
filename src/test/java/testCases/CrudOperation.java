package testCases;

import org.testng.annotations.Test;

import baseTest.BaseTest;
import pageObjectEvents.AddUserMangement;
import pageObjectEvents.DeleteTheRecord;
import pageObjectEvents.LoginPage;
import pageObjectEvents.SearchWithEdit;
import utils.Constants;

public class CrudOperation extends BaseTest{
	LoginPage loginpage=new LoginPage();
	AddUserMangement addum=new AddUserMangement();
	SearchWithEdit searchUser=new SearchWithEdit();
	DeleteTheRecord deleteUser=new DeleteTheRecord();
	@Test
	public void AddUser() throws InterruptedException
	{
		log.info("User is in the login page");
		loginpage.setUserName(Constants.username);
		log.info("User entered username");
		loginpage.setPassword(Constants.password);
		log.info("User entered password");
		loginpage.clickSubmit();
		log.info("User click login button");
		Thread.sleep(2000);
		addum.adminPanel();
		log.info("User is in the admin panel");
		addum.clickAdd();
		log.info("click add button to add user role");
		addum.userRole();
		log.info("Userrole is entered");
		addum.employeeName();
		log.info("Entered the empname");
		addum.selectStatus();
		log.info("selected the status");
		addum.username(Constants.User);
		log.info("Entered the username");
		addum.password("hello@123");
		log.info("Entered password");
		addum.confirmPassword("hello@123");
		log.info("Entered confirm password");
		addum.clicksubmit();
		log.info("Submitted");
		Thread.sleep(7000);
		//search and edit record
		searchUser.selectTheUser(Constants.User);
		log.info("User is selected to be edited");
		searchUser.editBtnClick();
		log.info("edit button is clicked");
		Thread.sleep(2000);
		addum.userRoleESS();
		log.info("user role has changed to ess");
		addum.clicksubmit();
		log.info("Submitted");
		Thread.sleep(8000);
		//deleted the record
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


