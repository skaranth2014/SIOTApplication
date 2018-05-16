package SIOT.Samsung.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;


public class GenericClass {
public WebDriver driver;


public GenericClass(WebDriver driver){
	this.driver=driver;
}
public static void implicitlyWait(WebDriver driver,int time){
	driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
 }

	

public static Properties readValue() throws IOException{
	FileInputStream fis =new FileInputStream("C:\\Users\\ravindra.parauha\\workspace\\SampleDemo\\Samsung\\src\\datafile.properties");
	Properties pro= new Properties();
	pro.load(fis);
	
	return pro;
}

public static void threadSleep(WebDriver driver,int time){
	try {
		Thread.sleep(time);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }


//readvalue
//split the key remove equals sign 
//return the value


}
