package testcases;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class LogInAndLogOut extends SeMethods{
		
	@Test
	public void login() {
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
	
	
	closeBrowser();
	
	
	
	
	
	}
	
	

}
