package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {
	
	WebDriver driver = new ChromeDriver();
	
	@Given("browser is open")
	public void browser_is_open() 
	{
		System.out.println("Inside Step-browser is open");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is:"+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
		
	//	driver = new ChromeDriver();
		
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(time, unit);
//		
		driver.manage().window().maximize();
		
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page()
	{
		System.out.println("Inside Step-user is on google search page");
		
		driver.navigate().to("https://google.com");
	}
	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() 
	{
	   System.out.println("Inside Step-user enters a text in search box");
	   
	   driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
	   
	  //Thread.sleep(2000);
	}

	@When("clicks enter")
	public void clicks_enter()
	{
	   System.out.println("Inside Step-clicks enter");
	   
	   driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	   //Thread.sleep(2000);
	}

	@Then("user is redirected to search results")
	public void user_is_redirected_to_search_results()
	{
	    System.out.println("Inside Step-user is redirected to search results");
	    
	    driver.getPageSource().contains("Online Courses");
	    
	    driver.close();
	    driver.quit();
	}


}
 