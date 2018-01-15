package Frontdesk;

import java.io.IOException;

import org.testng.annotations.Test;

import GenericClasses.DataProviderTest;
import GenericClasses.TestBase;

public class couriers extends TestBase {
	@Test(dataProviderClass = DataProviderTest.class, dataProvider = "SampleDataProvider")
  public void newcrrs(String sendername,String recdby,String desc1,String toname,String toaddrs,String crrcomname,
		  String trckNo,String sentby,String amt,String desc2) throws IOException, InterruptedException {
//Front desk
		getObject("frontdesk").click();
		Thread.sleep(1000);
		getObject("couriers").click();
		Thread.sleep(2000);
		getObject("Newcourier").click();
//		Received couriers
		getObject("sendername").sendKeys(sendername);
		Thread.sleep(1000);
		getObject("recdby").sendKeys(recdby);
		Thread.sleep(1000);
		getObject("desc1").sendKeys(desc1);
		Thread.sleep(1000);
		getObject("btnSave").click();
		Thread.sleep(3000);
//		Sent couriers
		getObject("Newcourier").click();
		Thread.sleep(1000);
		getObject("SentCrs").click();
		Thread.sleep(1000);
		getObject("toname").sendKeys(toname);
		Thread.sleep(1000);
		getObject("toaddrs").sendKeys(toaddrs);
		Thread.sleep(1000);
		getObject("crrcomname").sendKeys(crrcomname);
		Thread.sleep(1000);
		getObject("trckNo").sendKeys(trckNo);
		Thread.sleep(1000);
		getObject("sentby").sendKeys(sentby);
		Thread.sleep(1000);
		getObject("amt").sendKeys(amt);
		Thread.sleep(1000);
		getObject("desc2").sendKeys(desc2);
		Thread.sleep(2000);
		getObject("btnSave").click();
  }
}
