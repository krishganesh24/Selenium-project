package testcases;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class EditLead extends ProjectMethods{
	
	@Test
	public void Editlead() throws InterruptedException {

		login();

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
		
		logout();

}
}
