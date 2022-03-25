package testPackage;

import org.testng.annotations.Test;

//import pageEvents.AddItem;
import pageEvents.FilterDropdown;
import pageEvents.LoginPage;
import pageEvents.LoginPageError;
import pageEvents.NoOfItemsInCart;
import pageEvents.ProductPrice;
import utils.BaseTest;

public class Test1 extends BaseTest 
{
//	@Test(priority = 0, groups= {"smoke testing"})
//	public void Login()
//	{
//		
//		LoginPage lp = new LoginPage();
//		lp.Login();
//
//	}
	
//	@Test(priority = 2)
//	public void productDetail()
//	{
//		LoginPage lp = new LoginPage();
//		lp.Login();
//		ProductPrice pp=new ProductPrice();
//		pp.price();
//	}
	
//	@Test(priority = 3)
//	public void ItemAddandRemove()
//	{
//		LoginPage lp = new LoginPage();
//		lp.Login();
//		AddItem ai= new AddItem();
//		ai.ItemAddition();
//	}
	
//	@Test(priority = 1,groups= {"smoke testing"})
//	public void DropDownFilter()
//	{
//		LoginPage lp = new LoginPage();
//		lp.Login();
//		FilterDropdown fd =new FilterDropdown();
//		fd.selection();
//	}
//		
//	@Test(priority = 1, groups= {"smoke testing"})
//	public void Error()
//	{
//		LoginPageError le=new LoginPageError();
//		le.errormsg();
//	}
	 @Test
	 public void CartFeature()
	 {
		 LoginPage lp = new LoginPage();
		lp.Login();
		 NoOfItemsInCart c=new NoOfItemsInCart();
		 c.cartItems();
	 }

	
}
