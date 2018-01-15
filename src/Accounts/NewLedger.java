package Accounts;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import GenericClasses.DataProviderTest;
import GenericClasses.TestBase;

public class NewLedger extends TestBase {
	@Test(dataProviderClass = DataProviderTest.class, dataProvider = "SampleDataProvider")
	public void newledgr(String NewGLName, String NewAcc, String NewPLBShead, String NewOpeningbal, String Newdrcr)
			throws IOException, InterruptedException {
		getObject("Accounts").click();
		Thread.sleep(1000);
		getObject("GeneralLedger").click();
		Thread.sleep(1000);
		getObject("NewLedger").click();
		Thread.sleep(1000);
		getObject("NewGLName").sendKeys(NewGLName);
		Thread.sleep(1000);
		Select s = new Select(getObject("NewAcc"));
		s.selectByVisibleText(NewAcc);
		Thread.sleep(2000);
		getObject("NewPLBShead").sendKeys(NewPLBShead);
		Thread.sleep(2000);
		getObject("NewPLBShead").sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		getObject("NewOpeningbal").sendKeys(NewOpeningbal);
		Thread.sleep(1000);
		Select s1 = new Select(getObject("Newdrcr"));
		s1.selectByVisibleText(Newdrcr);
		Thread.sleep(2000);
		getObject("NewLedSaveBtn").click();
	}
}
