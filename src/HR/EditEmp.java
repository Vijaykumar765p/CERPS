package HR;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import GenericClasses.TestBase;

public class EditEmp extends TestBase {
  @Test
  public void editemp() throws IOException, InterruptedException {
//	  Edit employee
	  getObject("humanresource").click();
	  Thread.sleep(1000);
	  getObject("Employees").click();
	  Thread.sleep(1000);
	  getObject("UpdateEmp").click();
	  Thread.sleep(1000);
	  getObject("EmpSearch").sendKeys("Vijay");
	  Thread.sleep(1000);
	  getObject("EmpSearch").sendKeys(Keys.ARROW_DOWN);
	  Thread.sleep(1000);
	  getObject("UpdEmpSearchbtn").click();
	  Thread.sleep(2000);
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
	  jse.executeScript("scroll(0,250)");
	  getObject("EmplSal").clear();
	  Thread.sleep(1000);
	  getObject("EmplSal").sendKeys("135000");
	  Thread.sleep(1000);
	  getObject("EmpLeave").clear();
	  Thread.sleep(1000);
	  getObject("EmpLeave").sendKeys("9");
	  Thread.sleep(1000);
	  getObject("UpdateEmpBtn").click();
  }
}
