package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import webPageObjects.GoogleHomePage;
import webPageObjects.SearchPage;

public class TestCases {

	private static WebDriver driver = null;
	
	private static void wait(int timeOut) {
		try {
			Thread.sleep(timeOut);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	public static void main(String[] args) {
		String projPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projPath+"/Webdrivers/Chromedriver/chromedriver.exe");
		
		driver = new ChromeDriver();

		test_case_2();
		
		driver.close();
		driver.quit();
	}
	*/
	
	@BeforeTest
	public void setupTest() {
		String projPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projPath+"/Webdrivers/Chromedriver/chromedriver.exe");
		
		driver = new ChromeDriver();
	}
	
	
	public static void test_case_1() {
		driver.get("https://www.google.com");
		GoogleHomePage ghp = new GoogleHomePage();
		ghp.searchbox(driver).sendKeys("testing");
		driver.findElement(By.xpath("//*[@id=\"viewport\"]")).click();
		ghp.clickButton(driver).click();
	}
	
	@Test
	public static void test_case_2() {
		
		driver.get("https://www.google.com");
		SearchPage sp = new SearchPage(driver);
		
		
		sp.setText("test pom");
		sp.pressbutton();
		
		wait(2000);
		
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println("Tearing down");
		driver.close();
		driver.quit();
	}
}
