package jlc1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Scroll1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.get("http://www.seleniumhq.org/");
		 int y = driver.findElement(By.className("icon")).getLocation().getY();
		  RemoteWebDriver r = (RemoteWebDriver) driver;
		  String c = "window.scrollTo(0,"+y+")";
		  r.executeScript(c);
		  
		  

	}

}
