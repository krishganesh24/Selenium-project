package testcases;

import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class ProjectMethods extends SeMethods {
	
	public void login() {
		
		startApp("Chrome", "http://leaftaps.com/opentaps");
		WebElement uname = locateElement("id", "username");
		type(uname, "DemoSalesManager");
		WebElement pwd = locateElement("id", "password");
		type(pwd,"crmsfa");
		WebElement submit = locateElement("class", "decorativeSubmit");
		click(submit);

	}
	
	public void logout() {
		
		closeBrowser();
	}

}
