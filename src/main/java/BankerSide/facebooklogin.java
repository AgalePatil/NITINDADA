package BankerSide;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class facebooklogin {

	
	@FindBy(how=How.XPATH,using="//input[@type='text']")
	private WebElement Username;
	
	@FindBy(how=How.XPATH,using="//input[@type='password']")
	private WebElement Password;
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	private WebElement Login;

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogin() {
		return Login;
	}
	
	
	
}


