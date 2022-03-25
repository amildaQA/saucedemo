package pageEvents;

import org.openqa.selenium.support.ui.Select;

import pageObjects.Filters;
import utils.ElementFetch;

public class FilterDropdown {
	public void selection()
	{
		ElementFetch ele=new ElementFetch();
		//ele.getWebElement("XPATH", Filters.Filter).click();
		Select sel =new Select(ele.getWebElement("XPATH", Filters.Filter));
		sel.selectByValue("lohi");
	}
	

}
