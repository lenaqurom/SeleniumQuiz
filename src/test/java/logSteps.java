import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class logSteps {
	ChromeDriver driver;
	@Given("user open the website and go to login page")
	public void user_open_the_website_and_go_to_login_page() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://classic.freecrm.com/index.html");
        Thread.sleep(2000);

	}

	@When("user fill email and password and click on login")
	public void user_fill_email_and_password_and_click_on_login() {
        driver.findElement(By.name("username")).sendKeys("danaaqel");
        driver.findElement(By.name("password")).sendKeys("danaaqe1");
        driver.findElement(By.className("btn")).click();
	}
	

	@Then("user should navigate to home page")
	public void user_should_navigate_to_home_page() {
	        
	     
		boolean b=	 driver.getTitle().equalsIgnoreCase("CRMPRO");
    	assertTrue(b);
	}
}
