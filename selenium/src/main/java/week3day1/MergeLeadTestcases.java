package week3day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLeadTestcases {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver= new ChromeDriver();
		//Launch the browser
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		
		//Login Steps.
			
		driver.findElementById("username").sendKeys("DemosalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		//implicitly waited for 30 seconds
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Click crm/sfa link
			
		driver.findElementByLinkText("CRM/SFA").click();
		//Click Leads link
		driver.findElementByLinkText("Leads").click();
		//Click merge leads
		driver.findElementByLinkText("Merge Leads").click();
		// click icon

		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		String Parent_Window = driver.getWindowHandle(); 
		   
		
		// move in to new widow
		Set<String> newwin = driver.getWindowHandles();
		int count=newwin.size();
		List<String> win=new ArrayList<String>();
		win.addAll(newwin);
		//To select second window by using getindex method.
		String findlead=win.get(count-1);
		driver.switchTo().window(findlead);
		//Get URL name
		String url=driver.getCurrentUrl();
		System.out.println("URL1"+url);
		//Enter Lead ID
		
		Thread.sleep(5000);
		driver.findElementByXPath("//input[@type='text'and @name='id']").sendKeys("10136");
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		//Click First Resulting lead
		String fromlead=driver.findElementByXPath("((//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a[@class='linktext'])[1]").getText();

		driver.findElementByXPath("((//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a[@class='linktext'])[1]").click();
		
		 

		// switch back to parent window
		
		 driver.switchTo().window(Parent_Window);  

		
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();

		// move in to new widow
		Set<String> newwin1 = driver.getWindowHandles();
		int count1=newwin1.size();
		System.out.println("total windows:"+count1);
		List<String> win1=new ArrayList<String>();
		win1.addAll(newwin1);
		//To select second window by using getindex method.
		String findlead2=win1.get(count1-1);
		driver.switchTo().window(findlead2);
		Thread.sleep(3000);
		//String url2=driver.getCurrentUrl();
		//System.out.println("URL1"+url2);
		//Enter Lead ID
		driver.findElementByXPath("//input[@type='text'and @name='id']").sendKeys("10138");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		//Click First Resulting lead
		
		driver.findElementByXPath("((//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a[@class='linktext'])[1]").click();

		// switch back to parent window

		 driver.switchTo().window(Parent_Window);  

		
		driver.findElementByLinkText("Merge").click();
		driver.switchTo().alert().accept();
		driver.findElementByLinkText("Find Leads").click();
		
		driver.findElementByXPath("//input[@type='text' and @name='id']").sendKeys(fromlead);
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(3000);
		String actmsg = driver.findElementByXPath("//div[text()='No records to display']" ).getText();
		String expmsg = "No records to display";
		
		if(actmsg.contains(expmsg))
		{
			System.out.println("Error message matching Successfully "+actmsg);
		}
		
		
		driver.close();

	}

}
