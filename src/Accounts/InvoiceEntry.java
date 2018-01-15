package Accounts;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import GenericClasses.DataProviderTest;
import GenericClasses.TestBase;

public class InvoiceEntry  extends TestBase {
	@Test(dataProviderClass = DataProviderTest.class, dataProvider = "SampleDataProvider")
	  public void invEntry(String InvEntryLedg,String InvBillno,String InvBilldate,String InvDuedate,
			  String InvBaseAmt,String InvCGSTsel,String InvCGSTamt, String InvSGSTsel, String InvSGSTamt,String InvIGSTsel,
			  String InvIGSTamt,String InvDesr) throws IOException, InterruptedException {
//		Invoice Entry
		getObject("Accounts").click();
		Thread.sleep(1000);
		getObject("InvoiceEntry").click();
		Thread.sleep(1000);
		getObject("NewInvEntry").click();
		Thread.sleep(1000);
		Select s = new Select(getObject("InvEntryLedg"));
	    s.selectByVisibleText(InvEntryLedg);
	    Thread.sleep(2000);
	    getObject("InvBillno").sendKeys(InvBillno);
	    Thread.sleep(1000);
	    getObject("InvBilldate").sendKeys(InvBilldate);
	    Thread.sleep(1000);
	    getObject("InvBilldate").click();
	    Thread.sleep(1000);
	    getObject("InvDuedate").sendKeys(InvDuedate);
	    Thread.sleep(1000);
	    getObject("InvDuedate").click();
	    Thread.sleep(1000);
	    getObject("InvBaseAmt").sendKeys(InvBaseAmt);
	    Thread.sleep(1000);
	    Select s1 = new Select(getObject("InvCGSTsel"));
	    s1.selectByVisibleText(InvCGSTsel);
	    Thread.sleep(1000);
	    getObject("InvCGSTamt").sendKeys(InvCGSTamt);
	    Thread.sleep(1000);
	    Select s2 = new Select(getObject("InvSGSTsel"));
	    s2.selectByVisibleText(InvSGSTsel);
	    Thread.sleep(1000);
	    getObject("InvSGSTamt").sendKeys(InvSGSTamt);
	    Thread.sleep(1000);
	    Select s3 = new Select(getObject("InvIGSTsel"));
	    s3.selectByVisibleText(InvIGSTsel);
	    Thread.sleep(1000);
	    getObject("InvIGSTamt").sendKeys(InvIGSTamt);
	    Thread.sleep(1000);
	    getObject("InvDesr").sendKeys(InvDesr);
	    Thread.sleep(1000);
//	    getObject("InvSaveBtn").click();
  }
}
