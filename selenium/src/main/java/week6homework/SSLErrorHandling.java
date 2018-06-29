package week6homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SSLErrorHandling {

	
	public static void main(String[] args) {
		
		//RemoteWebDriver driver;


		
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		
//		DesiredCapabilities  cap = DesiredCapabilities.chrome();
//		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//		 driver= new ChromeDriver();
//		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(op);
		driver.get("https://www.myntra.com/");
		
			


		
		
	
	}

}
