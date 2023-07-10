package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeSynchronization {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://laptop-83dojttd/login.do");
		//Login Page

		String actualTitleofLoginPage = driver.getTitle();
		
		if(actualTitleofLoginPage.equals("actiTIME - Login"))
		{
			System.out.println("TItle is matched, Test case is passed!");
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
		}
		else
		{
			System.out.println("we will get exception!");
		}
		
		//Home Page
		
		String actualTitleOfHomePage=driver.getTitle();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleContains(actualTitleOfHomePage));
		
		if(actualTitleOfHomePage.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("TItle is matched, Test case is passed!");
			//driver.findElement(By.linkText("Logout")).click();
		}
		else
		{
			System.out.println("Title is not Matched,Test case is failed!");
		}
	}
}
