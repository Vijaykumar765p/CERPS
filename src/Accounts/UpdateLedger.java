package Accounts;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import GenericClasses.TestBase;

public class UpdateLedger extends TestBase {
  @Test
  public void updledg() throws IOException, InterruptedException {
//	  Update Ledger
	  getObject("Accounts").click();
	  Thread.sleep(1000);
	  getObject("GeneralLedger").click();
	  Thread.sleep(1000);
	  getObject("UpdateLedger").click();
	  Thread.sleep(1000);
	  getObject("SearchGLName").sendKeys("CASH ACCO");
	  Thread.sleep(1000);
	  getObject("SearchGLName").sendKeys(Keys.ARROW_DOWN);
	  Thread.sleep(1000);
	  getObject("UpdtLedgSearchBtn").click();
	  Thread.sleep(1000);
	  getObject("UpdtGLName").clear();
	  Thread.sleep(1000);
	  getObject("UpdtGLName").sendKeys("COMPANY CASH ACCOUNT");
	  Thread.sleep(1000);
	  getObject("UpdtLedBtn").click();
  }
}
