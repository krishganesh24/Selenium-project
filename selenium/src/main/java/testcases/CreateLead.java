package testcases;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class CreateLead extends ProjectMethods {

		
	@Test
	public void createLead() throws InterruptedException {

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
		
		logout();
}
}

