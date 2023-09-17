package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;
	public Properties prop;
	
	public void initializeDriver() throws IOException {
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties"); 
		{
			
		prop=new Properties();
		
		prop.load(fis);
		
		String BrowserName = prop.getProperty("Browser");
				
		if(BrowserName.equalsIgnoreCase("chrome")) {
			 driver=new ChromeDriver();
			
		}
		
		else if(BrowserName.equalsIgnoreCase("firefox")) {
			 driver=new FirefoxDriver();
		}
			
		else if(BrowserName.equalsIgnoreCase("edge")) {
			 driver=new EdgeDriver();
			
		}
		else {
			System.out.println("Please choose valid browser");
		}
			
		
		
		
		
		}
		
	
//		@BeforeMethod
//		public void urlLaunch() {                      //getting error 
//			
//			initializeDriver();
//			driver.get(prop.getProperty("url"));
//		}
//		
//		public void quitBrowser( ) {
//			driver.quit();
//		}
		
		
		
		
	}
}
