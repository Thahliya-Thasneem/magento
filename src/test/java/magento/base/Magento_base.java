package magento.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Magento_base {
	public static WebDriver driver;
	public String url="https://magento.softwaretestingboard.com/";
	@BeforeTest
	public void browser_setup() {
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

}
