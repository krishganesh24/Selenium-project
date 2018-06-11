package day1;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class PromptAlert extends SeMethods{
	
	
	@Test
	public void prompt() {
	
	startApp("Chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

	driver.switchTo().frame("iframeResult");
	
		WebElement li = locateElement("XPath","//button[text()='Try it']");
		click(li);
		
		promptAlertaccept("Ganesh");
		WebElement txt = locateElement("id","demo");
		getText(txt);
		verifyPartialText(txt, "Ganesh");
		

			 }
}
			 
			
					
			


