package pageEvents;



import pageObjects.ProductPriceElement;
import utils.ElementFetch;

public class ProductPrice {
	
	public void price()
	{
		ElementFetch ele1=new ElementFetch();
		
		int  NoOfProductnames =ele1.getListWebElements("XPATH",ProductPriceElement.productname).size();
		for (int i=0;i<=NoOfProductnames;i++)
		{
			String ProductName=ele1.getWebElement("XPATH", ProductPriceElement.productname).getText();
			if (ProductName=="Sauce Labs Fleece Jacket")
			{
				System.out.println(ProductName);
				String Description=ele1.getWebElement("XPATH", ProductPriceElement.productdesc).getText();
				System.out.println(Description);
					
			}
		}		
		
		
		
		
	}

}
