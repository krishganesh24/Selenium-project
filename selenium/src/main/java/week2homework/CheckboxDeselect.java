// JAVA program to uncheck the checked Check box in http://www.leafground.com/pages/checkbox.html

package week2homework;

import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxDeselect {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","F:\\Test Leaf\\selenium\\drivers\\chromedriver.exe");

		ChromeDriver driver= new ChromeDriver();

		// Load URL
		driver.get("http://www.leafground.com/");

		//maximize the window
		driver.manage().window().maximize();
		// Click Check box link.
		driver.findElementByLinkText("Checkbox").click();

		// uncheck the checked Check box

		boolean a =driver.findElementByXPath("(//input[@type='checkbox'])[6]").isSelected();
		
		

		if (a== true) {

			driver.findElementByXPath("(//input[@type='checkbox'])[6]").click();

		}


		else
		{

			System.out.println(" checkbox is not selected");;


		}

		boolean b =driver.findElementByXPath("(//input[@type='checkbox'])[7]").isSelected();

		if (b== false) {

			System.out.println(" checkbox is not selected");;


		}

		
		boolean c =driver.findElementByXPath("(//input[@type='checkbox'])[8]").isSelected();
		if (c== true) {

			driver.findElementByXPath("(//input[@type='checkbox'])[8]").click();

		}


		else
		{

			System.out.println(" checkbox is not selected");;


		}
		
		
		
		
	}

}


