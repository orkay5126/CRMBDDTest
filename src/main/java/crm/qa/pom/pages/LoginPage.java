package crm.qa.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import crm.qa.utils.TestBase;

public class LoginPage extends TestBase{
	
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath ="//input[@type='submit']")
	WebElement btnLogin;
	
	public WebDriver driver;
	
	//Initializing the Page Objects:
		public LoginPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	
	
	//WebElement username = driver.findElement(By.xpath("//input[@name = 'username']"));
	//WebElement password = driver.findElement(By.xpath("//input[@name = 'password']"));
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public HomePage Login(String un, String pw) {
		username.sendKeys(un);
		password.sendKeys(pw);
		
		//driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys(un);
		//driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys(pw);
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", btnLogin);
		js.executeScript("arguments[0].click();", btnLogin);
		
		return new HomePage(driver);
				
	}
	
}
