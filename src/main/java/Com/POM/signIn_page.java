package Com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Com.Utility.LibraryActionsClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class signIn_page  {
AndroidDriver driver;



LibraryActionsClass action =new LibraryActionsClass(driver);

	public signIn_page(AndroidDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements((driver), this);
	}
	
	@AndroidFindBy(xpath="(//android.widget.EditText)[1]")
	private WebElement email;
	
	@AndroidFindBy(xpath=("(//android.widget.EditText)[2]"))
	private WebElement password;

	
	@AndroidFindBy(xpath=("//android.widget.Button[@content-desc=\"Sign In\"]"))
	private WebElement signin;
	
	public WebElement entermail(String email1) {
		action.explicitWait(driver, email, 10);
		email.click();
		email.sendKeys(email1);
		return email;
	}
	public void enterpass(String pass) {
		password.click();
		password.sendKeys(pass);
	
	}
	
	public WebElement signinclick() {
		signin.click();
		return signin;

	}
}


