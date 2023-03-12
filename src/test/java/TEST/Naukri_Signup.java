package TEST;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Utility.BaseClass;
import com.Utility.ExcelReader;
import com.Utility.Library;

import BankerSide.Naukri_signup;

public class Naukri_Signup extends BaseClass{

	
	@Test
	public void test001() throws Exception {
		
		String path=Library.Excelpath("Ankush");
		ExcelReader Excel=new ExcelReader(path);
		String sheetname="Sheet1";
		
		String fullname=Excel.getCellData(sheetname, "Fullname", 1);
		String emailid=Excel.getCellData(sheetname, "Eamilid", 1);
		String password=Excel.getCellData(sheetname, "Password", 1);
		String mobilenumber=Excel.getCellData(sheetname, "Mobilenumber", 1);
		String resume=Excel.getCellData(sheetname, "Resume", 1);
		
		Naukri_signup element=PageFactory.initElements(driver, Naukri_signup.class);
		
	
		WebElement Fullname =element.getFullname();
		Library.CustomSendKeys(Fullname, fullname, "Fullname");
		
		WebElement Emailid=element.getEamilid();
		Library.CustomSendKeys(Emailid, emailid, "Emailid");
		
		WebElement Password=element.getPassword();
		Library.CustomSendKeys(Password, password, "Password");
		
		WebElement Mobilenumber=element.getMobilenumber();
		Library.CustomSendKeys(Mobilenumber, mobilenumber, "Mobilenumber");
		
		Library.Scrolldown(0, 100);	
		Library.screenshot("second");
		
		WebElement Workstatus=element.getWorkstatus();
		Library.CustomClick(Workstatus, "Workstatus");
		Thread.sleep(4000);
		WebElement Resume=element.getUploadresume();
		Library.screenshot("Fisrst");
		Resume.sendKeys("C:\\Users\\HP\\AUTOMATION\\Framework\\NITINDADA\\Inputdata\\Ankush_agle_software_Test_Engineer.pdf");
		//Library.CustomSendKeys(Resume, resume, "Resumeupload");
		
		WebElement Register=element.getRegisternow();
		Library.CustomClick(Register, "Registernow");
		
		Library.SelectDropDown(Register, mobilenumber,"Contry");
	}
}
