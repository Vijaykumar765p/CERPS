package Accounts;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import GenericClasses.DataProviderTest;
import GenericClasses.TestBase;

public class AccountEntry extends TestBase {
	@Test(dataProviderClass = DataProviderTest.class, dataProvider = "SampleDataProvider")
	  public void accEntry(String TraType,String TowardsAcc,String TraAmt,String TraChqNo,String TraChqDate,
			  String TraBankDetails,String TraDesc) throws IOException, InterruptedException {
		getObject("Accounts").click();
		Thread.sleep(1000);
		getObject("AccountEntry").click();
		Thread.sleep(1000);
		Select s = new Select(getObject("TraType"));
	    s.selectByValue(TraType);
	    Thread.sleep(1000);
	    getObject("TowardsAcc").sendKeys(TowardsAcc);
	    Thread.sleep(1000);
	    getObject("TowardsAcc").sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
	    getObject("TraAmt").sendKeys(TraAmt);
	    Thread.sleep(1000);
	    getObject("AccEntryAdd").click();
	    Thread.sleep(1000);
	    getObject("TraChqno").sendKeys(TraChqNo);
	    Thread.sleep(1000);
	    getObject("TraChqDate").sendKeys(TraChqDate);
	    Thread.sleep(1000);
	    getObject("TraBankDetails").sendKeys(TraBankDetails);
	    Thread.sleep(1000);
	    getObject("TraDesc").sendKeys(TraDesc);
	    Thread.sleep(2000);
	    getObject("TraSaveBtn").click();
	    Thread.sleep(1000);
	    driver.switchTo().alert().accept();
	    getObject("LogoutBtn").click();
  }
}
