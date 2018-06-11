package teststeps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class LoginTest {


	public static RemoteWebDriver driver;
	@Given("invoke the application")
	public void invokeapp( ) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps");
	}

	@And("enter the username")
	public void enterUsername() {

		driver.findElementById("username").sendKeys("DemoSalesManager");

	}
	@And("enter the password")	
	public void enterpassword() {

		driver.findElementById("password").sendKeys("crmsfa");

	}			

	@And("click the login")
	public void clickLogin() {

		driver.findElementByClassName("decorativeSubmit").click();

	}

	@Then("verify login is success")
	public void logincheck() {
	
	String title=driver.getTitle();
	System.out.println(title);

	
	
}
}
