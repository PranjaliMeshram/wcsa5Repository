package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToLaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		//Relative path of driver executable file
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
		//upcast into WebDriver interface
		WebDriver driver=new ChromeDriver();
		
		//to maximize the browser(using method chaining)
		driver.manage().window().maximize();
		
		//provide the delay of 2 sec
		Thread.sleep(5000); //stop execution for 2 sec
		
		//To close browser
		driver.close();
	}

}
