import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	@SuppressWarnings("deprecation")
	@Test
	public void login() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Sakthi/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement signin = driver.findElement(By.id("nav-signin-tooltip"));
		this.takeSnapShot(driver, "C:\\Users\\sakth\\eclipse-workspace\\phase5-2\\src\\test\\java//result1.png") ;
		signin.click();
		driver.findElement(By.name("email")).sendKeys("your_mail");
		this.takeSnapShot(driver, "C:\\Users\\sakth\\eclipse-workspace\\phase5-2\\src\\test\\java//result2.png") ;
		WebElement co = driver.findElement(By.id("continue"));
		co.click();
		driver.findElement(By.name("password")).sendKeys("your_pass");
		this.takeSnapShot(driver, "C:\\Users\\sakth\\eclipse-workspace\\phase5-2\\src\\test\\java//result3.png") ;
		WebElement signinsubmit = driver.findElement(By.id("signInSubmit"));
		signinsubmit.click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung galaxy s22");
		this.takeSnapShot(driver, "C:\\Users\\sakth\\eclipse-workspace\\phase5-2\\src\\test\\java//result4.png") ;
		WebElement submit = driver.findElement(By.id("nav-search-submit-button"));
		submit.click();
		this.takeSnapShot(driver, "C:\\Users\\sakth\\eclipse-workspace\\phase5-2\\src\\test\\java//result5.png") ;
		driver.get("https://www.amazon.in/Samsung-Phantom-Storage-Additional-Exchange/dp/B09SH8JPCJ/ref=sr_1_1_sspa?crid=2OL7EU9CITWDA&keywords=samsung+galaxy+s22&qid=1664700801&qu=eyJxc2MiOiI0Ljk2IiwicXNhIjoiNC45NCIsInFzcCI6IjIuMjUifQ%3D%3D&sprefix=samsung+galaxy+s2%2Caps%2C247&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEzOUk1TDA0VlRWUkFZJmVuY3J5cHRlZElkPUEwMzMzNjAyU1JRTExDN01ORzhXJmVuY3J5cHRlZEFkSWQ9QTA2MjQzNjhZR1kzMEFMVjlSSDAmd2lkZ2V0TmFtZT1zcF9hdGYmYWN0aW9uPWNsaWNrUmVkaXJlY3QmZG9Ob3RMb2dDbGljaz10cnVl");
		this.takeSnapShot(driver, "C:\\Users\\sakth\\eclipse-workspace\\phase5-2\\src\\test\\java//result6.png") ;
		WebElement addtocart = driver.findElement(By.id("add-to-cart-button"));
		addtocart.click();
		this.takeSnapShot(driver, "C:\\Users\\sakth\\eclipse-workspace\\phase5-2\\src\\test\\java//result7.png") ;
		Thread.sleep(5000);
		this.takeSnapShot(driver, "C:\\Users\\sakth\\eclipse-workspace\\phase5-2\\src\\test\\java//result8.png") ;
	}
	public void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile=new File(fileWithPath);
		//Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
		}
}