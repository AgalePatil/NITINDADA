package com.JQXGRIDPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.Utility.BaseClass;
import com.Utility.Library;

public class JQXDEMO001 extends BaseClass {
	@FindBy(how = How.XPATH, using = "//input[@name='firstName']")
	private WebElement FirstName;
	
	
	
	
	
	public WebElement getproductname(String index) throws Exception {
		
		System.out.println("//jqxgrid//div[contains(@id,'row"+index+"jqxWidget')]//div[@columnindex='0']");
		
		WebElement ele=driver.findElement(By.xpath("//jqxgrid//div[contains(@id,'row"+index+"jqxWidget')]//div[@columnindex='0']"));
		Library.Explicitlywait(ele, 50);
		return ele;
		
	}
	
	public WebElement getQuantityperunit(String index) {
		WebElement ele=driver.findElement(By.xpath("//jqxgrid//div[contains(@id,'row"+index+"jqxWidget')]//div[@columnindex='1']"));
		
		return ele;
		
	}
	
	
	public WebElement getunitprize(String index) {
		WebElement ele=driver.findElement(By.xpath("//jqxgrid//div[contains(@id,'row"+index+"jqxWidget')]//div[@columnindex='2']"));
		
		return ele;
		
	}
	
	public WebElement getUnitinStock(String index) {
		WebElement ele=driver.findElement(By.xpath("//jqxgrid//div[contains(@id,'row"+index+"jqxWidget')]//div[@columnindex='3']"));
		
		return ele;
		
	}
	
	
	
	
	
	
	

}
