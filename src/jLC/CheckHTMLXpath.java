package jLC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckHTMLXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Ashutosh1212/Desktop/HTML/link2.html");
		//driver.findElement(By.xpath("html/body/div[1]/input[1]")).click();
		//driver.findElement(By.xpath("html/body/div[1]/input[1]|/html/body/div[1]/input[2]")).click();
		//driver.findElement(By.xpath("html/body/div[2]/input[1]")).click();
		//driver.findElement(By.xpath("html/body/div[2]/input[2]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/input[1]|/html/body/div[2]/input[1]")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
