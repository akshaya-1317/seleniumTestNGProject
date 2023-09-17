package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageObjects {
	public WebDriver driver; //this driver dont have any scope

	private By username=By.xpath("//input[@name='username']");
	
	private By password=By.xpath("//input[@name='password']");
	
	private By login=By.xpath("//button[@type='submit']");
	
	private By errorMessage=By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text  ']");
	
	
	  public loginPageObjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		  this.driver=driver2;
		  
	}

	public WebElement enterUsername() {
	    	
	    	return driver.findElement(username);
			
	    	
		}
	
	  public WebElement enterPassword() {
		
		    return driver.findElement(password); //this returns the xpath for username
	    }
	  
	  public WebElement loginButton() {
		
		  return driver.findElement(login);
	  
	  }
	
	  
	  public WebElement errorMessage() {
		
		  return driver.findElement(errorMessage);
	  
	  }
  
}
