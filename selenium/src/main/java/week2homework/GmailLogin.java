package week2homework;

import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException {





		//Initilaize Webdriver.

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");



		ChromeDriver driver= new ChromeDriver();

		//Get URL//

		driver.get("https://www.google.com/gmail/");	

		//Give user name & password

		driver.manage().window().maximize();

		driver.findElementByName("identifier").sendKeys("krish.ganesh24");

		Thread.sleep(3000);
		driver.findElementByXPath("//span[text()='Next']").click();
		Thread.sleep(3000);
		driver.findElementByName("password").sendKeys("yamaha@123");
		
		Thread.sleep(3000);
		driver.findElementByXPath("//span[text()='Next']").click();

		//driver.close();



	}

}
