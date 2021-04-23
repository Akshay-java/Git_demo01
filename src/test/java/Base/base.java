package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public static WebDriver LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
		
	}
	
	public static WebDriver launch_url(String str) throws IOException, Exception 
	{
		
		prop = new Properties();
		FileInputStream fi = new FileInputStream("F:\\Java\\Live_PractiseProject_01\\src\\test\\java\\Base\\global.properties");
		prop.load(fi);
		driver.get(prop.getProperty(str));
		Thread.sleep(5000);
		return driver;
		
	}

}
