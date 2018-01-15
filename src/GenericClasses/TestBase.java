package GenericClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestBase {
	public static Properties prop = null;
	public static FileInputStream ip = null;
	public static WebDriver driver = null;
	@BeforeMethod
	public static void login() throws IOException, InterruptedException {
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
		Thread.sleep(1000);
		getObject("uname").sendKeys(prop.getProperty("USERNAME"));
		getObject("pwd").sendKeys(prop.getProperty("PASSWORD"));
		getObject("pwd").sendKeys(Keys.ENTER);
	}

	@BeforeTest
	public void initialize() throws IOException {
		prop = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\Excel\\xpaths.properties");
		prop.load(ip);
	}
	public static WebElement getObject(String identifier) throws IOException {
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
	@AfterMethod
	public void close() {
//		driver.quit();
	}
}
