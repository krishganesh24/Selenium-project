package week2day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcLink {

	public static void main(String[] args) {
				
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

			ChromeDriver driver = new ChromeDriver();
			

			// Open the chrome browser//

			driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
			//maximize the window//
			driver.manage().window().maximize();
			
			// to find no of links in iRCTC login page contain with 'a'
			
			List<WebElement> link = driver.findElementsByTagName("a");
			
			System.out.println(link.size());
			
			int count=0;
			
			for (WebElement alllinks :link)
			{
				if(alllinks.getText().contains("a"))
				{
					count++;
					
					System.out.println( alllinks.getText());
				}
				
				
			}
			
			System.out.println("Total No of links contain with a :"  +count);
			

			
			
	}

}
