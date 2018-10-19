package step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_description {


	WebDriver driver;
	
	@Given("^When application is launched$")
	public void when_application_is_launched(){
		driver= new FirefoxDriver();
		driver.get("http://localhost:8585/do/login");
	}

	@When("^Valid credentials are entered$")
	public void valid_credentials_are_entered()  {
		driver.findElement(By.id("cyclosUsername")).sendKeys("admin");
		driver.findElement(By.id("cyclosUsername")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@id='cyclosLogin']/table/tbody/tr[3]/td/input")).click();
		
	}

	@Then("^Home Page Should be get displayed$")
	public void home_Page_Should_be_get_displayed()  {
		System.out.println(driver.getTitle());
	}


}
