package pageObjectModels;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class myInfoPageObjects {

 public WebDriver driver;
 
 private By firstName=By.xpath("//input[@name='firstName']"); 
 
 private By middleName=By.xpath("//input[@name='middleName']");
 
 private By lastName=By.xpath("//input[@name='lastName']");

		 
 private By myInfo=By.xpath("//span[normalize-space()='My Info']"); //w
 
 private By EmployeeId=By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]");
 
 private By OtherId=By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]"); //w
 
// private By licenceNo=By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]");
 
 private By ssnId=By.xpath("(//input[@class='oxd-input oxd-input--active'])[6]"); //w

private By maritalStatusDropdown=By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]");

private By maritalStatusOptions=By.xpath("//div[@class='oxd-select-dropdown --positon-bottom']");
 

//private By gender=By.xpath("//input[@value='2']");

 private By nationalityDropdown=By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]");
 
 private By nationalityOptions= By.xpath("//div[@class='oxd-select-option']");
 
 private By militaryService=By.xpath("(//input[@class='oxd-input oxd-input--active'])[10]");
 
 private By smokeBox=By.xpath("(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[1]");
 
 private By saveButton=By.xpath("//button[@type='submit']");
 
 
 
 public myInfoPageObjects(WebDriver driver) {
  
      this.driver=driver;
 }


 public WebElement clickOnMyInfo() {
  
  return driver.findElement(myInfo);
 }
 
 public WebElement enterfirstName() {
	 
	 return driver.findElement(firstName);
 }
 
 public WebElement enterMiddleName() {
	 
	 return driver.findElement(middleName);
 }
 
 public WebElement enterLastName() {
	 
	 return driver.findElement(lastName);
 }
 
 public WebElement clickOnEmpID() {
	 
	 return driver.findElement(EmployeeId);
 }
 
 
 public WebElement ClickOnotherID() {

	 return driver.findElement(OtherId);
 } 
 
 
// public WebElement licenceNo() {
//
//	 return driver.findElement(licenceNo);
// } 
 
 
public WebElement SSNid() {
	
	return driver.findElement(ssnId);
}


//public WebElement selectGender() {
//	
//	return driver.findElement(gender);
//}


public WebElement maritalStatusDropdown() {
	
	return driver.findElement(maritalStatusDropdown);
}


public List<WebElement> chooseMaritalStatus(){
	
	return driver.findElements(maritalStatusOptions);
}
 
 
 public WebElement clickOnNationalityDropdown() {
  
  return driver.findElement(nationalityDropdown);
 }
 
    public List<WebElement> chooseNationality() {
  
  return driver.findElements(nationalityOptions);
 }
 
 
    public WebElement writeMilitaryStatus() {
    	
    	return driver.findElement(militaryService);
    }
 
    public WebElement smokeBox() {
    	
    	return driver.findElement(smokeBox);
    }
 
    
    public WebElement saveButton() {
    	
    	return driver.findElement(saveButton);
    }
    
    
    
    
}












