package jLC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckCssSELECTOR {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Ashutosh1212/Desktop/HTML/link1.html");
		//driver.findElement(By.cssSelector("a")).click();
		//driver.findElement(By.cssSelector("a[id='a1']")).click();
		//driver.findElement(By.cssSelector("a[name='n1']")).click();
		//driver.findElement(By.cssSelector("a[class='c1']")).click();
		driver.findElement(By.cssSelector("a[href='https://www.google.co.in']")).click();
		String title = driver.getTitle();
		if(title.equals("Google")){
			System.out.println("Test is pass");
		}
		else{
			System.out.println("Test is fail");
		}
		System.out.println(title);
		driver.quit();
	}

}
