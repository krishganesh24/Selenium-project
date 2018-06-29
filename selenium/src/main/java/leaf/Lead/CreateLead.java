package leaf.Lead;





import org.junit.Test;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{

	@Test(/*invocationCount=2*/)
	public void createLead() {	
		//login();
		click(locateElement("linkText", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), "TestLeaf");
		type(locateElement("id", "createLeadForm_firstName"), "Gopinath");
		type(locateElement("id", "createLeadForm_lastName"), "Jayakumar");
		type(locateElement("id", "createLeadForm_primaryEmail"), "gopinath@testleaf.com");
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), "9597704568");
		click(locateElement("name", "submitButton"));
		logout();
		
		
		
		
	}
}












