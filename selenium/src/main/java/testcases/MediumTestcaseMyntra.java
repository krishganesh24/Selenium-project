package testcases;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.internal.runners.model.EachTestNotifier;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.SendKeysAction;

public class MediumTestcaseMyntra {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(op);
		//Get URL//
		driver.get("https://www.myntra.com/");	
		//Maximize the window
		driver.manage().window().maximize();
		//Implicit wait for 30 Secs
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Type sunglass in search box and enter
		driver.findElementByClassName("desktop-searchBar").sendKeys("sunglass");
		driver.findElementByXPath("//a[@class='desktop-submit']/span").click();


		List<WebElement> listele = driver.findElementsByXPath("(//div[@class='product-productMetaInfo'])/div[1]");	

		List<String> sg=new ArrayList<String>();

		for (WebElement uniq : listele) {

			//String list=uniq.getText();
			//System.out.println(list);
			sg.add(uniq.getText());
		}


		Set<String> unisex = new HashSet<String>();

		unisex.addAll(sg);

		for (String unisun : unisex) {

			System.out.println("Unique brand names are:" +unisun);

		}


		//Get the count of the sunglasses with 40% discounts
		
		//List<WebElement> disele = driver.findElementsByXPath("(//div[@class='product-productMetaInfo'])/div[1]");
		
		List<WebElement> disele = driver.findElementsByClassName("product-productMetaInfo");
		int count=0;
		for (WebElement unisex1 : disele) {
			
			if (unisex1.getText().contains("40%") && unisex1.getText().contains("Unisex"))
			{
				
				count++;
				}
			
	}

		System.out.println("sunglass with 40% discount with unisex :"+count);
		
		Thread.sleep(3000);
		//Click on Green color Filter icon& Click on second listed search result of the sun glasses

		//driver.findElementByXPath("//input[@value='green'and @type='checkbox']").click();
		driver.findElementByXPath("//ul/li[@data-colorhex='green']").click();
		
		WebElement main=driver.findElementByXPath("//ul[@class='results-base']");
		List<WebElement> childs = main.findElements(By.className("product-base"));
		WebElement secProduct=childs.get(1);
		secProduct.click();
		
		//Print the name of the product
		
		WebElement prdname = driver.findElementByXPath("//h1[@class='pdp-title']");
		String prd=prdname.getText();
		System.out.println("Second listed prd name="+prd);
		
		//Click to add bag
		
		driver.findElementByXPath("//span[text()='ADD TO BAG']").click();
		
		//click go to bag
		
		
		driver.findElementByXPath("//a[@class='desktop-cart']/span").click();
		//driver.findElementByLinkText("GO TO BAG").click();
		
		Thread.sleep(3000);
		
		
		WebElement prdname1 = driver.findElementByXPath("//a[@class='c-gray']");
		String name=prdname1.getText();
		
		if(name.equals(prd))
		{
			System.out.println("Product name is matching");
		}
		else
			System.out.println("Product name is not matching");
		
		
		driver.close();
}


}



