package testcases;

import javax.lang.model.element.Element;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import wdMethods.SeMethods;

public class LeadTestCases extends SeMethods {

	@Test
	public void Login() throws InterruptedException {

		startApp("Chrome", "http://leaftaps.com/opentaps");
		WebElement uname = locateElement("id", "username");
		type(uname, "DemoSalesManager");
		WebElement pwd = locateElement("id", "password");
		type(pwd,"crmsfa");
		WebElement submit = locateElement("class", "decorativeSubmit");
		click(submit);


		// Create Lead
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

		Thread.sleep(3000);

		WebElement fl = locateElement("XPath", "//a[text()='Find Leads']");
		click(fl);

		WebElement lid = locateElement("XPath","//input[@type='text'and@name='id']");
		type(lid, "10034");


		WebElement flead = locateElement("XPath", "//button[text()='Find Leads']");
		click(flead);

		//Thread.sleep(3000);

		webDriverWait("(//a[@class='linktext'])[4]");

		WebElement frow = locateElement("XPath", "(//a[@class='linktext'])[4]");
		click(frow);

		//Verify Title//


		verifyTitle("View Lead | opentaps CRM");


		WebElement edit = locateElement("LinkText", "Edit");
		click(edit);

		//change the company Name

		WebElement updcname = locateElement("id", "updateLeadForm_companyName");
		type(updcname, "Edgeverve");

		WebElement cliupad = locateElement("class", "smallSubmit");
		click(cliupad);
		//verify company name
		WebElement newcname = locateElement("id", "viewLead_companyName_sp");
		getText(newcname);
		verifyPartialText(newcname, "Edgeverve");

		//Delete lead.

		WebElement fl2 = locateElement("XPath", "//a[text()='Find Leads']");
		click(fl2);

		WebElement phone = locateElement("LinkText", "Phone");
		click(phone);


		WebElement phno = locateElement("name", "phoneNumber");
		type(phno,"45645645");

		WebElement fl3 = locateElement("XPath", "//button[text()='Find Leads']");
		click(fl3);



		//Thread.sleep(3000);

		webDriverWait("(//a[@class='linktext'])[4]");

		//Capture lead ID of First Resulting lead.
		WebElement firstleadid= locateElement("XPath","(//a[@class='linktext'])[4]");
		String txt =getText(firstleadid);

		System.out.println("lead ID of First Resulting lead=" +txt );

		WebElement list = locateElement("XPath","(//a[@class='linktext'])[4]");
		click(list);


		WebElement delete = locateElement("LinkText","Delete");
		click(delete);


		WebElement fl4 = locateElement("XPath","//a[text()='Find Leads']");
		click(fl4);


		WebElement deldata = locateElement("XPath","//input[@name='id']");
		type(deldata, txt);

		WebElement fl5 = locateElement("XPath","//button[text()='Find Leads']");
		click(fl5);

		Thread.sleep(3000);

		WebElement actmsg =locateElement("XPath","//div[text()='No records to display']");
		getText(actmsg);
		verifyExactText(actmsg, "No records to displa");


		//Merge Lead//

		WebElement merlead = locateElement("LinkText", "Merge Leads");
		click(merlead);

		// click icon

		WebElement fllookup=locateElement("XPath","(//img[@alt='Lookup'])[1]");
		click(fllookup);
		//Move to new window
		Thread.sleep(3000);
		switchToWindow(1);


		WebElement fromlead1 =locateElement("XPath","(//input[@type='text'])[1]");
		type(fromlead1, "10075");

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
		type(tolead, "10077");

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

