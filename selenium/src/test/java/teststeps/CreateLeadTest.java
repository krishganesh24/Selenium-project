//package teststeps;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//
//public class CreateLeadTest {
//	
//	public static RemoteWebDriver driver;
//	@Given("launch the application for create lead")
//	public void launchapp( ) {
//
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		driver= new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.get("http://leaftaps.com/opentaps");
//	}
//
//	@And("Type the username as (.*)")
//	public void type_Username_for_CreateLead(String uname) {
//
//		driver.findElementById("username").sendKeys(uname);
//
//	}
//	@And("Type the password for CL as (*.*)")	
//	public void type_Password_CreateLead(String pwd) {
//
//		driver.findElementById("password").sendKeys(pwd);
//
//	}			
//
//	@And("Go to click the loginbtn for CL")
//	public void click_Login_btn_forCL() {
//
//		driver.findElementByClassName("decorativeSubmit").click();
//		
//	}
//	
//	@And("click CRMSFA link")
//	public void clickCRMSFAlink()
//	{
//	
//		driver.findElementByLinkText("CRM/SFA").click();
//	}
//
//	
//	@And("click leads button")
//	public void clickLeadbutton()
//	{
//			driver.findElementByLinkText("Leads").click();
//			
//	}
//
//	@And("click Createlead button")
//	public void clickCreateLeadlink()
//	{
//			driver.findElementByLinkText("Create Lead").click();;
//	}
//
//	@And("enter the company name")
//	public void enter_company_name()
//	{
//			driver.findElementById("createLeadForm_companyName").sendKeys("infosys");
//	}
//
//	@And("Enter first name")
//	public void enter_frist_name() {
//
//		driver.findElementById("createLeadForm_firstName").sendKeys("Ganesh");
//
//	}
//	
//	@And("Enter last name")
//	public void enter_last_name() {
//
//		driver.findElementById("createLeadForm_lastName").sendKeys("krish");
//
//	}
//	
//	
//	
//	@And("click Create lead button")
//	public void clickcreatelead_button() {
//
//		driver.findElementByClassName("smallSubmit").click();
//
//	}
//
//
//	
//	
//	
//
//}
