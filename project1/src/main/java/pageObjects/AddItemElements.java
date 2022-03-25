package pageObjects;

public interface AddItemElements {
	String AddToCartButton="(//button[@class='btn btn_primary btn_small btn_inventory'])";
	String cart="//a[@class='shopping_cart_link']";
	//String removeItem="//button[@id='remove-sauce-labs-bolt-t-shirt']";
	String ContinueShopping="//button[@id='continue-shopping']";
	String removeButton="(//button[@class='btn btn_secondary btn_small btn_inventory'])";
	String cartBadge="//span[@class='shopping_cart_badge']";
	String saucelabsbag="//button[@id='add-to-cart-sauce-labs-backpack']";
	String saucelabsbike="//button[@id='add-to-cart-sauce-labs-bike-light']";
	String itemNames="//div[@class='inventory_item_name']";
	String checkoutButton="//button[@id='checkout']";
	String firstname="//input[@id='first-name']";
	String lastname="//input[@id='last-name']";
	String postalcode="//input[@id='postal-code']";
	String continueButton="//input[@id='continue']";
	String paymentinfo="//div[@class='summary_value_label'][1]";
	String shippinginfo="//div[@class='summary_value_label'][2]";
	String itemprice="//div[@class='summary_subtotal_label']";
	String tax="//div[@class='summary_tax_label']";
	String totalprice="//div[@class='summary_total_label']";
	String finishButton="//button[@id='finish']";
	String confirmationmsg="//div[@class='complete-text']";
}
