package BankerSide;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Test_Automation_test {
    
	@FindBy(how=How.XPATH,using= "//input[@id='name']")
	private WebElement name;
	
	@FindBy(how=How.XPATH,using= "//input[@id='phone']")
	private WebElement mobileno;
	
	@FindBy(how=How.XPATH,using= "//input[@id='email']")
	private WebElement email;
	
	@FindBy(how=How.XPATH,using= "//input[@id='password']")
	private WebElement password;
	
	@FindBy(how=How.XPATH,using= "//textarea[@id='address']")
	private WebElement address;
	
	@FindBy(how=How.XPATH,using= "//button[@name='submit']")
	private WebElement submit;
	
	@FindBy(how=How.XPATH,using= "//input[@id='male']")
	private WebElement gender;
	
	@FindBy(how=How.XPATH,using= "//input[@id='monday']")
	private WebElement monday;
	
	@FindBy(how=How.XPATH,using= "//select[@class='custom-select']")
	private WebElement selestoptiondropdown;
	
	
	@FindBy(how=How.XPATH,using= "//label[@for='1year']")
	private WebElement year;
	
	@FindBy(how=How.XPATH,using= "")
	private WebElement seleniumwebdriver;
	
	@FindBy(how=How.XPATH,using= "//input[@id='inputGroupFile02']")
	private WebElement uploadfile;

	public WebElement getName() {
		return name;
	}

	public WebElement getMobileno() {
		return mobileno;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getMonday() {
		return monday;
	}

	public WebElement getSelestoptiondropdown() {
		return selestoptiondropdown;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getSeleniumwebdriver() {
		return seleniumwebdriver;
	}

	public WebElement getUploadfile() {
		return uploadfile;
	}
	
	
	
	
	
	 
}
