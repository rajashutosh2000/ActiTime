package Encapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	private WebElement LogoutBtn;
	public Homepage(WebDriver driver){
		LogoutBtn=driver.findElement(By.id("logoutLink"));
	}
     public void clickonLogoutBtn(){
    	 LogoutBtn.click();
     }
}
