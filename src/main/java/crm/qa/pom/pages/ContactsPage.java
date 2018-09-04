package crm.qa.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import crm.qa.utils.TestBase;

public class ContactsPage extends TestBase{
	
	@FindBy(xpath = "//legend[contains(text(),'Contact Information')]")
	WebElement lblContactPage;
	
	@FindBy(id="first_name")
	WebElement txtFirstName;
	
	@FindBy(id="surname")
	WebElement txtLastName;
	
	@FindBy(id="mobile")
	WebElement txtMobileName;
	
	@FindBy(xpath = "//input[@type='submit' and @value='Save']")
	WebElement btnSave;
	
	
//	public ContactsPage() {
//		PageFactory.initElements(driver, this);
//
//	}
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	

	public boolean verifyLblContactPage(){
		return lblContactPage.isDisplayed();
	}
	
	public void createNewContact(String fname, String lname, String mobile){
		txtFirstName.sendKeys(fname);
		txtLastName.sendKeys(lname);
		txtLastName.sendKeys(mobile);
		
		btnSave.click();
		
	}
}
