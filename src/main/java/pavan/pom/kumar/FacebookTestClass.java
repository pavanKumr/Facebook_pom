package pavan.pom.kumar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookTestClass {
 
protected WebDriver driver= null;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
	
	driver = new FirefoxDriver();	
	driver.get("https://www.facebook.com/");
	Thread.sleep(1000);
	driver.manage().window().maximize();

}

 @Test
 public void pavan() {
 System.out.println("I opend the Facebook page");
 }

@AfterMethod

public void tearDown() {
	driver.close();
}
}
	

