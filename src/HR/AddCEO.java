package HR;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import GenericClasses.TestBase;

public class AddCEO  extends TestBase {
	@Test
	public void addceo() throws InterruptedException, IOException {
//		Human Resource
		getObject("humanresource").click();
		Thread.sleep(1000);
		getObject("Employees").click();
		Thread.sleep(1000);
		getObject("AddNewEmp").click();
		Thread.sleep(1000);
		getObject("Genrate").click();
		Thread.sleep(1000);
		getObject("F_name").sendKeys("Ajit Patil");
		Select s = new Select(getObject("gender"));
	    s.selectByVisibleText("Male");
	    Thread.sleep(1000);
	    Select s1 = new Select(getObject("MarSts"));
	    s1.selectByVisibleText("Married");
	    Thread.sleep(1000);
	    getObject("dob").sendKeys("23/10/1982");
	    Thread.sleep(1000);
	    getObject("dob").click();
	    Thread.sleep(1000);
	    getObject("addr").sendKeys("1364, Vantmuri Colony Sector 7, MM Extension");
	    Thread.sleep(1000);
	    getObject("city").sendKeys("Belagavi");
	    Thread.sleep(1000);
	    getObject("phno").sendKeys("9379499565");
	    Thread.sleep(1000);
	    getObject("email").sendKeys("ajitkumarspatil@gmail.com");
	    Thread.sleep(1000);
	    getObject("upldpic").sendKeys("C:\\Users\\vijay.p\\Downloads\\Images\\uploads\\Ajit_Patil_Ajit passport.jpg");
	    Thread.sleep(1000);
	    getObject("upldidnty").sendKeys("C:\\Users\\vijay.p\\Downloads\\Images\\uploads\\AJIT_PATIL_0010000001_ID_Proof_14_10_2015.jpg");
	    Thread.sleep(1000);
	    getObject("upldaddr").sendKeys("C:\\Users\\vijay.p\\Downloads\\Images\\uploads\\AJIT_PATIL_0010000001_Address_Proof_01_04_2016.jpg");
	    Thread.sleep(1000);
	    Select s2 = new Select(getObject("dpt"));
	    s2.selectByValue("8");
	    Thread.sleep(1000);
	    getObject("desgn").sendKeys("CEO");
	    Thread.sleep(1000);
	    getObject("biomtr").sendKeys("00000001");
	    Thread.sleep(1000);
	    getObject("PFno").sendKeys("NULL");
	    Thread.sleep(1000);
	    getObject("pan").sendKeys("AKLPP4582B");
	    Thread.sleep(1000);
	    getObject("esi").sendKeys("NULL");
	    Thread.sleep(1000);
	    getObject("joindate").sendKeys("01/10/2012");
	    Thread.sleep(1000);
	    getObject("joindate").click();
	    Thread.sleep(1000);
	    getObject("ctc").sendKeys("120000");
	    Thread.sleep(1000);
	    getObject("inc").sendKeys("0");
	    Thread.sleep(1000);
	    getObject("TA").sendKeys("0");
	    Thread.sleep(1000);
	    getObject("mobexp").sendKeys("0");
	    Thread.sleep(1000);
	    getObject("prftax").sendKeys("0");
	    Thread.sleep(1000);
	    WebElement SaveBtn = driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_ctl00_btsavecustomer']"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SaveBtn); 
	    Thread.sleep(2000);
	    SaveBtn.click();
	}
}
