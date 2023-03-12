package com.Utility;

import java.io.File;
import java.time.Duration;

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


public class Library extends BaseClass{
public static ExtentTest test;


public static void screenshot(String name) throws Exception {
	
	String path=System.getProperty("user.dir")+"\\ScreenShots\\"+name+".png";
	TakesScreenshot ts=(TakesScreenshot)driver;
	
	File src=ts.getScreenshotAs(OutputType.FILE);
	File Destnation=new  File(path);
	FileHandler.copy(src, Destnation);
	test.log(Status.PASS, "Screenshot taken Succesfully=="+path);
      Reporter.log("Screenshot taken Succesfully=="+path);
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
	
	test.log(Status.PASS,"Click SuccessFulyy=="+FieldName);
Reporter.log("Click SuccessFulyy=="+FieldName);
}

public static void CustomSendKeys(WebElement element, String valuesend,String FieldName) {
	Library.Explicitlywait(element, 50);
	element.sendKeys(valuesend);
	test.log(Status.PASS,FieldName+"  Value Successfully send =="+"<b>"+valuesend+"</b>");
Reporter.log(FieldName+"  Value Successfully send =="+"<b>"+valuesend+"</b>");
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

}
