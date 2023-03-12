package TEST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Utility.BaseClass;
import com.Utility.ExcelReader;
import com.Utility.Library;

import BankerSide.facebooklogin;

public class facebook_login extends BaseClass{
	
	@Test
	public void test001() {
		String path=Library.Excelpath("Cheker");
		ExcelReader Excel=new ExcelReader(path);
		String sheetname="Sheet3";
		
		String Username=Excel.getCellData(sheetname, "Username", 1);
		String Pssword=Excel.getCellData(sheetname, "Password", 1);
	facebooklogin element=PageFactory.initElements(driver, facebooklogin.class);

	 
	WebElement username=element.getUsername();
	Library.CustomSendKeys(username, Username, "Username");
	
	WebElement password=element.getPassword();
	Library.CustomSendKeys(password, Pssword, "Pssword");
	
	WebElement login=element.getLogin();
	Library.CustomClick(login, "Login");
	
	
		
	
	}

}
