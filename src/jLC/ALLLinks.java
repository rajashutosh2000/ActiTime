package jLC;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALLLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Ashutosh1212/Desktop/link4.html");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		int sizeof = allLinks.size();
		System.out.println("Total Linksof="+sizeof);
		//for(int i=0;i<allLinks.size();i++){
			//System.out.println(allLinks.size());
	  //	for(int i=0;i<allLinks.size();i++)
		//System.out.println(allLinks.get(i).getAttribute("href"));
	      for(WebElement Links:allLinks){ 

		 System.out.println(Links.getAttribute("href"));
	      
	  }
	}
}
