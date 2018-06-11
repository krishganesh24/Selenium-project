package leaf.Contact;



import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class CreateContact extends ProjectMethods{

	@Test(invocationCount=1)
	public void createContact() {
		//login();
		click(locateElement("linkText", "Contacts"));
		click(locateElement("linkText", "Create Contact"));
		type(locateElement("id", "firstNameField"), "TestLeaf");
		type(locateElement("id", "lastNameField"), "Gopinath");
		click(locateElement("name", "submitButton"));
		logout();
	}

}
