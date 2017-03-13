package pavan.pom.swayampakula.registratin.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pavan.pom.swayampakula.registratin.constant.RegistrationConstants;

import pavan.pom.kumar.BasePage;

public class RegistrationPage extends BasePage {
	@FindBy(id = RegistrationConstants.FirstName)
	public WebElement firstname;
	@FindBy(id = RegistrationConstants.lastname)
	public WebElement lastname;
	@FindBy(id = RegistrationConstants.Email)
	public WebElement Email;
	@FindBy(id = RegistrationConstants.reenteremail)
	public WebElement ReenterEmail;
	@FindBy(id = RegistrationConstants.PassWord)
	public WebElement password;
	@FindBy(id = RegistrationConstants.Gender)
	public WebElement Gender;

	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void doSignOn(String FirstName, String lastName, String email, String reenterEmail, String passWord,
			String gender) throws InterruptedException {
		firstname.sendKeys(FirstName);
		Thread.sleep(1000);
		lastname.sendKeys(lastName);
		Thread.sleep(1000);
		Email.sendKeys(email);
		Thread.sleep(1000);
		ReenterEmail.sendKeys(reenterEmail);
		Thread.sleep(1000);
		password.sendKeys(passWord);
		Thread.sleep(1000);
		Gender.click();

	}
}
