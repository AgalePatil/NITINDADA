package JQXGRID;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.JQXGRIDPOM.JQXDEMO001;
import com.Utility.BaseClass;
import com.Utility.ExcelReader;
import com.Utility.Library;

public class Jqxgrid extends BaseClass{
	
	@Test
	public void grid001() throws Exception {
		

		String path=Library.Excelpath("Ankush");
		ExcelReader Excel=new ExcelReader(path);
		String sheetname="jqxgrid";
		
		String fullname=Excel.getCellData(sheetname, "Fullname", 1);
		String emailid=Excel.getCellData(sheetname, "Eamilid", 1);
		String password=Excel.getCellData(sheetname, "Password", 1);
		String mobilenumber=Excel.getCellData(sheetname, "Mobilenumber", 1);
		String resume=Excel.getCellData(sheetname, "Resume", 1);
		JQXDEMO001 element=PageFactory.initElements(driver, JQXDEMO001.class);
		
		Thread.sleep(5000);
      // WebElement defaultf=driver.findElement(By.xpath("//a[text()='Default Functionality']"));
       
     //  Library.CustomClick(defaultf,"Default Functionality");
       Thread.sleep(5000);
	Library.Scrolldown(0, 600);
	Thread.sleep(20000);
	WebElement drpdown=driver.findElement(By.xpath("//div[starts-with(@id,'dropdownlistArrowgridpagerlistjqxWidget')]"));
	Library.Comboclick(drpdown,"5","row num");
	Thread.sleep(10000);
		int T=0;
		
		try {
		for(int i=0;i<710;i++) {
			
			Library.Savemassagelog(resume);
			System.out.println("The value of I variable=="+i);
			String rowindex=String.valueOf(T); 
			String rowindex1=String.valueOf(T+1);
			Library.Savemassagelog("The Record Num of The List =="+rowindex);
			System.out.println("The value of T=="+T);
			String productname=Library.GesStringTitle(element.getproductname(rowindex));
			Excel.setCellData(sheetname,"Product Name", i+1, productname);
			String Quantityperunit=Library.GesStringTitle(element.getQuantityperunit(rowindex));
			//WebElement qiin=driver.findElement(By.xpath("//input[contains(@id,'QuantityPerUnit')]"));
			Excel.setCellData(sheetname,"Quantity", i+1, Quantityperunit);
			String Unitstock=Library.GesStringTitle(element.getUnitinStock(rowindex));
			Excel.setCellData(sheetname,"UnitINstock", i+1, Unitstock);
			String unitprize=Library.GesStringTitle(element.getunitprize(rowindex));
			Excel.setCellData(sheetname,"Unitprize", i+1, unitprize);
			if(Quantityperunit.equalsIgnoreCase("12")) {
				WebElement ele=element.getQuantityperunit(rowindex);
				Library.CustomClick(ele,"Quantity field");
				try {Library.CustomClick(ele,"Quantity field");}catch(Exception t) {}
				WebElement qiin=driver.findElement(By.xpath("//input[contains(@id,'QuantityPerUnit')]"));
				Random rm=new Random();
				int a=rm.nextInt(2500);
				String ip=Integer.toString(a);
				Library.CustomSendKeys(qiin, ip,"Quanty Field");
				qiin.sendKeys(Keys.ENTER);
			}
			
//only g row
			
			if(!(i==0)) {
				if(i%5==0) {
					System.out.println("Searching for next button");
					Thread.sleep(9000);
					WebElement nextbtn=driver.findElement(By.xpath("//div[@title='next']"));
					Library.CustomClick(nextbtn,"Next Button");
					Thread.sleep(2000);
					T=0;
					}
				else {
					
					T=T+1;
				}
				
			}
		}
		
			
		}
		catch(Exception t) {}
		
	}

	

}
