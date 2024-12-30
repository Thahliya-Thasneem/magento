package magento.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
	WebElement signin1;
	@FindBy(id="email")
	WebElement Email;
	@FindBy(id="pass")
	WebElement password;
	@FindBy(xpath="//*[@id=\"send2\"]/span")
	WebElement signin;
	
	public Login_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void signin_click() {
		signin1.click();
	}
	public void passvalues(String email,String pass) {
		Email.sendKeys(email);
		password.sendKeys(pass);
		
	}
	public void button_click() {
		signin.click();
	}}
