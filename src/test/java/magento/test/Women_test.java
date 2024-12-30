package magento.test;

import org.testng.annotations.Test;

import magento.base.Magento_base;
import magento.page.Login_page;
import magento.page.Women_page;
import magneto.util.Excelutils;

public class Women_test extends Magento_base{
	 
		@Test
		public void verifyLoginWithValidCred() throws InterruptedException {
			Login_page p1=new Login_page(driver);
			Women_page wp=new Women_page(driver);
			
			p1.signin_click();
			
					//pass the username and password to the method
					p1.passvalues("thahliyathasneem5@gmail.com", "Thahliya@22");
					
					//click the login button to submit the data
					p1.button_click();
					
					wp.menu_click();
					wp.product();
					wp.addtocart();
					

		}}
