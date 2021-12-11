package webapptest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest1 {
	
	 WebDriver dri;
	 WebElement E1;
	@BeforeClass
	 public void start()
	 {
		   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		   //ChromeDriver dri = new ChromeDriver();
		    dri = new ChromeDriver();
			dri.get("http://3.7.69.159:32002"); 
	 }
	
  @Test
  public void insertcase() throws InterruptedException 
  {

	dri.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	dri.findElement(By.cssSelector("input[type='button'][value='AddEmployee']")).click();
	 dri.findElement(By.id("fname")).sendKeys("testvikrams1");
	 dri.findElement(By.id("lname")).sendKeys("test");
	 dri.findElement(By.id("empid")).sendKeys("1");
	 dri.findElement(By.id("dept")).sendKeys("MES");
	 dri.findElement(By.id("dsgn")).sendKeys("mgr"); 
     dri.findElement(By.id("sal")).sendKeys("1000");
     dri.findElement(By.cssSelector("input[type='submit'][value='Add']")).click();
     E1 = dri.findElement(By.xpath("//table/tbody/tr[9]/td[1]"));
     System.out.println(E1.getText().substring(0,14));
     Assert.assertEquals(E1.getText().substring(0, 14),"Added employee");    

     dri.findElement(By.cssSelector("input[type='button'][value='Go to Homepage']")).click();
 	 dri.findElement(By.cssSelector("input[type='button'][value='GetEmployee']")).click();
 	 dri.findElement(By.id("empid")).sendKeys("1");
 	 dri.findElement(By.cssSelector("input[type='submit'][value='Get']")).click();
     
  }
  
 
  public void getcase() throws InterruptedException 
  {
	  
	  
  }
 
  @AfterClass
  public void close()
  {
	 // dri.close();
  }
  }
  

