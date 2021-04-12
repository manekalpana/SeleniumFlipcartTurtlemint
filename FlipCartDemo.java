package com.maven.flipcart.com.maven.flipcartdemo;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FlipCartDemo {

	@Test
	  public void testFlipcart()  throws InterruptedException{
	  
			System.setProperty("webdriver.chrome.driver", "E:\\kalpana\\chromedriver.exe");
			  WebDriver driver = new ChromeDriver();

			        driver.manage().window().maximize();
			        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			        Thread.sleep(3000);
		  driver.get("http://www.flipkart.com");
	    String title=driver.getTitle();
	    System.out.println("Title is "+title);
	    
	 driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
        driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("Books");
        
        driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys(Keys.ENTER);
        
        driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).click();;
        
       Thread.sleep(2000);
       
       driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a[2]")).click();
       
       String strUrl = driver.getCurrentUrl();
       System.out.println("Current Url is:"+ strUrl);
       Thread.sleep(100);
       driver.close();
        
		}

}
