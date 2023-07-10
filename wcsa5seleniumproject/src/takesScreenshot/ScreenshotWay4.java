package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenshotWay4 {
	
	//upcast into RemoteWebDriver class
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		RemoteWebDriver cdriver = new ChromeDriver();
		cdriver.manage().window().maximize();
		cdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		cdriver.get("https://www.netflix.com");

		File src = cdriver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/screenshot4.png");
		Files.copy(src, dest);

	}
}
