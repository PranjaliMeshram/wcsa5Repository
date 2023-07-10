package synchronization;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramInvalidLogin {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 ChromeDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 driver.get("https://www.instagram.com/");
	 
	 Thread.sleep(2000);
	 
}
}
