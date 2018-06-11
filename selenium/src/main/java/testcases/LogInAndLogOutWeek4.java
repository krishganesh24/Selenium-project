package testcases;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class LogInAndLogOutWeek4 extends SeMethods{
		
	@Test
	public void login() throws InterruptedException {
		startApp("firefox", "http://leaftaps.com/opentaps");
		WebElement uName = locateElement("id", "username");
		type(uName, "DemoSalesManager");
		WebElement pwd = locateElement("id", "password");
		type(pwd, "crmsfa");
		WebElement loginButton = locateElement("class", "decorativeSubmit");
		click(loginButton);
		
		// click Crmfsa link
		
	WebElement link = locateElement("LinkText", "CRM/SFA");
	click(link);
		
	WebElement clead = locateElement("LinkText", "Create Lead");
	click(clead);
	
	WebElement cname = locateElement("id", "createLeadForm_companyName"); 
	type(cname, "infosys");
	WebElement fname = locateElement("id", "createLeadForm_firstName");
	type(fname, "Ganesh");
	WebElement lname = locateElement("id", "createLeadForm_lastName");
	type(lname, "krishnamoorthy");
	
	WebElement dropdwn = locateElement("id", "createLeadForm_dataSourceId");
	selectDropDownUsingText(dropdwn, "Cold Call");
	
	WebElement dropdwn1 = locateElement("id", "createLeadForm_industryEnumId");
	selectDropDownUsingIndex(dropdwn1, 2);
	
	
	WebElement crlead = locateElement("class", "smallSubmit");
	click(crlead);
	
	
	//Edit lead
	
	WebElement ed = locateElement("LinkText", "Edit");
	click(ed);
	
	WebElement ufname = locateElement("id", "updateLeadForm_firstName");
	type(ufname, "Ganesh");
	WebElement ulname = locateElement("id", "updateLeadForm_lastName");
	type(ulname, "krishnamoorthy");
	WebElement upd = locateElement("class", "smallSubmit");
	click(upd);
	
	//Merge Lead

	WebElement merlead = locateElement("LinkText", "Merge Leads");
	click(merlead);

	// click icon

	WebElement fllookup=locateElement("XPath","(//img[@alt='Lookup'])[1]");
	click(fllookup);
	//Move to new window
	Thread.sleep(3000);
	switchToWindow(1);


	WebElement fromlead1 =locateElement("XPath","(//input[@type='text'])[1]");
	type(fromlead1, "10018");

	WebElement fl6 =locateElement("XPath","(//button[@class='x-btn-text'])[1]");
	clickWithoutSnap(fl6); 

	//Thread.sleep(3000);

	webDriverWait("((//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a[@class='linktext'])[1]");

	WebElement Flvalue=locateElement("XPath","((//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a[@class='linktext'])[1]");
	String txt1=	getText(Flvalue);
	clickWithoutSnap(Flvalue);

	switchToWindow(0);

	WebElement tllookup=locateElement("XPath","(//img[@alt='Lookup'])[2]");
	click(tllookup);

	switchToWindow(1);

	WebElement tolead = locateElement("XPath","(//input[@type='text'])[1]");
	type(tolead, "10022");

	WebElement fl7 = locateElement("XPath","(//button[@class='x-btn-text'])[1]");
	clickWithoutSnap(fl7);

	Thread.sleep(3000);

	WebElement tlvalue=locateElement("XPath","((//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a[@class='linktext'])[1]");
	clickWithoutSnap(tlvalue);

	switchToWindow(0);

	WebElement merge = locateElement("LinkText","Merge");
	clickWithoutSnap(merge);
	acceptAlert();

	WebElement Fl8 = locateElement("LinkText","Find Leads");
	click(Fl8);

	WebElement fl9 = locateElement("XPath","//input[@type='text'and @name='id']");
	type(fl9, txt1);

	WebElement fl10 = locateElement("XPath","//button[text()='Find Leads']");
	click(fl10);

	Thread.sleep(3000);


	WebElement actmsg1 = locateElement("XPath","//div[@class='x-paging-info']");
	getText(actmsg1);
	verifyExactText(actmsg1,"No records to display");


	closeBrowser();	
	
	
	}
	
	

}
