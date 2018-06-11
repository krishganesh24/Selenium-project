package week2homework;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");



		ChromeDriver driver= new ChromeDriver();

		//Get URL//

		driver.get("https://www.facebook.com/");	

		//Give user name & password

		driver.manage().window().maximize();


		// to idendify total no of links in login page

		List<WebElement> link = driver.findElementsByTagName("a");
		System.out.println(link.size());
		
		link.get(2).click();
		
		for (WebElement eachLink : link) {
			System.out.println(eachLink.getText());
		}


	
}
		
	}

	
