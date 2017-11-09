package jLC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrlLink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumhq.org");
		Thread.sleep(3000);
		driver.navigate().to("http://www.seleniumhq.org/download/");
		Thread.sleep(3000);
         driver.quit();

	}

}
