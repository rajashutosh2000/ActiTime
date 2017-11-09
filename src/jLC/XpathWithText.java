package jLC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathWithText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Ashutosh1212/Desktop/HTML/link4.html");
		//driver.findElement(By.xpath("//a[text()='Google']")).click();
		//driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		//driver.findElement(By.xpath("//a[text()='Instagram']")).click();
		driver.findElement(By.xpath("//a[text()='Twitter']")).click();
        Thread.sleep(3000);
        driver.quit();
	}

}
