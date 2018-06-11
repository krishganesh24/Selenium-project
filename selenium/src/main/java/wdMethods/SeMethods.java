package wdMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.NoSuchObjectException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.management.NotificationBroadcasterSupport;
import javax.management.RuntimeErrorException;
import javax.naming.directory.NoSuchAttributeException;
import javax.sound.midi.SysexMessage;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class SeMethods implements WdMethods{
	public RemoteWebDriver driver;
	public int i = 1;
	public String sUrl,primaryWindowHandle,sHubUrl,sHubPort;	

	public SeMethods() {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(new File("./src/main/resources/config.properties")));
			sHubUrl = prop.getProperty("HUB");
			sHubPort = prop.getProperty("PORT");
			sUrl = prop.getProperty("URL");
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
	}
	public void startApp(String browser, String url) {
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", 
						"./drivers/chromedriver.exe");
				ChromeOptions op = new ChromeOptions();
				op.addArguments("--disable-notifications");
				driver = new ChromeDriver(op);
			}else if(browser.equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.gecko.driver", 
						"./drivers/geckodriver_32bit.exe");
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("The Browser "+browser+" launched successfully");
		} catch (WebDriverException e) {

			System.err.println("The browser:" + browser + " could not be launched");
			//throw new RuntimeException();
		}


		finally {
			takeSnap();
		}
	}

	public void startApp(String browser) {
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if(browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "./drivers/internetexplorerserver.exe");
				driver = new InternetExplorerDriver();
			}
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(sUrl);
			driver.manage().window().maximize();	

			System.out.println("The browser:" + browser + " launched successfully");
		} catch (WebDriverException e) {			
			System.out.println("The browser:" + browser + " could not be launched");
		}
	}




	public WebElement locateElement(String locator, String locValue) {
		try {
			switch(locator) {
			case "id": return driver.findElementById(locValue);			
			case "class":return driver.findElementByClassName(locValue);
			case "name":return driver.findElementByName(locValue);
			case "linkText":return driver.findElementByLinkText(locValue);
			case "xpath":return driver.findElementByXPath(locValue);
			case "TagName": return driver.findElementByTagName(locValue);
			case "CssSelector":	return driver.findElementByCssSelector(locValue);
			case "PartialLinkText":	return driver.findElementByPartialLinkText(locValue);


			}
		} catch (NoSuchElementException e) {

			System.err.println("The element with locator "+locator+" and with value "+locValue+" not found.");
			throw new RuntimeException();
		} catch (WebDriverException e) {
			System.out.println("WebDriverException");
		}
		return null;
	}


	public List<WebElement> locateElements(String locator, String locValue) {

		try {
			switch(locator) {

			case "id":return driver.findElementsById(locValue);
			case "class":return driver.findElementsByClassName(locValue);
			case "XPath":return driver.findElementsByXPath(locValue);
			case "linkText":return driver.findElementsByLinkText(locValue);
			case "Name":return driver.findElementsByName(locValue);
			case "TagName":	return driver.findElementsByTagName(locValue);
			case "CssSelector":return driver.findElementsByCssSelector(locValue);
			case "PartialLinkText":	return driver.findElementsByPartialLinkText(locValue);
			}
		} catch (NoSuchElementException e) {

			System.err.println("The element with locator "+locator+" and with value "+locValue+" not found.");
			throw new RuntimeException();
		}catch (WebDriverException e) {
			System.out.println("WebDriverException");

		}
		return null;

	}



	public WebElement locateElement(String locValue) {		 
		return driver.findElementById(locValue);
	}

	public void type(WebElement ele, String data) {
		try {
			ele.clear();
			ele.sendKeys(data);
			System.out.println("The data "+data+" is entered successfully");

		} catch (InvalidElementStateException e) {
			System.err.println("The element " +data+ " could not entered");
		}catch (WebDriverException e) {
			System.err.println("WebDriverException"+e.getMessage());
		}


	}

	public void click(WebElement ele) {

		String text = "";
		try {
			text=ele.getText();
			ele.click();
			System.out.println("The Element "+text+" is clicked successfully");
		} catch (InvalidElementStateException e) {
			System.err.println("The element " +text+ " could not clicked");
		}catch (WebDriverException e) {
			System.err.println("WebDriverException"+e.getMessage());
		}

		finally {
			takeSnap();
		}

	}
	public void clickWithoutSnap(WebElement ele) { 

		String text = "";
		try {
			text=ele.getText();
			ele.click();
			System.out.println("The Element "+text+" is clicked successfully");
		} catch (InvalidElementStateException e) {
			System.err.println("The element " +text+ " could not clicked");
		}catch (WebDriverException e) {
			System.err.println("WebDriverException"+e.getMessage());
		}
	}
	public String getText(WebElement ele) {

		String bReturn = "";
		try {
			bReturn = ele.getText();
		} catch (WebDriverException e) {
			System.out.println("WebDriverException"+e.getMessage());
		}
		return bReturn;

	}


	public void selectDropDownUsingText(WebElement ele, String value) {		
		try {
			Select ss = new Select(ele);		
			ss.selectByVisibleText(value);		
			System.out.println("The "+value+" is selected from dropdwown");
		} catch (WebDriverException e) {

			System.err.println("WebDriverException"+e.getMessage());
		}
		finally {
			takeSnap();
		}
	}
	public void selectDropDownUsingIndex(WebElement ele, int index) {

		try {
			Select ss1= new Select(ele);
			ss1.selectByIndex(index);
			System.out.println("The "+index+" is selected from dropdwown");
		} catch (WebDriverException e) {
			System.err.println("WebDriverException"+e.getMessage());
		}

		finally {
			takeSnap();
		}

	}


	public boolean verifyTitle(String expectedTitle) {
		boolean bReturn=false;
		try {

			if(getTitle().equals(expectedTitle)) {
				System.out.println("The expected title "+expectedTitle+" matches the actual "+getTitle());
				bReturn= true;
			}else {
				System.out.println(getTitle()+" The expected title "+expectedTitle+" doesn't matches the actual "+getTitle());
			}
		} catch (WebDriverException e) {
			System.out.println("WebDriverException : "+e.getMessage());
		} 
		return bReturn;
	}
	public String getTitle() {
		String title = "";
		try {
			title =  driver.getTitle();
		} catch (WebDriverException e) {
			System.out.println("WebDriverException"+e.getMessage());
		} 
		return title;
	}


	public void verifyExactText(WebElement ele, String expectedText) {
		try {
			if(getText(ele).equals(expectedText)) {
				System.out.println("The expected text matches the actual "+expectedText);
			}else {
				System.out.println("The expected text doesn't matches the actual "+expectedText);
			}
		} catch (WebDriverException e) {
			System.out.println("WebDriverException : "+e.getMessage());
		} 

	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		try {
			if(getText(ele).contains(expectedText)) {
				System.out.println("The expected text contains the actual "+expectedText);
			}else {
				System.out.println("The expected text doesn't contain the actual "+expectedText);
			}
		} catch (WebDriverException e) {
			System.out.println("WebDriverException : "+e.getMessage());
		} 
	}		


	public void verifyExactAttribute(WebElement ele, String attribute, String value) {

		try {
			if(getAttribute(ele, attribute).equals(value)) {
				System.out.println("The expected attribute :"+attribute+" value matches the actual "+value);
			}else {
				System.out.println("The expected attribute :"+attribute+" value does not matches the actual "+value);
			}
		} catch (WebDriverException e) {
			System.out.println("WebDriverException : "+e.getMessage());
		} 
	}

	private String getAttribute(WebElement ele, String attribute) {
		String bReturn = "";
		try {
			bReturn=  ele.getAttribute(attribute);
		} catch (WebDriverException e) {
			System.out.println("WebDriverException"+e.getMessage());
		} 
		return bReturn;
	}
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		try {
			if(getAttribute(ele, attribute).contains(value)) {
				System.out.println("The expected attribute :"+attribute+" value contains the actual "+value);
			}else {
				System.out.println("The expected attribute :"+attribute+" value does not contains the actual "+value);
			}
		} catch (WebDriverException e) {
			System.out.println("WebDriverException : "+e.getMessage());
		}
	}

	public void verifySelected(WebElement ele) {

		try {
			if(ele.isSelected()) {
				System.out.println("The element "+ele+" is selected");
			} else {
				System.out.println("The element "+ele+" is not selected");
			}
		} catch (WebDriverException e) {
			System.out.println("WebDriverException : "+e.getMessage());
		}
	}




	public void verifyDisplayed(WebElement ele) {
		try {
			if(ele.isDisplayed()) {
				System.out.println("The element "+ele+" is visible");
			} else {
				System.out.println("The element "+ele+" is not visible");
			}
		} catch (WebDriverException e) {
			System.out.println("WebDriverException : "+e.getMessage());
		} 
	}


	public void switchToWindow(int index) {


		try {
			Set<String> allWindows=driver.getWindowHandles();
			List<String> lstWindows=new ArrayList<String>();
			lstWindows.addAll(allWindows);
			driver.switchTo().window(lstWindows.get(index));
			if (index==0) {
				System.out.println("Moved to Parent window");
			}
			else
				System.out.println("Moved to child window");
		} catch (NoSuchWindowException e) {
			System.err.println("The driver could not move to the given window by index "+index);
			//throw new RuntimeException();

		}catch (WebDriverException e) {
			System.err.println("WebDriverException : "+e.getMessage());
		}
	}


	public void switchToFrame(WebElement ele) {

		try {
			WebElement iframe = ele;
			driver.switchTo().frame(iframe);
			System.out.println("switch In to the Frame "+ele);
		} catch (NoSuchFrameException e) {
			System.err.println("No frames available");
		} catch (WebDriverException e) {
			System.out.println("WebDriverException : "+e.getMessage());

		}

	}


	public void acceptAlert() {
		String txt="";
		try {
			Alert alert = driver.switchTo().alert();
			txt=alert.getText();
			alert.accept();
			System.out.println("The Alert "+txt+" is successfully Accepted");
		} catch (NoAlertPresentException e) {
			System.err.println("Alert is not Present");
			//throw new RuntimeException();
		} catch (WebDriverException e) {
			System.out.println("WebDriverException : "+e.getMessage());
		}  
	}


	public void promptAlertaccept(String value) {

		Alert myalert = driver.switchTo().alert();
		myalert.sendKeys(value);
		myalert.accept();
		System.out.println("Prompt alert  is successfully Accepted");
	}



	public void dismissAlert() {
		String txt="";
		try {
			Alert alert = driver.switchTo().alert();
			txt=alert.getText();
			alert.dismiss();
			System.out.println("The Alert "+txt+" is successfully Accepted");
		} catch (NoAlertPresentException e) {
			System.err.println("Alert is not Present");
			//throw new RuntimeException();
		} catch (WebDriverException e) {
			System.out.println("WebDriverException : "+e.getMessage());
		}  
	}



	public String getAlertText() {
		String text = "";		
		try {
			Alert alert = driver.switchTo().alert();
			text = alert.getText();
		} catch (NoAlertPresentException e) {
			System.out.println("There is no alert present.");
		} catch (WebDriverException e) {
			System.out.println("WebDriverException : "+e.getMessage());
		} 
		return text;
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() {
		try {
			driver.close();
			System.out.println("The Current browser closed successfully");
		} catch (Exception e) {
			System.err.println("Browser  is not Present");
			//throw new RuntimeException();
		}
	}

	public void closeAllBrowsers() {
		try {
			driver.quit();
			System.out.println("The opened browsers are closed");
		} catch (Exception e) {
			System.out.println("The browsers could not be closed");
		}
	}

public void webDriverWait(String value) {
WebDriverWait wait = new WebDriverWait(driver, 30);
wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath(value))));
	System.out.println(" waiting for 30 secs");

	}



	public void mouseHover(WebElement ele) {

		Actions builder = new Actions(driver);
		builder.moveToElement(ele).perform();


	}

	public void mouseHoverandclick(WebElement ele) {

		Actions builder = new Actions(driver);
		builder.moveToElement(ele).click().perform();

	}

}


