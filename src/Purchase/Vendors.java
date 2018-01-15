package Purchase;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import GenericClasses.DataProviderTest;
import GenericClasses.TestBase;

public class Vendors extends TestBase {
	@Test(dataProviderClass = DataProviderTest.class, dataProvider = "SampleDataProvider")
	public void NewVendor(String Vendername, String VendorAddr, String VendorCity, String state, String Vendormob,
			String VendorPhno, String VendorFaxno, String VendorGSTIN, String VendorPAN,
			String VendorContactPerson, String VendorEmail, String VendorOpBal, String drcr) throws IOException, InterruptedException {
		// New vendor
		getObject("Purchase").click();
		Thread.sleep(1000);
		getObject("newVendor").click();
		Thread.sleep(1000);
		getObject("AddnewVendor").click();
		Thread.sleep(1000);
		getObject("VendorGen").click();
		Thread.sleep(1000);
		getObject("VendorName").sendKeys(Vendername);
		Thread.sleep(1000);
		getObject("VendorAddr").sendKeys(VendorAddr);
		Thread.sleep(1000);
		getObject("VendorCity").sendKeys(VendorCity);
		Thread.sleep(1000);
		Select s = new Select(getObject("VendorState"));
	    s.selectByVisibleText(state);
	    Thread.sleep(1000);
		getObject("Vendormob").sendKeys(Vendormob);
		Thread.sleep(1000);
		getObject("VendorPhno").sendKeys(VendorPhno);
		Thread.sleep(1000);
		getObject("VendorFaxno").sendKeys(VendorFaxno);
		Thread.sleep(1000);
		getObject("VendorGSTIN").sendKeys(VendorGSTIN);
		Thread.sleep(1000);
		getObject("VendorPAN").sendKeys(VendorPAN);
		Thread.sleep(1000);
		getObject("VendorContactPerson").sendKeys(VendorContactPerson);
		Thread.sleep(1000);
		getObject("VendorEmail").sendKeys(VendorEmail);
		Thread.sleep(1000);
		getObject("VendorOpBal").sendKeys(VendorOpBal);
		Thread.sleep(1000);
		Select s1 = new Select(getObject("VendorDrCr"));
	    s1.selectByVisibleText(drcr);
	    Thread.sleep(2000);
	    getObject("VendorSaveBtn").click();
	    Thread.sleep(1000);
	    getObject("LogoutBtn").click();
	}
}
