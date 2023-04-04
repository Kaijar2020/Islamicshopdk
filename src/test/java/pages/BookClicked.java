package pages;


import org.openqa.selenium.By;

public class BookClicked extends BasePage{
	
	public String SELECTED_BOOK_PAGE_URL = "https://islamicshopdk.com/shop/andaluser-golpo-1"; 
	public By SCROLL_ON_SELECTED_BOOK_PAGE = By.xpath("//h2[contains(text(),'Related Products')]");	//By.className("//section[@class=\"related products\"]");
	public By GOT_TO_TOP  = By.xpath("//a[@id='gotop']");  	//html[1]/body[1]/div[2]/a[1]
	public By ADD_TO_CART_BUTTON =By.xpath("//div[@id='page']/div[3]/div/div/main/div/div[2]/div[2]/form/div/button");		//button[@name='add-to-cart']
    

}

