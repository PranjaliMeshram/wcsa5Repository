package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");-->This statement will throw an error, to avoid it we are using the specific path
		driver.get("file:///C:/Users/hp/Desktop/WCSA5/WebElement/UsernameOnly.html");
		WebElement usn=driver.findElement(By.tagName("input"));
		usn.sendKeys("qspiders");
		
	}

}
