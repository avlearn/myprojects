package webPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

	WebDriver driver = null;
	
	By searchbox = By.name("q");
	By gpage = By.xpath("//*[@id=\"viewport\"]");
	By button = By.name("btnK");
	
	public SearchPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void setText(String text) {
		driver.findElement(searchbox).sendKeys(text);
	}
	
	public void pressbutton() {
		System.out.println("pressing buttons");
		driver.findElement(gpage).click();
		driver.findElement(button).click();
	}
	
}
