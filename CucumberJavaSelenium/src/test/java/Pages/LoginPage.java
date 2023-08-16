 package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	WebDriver driver;
	
	 By txt_username = By.id("name");
	 
	 By txt_password = By.className("form-control");
	 
	 By btn_login = By.id("login");
	 
	 By btn_logout = By.id("logout");
	 
	 public LoginPage(WebDriver driver) 
	 {
		 this.driver = driver;
		 
//		 if(!driver.getTitle().equals("TestProject Demo"))
//		 {
//			 throw new IllegalStateException("This is not Login Page. The Current page is"+driver.getCurrentUrl());
//		 }
	 }

	 
	 public void enterUserName(String UserName)
	 {
		 driver.findElement(txt_username).sendKeys(UserName);	 
	 }
	 
	 public void enterPassword(String Password)
	 {
		 driver.findElement(txt_password).sendKeys(Password);	 
	 }
	 
	 public void clickLogin()
	 {
		 driver.findElement(btn_login).click();	 
	 }
	 
	 public void checkLogOutIsDisplayed()
	 
	 {
		 driver.findElement(btn_logout).isDisplayed();
	 }

	 public void loginValidUser(String UserName, String Password)
	 {
		 driver.findElement(txt_username).sendKeys(UserName);
		 driver.findElement(txt_password).sendKeys(Password);
		 driver.findElement(btn_login).click();
		 driver.findElement(btn_logout).isDisplayed();
	 }

	 
}
