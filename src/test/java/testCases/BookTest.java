package testCases;

import org.testng.annotations.Test;

import pages.BookClicked;


import utiLites.BaseDriverSetup;


public class BookTest extends BaseDriverSetup{
	
	@Test
	public void bookonTest(){
		BookClicked bClicked = new BookClicked();
		getDriver().get(bClicked.SELECTED_BOOK_PAGE_URL);
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		bClicked.scrollTillTarget(bClicked.SCROLL_ON_SELECTED_BOOK_PAGE);
        
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bClicked.clickOnElement(bClicked.GOT_TO_TOP);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		bClicked.clickOnElement(bClicked.ADD_TO_CART_BUTTON);
		
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}