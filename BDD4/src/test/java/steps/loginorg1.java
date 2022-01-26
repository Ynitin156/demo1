package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginorg1 
{
	WebDriver driver;
	
	@Given("Open chrome browser and url of the application")
	public void open_chrome_browser_and_url_of_the_application() 
	{
		
		  System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		  driver.manage().window().maximize();	
	   	
	      System.out.println("Given Start");
	}

	@When("Enter valid email id and valid password ang click login button")
	public void enter_valid_email_id_and_valid_password_ang_click_login_button() 
	{
		  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		  driver.findElement(By.id("btnLogin")).click();
		  
		  System.out.println("When Done");
	}

	@Then("Successfully open page")
	public void successfully_open_page() 
	{
		System.out.println("Then Done");
	}




}
