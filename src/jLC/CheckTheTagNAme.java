package jLC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckTheTagNAme {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Ashutosh1212/Desktop/HTML/link1.html");
		//By b=By.tagName("a");
		//By b=By.id("a1");
		//By b=By.name("n1");
		//By b=By.linkText("Google");
		By b=By.partialLinkText("Google");
		WebElement e=driver.findElement(b);
		e.click();
		Thread.sleep(3000);

	}

}
