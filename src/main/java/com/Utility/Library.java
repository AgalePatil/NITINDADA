package com.Utility;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;


public class Library extends BaseClass{
public static ExtentTest test;


public static void screenshot(String name) throws Exception {
	
//	String path=System.getProperty("user.dir")+"\\ScreenShots\\"+name+".png";
//	TakesScreenshot ts=(TakesScreenshot)driver;
//	
//	File src=ts.getScreenshotAs(OutputType.FILE);
//	File Destnation=new  File(path);
//	FileHandler.copy(src, Destnation);
//	test.log(Status.PASS, "Screenshot taken Succesfully=="+path);
//      Reporter.log("Screenshot taken Succesfully=="+path);
}

public static void Explicitlywait(WebElement elemennt, int time) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(elemennt));
		wait.until(ExpectedConditions.elementToBeClickable(elemennt));
		System.out.println("Wait Statement Succesfully ExceutedS"+"time=="+time);
	}

public static void CustomClick(WebElement element, String FieldName) {
	Library.Explicitlywait(element, 50);
	element.click();
	
	test.log(Status.PASS,"Click SuccessFully=="+FieldName);
Reporter.log("Click SuccessFully=="+FieldName);
}

public static void CustomSendKeys(WebElement element, String valuesend,String FieldName) {
	Library.Explicitlywait(element, 50);
	element.sendKeys(valuesend);
	test.log(Status.PASS,FieldName+" Text Box Value Successfully send =="+"<b>"+valuesend+"</b>");
Reporter.log(FieldName+" Text Box Value Successfully send =="+"<b>"+valuesend+"</b>");
}

public static void SelectDropDown(WebElement element, String VisibleText,String FieldName) {
	Library.Explicitlywait(element, 50);
	Select select=new Select(element);
	select.selectByVisibleText(VisibleText);
	test.log(Status.PASS,FieldName+" Dropdown Value Successfully selected=="+"<b>"+VisibleText+"</b>");
   Reporter.log(FieldName+" Dropdown Value Successfully selected=="+"<b>"+VisibleText+"</b>");
}

public static void Scrolldown(int Horizontalpixel, int Verticalpixel) {

	 String str1 = Integer.toString(Horizontalpixel);
	String str2 = Integer.toString(Verticalpixel);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(" + str1 + "," + str2 + ")");
}

public static String Excelpath(String FileName) {	
	String path=System.getProperty("user.dir")+"\\ExcelFiles\\"+FileName+".xlsx";
	System.out.println("Excel Sheet Path For Test Case=="+path);
	return path;
}
	
	public static void Dropdown(WebElement element,String valuetobeselect,String Dropdownname) {
	Library.Explicitlywait(element, 50);
	element.click();
	Library.Explicitlywait(driver.findElement(By.xpath("//span[contains(text(),'"+valuetobeselect+"'")), 50);
	System.out.println("//span[contains(text(),'"+valuetobeselect+"'");
	WebElement drpdown=driver.findElement(By.xpath("//span[contains(text(),'"+valuetobeselect+"'"));
	
	String text=drpdown.getText();
	drpdown.click();
	test.log(Status.PASS,Dropdownname+" Dropdown Value Successfully selected=="+"<b>"+text+"</b>");
	   Reporter.log(Dropdownname+" Dropdown Value Successfully selected=="+"<b>"+text+"</b>");
	
}




public static void Dropdown(WebElement element,String valuetobeselect,String Dropdownname) {
	Library.Explicitlywait(element, 50);
	element.click();
	Library.Explicitlywait(driver.findElement(By.xpath("//span[contains(text(),'"+valuetobeselect+"'")), 50);
	System.out.println("//span[contains(text(),'"+valuetobeselect+"'");
	WebElement drpdown=driver.findElement(By.xpath("//span[contains(text(),'"+valuetobeselect+"'"));
	
	String text=drpdown.getText();
	drpdown.click();
	test.log(Status.PASS,Dropdownname+" Dropdown Value Successfully selected=="+"<b>"+text+"</b>");
	   Reporter.log(Dropdownname+" Dropdown Value Successfully selected=="+"<b>"+text+"</b>");
	
}
public static String GesStringTitle(WebElement element) {
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Library.Explicitlywait(element, 50);
	String valuetobeselect=element.getAttribute("title");
	
	String text=valuetobeselect;
	
	test.log(Status.PASS,"The Value Successfully Fetched=="+"<b>"+text+"</b>");
	  Reporter.log(" The Value Successfully Fetched=="+"<b>"+text+"</b>");
	  
	  System.out.println("The Value Successfully Fetched=="+"<b>"+text+"</b>");
	return text;
}
public static void Savemassagelog(String msg) {

	test.log(Status.INFO, MarkupHelper.createLabel(" " + msg, ExtentColor.GREEN));
	Reporter.log("<font color =" + "blue" + ">" + msg + "</font>");
	System.out.println(msg);

}

public static void Comboclick(WebElement element, String optionname, String Fieldname) {

	System.out.println("The Option Name Is ==" + optionname);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	JavascriptExecutor js = (JavascriptExecutor) driver;

	wait.until(ExpectedConditions.elementToBeClickable(element));
	System.out.println("Wait Succesfully Applied On Field");
	System.out.print("");
	element.click();
try {
	Thread.sleep(5000);
} catch (InterruptedException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
	try {

		Reporter.log("Click sucessfully==" + Fieldname);
		test.log(Status.PASS, "Click sucessfully==" + Fieldname);
		WebElement Option = driver.findElement(By.xpath("//span[text()='"+optionname +"']"));
		//WebElement Option = driver.findElement(By.xpath("//span[contains(text(),'" + optionname + "')]"));

		wait.until(ExpectedConditions.elementToBeClickable(Option));

		String text = Option.getText();

		Reporter.log("Option Sucessfully Selected==" + "<b>" + Fieldname + "==" + text + "</b>");

		test.log(Status.PASS, "Option Sucessfully Selected==" + "<b>" + Fieldname + "==" + text + "</b>");

		js.executeScript("arguments[0].click()", Option);

	} catch (Exception e) {
		System.err.println("Cannot Click " + e.getMessage());
		Reporter.log("<b><FONT COLOR=\"#ff0000\"> INVALID  Option/No such Option Present ==</FONT></b>"
				+ "<b><FONT COLOR=\"#0000ff\">" + Fieldname + "==" + optionname + "</FONT></b>");
		Reporter.log(e.getMessage());
		System.out.println(optionname + "==INVALID  Option/No such Option Present" + e.getMessage());
		test.log(Status.PASS, "<b><FONT COLOR=\"#ff0000\"> INVALID  Option/No such Option Present ==</FONT></b>"
				+ "<b>" + Fieldname + "==" + optionname + "</b>" + e.getMessage());
		// test.log(Status.FAIL, e.getMessage());
	}

}


}
