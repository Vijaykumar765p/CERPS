package GenericClasses;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import Excel.Xls_Reader;

public class Baseclass {
	
	public static Properties prop=null;
	public static FileInputStream ip = null;
	public static WebDriver driver=null;
	public static Select s = null;
	public static int i=2;
	public static Xls_Reader xls;
	
	@BeforeClass
	public void initialize() throws IOException
	{
		i=2;
		prop = new Properties();
	    ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\Excel\\xpaths.properties");
		prop.load(ip);
		
//		System.setProperty("webdriver.chrome.driver", prop.getProperty("ChromeDriverPath"));
//		ChromeOptions options = new ChromeOptions();
//		Map<String, Object> prefs = new HashMap<String, Object>();
//		prefs.put("credentials_enable_service", false);
//		prefs.put("password_manager_enabled", false);
//		options.setExperimentalOption("prefs", prefs);
//		options.addArguments("--disable-extensions");
//		options.addArguments("disable-infobars");
//		driver = new ChromeDriver(options);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		driver.get(prop.getProperty("url"));
//		getObject("uname").sendKeys(prop.getProperty("USERNAME"));
//		getObject("pwd").sendKeys(prop.getProperty("PASSWORD"));
//		getObject("pwd").sendKeys(Keys.ENTER);
	}
		
	@AfterMethod
	public static void closeBrowsers()
	{
		driver.quit();
	}
	
	public static  WebElement getObject(String identifier) throws IOException {
			try{
				if(prop.getProperty(identifier).startsWith("//"))
				return driver.findElement(By.xpath(prop.getProperty(identifier)));
			else
				return driver.findElement(By.id(prop.getProperty(identifier)));
			}catch(Throwable t){
				System.err.println("====ERROR ENCOUNTERED. OBJECT NOT FOUND====" + identifier);	
				takeScreenShots();
			}	
		return null;
	}	

	public static  void takeScreenShots() 
	{
		Date d = new Date();
		String filename = d.toString().replace(":", "_").replace(" ", "_") + ".png";
		System.out.println(filename);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try
		{
			FileUtils.copyFile(src, new File("C:\\Users\\vijay.p\\workspace\\CIS_Cerps\\Screenshots\\" + filename));
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean isRunnable(String LoginTest)
	{
		xls= new Xls_Reader(prop.getProperty("cerpsxlsx"));
		String runmode = xls.getCellData(LoginTest, "Runmode", i);
		i++;
		if(runmode.equals("Y"))
			return true;
		else
			return false;
	}
//	
	public static boolean isRunModeYes(String TestName)
	{
		xls = new Xls_Reader(prop.getProperty("cerpsxlsx"));
		int rows = xls.getRowCount("RunModes");
		for(int rNum=2;rNum<=rows;rNum++){
				if(TestName.equals(xls.getCellData("RunModes", "TCID", rNum))){
					if(xls.getCellData("RunModes", "Runmode", rNum).equals("Y"))
						return true;
					else
						return false;
				}		
		}
		return false;
	}
}
