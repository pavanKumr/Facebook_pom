package pavan.pom.kumar;

import org.openqa.selenium.WebDriver;

public class BasePage  {
    protected WebDriver driver=null;
    
   public String getCurrentUrl(){
	return driver.getCurrentUrl();
	   
   }
   public String getPageTitle(){
	   return driver.getTitle();
   }
}
