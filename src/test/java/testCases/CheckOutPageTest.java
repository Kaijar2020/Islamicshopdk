package testCases;

import org.testng.annotations.Test;

import pages.CheckOutPage;
import utiLites.BaseDriverSetup;

public class CheckOutPageTest extends BaseDriverSetup{
	
	CheckOutPage checkOutPage = new CheckOutPage();
	@Test
	public void testCheckOutProcess() {
		getDriver().get(checkOutPage.GOTO_CART);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
