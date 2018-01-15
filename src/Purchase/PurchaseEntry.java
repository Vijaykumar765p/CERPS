package Purchase;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import GenericClasses.TestBase;

public class PurchaseEntry extends TestBase {
	@Test
	// @Test(dataProviderClass = DataProviderTest.class, dataProvider =
	// "SampleDataProvider")
	public void newpurchentry() throws IOException, InterruptedException {
		// Purchase Entry
		getObject("Purchase").click();
		Thread.sleep(1000);
		getObject("PurchaseEntry").click();
		Thread.sleep(1000);
		getObject("NewPurcEntry").click();
		Thread.sleep(1000);
		getObject("PurcVendorName").sendKeys("sun");
		Thread.sleep(1000);
		getObject("PurcVendorName").sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(1000);
		getObject("PurcOrderNo").sendKeys("PO001");
		Thread.sleep(1000);
		getObject("PurcInvNo").sendKeys("INV001");
		Thread.sleep(1000);
		getObject("PurcInvDate").sendKeys("01/01/2018");
		Thread.sleep(1000);
		getObject("PurcInvDate").click();
		Thread.sleep(1000);
		getObject("PurcInvDelvrDate").sendKeys("10/01/2018");
		Thread.sleep(1000);
		getObject("PurcInvDelvrDate").click();
		Thread.sleep(1000);
		
//		Power Chords
		getObject("PurcQty").sendKeys("2");
		Thread.sleep(1000);
		getObject("PurcQtyPrice").sendKeys("350");
		Thread.sleep(1000);
		getObject("PurcDisc").sendKeys("0");
		Thread.sleep(1000);
		getObject("PurcScanPartCode").sendKeys("P002",Keys.ENTER);
		Thread.sleep(1000);
		getObject("PurcScanItems").sendKeys("PC011",Keys.ENTER);
		Thread.sleep(1000);
		getObject("PurcScanItems").sendKeys("PC012",Keys.ENTER,Keys.ENTER);
		Thread.sleep(1000);
		
//		GI Wire
		getObject("PurcQty").clear();
		getObject("PurcQty").sendKeys("1");
		Thread.sleep(1000);
		getObject("PurcQtyPrice").clear();
		getObject("PurcQtyPrice").sendKeys("400");
		Thread.sleep(1000);
		getObject("PurcDisc").clear();
		getObject("PurcDisc").sendKeys("0");
		Thread.sleep(1000);
		getObject("PurcScanPartCode").clear();
		getObject("PurcScanPartCode").sendKeys("P003",Keys.ENTER);
		Thread.sleep(1000);
		getObject("PurcScanItems").sendKeys("GIW011",Keys.ENTER,Keys.ENTER);
		Thread.sleep(1000);
		
//		Cable Ties
	}
}