package BankerSide;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Naukri_signup {

	@FindBy (how=How.XPATH,using="(//input[@type='text'])[1]")
	WebElement Fullname;
	
	@FindBy(how=How.XPATH,using="(//input[@type='text'])[2]")
	WebElement Eamilid;
	
	@FindBy(how=How.XPATH,using="//input[@type='password']")
	WebElement Password;
	
	@FindBy(how=How.XPATH,using="(//input[@type='text'])[3]")
	WebElement Mobilenumber;
	
	@FindBy(how=How.XPATH,using="//i[@class='main-6 resman-icon resman-icon-briefcase']")
	WebElement Workstatus;
	
	@FindBy (how=How.XPATH,using="//button[text()='Upload Resume']")
	WebElement Uploadresume;
	
	@FindBy(how=How.XPATH,using="//button[text()='Register Now']")
	WebElement Registernow;

	public WebElement getFullname() {
		return Fullname;
	}

	public WebElement getEamilid() {
		return Eamilid;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getMobilenumber() {
		return Mobilenumber;
	}

	public WebElement getWorkstatus() {
		return Workstatus;
	}

	public WebElement getUploadresume() {
		return Uploadresume;
	}

	public WebElement getRegisternow() {
		return Registernow;
	}
}
