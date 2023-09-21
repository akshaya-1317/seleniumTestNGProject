package testCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjectModels.loginPageObjects;
import pageObjectModels.myInfoPageObjects;
import resources.BaseClass;

public class myInfoTestCases extends BaseClass {

	
	@Test
	public void fillPersonalDetails() throws InterruptedException, IOException {
		
		
		
		 driver.manage().window().maximize();
		  Thread.sleep(2000);
		
		
		loginPageObjects lpo=new loginPageObjects(driver);
		lpo.enterUsername().sendKeys("Admin");                        //username
	    lpo.enterPassword().sendKeys("admin123");                     //password
		lpo.loginButton().click();
		
		
		  Thread.sleep(3000);
		  SoftAssert sa=new SoftAssert();
		
		
		
		
		
		myInfoPageObjects mpo=new myInfoPageObjects(driver);
		
		Thread.sleep(2000);
		mpo.clickOnMyInfo().click();                                   //my Info click -- working
		
		
//        mpo.enterfirstName().clear();	
//		mpo.enterfirstName().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
//		Thread.sleep(2000);
//		mpo.enterfirstName().sendKeys("Akshaya");
//		
//		
//		mpo.enterMiddleName().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
//		Thread.sleep(2000);
//		mpo.enterMiddleName().sendKeys("S");
//		
//		
//		mpo.enterLastName().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
//		Thread.sleep(2000);
//		mpo.enterLastName().sendKeys("Kulkarni");
		
		
		Thread.sleep(3000);                                            //EmployeeId -- working
	//	mpo.clickOnEmpID().clear();
		mpo.clickOnEmpID().sendKeys("1234");
		
		
		Thread.sleep(3000);                                            //otherId
		mpo.ClickOnotherID().sendKeys("567");
		
		
//		Thread.sleep(3000);
//		mpo.licenceNo().sendKeys("ABCD1234");
		
		Thread.sleep(3000);                                            //SSNId -- working
		mpo.SSNid().sendKeys("abcde123");
		
//		Thread.sleep(3000);
//		mpo.selectGender().click();                                   //Gender
//		
		Thread.sleep(3000);
		mpo.maritalStatusDropdown().click();                         //marital status arrow -- working
		
		
		List<WebElement> obj1=mpo.chooseMaritalStatus();            //marital status dropdown options -- working
		for(WebElement m:obj1) {
			if(m.getText().equalsIgnoreCase("Married")) {
				m.click();
				break;
			}
		}
		
		
		Thread.sleep(3000);
		mpo.clickOnNationalityDropdown().click();                      //nationality arrow -- working
		
		Thread.sleep(3000);
		List<WebElement> obj=mpo.chooseNationality();                  //choose Indian -- working
		
		for(WebElement k:obj) {
			if(k.getText().equalsIgnoreCase("Indian")) {
				k.click();
				break;
			}
		}
		
		
		Thread.sleep(3000);
		mpo.writeMilitaryStatus().sendKeys("NO");                     //military status -- working
		
		
		Thread.sleep(3000);
		mpo.smokeBox().click();                                       //smoke box -- working
		
		Thread.sleep(3000);
		mpo.saveButton().click();                                      //save button -- working
		
		
	//	mpo.enterfirstName().sendKeys("Akshaya");
	//	mpo.enterMiddleName().sendKeys("Suhas");
	
		
		sa.assertAll();
		
	}
}
