package pageObjectEvents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import baseTest.BaseTest;
import utils.Constants;

public class DeleteTheRecord extends BaseTest{


	By deleteButton =By.xpath("//*[@class=\"oxd-icon-button oxd-table-cell-action-space\"]");
	By clickAlert=By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin\"]");
	By clickprofile=By.className("oxd-userdropdown-name");
	By logotBtn=By.xpath("//*[text()=\"Logout\"]");
	By searchButton=By.xpath("//*[@type=\"submit\"]");
	
	public void searchRecordsTodelete() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(searchButton).click();
		Thread.sleep(2000);
	}
	public void deleteTheUser() throws InterruptedException
	{
		driver.findElement(deleteButton).click();
		Thread.sleep(2000);
		driver.findElement(clickAlert).click();
		Thread.sleep(3000);
	}
	public void logoutOHRM()
	{
		driver.findElement(clickprofile).click();
		driver.findElement(logotBtn).click();
	}
}
