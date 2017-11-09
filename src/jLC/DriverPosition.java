package jLC;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverPosition {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        Dimension d=new Dimension(200,300);
        driver.manage().window().setSize(d);
        Thread.sleep(3000);
        Point p= new Point(200,300);
        driver.manage().window().setPosition(p);
        Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
        driver.close();
	}

}
