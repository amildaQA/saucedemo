package pageEvents;
//import org.testng.Assert;

import pageObjects.LoginElements;
import utils.ElementFetch;

public class LoginPage {
	
	public void Login()
	{
		ElementFetch ele = new ElementFetch();
		ele.getWebElement("XPATH",LoginElements.username).sendKeys("standard_user");
		ele.getWebElement("XPATH",LoginElements.password).sendKeys("secret_sauce");
		ele.getWebElement("XPATH",LoginElements.login).click();
		
		
	}
	
	
}
