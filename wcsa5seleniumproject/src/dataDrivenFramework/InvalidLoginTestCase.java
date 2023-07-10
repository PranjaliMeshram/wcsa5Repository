package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestCase {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://laptop-83dojttd/login.do");

		//read the data from excel file and test the login page
		Flib flib = new Flib();

		//to tread multiple data for loop
		int rc = flib.getLastRowCount("./data/ActiTimeTestData.xlsx", "invalidcreds");
		for(int i=1;i<=rc;i++)
		{
			String invalidUsername= flib.readExcelData("./data/ActiTimeTestData.xlsx", "invalidCreds",i, 0);
			String invalidPassword = flib.readExcelData("./data/ActiTimeTestData.xlsx", "invalidCreds",i, 1);

			driver.findElement(By.name("username")).sendKeys(invalidUsername);
			Thread.sleep(2000);
			driver.findElement(By.name("pwd")).sendKeys(invalidPassword);
			Thread.sleep(2000);
			driver.findElement(By.id("loginbutton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
		}
	}
}
