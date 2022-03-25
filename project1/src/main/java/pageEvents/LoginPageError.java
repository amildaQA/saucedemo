package pageEvents;

import pageObjects.LoginElements;
import pageObjects.LoginError;
import utils.ElementFetch;

public class LoginPageError {
public void errormsg()
{
	ElementFetch ele=new ElementFetch();
	ele.getWebElement("XPATH",LoginElements.username).sendKeys("abccc");
	ele.getWebElement("XPATH",LoginElements.password).sendKeys("hello");
	ele.getWebElement("XPATH",LoginElements.login).click();
	String err= ele.getWebElement("CSS", LoginError.Error).getText();
	System.out.println(err);
}
}
