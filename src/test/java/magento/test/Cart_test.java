package magento.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import magento.base.Magento_base;
import magento.page.Cart_page;
import magento.page.Login_page;
import magento.page.Women_page;

public class Cart_test extends Magento_base{
	@Test
	public void verifyLoginWithValidCred() throws InterruptedException {
		Login_page p1=new Login_page(driver);
		Women_page wp=new Women_page(driver);
		Cart_page cr=new Cart_page(driver);
		
		p1.signin_click();
		
				//pass the username and password to the method
				p1.passvalues("thahliyathasneem5@gmail.com", "Thahliya@22");
				
				//click the login button to submit the data
				p1.button_click();
				
				wp.menu_click();
				wp.product();
				wp.addtocart();
				cr.cart_click();
				//cr.passvalues("Thahliya", "Thasneem", "luminar","maliyekkal" , "calicut", "california","876590", "india","87690546");
				cr.radio_click();
				Thread.sleep(2000);
				cr.placeorder_click();
				

	}


}
