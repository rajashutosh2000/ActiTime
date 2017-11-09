package jLC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Ashutosh1212/Desktop/HTML/link1.html");
		//driver.findElement(By.tagName("a")).click();
		Thread.sleep(3000);
		//driver.findElement(By.id("a1")).click();
		//driver.findElement(By.name("n1")).click();
		driver.findElement(By.linkText("Google")).click();
		Thread.sleep(3000);
        driver.close();
	}

}
