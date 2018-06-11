package testcases;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class MediumMyntra_SeMethods extends SeMethods {

@Test
	public void medium() throws InterruptedException {

		//Launch the chrome brower and load myntra URL 
		startApp("chrome", "https://www.myntra.com/");

		//Type sunglass in search box and enter
		WebElement search = locateElement("class", "desktop-searchBar");
		type(search, "sunglass");

		WebElement sub = locateElement("XPath","//a[@class='desktop-submit']/span");
		click(sub);

		//List<WebElement> listele = driver.findElementsByXPath("(//div[@class='product-productMetaInfo'])/div[1]");	
		
		List<WebElement> listele =locateElements("XPath","(//div[@class='product-productMetaInfo'])/div[1]");
		List<String> sg=new ArrayList<String>();
		for (WebElement uniq : listele) {
			sg.add(uniq.getText());
		}

		Set<String> unisex = new HashSet<String>();
		unisex.addAll(sg);
		for (String unisun : unisex) {

			System.out.println("Unique brand names are:" +unisun);

		}

		//Get the count of the sunglasses with 40% discounts

		//List<WebElement> disele = driver.findElementsByXPath("(//div[@class='product-productMetaInfo'])/div[1]");

		//List<WebElement> disele = driver.findElementsByClassName("product-productMetaInfo");
		List<WebElement> disele=locateElements("class", "product-productMetaInfo");
		
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

		WebElement green = locateElement("XPath","//ul/li[@data-colorhex='green']");
		click(green);

		WebElement main=locateElement("XPath","//ul[@class='results-base']");
		List<WebElement> childs = main.findElements(By.className("product-base"));
		WebElement secProduct=childs.get(1);
		click(secProduct);

		//Print the name of the product

		WebElement prdname = locateElement("XPath","//h1[@class='pdp-title']");
		String prd=getText(prdname);
		System.out.println("Second listed prd name="+prd);

		//Click to add bag

		WebElement add = locateElement("XPath","//span[text()='ADD TO BAG']");
		click(add);

		//click go to bag

		WebElement go = locateElement("XPath","//a[@class='desktop-cart']/span");
		click(go);

		Thread.sleep(3000);


		WebElement prdname1 = locateElement("XPath","//a[@class='c-gray']");

		verifyExactText(prdname1, prd);

closeBrowser();

	}
}
