package testclass;

import java.io.IOException;

import org.testng.annotations.Test;

import Com.Utility.BaseClass;
import Com.Utility.ExcelDataProvider;

import Com.POM.register_pom;
import Com.POM.signIn_page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.Assert;
public class registerTest extends Com.Utility.BaseClass {
	public ExcelDataProvider excel;
	private static final Logger logger = (Logger) LogManager.getLogger(registerTest.class);
	@Test(priority=0)
	public void validverifytest() throws InterruptedException, IOException {
		register_pom rgst=new register_pom(driver);
		rgst.btn();
		//rgst.verifyname("123avn");
		excel=new ExcelDataProvider();
		excel.getdata();
		
		String name1=excel.getStringData("SignUpData", 0, 1);
		rgst.verifyname(name1);
		
				
		driver.hideKeyboard();
	
		String email1=excel.getStringData("SignUpData", 1, 1);
		rgst.verifyemail(email1);
		
		driver.hideKeyboard();
	
		Thread.sleep(1000);
		
		//String pass=excel.getStringData("SignUpData", 0, 2);
		//rgst.verifypass(pass);
		
		driver.hideKeyboard();
		Thread.sleep(1000);
		rgst.verifyregister();

		//MobileElement errTxt=(MobileElement)driver.findElement(null)
		driver.navigate().back();

		logger.info("Initializing setup...");
		
		//String actucalErrtext=errTxt.
	}


	@Test(priority=1)
	public void invalidverifytest() throws InterruptedException {
		register_pom rgst=new register_pom(driver);
		rgst.btn();
		rgst.verifyname("123Bhavana");
		driver.hideKeyboard();
		rgst.verifyemail("akash11@gmail.com");
		driver.hideKeyboard();
		Thread.sleep(1000);
		rgst.verifypass("Bhavana@1234");
		driver.hideKeyboard();
		Thread.sleep(1000);
		rgst.verifyregister();
		logger.error("error");
		//info("Initializing setup...");
	}
}

