package TEST;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Utility.BaseClass;
import com.Utility.ExcelReader;
import com.Utility.Library;

import BankerSide.BankerLogin;

public class signup extends BaseClass {
	
	
	
	@Test
	public void test001() {
		
		String path=Library.Excelpath("Cheker");
		ExcelReader Excel=new ExcelReader(path);
		String sheetname="Sheet1";
		
		String FirstName=Excel.getCellData(sheetname,"FirstName", 1);
		String LastName=Excel.getCellData(sheetname,"LastName", 1);
		String Phone=Excel.getCellData(sheetname,"Phone", 1);
		String Email=Excel.getCellData(sheetname,"Email", 1);
		String Address=Excel.getCellData(sheetname,"Address", 1);
		String City=Excel.getCellData(sheetname,"City", 1);
		String State=Excel.getCellData(sheetname,"State", 1);
		String Postalcode=Excel.getCellData(sheetname,"Postalcode", 1);
		String Country=Excel.getCellData(sheetname,"Country", 1);
		String Usernmae=Excel.getCellData(sheetname,"Username", 1);
		String Password=Excel.getCellData(sheetname,"Password", 1);
		String ConfirmPassWord=Excel.getCellData(sheetname,"ConfirmPassWord", 1);
	
		BankerLogin Element=PageFactory.initElements(driver,BankerLogin.class);
		//1) First name value send
		WebElement frstname=Element.getFirstName();
		Library.CustomSendKeys(frstname, FirstName,"FisrName");
		
		WebElement Lastname=Element.getLastName();
		Library.CustomSendKeys(Lastname, LastName, "LastName");
		
		WebElement phone=Element.getPhone();
		Library.CustomSendKeys(phone,Phone,"Phone");
		
		WebElement email=Element.getEmail();
		Library.CustomSendKeys(email, Email,"Email");
		
		WebElement address=Element.getAddress();
		Library.CustomSendKeys(address, Address,"Address");
		
		WebElement city=Element.getCity();
		Library.CustomSendKeys(city, City, "City");
		
		WebElement state=Element.getState();
		Library.CustomSendKeys(state, State, "State");
		
		WebElement postalcode=Element.getPostalcode();
		Library.CustomSendKeys(postalcode, Postalcode, "Postalcode");
		
		WebElement country=Element.getCountrydropdown();
		Library.SelectDropDown(country, Country, "Country");
		
		
		WebElement username=Element.getUsername();
		Library.CustomSendKeys(username, Usernmae, "User Name");
		
		
		WebElement pass=Element.getUsername();
		Library.CustomSendKeys(pass,Password, "Password");
		
		
		WebElement confirmpass=Element.getUsername();
		Library.CustomSendKeys(confirmpass, ConfirmPassWord, "ConfirmPassWord");
		
		
		Library.CustomClick(Element.getSubMitButton(),"Submit Button");
	}

	@Test
	public void test002() {
		
		String path=Library.Excelpath("Cheker");
		ExcelReader Excel=new ExcelReader(path);
		String sheetname="Sheet2";
		String FirstName=Excel.getCellData(sheetname,"FirstName", 1);
		String LastName=Excel.getCellData(sheetname,"LastName", 1);
		String Phone=Excel.getCellData(sheetname,"Phone", 1);
		String Email=Excel.getCellData(sheetname,"Email", 1);
		String Address=Excel.getCellData(sheetname,"Address", 1);
		String City=Excel.getCellData(sheetname,"City", 1);
		String State=Excel.getCellData(sheetname,"State", 1);
		String Postalcode=Excel.getCellData(sheetname,"Postalcode", 1);
		String Country=Excel.getCellData(sheetname,"Country", 1);
		String Usernmae=Excel.getCellData(sheetname,"Username", 1);
		String Password=Excel.getCellData(sheetname,"Password", 1);
		String ConfirmPassWord=Excel.getCellData(sheetname,"ConfirmPassWord", 1);
	
		BankerLogin Element=PageFactory.initElements(driver,BankerLogin.class);
		//1) First name value send
		WebElement frstname=Element.getFirstName();
		Library.CustomSendKeys(frstname, FirstName,"FisrName");
		
		WebElement Lastname=Element.getLastName();
		Library.CustomSendKeys(Lastname, LastName, "LastName");
		
		WebElement phone=Element.getPhone();
		Library.CustomSendKeys(phone,Phone,"Phone");
		
		WebElement email=Element.getEmail();
		Library.CustomSendKeys(email, Email,"Email");
		
		WebElement address=Element.getAddress();
		Library.CustomSendKeys(address, Address,"Address");
		
		WebElement city=Element.getCity();
		Library.CustomSendKeys(city, City, "City");
		
		WebElement state=Element.getState();
		Library.CustomSendKeys(state, State, "State");
		
		WebElement postalcode=Element.getPostalcode();
		Library.CustomSendKeys(postalcode, Postalcode, "Postalcode");
		
		WebElement country=Element.getCountrydropdown();
		Library.SelectDropDown(country, Country, "Country");
		
		
		WebElement username=Element.getUsername();
		Library.CustomSendKeys(username, Usernmae, "User Name");
		
		
		WebElement pass=Element.getPassword();
		Library.CustomSendKeys(pass,Password, "Password");
		
		
		WebElement confirmpass=Element.getConformPassword();
		Library.CustomSendKeys(confirmpass, ConfirmPassWord, "ConfirmPassWord");
		
		
		Library.CustomClick(Element.getSubMitButton(),"Submit Button");
	}

}
