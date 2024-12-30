package magento.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_page {
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button")
	WebElement arrow;
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")
	WebElement signout;
	

public Logout_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
	     this.driver=driver;
	     PageFactory.initElements(driver, this);
	}


public void signout_click() {
	arrow.click();
	signout.click();
}}
