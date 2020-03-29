package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import webPageObjects.GoogleHomePage;

public class TestNgDemo {

	WebDriver driver = null;
	
	@BeforeTest
	public void setupTest() {
		String projPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projPath+"/Webdrivers/Chromedriver/chromedriver.exe");
		
		driver = new ChromeDriver();
	}
	
	@Test
	public void doTest() {
		driver.get("https://www.google.com");
		GoogleHomePage ghp = new GoogleHomePage();
		ghp.searchbox(driver).sendKeys("testing");
		driver.findElement(By.xpath("//*[@id=\"viewport\"]")).click();
		ghp.clickButton(driver).click();
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println("Tearing down");
		driver.close();
		driver.quit();
	}
}
