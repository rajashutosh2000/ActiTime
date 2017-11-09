package Encapsulation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class TestLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://online.actitime.com/akumar11/login.do");
		LoginPage login=new LoginPage(driver);
		login.setUsename("raj.ashutosh2000");
		login.setPassword("9031555299a");
		login.clickonloginBtn();
		login.clickonchckBx();
		Homepage p=new Homepage(driver);
		p.clickonLogoutBtn();

	}

}
