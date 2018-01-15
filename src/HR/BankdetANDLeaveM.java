package HR;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class BankdetANDLeaveM {
	public WebDriver driver;
	public WebDriverWait wait;
	
	String appURL = "http://demo/cerps_test/";
	
	//Locators
	private By byUsername = By.xpath("//input[@id='ContentPlaceHolder1_uclogin_txtuname']");
	private By byPassword = By.xpath("//input[@id='ContentPlaceHolder1_uclogin_txtpass']");
	private By byError = By.xpath("//span[contains(.,'Login Error... Please try again!')]");
	
	@BeforeClass
	public void testSetup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay.p\\workspace\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("password_manager_enabled", false);
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("--disable-extensions");
		options.addArguments("disable-infobars");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 10);
	}
	

	@Test(dataProvider="empLogin")
	public void VerifyInvalidLogin(String userName, String password) throws InterruptedException {
		driver.navigate().to(appURL);
		driver.findElement(byUsername).sendKeys(userName);
		driver.findElement(byPassword).sendKeys(password);
		//wait for element to be visible and perform click
		wait.until(ExpectedConditions.visibilityOfElementLocated(byPassword));
		driver.findElement(byPassword).sendKeys(Keys.ENTER);
//		Check for error message

		String requiredErrorMessage = "Login Error... Please try again!";
		wait.until(ExpectedConditions.presenceOfElementLocated(byError));
		String actualErrorDisplayed = driver.findElement(byError).getText();
		Assert.assertEquals(requiredErrorMessage, actualErrorDisplayed);

	}
	
	@DataProvider(name="empLogin")
	public Object[][] loginData() throws BiffException {
		Object[][] arrayObject = getExcelData("C:\\Users\\vijay.p\\workspace\\CIS_Cerps\\Excelfile\\Login.xlt","MultLogin");
		return arrayObject;
	}

	/**
	 * @param File Name
	 * @param Sheet Name
	 * @return
	 * @throws BiffException 
	 */
	public String[][] getExcelData(String fileName, String sheetName) throws BiffException {
		String[][] arrayExcelData = null;
		try {
			FileInputStream fs = new FileInputStream(fileName);
			Workbook wb = Workbook.getWorkbook(fs);
			Sheet sh = wb.getSheet(sheetName);

			int totalNoOfCols = sh.getColumns();
			int totalNoOfRows = sh.getRows();
			
			arrayExcelData = new String[totalNoOfRows-1][totalNoOfCols];
			
			for (int i= 1 ; i < totalNoOfRows; i++) {

				for (int j=0; j < totalNoOfCols; j++) {
					arrayExcelData[i-1][j] = sh.getCell(j, i).getContents();
				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			e.printStackTrace();
//		} catch (BiffException e) {
//			e.printStackTrace();
		}
		return arrayExcelData;
	}

	@Test
	public void tearDown() {
		driver.quit();
	}
}