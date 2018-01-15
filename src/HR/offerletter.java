package HR;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import GenericClasses.DataProviderTest;
import GenericClasses.TestBase;
public class offerletter extends TestBase {
	@Test(dataProviderClass = DataProviderTest.class, dataProvider = "SampleDataProvider")
  public void genoffltr(String empname,String empemail,String empjoindate,String empdept,String empdesgn,
		  String emprptngto,String empsaloff) throws IOException, InterruptedException {
//		Human Resource
		getObject("humanresource").click();
		Thread.sleep(1000);
		getObject("OfferLetter").click();
		Thread.sleep(1000);
		getObject("empname").sendKeys(empname);
		Thread.sleep(1000);
		getObject("empemail").sendKeys(empemail);
		Thread.sleep(1000);
		getObject("empjoindate").sendKeys(empjoindate);
		Thread.sleep(1000);
		getObject("empjoindate").click();
		Thread.sleep(1000);
		Select s = new Select(getObject("empdept"));
	    s.selectByValue(empdept);
	    Thread.sleep(1000);
	    getObject("empdesgn").sendKeys(empdesgn);
	    Thread.sleep(1000);
	    getObject("emprptngto").sendKeys(emprptngto);
	    Thread.sleep(1000);
	    getObject("emprptngto").sendKeys(Keys.ARROW_DOWN);
	    Thread.sleep(1000);
	    getObject("empsaloff").sendKeys(empsaloff);
	    Thread.sleep(1000);
	    getObject("Genrtbtn").click();
	    Thread.sleep(2000);
	    WebElement SaveBtn = driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_ctl00_btsaveeol']"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SaveBtn); 
	    Thread.sleep(2000);
	    SaveBtn.click();
  }
}
