package TEST;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Utility.BaseClass;
import com.Utility.ExcelReader;
import com.Utility.Library;

public class file_upload extends BaseClass {

	@Test
	public void test01() {
		
		String path=Library.Excelpath("Ankush");
		ExcelReader Excel=new ExcelReader(path);
		String sheetname="Sheet1";
		
		String resume=Excel.getCellData(sheetname, "Resume", 1);
		
		file_upload element=PageFactory.initElements(driver,file_upload.class);
		
		
	}
}
