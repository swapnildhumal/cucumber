package defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepdefination {
	WebDriver driver;
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	@Given("i should be in the login page")
	public void i_should_be_in_the_login_page() throws InterruptedException {WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver(); 
	driver.manage().window().maximize();
	driver.get(url);
	Thread.sleep(5000);
		
	   
	}
	@When("enter the username {string}")
	public void enter_the_username(String string) {
		WebElement we=driver.findElement(By.xpath("//input[@name='username']"));
		we.sendKeys(string);
	   
	}
	@When("enter the password {string}")
	public void enter_the_password(String string) {
		WebElement we=driver.findElement(By.xpath("//input[@name='password']"));
		we.sendKeys(string);
	   
	}
	@When("click on the login button")
	public void click_on_the_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	    
	}
	@Then("i should see the username as {string}")
	public void i_should_see_the_username_as(String string) {
	driver.findElement(By.className("oxd-userdropdown-name"));
	System.out.println(string);
	   
	}
	
}
