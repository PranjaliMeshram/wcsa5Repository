package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidLoginTestCase  extends BaseTest
{
	public static void main(String[] args) throws IOException, InterruptedException {

		BaseTest bt = new BaseTest();
		bt.openBrowser();

		Flib flib = new Flib();

		int rc =flib.getLastRowCount(EXCEL_PATH, "invalidcreds");

		for(int i=1;i<=rc;i++)
		{
			driver.findElement(By.name("username")).sendKeys(flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0));
			Thread.sleep(2000);
			driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1));
			Thread.sleep(2000);
			driver.findElement(By.id("loginbutton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();

		}
	}
}
