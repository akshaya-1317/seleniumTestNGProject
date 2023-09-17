package testCases;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
//import bsh.org.objectweb.asm.Constants;
import pageObjectModels.loginPageObjects;
import resources.BaseClass;
import resources.commonMethods;
import resources.constants;

public class loginTestCases extends BaseClass{

	@Test(priority=0)
	public void verifyValidLogin() throws IOException, InterruptedException {
		
		
		
		Thread.sleep(2000);
		loginPageObjects lpo=new loginPageObjects(driver);
		lpo.enterUsername().sendKeys(constants.username);
	/*	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	    hi line nko mhnun line no 20 che settings kele ani hyacha xpath loginPageObject vr dilay.
	*/
		lpo.enterPassword().sendKeys(constants.validPassword);
		lpo.loginButton().click();
		
		
		
//		SoftAssert sa = new SoftAssert();
//		
//		String ExpectedText = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
//		String ActualText = driver.getCurrentUrl();
//		
//		sa.assertEquals(ActualText, ExpectedText);
//		
//		sa.assertAll();
//		
		
		commonMethods.handleAssertion(driver.getCurrentUrl(), constants.dashboardUrl);
		
		
		
		
	}
	
	
	@Test(priority=1)
	public void verifyInValidLogin() throws IOException, InterruptedException {
		
		
		
		Thread.sleep(2000);
		loginPageObjects lpo=new loginPageObjects(driver);
		lpo.enterUsername().sendKeys(constants.username);
	    lpo.enterPassword().sendKeys(constants.invalidPAssword);
		lpo.loginButton().click();
	
		Thread.sleep(5000);
//		SoftAssert sa=new SoftAssert();
//		
//		String expectedText="Invalid credentials";
//		  
//		  String actualText=  driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText();
//		  
//		  sa.assertEquals(actualText, expectedText);
//		  
//		  
//		  sa.assertAll(); //This is mandatory
//		  
		
		commonMethods.handleAssertion(lpo.errorMessage().getText(), constants.invalidErrorExpectedText);
		
		
		
		
		
		
}
	
}
