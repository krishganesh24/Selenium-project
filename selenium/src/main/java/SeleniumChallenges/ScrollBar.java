package SeleniumChallenges;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollBar {
			
			public static final String USERNAME = "TunaTestDemo";
			public static final String ACCESS_KEY = "c35b5eee-95d7-4a73-8be2-d05b77456594";
			public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
			@Test
			public  void main() throws MalformedURLException {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.naukri.com/");
				System.out.println(driver.getTitle());
				WebElement browser = driver.findElementByXPath("//a[contains(text(),'Browse Jobs')]");
				System.out.println(browser.isDisplayed());
				int y = browser.getLocation().getY();
				driver.executeScript("scroll(0,"+y+");");
			}

		} 



		
		
		
	
	