package crm.qa.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;



public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase(){
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("C:\\Ramesh_1\\src\\RKCRM_BDD\\src\\main\\java\\crm\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static WebDriver initialization() {
	
		/*String browserName = prop.getProperty("browser");*/
		
		//String browserName = System.getenv("env.Browser");
		
		String browserName = System.getProperty("BROWSER");		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");	
			driver = new FirefoxDriver(); 
		}
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIME_OUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url"));
	return driver;
	
	}
	
}
