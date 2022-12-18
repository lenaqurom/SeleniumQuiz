
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.cucumber.messages.types.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class msgSteps {
	ChromeDriver driver;

	@Given("open the website and go to login page")
	public void open_the_website_and_go_to_login_page() {
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
       // driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);

        driver.manage().window().maximize();
        //driver.get("https://classic.freecrm.com/index.html");
        driver.navigate().to("https://classic.freecrm.com/index.html");

        //Thread.sleep(2000);	}
	}
	@When("fill username and password and click on login")
	public void fill_username_and_password_and_click_on_login() {
		driver.findElement(By.name("username")).sendKeys("danaaqel");
        driver.findElement(By.name("password")).sendKeys("danaaqe1");
        driver.findElement(By.className("btn")).click();	}

	@When("click messages and enter the message and subject then click post")
	public void click_messages_and_enter_the_message_and_subject_then_click_post() {
		//tagname[@attribute='value']
        driver.findElement(By.xpath("//a[@title='Messages']")).click();
        driver.findElement(By.xpath("//input[@value='New Message']")).click();
		driver.findElement(By.id("subject")).sendKeys("sally message");
		driver.findElement(By.id("msg")).sendKeys("hiii from sally");
        driver.findElement(By.xpath("//input[@value='Post']")).click();
	}

	@Then("The message added to the board.")
	public void the_message_added_to_the_board() {
	      //boolean a=  driver.findElement(By.xpath("//td[@class='datatitle']")).isDisplayed();
		//WebElement web = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/input[2]"));
		
		boolean s = driver.findElement(By.xpath("//*[@value='Reply']")).isDisplayed();


		
		//boolean a =  web.isDisplayed();

	     // assertEquals(driver.findElement(By.xpath("//td[@class='datatitle']")).isDisplayed(), true);	
			assertTrue(s);

	}

}
