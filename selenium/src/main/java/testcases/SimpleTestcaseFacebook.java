package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SimpleTestcaseFacebook {

	public static void main(String[] args) throws InterruptedException {
		// Launch the chrome browser

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(op);
		//Get URL//
		driver.get("https://www.facebook.com/");	
		//Maximize the window
		driver.manage().window().maximize();
		//Implicit wait for 30 Secs
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		
		//Enter the Email or Phone
		driver.findElementById("email").clear();
		driver.findElementById("email").sendKeys("9840068722");
		//Enter the password
		driver.findElementById("pass").clear();
		driver.findElementById("pass").sendKeys("thenu@83");
		//Click Login button 
		
		driver.findElementByXPath("//input[@value='Log In']").click();
		
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-testid='search_input']")));
				
		driver.findElementByXPath("//input[@data-testid='search_input']").sendKeys("Test leaf");
		driver.findElementByXPath("//button[@type='submit']").click();
		
		
		Thread.sleep(3000);
		WebElement  like= driver.findElementByXPath("(//button[@type='submit'])[2]");
		
		String value =like.getText();
		
		if (value.equals("Like")) {
			
			driver.findElementByXPath("(//button[@type='submit'])[2]").click();
			System.out.println("Like button is clicked");
						
		}
					
			driver.findElementByLinkText("TestLeaf").click();
		
		
			//WebDriverWait wait = new WebDriverWait(driver, 30);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/TestleafSolutionsIncChennai/reviews/?ref=page_internal']/span[1]")));
			
			Thread.sleep(5000);
		
			WebElement reviews = driver.findElementByXPath("//div[contains(text(),'reviews')]");
			String totalreview=reviews.getText();
			System.out.println("TOtal No of Reviews=" +totalreview);
			
		
			
		}
			
			
		}


