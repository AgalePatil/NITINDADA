package BankerSide;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BankerLogin {

	@FindBy(how = How.XPATH, using = "//input[@name='firstName']")
	private WebElement FirstName;

	@FindBy(how = How.XPATH, using = "//input[@name='lastName']")
	private WebElement LastName;

	@FindBy(how = How.XPATH, using = "//input[@id='userName']")
	private WebElement Email;

	@FindBy(how = How.XPATH, using = "//input[@name='phone']")
	private WebElement Phone;

	@FindBy(how = How.XPATH, using = "//input[@name='address1']")
	private WebElement Address;

	@FindBy(how = How.XPATH, using = "//input[@name='city']")
	private WebElement City;

	@FindBy(how = How.XPATH, using = "//input[@name='state']")
	private WebElement state;

	@FindBy(how = How.XPATH, using = "//input[@name='postalCode']")
	private WebElement Postalcode;

	@FindBy(how = How.XPATH, using = "//select[@name='country']")
	private WebElement Countrydropdown;

	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	private WebElement Username;

	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	private WebElement Password;

	@FindBy(how = How.XPATH, using = "//input[@name='confirmPassword']")
	private WebElement ConformPassword;
	
	@FindBy(how = How.XPATH, using = "//input[@name='submit']")
	private WebElement SubMitButton;
	
	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPhone() {
		return Phone;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCity() {
		return City;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getPostalcode() {
		return Postalcode;
	}

	public WebElement getCountrydropdown() {
		return Countrydropdown;
	}

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getConformPassword() {
		return ConformPassword;
	}

	public WebElement getSubMitButton() {
		return SubMitButton;
	}

}
