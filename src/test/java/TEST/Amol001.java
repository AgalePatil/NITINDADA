package TEST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Utility.BaseClass;
import com.Utility.ExcelReader;
import com.Utility.Library;

public class Amol001 extends BaseClass{
	
	
	@Test(dataProvider = "data-provider")
	
	public void login001(int index) {
		
		System.out.println("The vlue of i is Equals to=="+index);
		String path=Library.Excelpath("LOGIN");
		ExcelReader excel=new ExcelReader(path);
		String sheet="Sheet1";
		String username=excel.getCellData(sheet, "Username", index);
		String Password=excel.getCellData(sheet, "Password", index);
		
		WebElement Username=driver.findElement(By.xpath("//input[@class='flt-text-editing transparentTextEditing']"));
		Library.CustomSendKeys(Username, username, "username");
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		Library.CustomSendKeys(pass, Password, "password");
		
		WebElement Loginbtn=driver.findElement(By.xpath("//input[@class='flt-text-editing transparentTextEditing']"));
		
		
		
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
}
