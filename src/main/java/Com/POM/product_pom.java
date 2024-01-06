package Com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class product_pom {

	
	AndroidDriver driver;
	public product_pom(AndroidDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath=("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"))
			private WebElement product;
	
	@AndroidFindBy(xpath=("//android.view.View[@content-desc=\"Select Product Images\"]"))
	   WebElement slct_pro_Image;
	@AndroidFindBy(xpath=("//android.widget.Button[@resource-id=\"com.android.packageinstaller:id/permission_allow_button\"]"))
	   WebElement allow;
	@AndroidFindBy(xpath=("(//android.widget.EditText)[1]"))
	   WebElement pro_name;
	@AndroidFindBy(xpath=("(//android.widget.EditText)[2]"))
	   WebElement description;
	@AndroidFindBy(xpath=("(//android.widget.EditText)[3]"))
	   WebElement Price;
	@AndroidFindBy(xpath=("(//android.widget.EditText)[4]"))
	   WebElement quantity;
	@AndroidFindBy(xpath=("//android.view.View[@content-desc=\"Dismiss\"]"))
	   WebElement pro_drop_down;
	@AndroidFindBy(xpath=("//android.widget.Button[@content-desc=\"Sell\"]"))
	   WebElement sell_tab;
	   
	   
	
//	//click on "+" sign and wait for the element to b clockable
//	WebElement plusSign=waitForElementToBeClickable(driver, By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"),10);
//	plusSign.click();
//	
//	
	
	
	
//	public WebElement clickpro() throws InterruptedException {
//		 Thread.sleep(3000);
//		product.click();
//		
//		return product;
//	}
	 public void plus_btn()
	   {
		 product.click();
	   }
	   
	 
	 
	 
	   public WebElement  prod_img()
	   {
		   slct_pro_Image.click();
		  allow.click();
		  slct_pro_Image.click();
		   slct_pro_Image.sendKeys("D://Automation_Framework Homelyf//HomeLyf_serivce_New//ExcelTestData//2423.PNG");
		
		return slct_pro_Image;
		
		
	   }
	   
	   public void prod_name()
	   {
		   pro_name.click();
		   pro_name.sendKeys("Cameraman");
	   }
	   
	   public void prod_descrptn()
	   {
		   description.click();
		   description.sendKeys("Birthday PhotoShoot");
	   }
	   
	   public void prod_Price()
	   {
		   Price.click();
		   Price.sendKeys("2500");
	   }
	   
	   public void prod_quantity()
	   {
		   quantity.click();
		   quantity.sendKeys("100");
	   }
	   
	   public void prod_drop_down()
	   {
		   //pro_drop_down.click();
		   Select s=new Select(pro_drop_down);
		   s.selectByIndex(0);
	   }
	   
	   public void prod_sell_tab()
	   {
		   sell_tab.click();
	   }
	   
	   
	}




	

