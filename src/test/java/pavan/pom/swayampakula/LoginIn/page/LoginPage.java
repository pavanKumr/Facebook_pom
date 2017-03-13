package pavan.pom.swayampakula.LoginIn.page;

import pavan.pom.kumar.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pavan.pom.swayampakula.LoginIn.constant.LoginConstants;

public class LoginPage extends BasePage {

	@FindBy(id = LoginConstants.Email)
	WebElement Email;
	@FindBy(id = LoginConstants.Password)
	WebElement Password;
	@FindBy(id = LoginConstants.Login)
	WebElement login;

	public LoginPage(WebDriver driver) {
		super.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public InboxPage LoginFacebook(String email2, String password2) throws InterruptedException {
		// TODO Auto-generated method stub
		Email.sendKeys("pavanyamini45@gmail.com");
		Thread.sleep(1000);
		Password.sendKeys("powerstar244");
		Thread.sleep(1000);
		login.click();
		Thread.sleep(2000);
		return new InboxPage(driver);
	}

}
