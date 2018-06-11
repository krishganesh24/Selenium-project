package wdMethods;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import reports.ExcelUtil;
import wdMethods.SeMethods;

public class ProjectMethods extends SeMethods {

	@Parameters({"url","username","password"})
	@BeforeMethod
	public void login(String url,String username,String password) {

		startApp("chrome", url);
		WebElement uname = locateElement("id", "username");
		type(uname, username);
		WebElement pwd = locateElement("id", "password");
		type(pwd,password);
		WebElement submit = locateElement("class", "decorativeSubmit");
		click(submit);
		WebElement link = locateElement("linkText", "CRM/SFA");
		click(link);

	}

	@DataProvider(name="fetch")
	public Object[][] fetchdata() throws IOException {

		ExcelUtil ex = new ExcelUtil();
		return ex.readExcel();


	}


	@AfterMethod(groups="common")
	public void logout() {

		closeBrowser();
	}

}
