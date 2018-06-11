package testNG;



import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import reports.ExcelUtil;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	
	
	@Test(dataProvider="fetch")
	public void createLead(String cname,String fname, String lname, String email, String phone) {	
		
		click(locateElement("linkText", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), cname);
		type(locateElement("id", "createLeadForm_firstName"), fname);
		type(locateElement("id", "createLeadForm_lastName"), lname);
		type(locateElement("id", "createLeadForm_primaryEmail"), email);
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), ""+phone);
		click(locateElement("name", "submitButton"));
				
	}




}















