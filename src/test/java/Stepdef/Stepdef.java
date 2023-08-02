package Stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdef {
	WebDriver driver;
	
	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
			driver.get("http://localhost:1080/webtours/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
		    

	@When("Enter the username {string}")
	public void enter_the_username(String string) throws InterruptedException {
		
		Thread.sleep(7000);
		//driver.findElement(By.name("username")).sendKeys(string);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(string);
	    //driver.findElement(By.xpath("//table/tbody/tr[4]/td[2]/input")).sendKeys(string);
	}

	@When("Enter the password {string}")
	public void enter_the_password(String string) {
		
		driver.findElement(By.name("password")).sendKeys(string);
	}

	@When("Click on login button")
	public void click_on_login_button() {
		
	    driver.findElement(By.name("login")).click();
	}

	@Then("I should see the homepage {string}")
	public void i_should_see_the_homepage(String string) {
		Assert.assertEquals(driver.getTitle(),string);
	}

}
