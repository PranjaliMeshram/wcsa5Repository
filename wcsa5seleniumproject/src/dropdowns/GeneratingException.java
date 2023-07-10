package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GeneratingException {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/hp/Desktop/WCSA5/WebElement/SingleSelectDropdown.html");
	
	//identify dropdown on webpage
	 WebElement dropDownElement = driver.findElement(By.id("menu"));
	 
	 //handle the dropDown by creating object of Select class
	  Select sel = new Select(dropDownElement);
	  
	  //select the option from dropdown
	  //use selection methods
	  Thread.sleep(2000);
	  sel.selectByIndex(2); //from single select dropdown
	  
	  Thread.sleep(2000);
	  //try to deselect the option
	  sel.deselectByIndex(2);
	
}
}
