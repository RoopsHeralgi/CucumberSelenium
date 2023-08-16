package StepDefinitions;

//import javax.security.auth.spi.LoginModule;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import Pages.LoginPage;
//import io.cucumber.java.en.*;
//
//public class LoginDemo_POM 
//{
//	
//	
//	WebDriver driver = new ChromeDriver();
//	LoginPage login;
//	
//	@Given("chromebrowser is open")
//	public void chromebrowser_is_open()
//	{
//		
//	    System.out.println("Opens Chrome browser");
//	    System.setProperty("webdriver.chrome.driver", "C:/Users/33000046/eclipse-workspace1/CucumberJavaSelenium/src/test/resources/Drivers/chromedriver.exe");
//	     
//	    driver.manage().window().maximize();
//	    
//	}
//
//	@And("user is on demo login page")
//	public void user_is_on_demo_login_page() 
//	{
//		login = new LoginPage(driver);  
//		System.out.println("User is on Login page");
//		driver.navigate().to("https://example.testproject.io/web/");
//	    
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_user_name_and_password(String UserName, String Password) throws InterruptedException 
//	{
//	    System.out.println("User enters Username & pswd");
//	    
//	   login = new LoginPage(driver);
//	   
//	   login.enterUserName(UserName);
//	   login.enterPassword(Password);
//	   
//	   
////	    driver.findElement(By.id("name")).sendKeys(UserName);
////	    driver.findElement(By.id("password")).sendKeys(Password);
//	    Thread.sleep(2000);
//	    
//	}
//	@And("user clicks on login")
//	public void user_clicks_on_login() throws InterruptedException 
//	{
//		System.out.println("User clicks on Login");
//		login.clickLogin();
//		//driver.findElement(By.id("login")).click();
//		Thread.sleep(2000);
//		
//	}
//
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() throws InterruptedException
//	{
//	  System.out.println("User is on Home page");
//	  login.checkLogOutIsDisplayed();
//	  //driver.findElement(By.id("logout")).isDisplayed();
//	  Thread.sleep(2000);
//	  
//	  driver.close();
//	  driver.quit();
//	}
//	
//	
//	
//}
