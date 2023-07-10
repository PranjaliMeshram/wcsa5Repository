package takesScreenshot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementScreenShot {
public static void main(String[] args) {
	System.setProperty("webdriver.Chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("file:///C:/Users/hp/Desktop/WCSA5/WebElement/SingleSelectDropdown.html");
	
	 WebElement dropDown = driver.findElement(By.id("menu"));
	 dropDown.click();
	 
}
}
