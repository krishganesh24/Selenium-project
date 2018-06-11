package testcases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.sequence.EditScript;
import org.jsoup.nodes.Entities.EscapeMode;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

import freemarker.core.StringArraySequence;
import week1day1homeowork.EscapeCharacters;

public class ComplexFlipkart {

	public static void main(String[] args) throws InterruptedException {

		
		// Launch the chrome browser

				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				ChromeOptions op = new ChromeOptions();
				op.addArguments("--disable-notifications");
				ChromeDriver driver= new ChromeDriver(op);
				//Get URL//
				driver.get("https://www.flipkart.com/");	
				//Maximize the window
				driver.manage().window().maximize();
				//Implicit wait for 30 Secs
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				driver.getKeyboard().sendKeys(Keys.ESCAPE);
						
				
				Actions builder = new Actions(driver);
				WebElement tv = driver.findElementByLinkText("TVs & Appliances");
				builder.moveToElement(tv).perform();
				WebElement samsung = driver.findElementByLinkText("Samsung");
				builder.moveToElement(samsung).click().perform();
				
				Thread.sleep(5000);
				//select price filter min & max value
				
				WebElement flit1 = driver.findElementByXPath("//select[@class='fPjUPw'][1]");
				Select minvalue = new Select(flit1);
				minvalue.selectByIndex(3);
				
				Thread.sleep(3000);
				WebElement flit2 = driver.findElementByXPath("(//select[@class='fPjUPw'])[2]");
				Select maxvalue= new Select(flit2);
				maxvalue.selectByIndex(3);
				
				Thread.sleep(3000);
				
				driver.findElementByXPath("//div[text()='Screen Size']").click();
				driver.findElementByXPath("//div[text()='48 - 55']").click();
				
				//to click first prd
				
				
				WebElement main = driver.findElement(By.xpath("(//div[@class='_1HmYoV _35HD7C col-10-12'])"));
				WebElement firstprice = driver.findElementByXPath("(//div[@class='_1vC4OE _2rQ-NK'])[1]");
				String price=firstprice.getText();
				System.out.println("Price for the first selected prd"+price);
				
				WebElement firstele = driver.findElementByXPath("(//div[@class='bhgxx2 col-12-12'])[4]");
				firstele.click();

				//Switch to window
				
				Set<String> windows = driver.getWindowHandles();
				List<String> allwin = new ArrayList<String>();
				allwin.addAll(windows);
				
				String chilwin = allwin.get(1);
				String parentwin = allwin.get(0);
				
				driver.switchTo().window(chilwin);
				
				
				WebElement finprice = driver.findElementByXPath("//div[@class='_1vC4OE _3qQ9m1']");
				String finaprice=finprice.getText();
				
				System.out.println("price selected from child window:"+finaprice);
				
				if(price.equals(finaprice)) {
					System.out.println("Price value is matches");
				}
				else
					
					System.out.println("Price value is not same");

				driver.close();
				//switch to main window
				
				driver.switchTo().window(parentwin);
				
				
				driver.findElementByXPath("(//span[text()='Add to Compare'])[1]").click();
				driver.findElementByXPath("(//span[text()='Add to Compare'])[2]").click();
				
				driver.findElementByXPath("//span[text()='COMPARE']").click();
				Thread.sleep(3000);
				WebElement title = driver.findElementByXPath("//span[text()='Compare']");
				String Titname=title.getText();
				
				
				if (Titname.equals("Compare")) {
					
					System.out.println("Section title is shown as " +Titname);
					
				}
				else
					System.out.println("Title name is invalid");
				
				//Print the lowest price between the two items

				
				WebElement firstprd = driver.findElementByXPath("(//div[@class='_1vC4OE'])[1]");
				String firstprdprice=firstprd.getText();
				int n1=Integer.parseInt(firstprdprice.replace("\u20B9", "").replace(",", ""));
				
				System.out.println(n1);

			System.out.println("firstprdprice="+firstprdprice);

				
				WebElement secondprd = driver.findElementByXPath("(//div[@class='_1vC4OE'])[2]");
				String secondprdprice=secondprd.getText();
				
				
				int n2=Integer.parseInt(secondprdprice.replace("\u20B9", "").replace(",", ""));
				System.out.println(n2);
				System.out.println("Secondprdprice="+secondprdprice);
				
				if (n1>n2) {
					
					System.out.println("Lowest price is"+secondprdprice);
					
				}
				else
					System.out.println("Lowest price is"+firstprdprice);
					
					
				driver.close();
				
				
				
				
				
	}

	
}
