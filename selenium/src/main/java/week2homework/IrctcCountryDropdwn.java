package week2homework;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcCountryDropdwn {


	public static void main(String[] args) {

		int i =0;
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		// Open the chrome browser//

		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		//maximize the window//
		driver.manage().window().maximize();

		WebElement cty = driver.findElementById("userRegistrationForm:countries");
		Select value = new Select(cty);

		List<WebElement> options =value.getOptions();
		int a= options.size();
		value.selectByIndex(a-2);
//
		
		
		System.out.println(options.size());
		
		for(WebElement eachoptions:options){

			if(eachoptions.getText().startsWith("E")) {

				i++;
				if (i==2) {
					System.out.println(eachoptions.getText());
					//eachoptions.click();

					break;
				}


			}

		}



	}










}










