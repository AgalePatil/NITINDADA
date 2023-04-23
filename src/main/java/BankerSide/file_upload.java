package BankerSide;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class file_upload {
	
	@FindBy(how=How.XPATH,using="//input[@id='file-upload']")
	WebElement file_upload;

	public WebElement getFile_upload() {
		return file_upload;
	}
}
