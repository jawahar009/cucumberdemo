package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class defination {
	WebDriver driver;
	@Given("^i should have valid URL and be present in the login page$")
	public void i_should_have_valid_URL_and_be_present_in_the_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JawaharMurali\\Desktop\\NJ\\LPB23\\Selenium Jar files\\Chrome webDriver\\chromedriver_win32 (2)\\chromedriver90.exe");
		//System.setProperty("webdriver.driver.chrome","C:\\Users\\JawaharMurali\\Desktop\\NJ\\LPB23\\Selenium Jar files\\Chrome webDriver\\chromedriver_win32 (2)\\chromedriver90.exe");
	// Creating instance of chrome driver
		driver= new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^Enter valid user name and password  and click submit$")
	public void enter_valid_user_name_and_password_and_click_submit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	   driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	   driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^Login should be successfull$")
	public void login_should_be_successfull() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000);
	   String actual =driver.findElement(By.id("welcome")).getText();
	   String expected = "Welcome Paul";
	   Assert.assertEquals(expected, actual);
	   driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]")).click();
	   System.out.println("I am logged out");
	  // driver.quit();
	   
	   
	}


}
