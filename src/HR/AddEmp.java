package HR;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import GenericClasses.DataProviderTest;
import GenericClasses.TestBase;

public class AddEmp extends TestBase {
	@Test(dataProviderClass = DataProviderTest.class, dataProvider = "SampleDataProvider")
	public void hres(String fname,String gender,String mrtsts,String dob,String addrs,String city,String phno,String email,String updpic,String upldidnty,String upldaddr,
			String dept,String desgn,String biomtr,String pfno,String pan,String esi,String joindate,String ctc,String inc,String ta,String mbexp,
			String pftax) throws InterruptedException, IOException {
//		Human Resource
		getObject("humanresource").click();
		Thread.sleep(1000);
		getObject("Employees").click();
		Thread.sleep(1000);
		getObject("AddNewEmp").click();
		Thread.sleep(1000);
		getObject("Genrate").click();
		Thread.sleep(1000);
		getObject("F_name").sendKeys(fname);
		Select s = new Select(getObject("gender"));
	    s.selectByVisibleText(gender);
	    Thread.sleep(1000);
	    Select s1 = new Select(getObject("MarSts"));
	    s1.selectByVisibleText(mrtsts);
	    Thread.sleep(1000);
	    getObject("dob").sendKeys(dob);
	    Thread.sleep(1000);
	    getObject("dob").click();
	    Thread.sleep(1000);
	    getObject("addr").sendKeys(addrs);
	    Thread.sleep(1000);
	    getObject("city").sendKeys(city);
	    Thread.sleep(1000);
	    getObject("phno").sendKeys(phno);
	    Thread.sleep(1000);
	    getObject("email").sendKeys(email);
	    Thread.sleep(1000);
	    getObject("upldpic").sendKeys(updpic);
	    Thread.sleep(1000);
	    getObject("upldidnty").sendKeys(upldidnty);
	    Thread.sleep(1000);
	    getObject("upldaddr").sendKeys(upldaddr);
	    Thread.sleep(1000);
	    Select s2 = new Select(getObject("dpt"));
	    s2.selectByValue(dept);
	    Thread.sleep(1000);
	    getObject("desgn").sendKeys(desgn);
	    Thread.sleep(1000);
	    getObject("biomtr").sendKeys(biomtr);
	    Thread.sleep(1000);
	    getObject("PFno").sendKeys(pfno);
	    Thread.sleep(1000);
	    getObject("pan").sendKeys(pan);
	    Thread.sleep(1000);
	    getObject("esi").sendKeys(esi);
	    Thread.sleep(1000);
	    getObject("joindate").sendKeys(joindate);
	    Thread.sleep(1000);
	    getObject("joindate").click();
	    Thread.sleep(1000);
	    getObject("ctc").sendKeys(ctc);
	    Thread.sleep(1000);
	    getObject("inc").sendKeys(inc);
	    Thread.sleep(1000);
	    getObject("TA").sendKeys(ta);
	    Thread.sleep(1000);
	    getObject("mobexp").sendKeys(mbexp);
	    Thread.sleep(1000);
	    getObject("prftax").sendKeys(pftax);
	    Thread.sleep(1000);
	    WebElement SaveBtn = driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_ctl00_btsavecustomer']"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SaveBtn); 
	    Thread.sleep(2000);
	    SaveBtn.click();
	}
}
