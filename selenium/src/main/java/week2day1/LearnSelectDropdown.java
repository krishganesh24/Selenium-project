package week2day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectDropdown {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver= new ChromeDriver();
		
 driver.manage().window().maximize();
 driver.get("http://leaftaps.com/opentaps/");
		  
		WebElement Source=driver.findElementById("createLeadForm_dataSourceId");
		
		Select ss = new Select(Source);
		ss.selectByIndex(5);
	}

}
