package jLC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpathChild {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Child axes
		driver.get("file:///C:/Users/Ashutosh1212/Desktop/HTML/xpah%20axes.html");
		/*driver.findElement(By.xpath("/child::html/child::body/child::select/child::option[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/descendant::option[text()='Dosa']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/descendant::option[text()='upma']")).click();*/
		Thread.sleep(3000);
		//parent
		
		driver.findElement(By.xpath("//option[text()='Dosa']/parent::select//option[text()='poha']")).click();
		//driver.findElement(By.xpath("//option[text()='upma']/following-sibling::option[2]")).click();
		//driver.findElement(By.xpath("//option[text()='idly']/following-sibling::option")).click();
	//driver.findElement(By.xpath("//option[text()='upma']/preceding-sibling::option[1]")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
