package pages;

import org.openqa.selenium.By;

public class CheckOutPage extends BasePage {
	
	public String GOTO_CART  = "https://islamicshopdk.com/cart";
	public By CLICK_ON_PROCEED_CHECKOUT  = By.xpath("//a[contains(text(),'Proceed to checkout')]");
	
	//Direct ADD to cart Button
	public By ADD2CART = By.xpath("//body/div[@id='page']/div[@id='content']/div[1]/div[1]/main[1]/div[4]/ul[1]/li[2]/div[1]/div[2]/div[1]/a[1]/span[2]");
	
	public By ACTUAL_TEXT = By.xpath("//p[contains(text(),'Your cart is currently empty.')]");
	public String EXPECTED_TEXT = "Your cart is currently empty.";
	
	public By FIRST_NAME_FIELD = By.xpath("//input[@id=\"billing_first_name\"]");
	public By LAST_NAME_FIELD = By.xpath("//input[@id='billing_last_name']");
	
	public By STREET_ADDRESS_FIELD = By.xpath("//input[@id='billing_address_1']");
	public By TOWN_or_CITY_FIELD = By.xpath("//input[@id='billing_city']");
	public By DISTRICT_FIELD = By.className("//span[@class=\"select2-selection__arrow\"]");//this locator found error;
	public By POSTAL_CODE_or_ZIP_FIELD = By.xpath("//input[@id='billing_postcode']");
	
	public By PHONE_FIELD = By.xpath("//input[@id='billing_phone']");
	public By EMAIL_ADDRESS_FIELD = By.xpath("//input[@id='billing_email']");
	
	public By ORDER_NOTES_FIELD = By.xpath("//textarea[@id='order_comments']");
	public By PAYMENT_METHOD = By.xpath("//input[@id='payment_method_woo_bkash']");
	
	public By CLICK_ON_USER_ICON = By.linkText("https://islamicshopdk.com/my-account/");

}
