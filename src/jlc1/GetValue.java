package jlc1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetValue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.get("file:///C:/Users/Ashutosh1212/Desktop/test.html");
           String st = driver.findElement(By.id("a1")).getAttribute("class");
           System.out.println(st);
           Thread.sleep(3000);
           driver.quit();
	}

}
