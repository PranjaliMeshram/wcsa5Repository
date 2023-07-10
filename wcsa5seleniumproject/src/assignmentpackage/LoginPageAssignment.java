package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageAssignment {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		Thread.sleep(2000);
		//To Identify WebElement we use Locators

		driver.findElement(By.id("id_userLoginId")).sendKeys("Pranjali123@gmail.com");//username textbox
		Thread.sleep(2000);
		//we have copied this id WebElement from the source code itself and paste it here
		//we are usig the id locator here since it is the fastest locator

		driver.findElement(By.id("id_password")).sendKeys("asdfghjkl");
		Thread.sleep(2000);

		//driver.findElement(By.xpath("button[@class='btn login-button btn-submit btn-small")).click();
		//here we are using className locator since there is no id or name locator is present. we can check by pressing cntrl+f and then putting "//" into that textfield.
		
		driver.findElement(By.cssSelector("button[class='btn login-button btn-submit btn-small']")).click();
	}

}
