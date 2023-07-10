package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://www.selenium.dev/");
	
	//to perform Scrolling operations
	 JavascriptExecutor jse = (JavascriptExecutor)driver;
	 
	 //scroll down
	 Thread.sleep(2000);
	 jse.executeScript("window.scrollBy(0,1000)");
	 
	 
	  WebElement buttonReadMore = driver.findElement(By.xpath("//a[contains(@class,'selenium-button selenium-ide text-uppercase font-weight-bold')]"));
	  
	  jse.executeScript("argument[0].click",buttonReadMore);
}
}
