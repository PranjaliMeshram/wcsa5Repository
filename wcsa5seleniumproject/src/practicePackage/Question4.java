package practicePackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4 {
	
	//how to close only child browser
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://omayo.blogspot.com/");
		
		
		//Launch the child window
		WebElement childWindow = driver.findElement(By.partialLinkText("Open a popup window"));
		Point elementLoc = childWindow.getLocation();
	   int xaxis = elementLoc.getX();
	   int yaxis = elementLoc.getY();
	   
	   //scroll till open a popup window
	   JavascriptExecutor jse = (JavascriptExecutor)driver;
	   jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-80)+")");
	   childWindow.click();
	   
	 //get the address or handles of parent window
	 		String parentHandle = driver.getWindowHandle();
	 		
	 		//get the address or handles of parent and child window
	 		Set<String> allHandles = driver.getWindowHandles();
	 		
	 		//how to close only child browser
	 		
	 		for(String wh:allHandles)
	 		{
	 			if(!parentHandle.equals(wh))
	 			{
	 				Thread.sleep(2000);
	 				driver.switchTo().window(wh).close();
	 				break;
	 			}
	 		}
	 		
}
}
