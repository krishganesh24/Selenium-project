package week2day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcRegistration {

	public static WebElement webElement;
	//public static WebElement webElement2;
	
	

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		// Open the chrome browser//

		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		//maximize the window//
		driver.manage().window().maximize();
		
		// Enter username, password and confirm password.
		
		driver.findElementById("userRegistrationForm:userName").sendKeys("kris_gans24");
		driver.findElementById("userRegistrationForm:password").sendKeys("Ganesh@123");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Ganesh@123");
		
		// Select values from security question dropdown.
		
		WebElement securityQ = driver.findElementById("userRegistrationForm:securityQ");
		Select secq= new Select(securityQ);
		secq.selectByVisibleText("Who was your Childhood hero?");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Kamalhassan");
		
		
		// Select values from prefered language dropdown.
		
		WebElement prelan =driver.findElementById("userRegistrationForm:prelan");
		Select Prel=new Select(prelan);
		Prel.selectByVisibleText("English");
		
		// Enter Personal details first name, middle name and last name//
		
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Ganesh");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("krishna");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Moorthy");
		// select gender and maritalstatus
		
		driver.findElementById("userRegistrationForm:gender:0").click();
		driver.findElementById("userRegistrationForm:maritalStatus:0").click();
		
		
		// Select value from date of birth
		WebElement dobDay = driver.findElementById("userRegistrationForm:dobDay");
		Select bday=new Select(dobDay);
		bday.selectByVisibleText("24");
		
		WebElement dobMonth = driver.findElementById("userRegistrationForm:dobMonth");
		Select bmon=new Select(dobMonth);
		bmon.selectByVisibleText("APR");	
		
		WebElement dateOfBirth = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select byear=new Select(dateOfBirth);
		byear.selectByVisibleText("1982");	
		
		//select occupation from dropdown.
		
		WebElement occupation = driver.findElementById("userRegistrationForm:occupation");
		Select Occ=new Select(occupation);
		Occ.selectByVisibleText("Professional");
		
		driver.findElementById("userRegistrationForm:uidno").sendKeys("90312699833");
		driver.findElementById("userRegistrationForm:idno").sendKeys("AKKPG6334R");
		
		WebElement countries = driver.findElementById("userRegistrationForm:countries");
		Select cty=new Select(countries);
		cty.selectByVisibleText("India");
			
		driver.findElementById("userRegistrationForm:email").sendKeys("krish.ganesh@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9840068722");
		
		WebElement nationality= driver.findElementById("userRegistrationForm:nationalityId");
		Select nation = new Select(nationality);
		nation.selectByVisibleText("India");
		 
		//enter Residential Address//
		
		 driver.findElementById("userRegistrationForm:address").sendKeys("Plot no 17 dorr no 87F2");
		 driver.findElementById("userRegistrationForm:street").sendKeys("3rd Cross St");
		 driver.findElementById("userRegistrationForm:area").sendKeys("Rajakilpakkam, Chennai");
		 driver.findElementById("userRegistrationForm:pincode").sendKeys("600073",Keys.TAB);
		 
			 Thread.sleep(3000);
		 		 
		 //driver.findElementById("userRegistrationForm:statesName").sendKeys("");
		 
		 WebElement cityName = driver.findElementById("userRegistrationForm:cityName");
		 Select city= new Select(cityName);
		 city.selectByVisibleText("Kanchipuram");
		 
		 Thread.sleep(3000);
		 
		 WebElement post = driver.findElementById("userRegistrationForm:postofficeName");
		 Select po= new Select(post);
		 po.selectByVisibleText("Selaiyur S.O");
		 
		 driver.findElementById("userRegistrationForm:landline").sendKeys("044-22282315");
		 boolean resadd=driver.findElementById("userRegistrationForm:resAndOff:0").isSelected();
		 System.out.println(resadd);

	}

}
