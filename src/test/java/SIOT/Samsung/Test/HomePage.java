package SIOT.Samsung.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import SIOT.Samsung.Pages.UIElements;

public class HomePage extends UIElements{

	public WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver=driver;
	}
	public void getURL(){
		 String Application_URL=driver.getCurrentUrl();
		  System.out.println("application URL is:-" +Application_URL );
		  Reporter.log("application URL is:-" +Application_URL );
		  
	}
	
	public boolean user_navigates_to_landing_Screen() throws Throwable {
	    WebElement samsunglogo=driver.findElement(By.xpath(samsung_Logo_xpath));
	      if(samsunglogo.isDisplayed()){
	    	  System.out.println("logo is present in homepage");
	    	  Reporter.log("logo is present in homepage");
	    	  return true;
	      }
	      else return false;
	
	}
	public boolean verify_Food_Pillar() throws Throwable {
	    WebElement foodelement=driver.findElement(By.xpath(food_pillar_xpath));
	      if(foodelement.isDisplayed()){
	    	  System.out.println("food pillar is present in homepage landing screen");
	    	  Reporter.log("food pillar is present in homepage landing screen");
	    	  return true;
	      }
	      else return false;
	
}
	public boolean verify_Fun_Pillar() throws Throwable {
	    WebElement funelement=driver.findElement(By.xpath(fun_pillar_xpath));
	      if(funelement.isDisplayed()){
	    	  System.out.println("fun pillar is present in homepage landing screen");
	    	  Reporter.log("fun pillar is present in homepage landing screen");
	    	  return true;
	      }
	      else return false;
	}
	
	public boolean verify_Family_Pillar() throws Throwable {
	    WebElement familyelement=driver.findElement(By.xpath(family_pillar_xpath));
	      if(familyelement.isDisplayed()){
	    	  System.out.println("family pillar is present in homepage landing screen");
	    	  Reporter.log("Family pillar is present in homepage landing screen");
	    	  return true;
	      }
	      else return false;
	}
	public void appTitle(){
		String appTitle="Samsung IOT";
		String Application_Title=driver.getTitle();
		System.out.println("application Title is:-" +Application_Title );
		Assert.assertEquals(Application_Title, appTitle);
		Reporter.log("application Title is:-" +Application_Title );
		 
		  
	}
}
