package week2homework;

import org.openqa.selenium.chrome.ChromeDriver;

public class LeadTestcases {

	public static void main(String[] args) throws InterruptedException {

		// intitalize Chrrome webdriver.
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver= new ChromeDriver();
		//Launch the browser
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();

		//Use case 1:Edit lead//

		//Login Steps.

		driver.findElementById("username").sendKeys("DemosalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		//Click crm/sfa link
		driver.findElementByLinkText("CRM/SFA").click();
		//Click Leads link
		driver.findElementByLinkText("Leads").click();
		//Click Find leads
		driver.findElementByLinkText("Find Leads").click();
		//Enter first name
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Nagaraj");
		//Click Find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		//Click on first resulting lead
		Thread.sleep(3000);
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		//verify title page
		String pgtitle=driver.getTitle();
		//System.out.println(pgtitle);
		String exppgtit= ("View Lead | opentaps CRM");
		if (pgtitle.equals(exppgtit))
		{

			System.out.println("Page title is verified");
		}

		else
		{
			System.out.println("Page title verification is failed");

		}

		//click Edit button
		driver.findElementByLinkText("Edit").click();
		//String comname=driver.findElementById("updateLeadForm_companyName").getText();
		//System.out.println(comname);
		//change the company Name
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("IBM");
		String newcom=driver.findElementById("updateLeadForm_companyName").getText();
		//update company name
		driver.findElementByClassName("smallSubmit").click();
		//Confirm the changed name appears
		String updcom=driver.findElementById("viewLead_companyName_sp").getText();
		//System.out.println(updcom);
		if (updcom.contains(newcom)) {

			System.out.println(" company name is Updated successfullly");

		}

		else
		{
			System.out.println(" Company name is not Updated");
		}


		// Use Case 2: Delete Lead


		//Click Find leads
		driver.findElementByLinkText("Find Leads").click();
		//click on phone.
		driver.findElementByLinkText("Phone").click();
		//Enter phone number.
		driver.findElementByName("phoneNumber").sendKeys("9876543210");
		//Click find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		//Capture lead ID of First Resulting lead
		String leadid= driver.findElementByXPath("(//a[@class='linktext'])[4]").getText();
		System.out.println("lead ID of First Resulting lead=" +leadid );
		//Click First Resulting lead
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		// Delete
		driver.findElementByLinkText("Delete").click();
		//Click Find leads and enter captured lead id
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(leadid);
		//Click find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		//Verify error msg (No records to display)
		Thread.sleep(3000);
		String actmsg= driver.findElementByXPath("//div[text()='No records to display']").getText();
		System.out.println(actmsg);

		String expmsg=("No records to display");
		if(actmsg.equals(expmsg)) {

			System.out.println("No records to display message is displayed and Test case is pass");	

		}

		else {
			System.out.println("Test case is pass is failed");
		}


		// use case 3: Duplicate Lead

		//Click Find leads
		driver.findElementByLinkText("Find Leads").click();
		//click on Email.
		driver.findElementByLinkText("Email").click();
		//Enter Email and 	Click find leads button
		driver.findElementByName("emailAddress").sendKeys("gopinath@testleaf.com");
		driver.findElementByXPath("(//button[@type='button'])[7]").click();
		Thread.sleep(3000);

		//Capture name of First Resulting lead
		String firstleadname = driver.findElementByXPath("(//a[@class='linktext'])[6]").getText();
		System.out.println(firstleadname);
		
		//Click First Resulting lead
		
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		
		//Click Duplicate Lead

		driver.findElementByLinkText("Duplicate Lead").click();
		//Verify the title as 'Duplicate Lead'
		
		String acttitle=driver.getTitle();
		System.out.println(acttitle);
		String exptitle=("Duplicate Lead | opentaps CRM");
		if (acttitle.equals(exptitle)) {
			
			System.out.println("page title is verified");
		}
		
		else {
			
			System.out.println("page Title verification failed");
		}
		
		// click create lead button
		driver.findElementByClassName("smallSubmit").click();
		String duplead=driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println(duplead);
		if(duplead.equals(firstleadname)) {
			System.out.println("duplicated lead name is same as captured name");
		}
		
		else
		{
			System.out.println("Test case failed");
		}
			
		
		driver.close();
		
	}

}
