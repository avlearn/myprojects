import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String[] args) {
		
		String projPath = System.getProperty("user.dir");
		System.out.println(projPath);
		System.setProperty("webdriver.chrome.driver", projPath + "/Webdrivers/Chromedriver/chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		
		driver.quit();
	}
}



