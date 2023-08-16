package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginSteps 
{
	public WebDriver driver;
	public LoginPage LgPg;
	
	@Given("User Launch the browser")
	public void user_launch_the_browser() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    LgPg = new LoginPage(driver);
	}

	@When("User open url {string}")
	public void user_open_url(String url) throws InterruptedException {
	    Thread.sleep(2000);
	    driver.get(url);
	    }
	
	@When("^user enters (.*) and (.*)$")
	public void user_enters_user_name_and_password(String UserName, String Password) throws InterruptedException 
	{
		Thread.sleep(2000);
		System.out.println("Inside Step -User enters Username and Password");
		LgPg.enterUserName(UserName);
		LgPg.enterPassword(Password);
	}

	@And("user clicks on Login button")
	public void user_clicks_on_login_button() throws InterruptedException 
	{
		Thread.sleep(2000);
		System.out.println("Inside Step- Clicks on login button");
		LgPg.clickLogin();
	}

	@Then("user navigate to home page")
	public void user_navigate_to_home_page() throws InterruptedException 
	{
		Thread.sleep(2000);
		System.out.println("Inside Step- User is navigated to the home page");
		LgPg.checkLogOutIsDisplayed();
	}


}
