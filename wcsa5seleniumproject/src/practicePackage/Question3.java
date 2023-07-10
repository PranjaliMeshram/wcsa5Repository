package practicePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {
//how to close only the parent browser
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://omayo.blogspot.com/");
		
		WebElement childWindow = driver.findElement(By.partialLinkText("Open a popup window"));
		Point elementLoc = childWindow.getLocation();
	   int xaxis = elementLoc.getX();
	   int yaxis = elementLoc.getY();
	   
	   JavascriptExecutor jse = (JavascriptExecutor)driver;
	   jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-80)+")");
	   childWindow.click();
	   Thread.sleep(2000);
	   driver.close();
}
}
