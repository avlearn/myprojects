package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabsDemo {

	public final static String USERNAME = "avlearn";
	public final static String ACCESS_KEY = "a80b80f4-add3-4f1d-b0b9-6bed88425794";
	public final static String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";

	public static void main(String[] args) throws Exception {
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 10");
		caps.setCapability("version", "latest");
		
		WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		
		driver.get("https://saucelabs.com/test/guinea-pig");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("i_am_a_textbox")).sendKeys("Thisis a test");
		
		driver.quit();
	}
}
