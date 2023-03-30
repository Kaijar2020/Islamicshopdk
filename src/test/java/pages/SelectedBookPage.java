package pages;

import org.openqa.selenium.By;

public class SelectedBookPage extends BasePage{
	
	public By SCROLL_ON_SELECTED_BOOK_PAGE = By.xpath("//h2[contains(text(),'যে পণ্যগুলি দেখেছেন')]");
	public By GOT_TO_TOP  = By.id("//a[@id='gotop']");
	public By ADD_TO_CART_BUTTON =By.name("//button[@name=\"add-to-cart\"]");
    public By CLICK_ON_CART_ICON = By.linkText("https://islamicshopdk.com/cart/");
    public By CLICK_ON_PROCEED_CHECKOUT  = By.xpath("//a[contains(text(),'Proceed to checkout')]");

}
