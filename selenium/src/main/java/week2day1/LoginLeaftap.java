package week2day1;

import java.util.List;

//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginLeaftap {

	public static void main(String[] args) {

		//Initialize chrome driver//

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		//Launch the chrome browser//

		ChromeDriver driver= new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// given URl//

		driver.get("http://leaftaps.com/opentaps/");


		// give login & password and click the login button

		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();

		// Click the crmfsa link//

		driver.findElementByLinkText("CRM/SFA").click();

		// to create lead

		driver.findElementByLinkText("Create Lead").click();

		// enter the companay name

		driver.findElementById("createLeadForm_companyName").sendKeys("Infosys");
		// enter last name & first name
		driver.findElementById("createLeadForm_firstName").sendKeys("Ganesh");
		driver.findElementById("createLeadForm_lastName").sendKeys("krishnamoorthy");

		WebElement Source=driver.findElementById("createLeadForm_dataSourceId");

		Select ss = new Select(Source);

		ss.selectByVisibleText("Existing Customer");

		WebElement Source1=driver.findElementById("createLeadForm_marketingCampaignId");
		Select ss1 = new Select(Source1);

		ss1.selectByIndex(3);

		WebElement Source2= driver.findElementById("createLeadForm_industryEnumId");

		Select soc= new Select(Source2);
		
		List<WebElement> alloptions= soc.getOptions();
		
		
		
		
		
		for ( WebElement listofvalue : alloptions) 
		{
			
			System.out.println(listofvalue.getText());
			
		}
		
		
		// to find no of rows in calendar and click date 21	
		
		driver.findElementById("createLeadForm_birthDate-button").click();
		
		driver.findElementByXPath("//tr[@class='daysrow'][4]/td[2]").click();
		
			
		}

		//driver.findElementByClassName("smallSubmit").click();

		// to minimize the window//
		// Dimension d = new Dimension(333, 333);

		//driver.manage().window().setSize(d);

	}

