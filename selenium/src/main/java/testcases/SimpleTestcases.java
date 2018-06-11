package testcases;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class SimpleTestcases extends SeMethods{

	@Test
	public void facebook() throws InterruptedException {



		startApp("Chrome", "https://www.facebook.com/");
		WebElement login=locateElement("id", "email");
		type(login, "9840068722");
		WebElement pass = locateElement("id","pass");
		type(pass,"thenu@83");
		WebElement submit = locateElement("XPath","//input[@value='Log In']");
		click(submit);
		webDriverWait("//input[@data-testid='search_input']");

		// Enter value in search textbox and Click search button
		WebElement search = locateElement("XPath","//input[@data-testid='search_input']");
		type(search, "Test leaf");

		WebElement sebut = locateElement("XPath","//button[@type='submit']");
		click(sebut);
			
		Thread.sleep(3000);
		
		WebElement  like=locateElement("XPath","(//button[@type='submit'])[2]");
		
		
		String value =like.getText();
		
		if (value.equals("Like")) {
			clickWithoutSnap(like);
			System.out.println("Like button is clicked");
						
		}
			WebElement  tl=locateElement("LinkText","TestLeaf");	
			clickWithoutSnap(tl);
		
		Thread.sleep(5000);
			//webDriverWait("//a[@href='/TestleafSolutionsIncChennai/reviews/?ref=page_internal']/span[1]");

			WebElement link= locateElement("XPath","//a[@href='/TestleafSolutionsIncChennai/reviews/?ref=page_internal']/span[1]");
			clickWithoutSnap(link);
						
			WebElement reviews =locateElement("XPath","//div[contains(text(),'reviews')]");
			String Totalreview=reviews.getText();
			System.out.println("Total No of Reviews=" +Totalreview);


			driver.close();

	}

}
