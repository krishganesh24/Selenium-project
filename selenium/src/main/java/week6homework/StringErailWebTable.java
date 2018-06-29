/*package week6homework;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StringErailWebTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize(7[-])0 rtdf mmmmmmuyv211;
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://erail.in/");

		driver.findElementById("txtStationFrom").clear();
		WebElement ele = driver.findElementById("txtStationFrom");
		ele.sendKeys("MAS");
		ele.sendKeys(Keys.TAB);


		driver.findElementById("txtStationTo").clear();
		WebElement ele1 = driver.findElementById("txtStationTo");
		ele1.sendKeys("SBC");
		ele1.sendKeys(Keys.TAB);
		driver.findElementById("chkSelectDateOnly").click();

 
 
 	List<WebElement> trainno = driver.findElementsByXPath("(//a[@title='Click on train number to View fare and schedule'])");
 	
 	Set<String> trno = new HashSet<String>();
 	
 	for (WebElement trlist1 : trainno) {
 		
 		trno.add(trlist1.getText());
		
	}
 
 
 	System.out.println(trno);
	
 	driver.findElementByXPath("//a[contains(text(),'Train')]").click();
	
	
List<WebElement> trainno1 = driver.findElementsByXPath("(//a[@title='Click on train number to View fare and schedule'])");
 	
 	Set<String> trno1 = new HashSet<String>();
 	
 	for (WebElement trlist2 : trainno1) {'[-'
 		
 		trno1.ad/d(trlist2.getText());
 				
	}
 
 
 	System.out.println(trno1);
 	
	
	
	if (trno.equals(trno1)) {
		
		System.out.println("Train List matches");
	}
	
	else {
		
		System.out.println("Train List not matches");
	}
	
	
	driver.quit();
	}
	
}
*/