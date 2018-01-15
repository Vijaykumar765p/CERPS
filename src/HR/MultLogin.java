package HR;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import GenericClasses.Baseclass;
import GenericClasses.DataProvider1;

public class MultLogin extends Baseclass {

	@BeforeMethod
	public void login() throws IOException {
		// driver.quit();
		System.setProperty("webdriver.chrome.driver", prop.getProperty("ChromeDriverPath"));
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("password_manager_enabled", false);
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("--disable-extensions");
		options.addArguments("disable-infobars");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}

	@Test(dataProviderClass = DataProvider1.class, dataProvider = "SampleDataProvider")
	public void doLoginTest(String username, String password, String BankAccNo, String BankIFSC, String BankDetails,
			String Runmode) throws IOException, InterruptedException {
		if (!isRunModeYes("MultLogin")) {
			driver.quit();
			throw new SkipException("====RUNMODE SET TO NO====");
		}

		if (!isRunnable("LoginTest"))
			throw new SkipException("====RUNMODE SET TO NO====");
		getObject("uname").sendKeys(username);
		Thread.sleep(1000);
		getObject("pwd").sendKeys(password);
		Thread.sleep(1000);
		getObject("pwd").sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		getObject("AddBankDetails").click();
		Thread.sleep(1000);
		getObject("BankAccNo").sendKeys(BankAccNo);
		Thread.sleep(1000);
		getObject("BankIFSC").sendKeys(BankIFSC);
		Thread.sleep(1000);
		getObject("BankDetails").sendKeys(BankDetails);
		Thread.sleep(2000);
		getObject("BankDetSaveBtn").click();
		Thread.sleep(1000);
		getObject("BankDetCloseBtn").click();
		Thread.sleep(1000);
//		getObject("humanresource").click();
//		Thread.sleep(1000);
//		getObject("LeaveManagement").click();
//		Thread.sleep(1000);
//		getObject("NewLeaveReq").click();
//		Thread.sleep(1000);
//		getObject("LeaveFromDate").sendKeys("25/12/2017");
//		Thread.sleep(1000);
//		getObject("LeaveFromDate").click();
//		Thread.sleep(1000);
//		getObject("LeaveToDate").sendKeys("25/12/2017");
//		Thread.sleep(1000);
//		getObject("LeaveToDate").click();
//		Thread.sleep(1000);
//		getObject("LeaveReason").sendKeys(LeaveReason);
//		Thread.sleep(1000);
//		// getObject("LeaveSaveBtn").click();
//		Thread.sleep(1000);
		getObject("LogoutBtn").click();
	}
}
