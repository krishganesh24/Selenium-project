
package week2homework;

import java.util.List;

import org.openqa.selenium.WebElement;

//import java.util.List;

//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownLastbutone {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Test Leaf\\selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/");
		
				driver.findElementByLinkText("Drop down").click();
		
				WebElement dropdown = driver.findElementById("dropdown1");
				Select value= new Select(dropdown);
				
		List<WebElement> options=value.getOptions();
		int lastopt = options.size();
		value.selectByIndex(lastopt-2);		
		
		
			
		
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();

		driver.findElementByLinkText("Checkbox").click();

		// TO Confirm if any  CHECKBOX is checked 
		driver.findElementByXPath("(//input[@type='checkbox'])[1]").click();
		
		boolean a= driver.findElementByXPath("(//input[@type='checkbox'])[1]").isSelected();
		if(a== true) {

			System.out.println("Java checkbox is selected");
		}

		else
		{
			System.out.println("Java checkbox is not selected");

		}



		//TO Confirm Selenium CHECKBOX is checked 

		boolean b=driver.findElementByXPath("(//input[@type='checkbox'])[6]").isSelected();

		if(b== true) {

			System.out.println("selenium checkbox is selected");
		}

		else
		{
			System.out.println("selenium checkbox is not selected");

		}
		



		
	}

}
