package magento.test;

import org.testng.annotations.Test;

import magento.base.Magento_base;
import magento.page.Login_page;
import magneto.util.Excelutils;


public class Login_test extends Magento_base {
	
   @Test
	
	public void verifyLoginWithValidCred() throws InterruptedException {
		Login_page p1=new Login_page(driver);
		
		p1.signin_click();
		//reading the data from excel file by the specified path
		String xl="D:\\Automation\\Selenium\\Magneto_login.xlsx";
		String Sheet="Sheet1";
		int rowCount=Excelutils.getRowCount(xl, Sheet);
		System.out.println(rowCount);
		
		
		for(int i=1;i<=rowCount;i++) {
			int CellCount=Excelutils.getCellCount(xl, Sheet, i);
			System.out.println("Cell Count:"+CellCount);
			
			//ensure j starts at 0 and loops util cellCount to prevent index out of bounds.
			for(int j=0;j<CellCount;j+=3) {  //each row should have pairs of values(username,password)
				String username=Excelutils.getCellValue(xl, Sheet, i, j);
				System.out.println("UserName ="+username);
				
				String pwd=Excelutils.getCellValue(xl, Sheet, i, j+1);
				System.out.println("Password = "+pwd);
				
				//pass the username and password to the method
				p1.passvalues(username, pwd);
				
				//click the login button to submit the data
				p1.button_click();
				Thread.sleep(1000);
	String actualtitle=driver.getTitle();
	String expcttitle="luma";
	if(actualtitle.equals(expcttitle)) 
	{
		System.out.println("Title Logged in successfull");
	}
	else {
		System.out.println("Title Log in fail");
	}
	
	String actualurl=driver.getCurrentUrl();
	String expctdurl="https://magento.softwaretestingboard.com/customer/account/";
	if(actualurl.equals(expctdurl)) 
	{
		System.out.println("URL Logged in successfull");
		break;
	}
	else {
		System.out.println("URL Log in fail");
	}	
	
	driver.get(url);
	p1.signin_click();
}
}}}		
	


