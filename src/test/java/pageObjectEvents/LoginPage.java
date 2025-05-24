package pageObjectEvents;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


import baseTest.BaseTest;

public class LoginPage extends BaseTest {

	By usernameInput = By.name("username");
    By passwordInput = By.name("password");
    By loginButton   = By.xpath("//*[@type=\"submit\"]");
    By lnkLogout	=By.xpath("//*[@type=\"submit\"]");

	
	public void setUserName(String uname)
	{
		driver.findElement(usernameInput).sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		driver.findElement(passwordInput).sendKeys(pwd);
	}
	
	
	public void clickSubmit()
	{
		driver.findElement(loginButton).click();
	}	
	
//	public void clickLogout()
//	{
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", driver.findElement(lnkLogout));
//		
//	}
	
	
}