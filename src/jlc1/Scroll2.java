package jlc1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Scroll2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.get("http://www.seleniumhq.org/");
		  RemoteWebDriver r = (RemoteWebDriver) driver;
		  String c = "window.scrollTo(0,document.body.scrollHeight)";
		  r.executeScript(c);
	}

}
