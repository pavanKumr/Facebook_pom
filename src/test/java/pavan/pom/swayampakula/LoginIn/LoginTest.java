package pavan.pom.swayampakula.LoginIn;

import org.testng.Assert;
import org.testng.annotations.Test;
import pavan.pom.kumar.FacebookTestClass;
import pavan.pom.swayampakula.LoginIn.constant.LoginConstants;
import pavan.pom.swayampakula.LoginIn.page.InboxPage;
import pavan.pom.swayampakula.LoginIn.page.LoginPage;

public class LoginTest extends FacebookTestClass {

	@Test
	public void kumar() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		InboxPage inboxpage=login.LoginFacebook(LoginConstants.Email, LoginConstants.Password);
		
		Assert.assertEquals(inboxpage.getCurrentUrl(), "https://www.facebook.com/");;
		Assert.assertEquals(inboxpage.getPageTitle(),"Facebook");
	}

}
