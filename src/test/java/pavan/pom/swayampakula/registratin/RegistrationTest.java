package pavan.pom.swayampakula.registratin;

import org.testng.annotations.Test;

import pavan.pom.kumar.FacebookTestClass;
import pavan.pom.swayampakula.registratin.constant.RegistrationConstants;
import pavan.pom.swayampakula.registratin.page.RegistrationPage;

public class RegistrationTest extends FacebookTestClass {

	@Test

	public void P() throws InterruptedException {
		RegistrationPage Page = new RegistrationPage(driver);
		Page.doSignOn(RegistrationConstants.firstname, RegistrationConstants.lastName, RegistrationConstants.email,
				RegistrationConstants.ReenterEmail, RegistrationConstants.password, RegistrationConstants.gender);

	}
}
