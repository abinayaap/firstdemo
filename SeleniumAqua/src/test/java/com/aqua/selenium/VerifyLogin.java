package com.aqua.selenium;

/**
* 
*/

 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
import com.aqua.selenium.Login ;
 
/**
* @author Mukesh_50
*
*/
public class VerifyLogin 
{
 
 
@Test
public void verifyValidLogin() throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\abinayaap\\eclipse-workspace_selenium\\selenium_project\\drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
 
driver.manage().window().maximize();
 
driver.get("https://opensource-demo.orangehrmlive.com/");
 
Login login=new Login(driver);
 
Thread.sleep(3000);
login.loginToWordpress("Admin","admin123");
Thread.sleep(5000);
//login.typePassword("admin123");
//Thread.sleep(3000);
//login.clickOnLoginButton();
//Thread.sleep(3000);
 
 
driver.quit();
 
}
 
 
}
