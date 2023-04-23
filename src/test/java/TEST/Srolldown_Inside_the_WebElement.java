package TEST;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Srolldown_Inside_the_WebElement {
	
	
	@SuppressWarnings("deprecation")
	@Test()
	public void m1() throws Exception {
		
		//https://demo.automationtesting.in/WebTable.html
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.myntra.com/women-kurtas-suits");
		WebElement a=driver.findElement(By.xpath("//div[@class='brand-more']"));
		a.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(5000);
		EventFiringWebDriver event=new EventFiringWebDriver(driver);
		
		event.executeScript("document.querySelector('ul[class=\"FilterDirectory-list\"]').scrollLeft=500");
		
		
	}


}
