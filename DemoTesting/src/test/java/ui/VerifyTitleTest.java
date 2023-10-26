package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyTitleTest {

	@Test
	public void titleTest() {
		
		SoftAssert softassert = new SoftAssert();
		String expectedtitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String expectedtext = "Search";
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String actualtitle = driver.getTitle();
		System.out.println("verification title");
		softassert.assertEquals(actualtitle, expectedtitle, "Text verification failed");
		String actualtext = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("Value");
		System.out.println("Verifying text");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		System.out.println("Closing browser");
		driver.close();
		softassert.assertAll();
	}
}
