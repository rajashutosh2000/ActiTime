package Encapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebElement unTxtBx;
	private WebElement pwTxtBx;
	private WebElement chckBx;
	private WebElement loginBtn;
    public LoginPage(WebDriver driver){
    	
    	unTxtBx=driver.findElement(By.id("username"));
    	pwTxtBx=driver.findElement(By.name("pwd"));
    	chckBx=driver.findElement(By.id("keepLoggedInCheckBox"));
    	loginBtn=driver.findElement(By.xpath("//div[contains(text(),'Login')]"));
    	
    }
      public void setUsename(String name){
    	  unTxtBx.sendKeys(name);
      }

      public void setPassword(String pwd){
    	  pwTxtBx.sendKeys(pwd);
	}
      public void clickonchckBx(){
    	  chckBx.click();
      }
      public void clickonloginBtn(){
    	  loginBtn.click();
      }
}