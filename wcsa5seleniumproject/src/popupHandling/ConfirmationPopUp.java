package popupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdrievr.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/hp/Desktop/WCSA5/WebElement/Confirmation.html");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);

		//handle the Confirmation PopUp
		Alert al = driver.switchTo().alert();
		//al.accept();
		al.accept();
	}
}
