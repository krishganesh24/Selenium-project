package week2homework;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcCountryText {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		// Open the chrome browser//

		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		//maximize the window//
		driver.manage().window().maximize();

		WebElement cty = driver.findElementById("userRegistrationForm:countries");
		Select value = new Select(cty);
		List<WebElement> options =value.getOptions();

		int a = options.size();

		System.out.println("Total no of Countries="+a);

		for (WebElement list : options) 
		{

			System.out.println("List of country="+list.getText());
		}
	}

}
