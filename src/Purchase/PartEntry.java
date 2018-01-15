package Purchase;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import GenericClasses.DataProviderTest;
import GenericClasses.TestBase;

public class PartEntry extends TestBase{
	@Test(dataProviderClass = DataProviderTest.class, dataProvider = "SampleDataProvider")
	public void newpartentry(String NewPartCode, String NewHSNode, String NewPartName, String UnitforPart, String NewPartMRP,
			String NewPartST, String NewPartVAT, String NewPartCGST, String NewPartSGST,
			String NewPartIGST, String NewPartDecs) throws IOException, InterruptedException {
//		New Part Entry
		getObject("Purchase").click();
		Thread.sleep(1000);
		getObject("PartEntry").click();
		Thread.sleep(1000);
		getObject("NewPart").click();
		Thread.sleep(1000);
		getObject("NewPartCode").sendKeys(NewPartCode);
		Thread.sleep(1000);
		getObject("NewHSNode").sendKeys(NewHSNode);
		Thread.sleep(1000);
		getObject("NewPartName").sendKeys(NewPartName);
		Thread.sleep(1000);
		Select s = new Select(getObject("UnitforPart"));
		s.selectByVisibleText(UnitforPart);
		Thread.sleep(1000);
		getObject("NewPartMRP").sendKeys(NewPartMRP);
		Thread.sleep(1000);
		getObject("NewPartST").sendKeys(NewPartST);
		Thread.sleep(1000);
		getObject("NewPartVAT").sendKeys(NewPartVAT);
		Thread.sleep(1000);
		getObject("NewPartCGST").sendKeys(NewPartCGST);
		Thread.sleep(1000);
		getObject("NewPartSGST").sendKeys(NewPartSGST);
		Thread.sleep(1000);
		getObject("NewPartIGST").sendKeys(NewPartIGST);
		Thread.sleep(1000);
		getObject("NewPartDecs").sendKeys(NewPartDecs);
		Thread.sleep(2000);
		getObject("NewPartSaveBtn").click();
  }
}
