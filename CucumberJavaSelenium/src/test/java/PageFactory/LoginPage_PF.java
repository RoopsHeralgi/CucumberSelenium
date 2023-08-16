package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF 
{

	@FindBy(id= "name") 
	WebElement txt_username;
	
	@FindBy(id= "password")
	WebElement txt_password;
	 
	@FindBy(id= "login")
	WebElement btn_login;

	@FindBy(id= "logout")
	WebElement btn_logout;
	
	WebDriver driver; 
	public LoginPage_PF(WebDriver driver1)
	{
		this.driver = driver1;
		PageFactory.initElements(driver1,this );
	}
	
	public void enterUsername(String Username)
	{
		txt_username.sendKeys(Username);
	}
	
	public void enterpassword(String Password)
	{
		txt_password.sendKeys(Password);
	}
	
	public void clickOnLogin()
	{
		btn_login.click();
	}
	public void checkLogoutIsDisplayed()
	{
		btn_logout.isDisplayed();
	}
}
