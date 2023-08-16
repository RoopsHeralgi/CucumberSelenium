package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF 
{
	@FindBy(id= "logout")
	WebElement btn_logout;
	
	WebDriver driver;
	public HomePage_PF(WebDriver driver1)
	{
		this.driver = driver1;
		PageFactory.initElements(driver1, LoginPage_PF.class );
	}
	
	public void checkLogoutIsDisplayed() throws InterruptedException
	{
	  System.out.println("User is on Home page");
	  btn_logout.isDisplayed();
	  
	  //driver.findElement(By.id("logout")).isDisplayed();
	  Thread.sleep(2000);
	}
}
