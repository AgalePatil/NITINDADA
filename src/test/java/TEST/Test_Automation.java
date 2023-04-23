package TEST;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Utility.BaseClass;
import com.Utility.ExcelReader;
import com.Utility.Library;

import BankerSide.Test_Automation_test;
import net.bytebuddy.utility.RandomString;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Test_Automation extends BaseClass {

	@Test(dataProvider = "data-provider")
public void test00i(int i) throws Exception {
		
		
   System.out.println("The vlue of i is Equals to=="+i);
	String path=Library.Excelpath("Ankush");
	ExcelReader excel=new ExcelReader(path);
	String sheet="Sheet2";
	String Name=excel.getCellData(sheet, "Name", i);
	String Mobileno=excel.getCellData(sheet, "Mobileno", i);
	String Email=excel.getCellData(sheet, "Email", i);
	String Password=excel.getCellData(sheet, "Password", i);
	String Address=excel.getCellData(sheet, "Address", i);
	String Uploadfile=excel.getCellData(sheet, "Uploadfile", i);
	
	Test_Automation_test element=PageFactory.initElements(driver, Test_Automation_test.class);
	
      WebElement name=element.getName();
      Library.CustomSendKeys(name, Name, "name");
      
      WebElement Mobileno1=element.getMobileno();
	  Library.CustomSendKeys(Mobileno1, Mobileno, "Mobilenumner");
	  
	  WebElement email=element.getEmail();
	  Library.CustomSendKeys(email, Email, "Email");
	  
	 WebElement password= element.getPassword();
	  Library.CustomSendKeys(password, Password, "Password");
	  
	 WebElement address= element.getAddress();
	  Library.CustomSendKeys(address, Address, "Address");
	  
	 WebElement submit= element.getSubmit();
	  Library.CustomClick(submit, "Submit button");
	  
	WebElement gender= element.getGender();
	  Library.CustomClick(gender, "Mail Radio button");
	  
	 WebElement monday= element.getMonday();
	  Library.CustomClick(monday, "Monday checkbox");
	  
	 WebElement drddown= element.getSelestoptiondropdown();
	 String Dropdown1=excel.getCellData(sheet, "Dropdown", 1);
	String a=RandomString.make(4);
	 Library.SelectDropDown(drddown,Dropdown1, "Where to travels dropdown");
	 Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1700)).takeScreenshot(driver);
		ImageIO.write(screenshot.getImage(), "jpg", new File(".\\ScreenShots\\ashotimgelement"+a+".jpg"));
}








@DataProvider(name = "data-provider")
public Object[][] dataProviderMethod()
{
	
	int i=1;
    return new Object[][]
    {
    	
        {i++},{i++},{i++},{i++},{i++},{i++}
    
       
    };
}


@Test(dataProvider = "data-provider")
public void test002(int i) {
		
		
		System.out.println("The vlue of i is Equals to=="+i);
	String path=Library.Excelpath("Ankush");
	ExcelReader excel=new ExcelReader(path);
	String sheet="Sheet2";
	String Name=excel.getCellData(sheet, " Sencond Name", i);
	String Mobileno=excel.getCellData(sheet, "Second Mobileno", i);
	String Email=excel.getCellData(sheet, "Email", i);
	String Password=excel.getCellData(sheet, "Password", i);
	String Address=excel.getCellData(sheet, "Address", i);
	String Uploadfile=excel.getCellData(sheet, "Uploadfile", i);
	
	Test_Automation_test element=PageFactory.initElements(driver, Test_Automation_test.class);
	
      WebElement name=element.getName();
      Library.CustomSendKeys(name, Name, "name");
      
      WebElement Mobileno1=element.getMobileno();
	  Library.CustomSendKeys(Mobileno1, Mobileno, "Mobilenumner");
	  
	  WebElement email=element.getEmail();
	  Library.CustomSendKeys(email, Email, "Email");
	  
	 WebElement password= element.getPassword();
	  Library.CustomSendKeys(password, Password, "Password");
	  
	 WebElement address= element.getAddress();
	  Library.CustomSendKeys(address, Address, "Address");
	  
	 WebElement submit= element.getSubmit();
	  Library.CustomClick(submit, "Submit button");
	  
	WebElement gender= element.getGender();
	  Library.CustomClick(gender, "Mail Radio button");
	  
	 WebElement monday= element.getMonday();
	  Library.CustomClick(monday, "Monday checkbox");
	  
	 WebElement drddown= element.getSelestoptiondropdown();
	 String Dropdown1=excel.getCellData(sheet, "Dropdown", 1);
	
	 Library.SelectDropDown(drddown,Dropdown1, "Where to travels dropdown");
}
}
