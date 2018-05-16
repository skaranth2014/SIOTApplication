package SIOT.Samsung.Test;


import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseClass
{
	protected static WebDriver driver;  
    protected static  HomePage homepage ;
    protected static GenericClass function;
   
public static void setUp() throws Exception 
{	
	//*********************************************************************************************************************
/*	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
	capabilities.setCapability("deviceName", "02157df2c9e37330  ");
	capabilities.setCapability("deviceId", "02157df2c9e37330");
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("platformVersion", "7.0");
	driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);*/
	//*********************************************************************************************************************
	Properties Browser=function.readValue();
     System.setProperty("webdriver.chrome.driver",Browser.getProperty("chromeDriver"));
	driver=new ChromeDriver();
	
	driver.get(Browser.getProperty("AppURL"));
	function.implicitlyWait(driver,1000);
	function.threadSleep(driver, 2000);
	homepage=new HomePage(driver);
	function=new GenericClass(driver);
	
}
}
	
	//***********************************************************************************************************************
	/*DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
	capabilities.setCapability("deviceName", "ce0317139951dc690c");
	capabilities.setCapability("deviceId", "ce0317139951dc690c");
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("platformVersion", "7.0");
	driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	Thread.sleep(10000);
	//driver.get("http://52.90.203.123/#/");

	System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

	
*/
//***********************************************************************************************************************



