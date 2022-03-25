package pageEvents;

import java.util.List;

import org.openqa.selenium.WebElement;

import pageObjects.AddItemElements;
import utils.ElementFetch;

public class NoOfItemsInCart {
	public void cartItems()
	{
		ElementFetch ele=new ElementFetch();
		//count of Add to cart button
		int items=ele.getListWebElements("XPATH", AddItemElements.AddToCartButton).size();
		System.out.println("Total number of items in the inventory = "+items);
		//Names of the items
		List<WebElement> itemss=ele.getListWebElements("XPATH", AddItemElements.itemNames);
		for(WebElement i:itemss)
		{
			System.out.println(i.getText());
		}
		//Add items
		ele.getWebElement("XPATH", AddItemElements.saucelabsbag).click();
		ele.getWebElement("XPATH", AddItemElements.saucelabsbike).click();
		//Count the cart badge
		String cartcount=ele.getWebElement("XPATH", AddItemElements.cartBadge).getText();
		System.out.println("Number of items in cart= "+cartcount);
		//Go to cart page
		ele.getWebElement("XPATH", AddItemElements.cart).click();
		//checkout
		ele.getWebElement("XPATH", AddItemElements.checkoutButton).click();
		//checkout info
		ele.getWebElement("XPATH", AddItemElements.firstname).sendKeys("Dan");
		ele.getWebElement("XPATH", AddItemElements.lastname).sendKeys("Brown");
		ele.getWebElement("XPATH", AddItemElements.postalcode).sendKeys("400043");
		//continue button
		ele.getWebElement("XPATH", AddItemElements.continueButton).click();
		//payment info
		System.out.println(ele.getWebElement("XPATH", AddItemElements.paymentinfo).getText());
		//Shipping info
		System.out.println(ele.getWebElement("XPATH", AddItemElements.shippinginfo).getText());
		//item
		System.out.println(ele.getWebElement("XPATH", AddItemElements.itemprice).getText());
		//tax
		System.out.println(ele.getWebElement("XPATH", AddItemElements.tax).getText());
		//total
		System.out.println(ele.getWebElement("XPATH", AddItemElements.totalprice).getText());
		//finish
		ele.getWebElement("XPATH", AddItemElements.finishButton).click();
		//confirmation message
		System.out.println(ele.getWebElement("XPATH", AddItemElements.confirmationmsg).getText());
		
		
	}

}
