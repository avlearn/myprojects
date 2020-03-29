package webPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage {

	static WebElement element = null;
	public WebElement searchbox(WebDriver driver) {
		element = driver.findElement(By.name("q"));
		return element;
	}
	
	public  WebElement clickButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/div[2]/center/input[1]"));
		return element;	
	}
}
