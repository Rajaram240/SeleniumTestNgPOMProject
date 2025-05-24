package pageObjectEvents;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Constants;
import baseTest.BaseTest;

public class SearchWithEdit extends BaseTest {
	String User=Constants.User;
	By webTable=By.xpath("//div[@class=\"oxd-table-cell oxd-padding-cell\"][2]");
	By editButton =By.xpath("//*[text()='"+User+"']/following::div//*[@class=\"oxd-icon bi-pencil-fill\"]");
	By searchRecord =By.xpath("//*[text()=\"No Records Found\"]");
	
	
	public void selectTheUser(String user) throws InterruptedException
	{
		
		List<WebElement> list=driver.findElements(webTable);
		System.out.println(list);
		for(WebElement findUser:list)
		{
			if(findUser.getText().equalsIgnoreCase(user))
			{
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", findUser);
				Thread.sleep(5000);	
			}
		}
	}
	public void editBtnClick() throws InterruptedException
	{
		//driver.findElement(editButton).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement editButn = wait.until(ExpectedConditions.elementToBeClickable(
	           editButton));
		editButn.click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.urlContains("/saveSystemUser"));
		Thread.sleep(5000);
	}
	public boolean checkNumberOfUsers(String username)
	{
		String recordsFound= driver.findElement(searchRecord).getText();
		if(recordsFound.equals("No Records Found"))
		{
			log.info("The Record for user "+User+"is no longer available or deleted");
			return true;
		}
		else {
			log.info("The Record for user "+User+"is available or not deleted yet");
			return false;
		}
	}
}
	

	
