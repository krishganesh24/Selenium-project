package week3homework;

import javax.swing.Action;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import wdMethods.SeMethods;

public class DragandDrop extends SeMethods{

		
		
/*	@Test
	public void Dragdrop() {
		
		startApp("Chrome", "http://jqueryui.com/draggable/");
		WebElement drag = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(drag);
		
		WebElement drag1 = driver.findElementById("draggable");
		
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(drag1, 350, 250).perform();*/
	
	
	
		
	@Test 	
public void frame() {
	
		
	
	startApp("firefox", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	
	WebElement frame = locateElement("iframeResult");
	switchToFrame(frame);
		
	WebElement frame1 = locateElement("XPath", "//button[text()='Try it']");
	click(frame1);
	
	//promptAlertaccept("ganesh");
	
	//driver.switchTo().frame("iframeResult");
	//driver.findElementByXPath("//button[text()='Try it']").click();
	//Alert alt = driver.switchTo().alert();
	//alt.sendKeys("Ganesh");
	//alt.accept();
	 //String txt = driver.findElementByXPath("//p[@id='demo']").getText();
	  String txt = driver.findElementById("demo").getText();
	 if(txt.contains("Ganesh")) {
		 System.out.println("Entered name is dispalyed");
	 }
	 
	 else
	 {
	 System.out.println("Entered name is not dispalyed");

	 }
	
}
}


	


