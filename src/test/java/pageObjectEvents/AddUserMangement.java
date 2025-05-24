package pageObjectEvents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import baseTest.BaseTest;

public class AddUserMangement extends BaseTest {
	
	By goToAdmin=By.xpath("//*[text()=\"Admin\"]");
	By clickAdd=By.xpath("//*[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]");
	By userRole=By.xpath("//label[text()=\"User Role\"]/following::div[@class=\"oxd-select-text-input\"]");
	By listBoxAdmin=By.xpath("//div[@role='listbox']//span[text()='Admin']");
	By listBoxESS=By.xpath("//div[@role='listbox']//span[text()='ESS']");
	By listBoxStatus=By.xpath("//div[@role='listbox']//span[text()='Enabled']");
	By listBoxUsername=By.xpath("//div[@role='listbox']//span[contains(text(), 'admin')][1]");
	By empName=	By.xpath("//input[@placeholder=\"Type for hints...\"]");
	By selstatus=By.xpath("//label[text()=\"Status\"]/following::div[@class=\"oxd-select-text-input\"]");
	By userName=By.xpath("//label[text()=\"Username\"]/following::input[@class=\"oxd-input oxd-input--active\"]");
	By Password=By.xpath("//label[text()=\"Password\"]/following::input[@class=\"oxd-input oxd-input--active\"]");
	By ConfirmPassword=By.xpath("//label[text()=\"Confirm Password\"]/following::input[@class=\"oxd-input oxd-input--active\"]");
	By save=By.xpath("//*[@type=\"submit\"]");
	public void adminPanel() {
		driver.findElement(goToAdmin).click();
			
	}
	//mahesh  babu

	public void clickAdd() {
		driver.findElement(clickAdd).click();
		}

	public void userRole() throws InterruptedException {
		driver.findElement(userRole).click();
		Thread.sleep(2000);
		driver.findElement(listBoxAdmin).click();
		
	}
	public void userRoleESS() throws InterruptedException {
		driver.findElement(userRole).click();
		Thread.sleep(2000);
		driver.findElement(listBoxESS).click();
		
	}

	public void employeeName() throws InterruptedException {
		driver.findElement(empName).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(listBoxUsername).click();
		}

	public void selectStatus() throws InterruptedException {
		driver.findElement(selstatus).click();
		Thread.sleep(2000);
		driver.findElement(listBoxStatus).click();
		
	}

	public void username(String username) throws InterruptedException {
		driver.findElement(userName).sendKeys(username);
		
	}

	public void password(String pwd) {
		driver.findElement(Password).sendKeys(pwd);
	}

	public void confirmPassword(String cpwd) {
		driver.findElement(ConfirmPassword).sendKeys(cpwd);
	}


	public void clicksubmit() {
		driver.findElement(save).click();
	}
}
