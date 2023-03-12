package TEST;

import com.Utility.ExcelReader;
import com.Utility.Library;

public class demo {

	public static void main(String[] args) {
		
		String path=Library.Excelpath("Ankush");
		ExcelReader Excel=new ExcelReader(path);
		String sheetname="Sheet1";
		
		String fullname=Excel.getCellData(sheetname, "Fullname", 1);
		String emailid=Excel.getCellData(sheetname, "Eamilid", 1);
		String password=Excel.getCellData(sheetname, "Password", 1);
		String mobilenumber=Excel.getCellData(sheetname, "Mobilenumber", 1);
		String resume=Excel.getCellData(sheetname, "Resume", 1);
		System.out.println(resume);
	
	
	
	}
}
