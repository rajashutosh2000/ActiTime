package jLC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CHECKAbsoluteXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Ashutosh1212/Desktop/HTML/link3.html");
		//driver.findElement(By.xpath("//div[1]/a[1]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[1]/a[2]")).click();
		//driver.findElement(By.xpath("//div[2]/a[1]")).click();
		driver.findElement(By.xpath("//div[2]/a[2]")).click();
         Thread.sleep(3000);
         driver.quit();
	}

}
