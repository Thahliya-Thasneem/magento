package magento.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_page {
		WebDriver driver;
		@FindBy(xpath="/html/body/div[2]/header/div[2]/div[1]/a")
		WebElement cart;
		@FindBy(xpath="//*[@id=\"top-cart-btn-checkout\"]")
		WebElement proceed_to_checkout;
		@FindBy(name="username")
		WebElement email;
		@FindBy(name="firstname")
		WebElement fname;
		@FindBy(name="lastname")
		WebElement lname;
		@FindBy(name="company")
		WebElement company;
		@FindBy(name="street[0]")
		WebElement address;
		@FindBy(name="city")
		WebElement city;
		@FindBy(name="region_id")
		WebElement state;
		@FindBy(name="postcode")
		WebElement postalcode;
		@FindBy(name="country_id")
		WebElement country;
		@FindBy(name="telephone")
		WebElement phone;
		@FindBy(name="ko_unique_1")
		WebElement shippingmethod;
		@FindBy(xpath="//*[@id=\"shipping-method-buttons-container\"]/div/button")
		WebElement next;
		@FindBy(xpath="//button[@title=\"Place Order\"]")
		WebElement placeorder;
		@FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div/div[2]/div/div/a")
		WebElement continueshopping;
		

public Cart_page(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void cart_click() throws InterruptedException {
	Thread.sleep(2000);
	cart.click();
	proceed_to_checkout.click();
}
public void passvalues(String firstname,String lastname,String cmpny,String adrs,String city1,String state1,String postcode,String country1,String phn) {
	fname.sendKeys(firstname);
	lname.sendKeys(lastname);
	company.sendKeys(cmpny);
	address.sendKeys(adrs);
	city.sendKeys(city1);
	state.sendKeys(state1);
	postalcode.sendKeys(postcode);
	country.sendKeys(country1);
	phone.sendKeys(phn);
}
public void radio_click() throws InterruptedException {
	Thread.sleep(2000);
	shippingmethod.click();
	Thread.sleep(2000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	next.click();
}
public void placeorder_click() throws InterruptedException {
	Thread.sleep(2000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)", "");
	placeorder.click();
	Thread.sleep(4000);
	continueshopping.click();
}
	
}
