package week3day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcWindow {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		// Open the chrome browser//

		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		//maximize the window//
		driver.manage().window().maximize();

		//click contact us link

		driver.findElementByLinkText("Contact Us").click();

		//to print how many windows active.

		Set<String> listwin = driver.getWindowHandles();
		//to find out count of window
		int count=listwin.size();
		System.out.println("Total No of windows="+count);
		// convert set string in to list string
		List<String> listwindow = new ArrayList<String>();
		listwindow.addAll(listwin);
		//To select second window by using getindex method.
		String contactus=listwindow.get(1);
		//to move contact us URL
		driver.switchTo().window(contactus);
		//to print Second window UR
		String URL = driver.getCurrentUrl();
		System.out.println("Second URL name="+URL);
		//to close all browser
		//driver.close();
		driver.quit();























	}

}
