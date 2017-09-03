package com.rsa.instest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrangeHrms {
	
public static WebDriver driver = null;	
	
	@BeforeClass
	public static void createWebDriver() {
		//sdded comment
		System.setProperty("webdriver.gecko.driver","C:\\developement\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
	}


	@SuppressWarnings("deprecation")
	@Test
	public void test() {
	  driver.get("https://www.google.co.in/");
	  String name = driver.getTitle();
	//  Assert.assertEquals("Google", name);
	  System.out.println(name);
	}
	
	@Test
	public void login() throws InterruptedException {
		
	  driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
	  driver.findElement(By.name("txtUserName")).sendKeys("admin");
	  driver.findElement(By.name("txtPassword")).sendKeys("admin");
	  driver.findElement(By.name("Submit")).click();
	  Weblement element = driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[1]"));
	  String name = element.getText();
	 // Assert.assertEquals(name, "Welcome admin");
//	  String name = driver.getTitle();
//	  Assert.assertEquals("Google", name);
//	  System.out.println(name);
	}

	@AfterClass
	public static void clear(){
		driver.close();
	}
	
}
