package magento.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women_page {
	WebDriver driver;
	@FindBy (xpath="//*[@id=\"ui-id-4\"]/span[2]")
	WebElement women;
	@FindBy (id="ui-id-9")
	WebElement top;
	@FindBy (xpath="//a[@href=\"https://magento.softwaretestingboard.com/women/tops-women/jackets-women.html\"]")
	WebElement jacket;
	@FindBy (xpath="//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/a/span/span/img")
	WebElement product;
	@FindBy (xpath="//*[@id=\"option-label-size-143-item-167\"]")
	WebElement small;
	@FindBy(xpath="//*[@id=\"option-label-color-93-item-49\"]")
	WebElement black;
	@FindBy (id="product-addtocart-button")
	WebElement add_to_cart;


	public Women_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public void menu_click() throws InterruptedException {
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(women).perform();
		act.moveToElement(top).perform(); 
		act.moveToElement(jacket).perform();
		Thread.sleep(2000);
		jacket.click();
	}
	public void product() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		product.click();
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,500)", "");
		small.click();
		black.click();
	}
	public void addtocart() {
		add_to_cart.click();
		
		
	}}


