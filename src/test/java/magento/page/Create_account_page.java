package magento.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_account_page {
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[3]/a")
	WebElement createanaccount;
	@FindBy(name="firstname")
	WebElement fstname;
	@FindBy(name="lastname")
	WebElement lstname;
	@FindBy(name="email")
	WebElement Email;
	@FindBy(id="password")
	WebElement pwd;
	@FindBy(id="password-confirmation")
	WebElement confirmpwd;
	@FindBy(xpath="//*[@id=\"form-validate\"]/div/div[1]/button")
	WebElement createaccount;
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button")
	WebElement uparrow;
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")
	WebElement signout;
	
	public Create_account_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	public void click() {
		createanaccount.click();
	}
	
	public void passvalues(String fname,String lname,String mail,String pass,String pass1) {
		fstname.sendKeys(fname);
		lstname.sendKeys(lname);
		Email.sendKeys(mail);
		pwd.sendKeys(pass);
		confirmpwd.sendKeys(pass1);
	}
	public void button_click() {
        createaccount.click();
	}
	public void up_arrow() {
		uparrow.click();
		
	}
	public void signout() {
		signout.click();
	}}


