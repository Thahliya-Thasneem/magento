package magento.test;
import org.testng.annotations.Test;

import magento.base.Magento_base;
import magento.page.Create_account_page;
import magneto.util.Excelutils;

public class Create_account_test extends Magento_base{
	@Test
	public void registration() throws InterruptedException {
		 Create_account_page p1=new  Create_account_page(driver);
		 p1.click();
		 String xl="D:\\Automation\\Selenium\\magneto_registration.xlsx";
			String Sheet="Sheet1";
			int rowCount=magneto.util.Excelutils.getRowCount(xl, Sheet);
			System.out.println(rowCount);
			
			
			for(int i=1;i<=rowCount;i++) {
				int CellCount=magneto.util.Excelutils.getCellCount(xl, Sheet, i);
				System.out.println("Cell Count:"+CellCount);
				
				//ensure j starts at 0 and loops util cellCount to prevent index out of bounds.
				for(int j=0;j<CellCount;j+=5) {  
					String fname=Excelutils.getCellValue(xl, Sheet, i, j);
					System.out.println("Firstname ="+fname);
					
					String lname=Excelutils.getCellValue(xl, Sheet, i, j+1);
					System.out.println("Lastname = "+lname);
					

					String email=Excelutils.getCellValue(xl, Sheet, i, j+2);
					System.out.println("Email="+email);
					
					
					String pwd=Excelutils.getCellValue(xl, Sheet, i, j+3);
					System.out.println("Password="+pwd);
					
					String confirmpwd=Excelutils.getCellValue(xl, Sheet, i, j+4);
					System.out.println("ConfirmPassword="+confirmpwd);
					
					
					p1.passvalues(fname, lname,  email, pwd, confirmpwd);
					
					
					p1.button_click();
					p1.signout();
					Thread.sleep(1000);
					driver.get("https://magento.softwaretestingboard.com/");
					p1.click();
					
					
	}

}}}
