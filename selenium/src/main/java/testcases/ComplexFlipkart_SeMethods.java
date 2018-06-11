package testcases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import wdMethods.SeMethods;

public class ComplexFlipkart_SeMethods extends SeMethods{

@Test
	public void flipkart() throws InterruptedException {

		startApp("Chrome", "https://www.flipkart.com/");
		driver.getKeyboard().sendKeys(Keys.ESCAPE);
		// move the house over TVs& appliances  and click samsung

		
		WebElement tv=locateElement("LinkText", "TVs & Appliances");
		mouseHover(tv);
		WebElement samsung = locateElement("LinkText","Samsung");
		mouseHoverandclick(samsung);
		Thread.sleep(5000);

		//select price filter and set min value & max value

		WebElement flit1 = locateElement("XPath","//select[@class='fPjUPw'][1]");
		selectDropDownUsingIndex(flit1, 3);
		Thread.sleep(3000);

		WebElement flit2 = locateElement("XPath","(//select[@class='fPjUPw'])[2]");
		selectDropDownUsingIndex(flit2, 3);
		Thread.sleep(3000);

		//Select searchbox and click 48-55 size

		WebElement search = locateElement("XPath", "//div[text()='Screen Size']");
		click(search);

		WebElement size = locateElement("XPath","//div[text()='48 - 55']");
		click(size);
		
		// select first listed product
		
		
		WebElement main = driver.findElement(By.xpath("(//div[@class='_1HmYoV _35HD7C col-10-12'])"));
		WebElement firstprice = locateElement("XPath","(//div[@class='_1vC4OE _2rQ-NK'])[1]");
		String price=getText(firstprice);
		System.out.println("Price for the first selected prd"+price);
		
		WebElement firstele = locateElement("XPath", "(//div[@class='bhgxx2 col-12-12'])[4]");
		click(firstele);
		
		//Switch to window
		
		switchToWindow(1);
		
		WebElement finprice = locateElement("XPath","//div[@class='_1vC4OE _3qQ9m1']");
		String finaprice=getText(finprice);
		
		System.out.println("price selected from child window:"+finaprice);
		
		//verifyExactText(firstprice, finaprice);
		if(price.equals(finaprice)) {
			System.out.println("Price value is matches");
		}
		else
			
			System.out.println("Price value is not same");
			

	closeBrowser();
		//switch to main window
		
		switchToWindow(0);
		// compare 2 product
		
		WebElement add1 = locateElement("XPath","(//span[text()='Add to Compare'])[1]");
		click(add1);
		WebElement add2 = locateElement("XPath","(//span[text()='Add to Compare'])[2]");
		click(add2);
		WebElement comp = locateElement("XPath","//span[text()='COMPARE']");
		click(comp);
		Thread.sleep(3000);
		// Compare the Title name as compare
		WebElement title =locateElement("XPath","//span[text()='Compare']");
		verifyExactText(title,"Compare");
		
		//Print the lowest price between the two items
		
		WebElement firstprd = locateElement("XPath","(//div[@class='_1vC4OE'])[1]");
		String firstprdprice=getText(firstprd);
		int n1=Integer.parseInt(firstprdprice.replace("\u20B9", "").replace(",", ""));
		System.out.println(n1);
		System.out.println("firstprdprice="+firstprdprice);

		
		WebElement secondprd = locateElement("XPath","(//div[@class='_1vC4OE'])[2]");
		String secondprdprice=getText(secondprd);
		int n2=Integer.parseInt(secondprdprice.replace("\u20B9", "").replace(",", ""));
		System.out.println(n2);
		System.out.println("Secondprdprice="+secondprdprice);
		
		if (n1>n2) {
			
			System.out.println("Lowest price is ="+secondprdprice);
			
		}
		else
			System.out.println("Lowest price is"+firstprdprice);
			
			
closeBrowser();		
}
}
