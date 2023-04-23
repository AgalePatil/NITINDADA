package com.Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	@BeforeMethod
	public void StartBrowser() {
		String path=System.getProperty("user.dir")+"\\ExcelFiles\\LOGIN.xlsx";
		String sheetname="LOGIN";
		ExcelReader Excel=new ExcelReader(path);
		String URL=Excel.getCellData(sheetname,"value", 1);
		String Browser=Excel.getCellData(sheetname,"value", 4);
		
		
		if(Browser.equalsIgnoreCase("chrome")) {
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(option);
			}
		
		else if(Browser.equalsIgnoreCase("edge")) {
			
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
	
		}
	

		else if(Browser.equalsIgnoreCase("FireFox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
	
		}
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		}
	
	
	@AfterMethod()
	public void TearDown() {
		
		//driver.close();
		
		
	}

}
