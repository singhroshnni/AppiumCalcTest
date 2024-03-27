package MobileTesting.AppiumTesting;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AppiumCalcTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		   capabilities.setCapability("deviceName","emulator-5554");
	        capabilities.setCapability("platformname", "Android");     
	        capabilities.setCapability("automationName","uiautomator2");
	        capabilities.setCapability("platformversion", "12");
	     
	        capabilities.setCapability("appPackage","com.google.android.calculator");
	        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
	        
	        

	        URL url = new URL("http://127.0.0.1:4723/wd/hub");

	        
	        AndroidDriver driver = new AndroidDriver(url, capabilities);
	        Thread.sleep(5000);
	        System.out.println("Application Started");
	        
	        
	        //click on number 80
	       WebElement num8 =  driver.findElement(By.id("com.google.android.calculator:id/digit_8"));
	       num8.click(); //perform click action on number 8
	       
	       WebElement num0 =  driver.findElement(By.id("com.google.android.calculator:id/digit_0"));
	       num0.click();//perform click action on number 8
	       
	       //click on plus sign
	       WebElement plus =  driver.findElement(By.id("com.google.android.calculator:id/op_add"));
	       plus.click(); //perform click action on number 8
	    
	        //click on number 20
	       WebElement num2 =  driver.findElement(By.id("com.google.android.calculator:id/digit_2"));
	       num2.click(); //perform click action on number 2
	       
	       WebElement num5 =  driver.findElement(By.id("com.google.android.calculator:id/digit_5"));
	       num5.click(); //perform click action on number 5
	    
	       
	        //click on equal sign
	       WebElement equal =  driver.findElement(By.id("com.google.android.calculator:id/eq"));
	       equal.click(); 
	    
	       
	  // check result
	       WebElement result =  driver.findElement(By.id("com.google.android.calculator:id/result_preview"));
	      String resultString = result.getText();
	      
	      if(resultString.equals("105"))
	      {
	    	  System.out.println("Pass");
	      }
	      else
	      {
	    	  System.out.println("fail");
	      }
	      
	   
	        driver.quit();

	}

}
