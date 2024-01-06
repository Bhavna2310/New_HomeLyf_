package testclass;

import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.annotations.Test;



import Com.POM.product_pom;
import Com.POM.signIn_page;
import Com.Utility.BaseClass;
import Com.Utility.ExcelDataProvider;

public class signIn_test  extends BaseClass{
	public ExcelDataProvider excel;
	private static final Logger logger = (Logger) LogManager.getLogger(registerTest.class);
	
	@Test(priority =0)
public void verifytest() throws InterruptedException, IOException {
		signIn_page sp=new signIn_page(driver);
		
		//sp.entermail("amit@gmail.com");
		excel=new ExcelDataProvider();
		excel.getdata();
		String email1=excel.getStringData("SignInData", 0, 1);
		sp.entermail(email1);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.hideKeyboard();
	//	sp.enterpass("Amit");	
		String pass=excel.getStringData("SignInData", 1, 1);
		sp.enterpass(pass);
		driver.hideKeyboard();
		sp.signinclick();
		Thread.sleep(3000);
		
		logger.info("Admin Uer Login successfully...");
		}
	
	
	
	@Test(priority =1)
	public void verifyproduct() throws InterruptedException {
		
		product_pom pro =new product_pom(driver);
		pro.plus_btn();
	//	pro.prod_img();
		
		pro.prod_name();
		pro.prod_descrptn();
		pro.prod_Price();
		pro.prod_quantity();
		driver.hideKeyboard();
		pro.prod_sell_tab();
		
	}
	
}
