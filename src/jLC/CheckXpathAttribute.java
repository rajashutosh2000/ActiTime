package jLC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckXpathAttribute {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Ashutosh1212/Desktop/HTML/link4.html");
		//driver.findElement(By.xpath("//a[@id='a1'][@name='n1']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[@id='a2'][@name='n2']")).click();
		//driver.findElement(By.xpath("//a[@id='a3'][@class='c3'][@name='n3']")).click();
		driver.findElement(By.xpath("//a[@id='a4'][@class='c4'][@name='n4']")).click();
		Thread.sleep(3000);
        driver.quit();
	}

}
