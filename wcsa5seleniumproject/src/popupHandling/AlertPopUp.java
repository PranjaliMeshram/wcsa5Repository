package popupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdrievr.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/hp/Desktop/WCSA5/WebElement/Alert.html");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(2000);

		//handle the alert popup
		Alert al = driver.switchTo().alert();
		//al.accept();
		al.dismiss();
	}
}
