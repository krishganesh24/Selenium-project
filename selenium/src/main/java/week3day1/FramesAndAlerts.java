package week3day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAndAlerts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver= new ChromeDriver();
		//Launch the browser
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("Ganesh");
		alt.accept();
		 //String txt = driver.findElementByXPath("//p[@id='demo']").getText();
		  String txt = driver.findElementById("demo").getText();
		 if(txt.contains("Ganesh")) {
			 System.out.println("Entered name is dispalyed");
		 }
		 
		 else
		 {
		 System.out.println("Entered name is not dispalyed");

		 }
		 
		
		
		
		
		//Alert myalert=driver.switchTo().alert();
		//myalert.
		
		
		


	}

}
