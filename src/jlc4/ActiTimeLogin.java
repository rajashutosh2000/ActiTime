  package jlc4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		driver.get("https://online.actitime.com/akumar11/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("raj.ashutosh2000");
		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("9031555299a");

		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		
        driver.quit();
	}

}
