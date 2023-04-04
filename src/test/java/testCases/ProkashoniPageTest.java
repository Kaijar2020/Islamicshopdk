package testCases;

import org.testng.annotations.Test;


import pages.ProkashoniPage;
import utiLites.BaseDriverSetup;

public class ProkashoniPageTest extends BaseDriverSetup{
	HomePageTest homePageTest = new HomePageTest();
	
	
	@Test
	public void enterSonchalonProkashoniTest() {
		
		ProkashoniPage prokashoniPage = new ProkashoniPage();
		getDriver().get(prokashoniPage.PUBLISHER_PAGE_URL);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		prokashoniPage.clickOnElement(prokashoniPage.SONCHALON_PROKASHONI);
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
