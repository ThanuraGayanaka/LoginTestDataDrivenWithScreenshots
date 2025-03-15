package TestPages;

import Basepage.BaseTestpage;
import Pages.LoginPage;
import Utility.ConfigReader;
import Utility.ScreenshotUtil;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTestpage {

    @Test
    public void login(){

       try {
           LoginPage loginPage = new LoginPage(driver);



           String configUsername = ConfigReader.getProperty("Username");

          // System.out.println( ConfigReader.getProperty("Username"));

           String configPassword = ConfigReader.getProperty("Password");


          // System.out.println( ConfigReader.getProperty("Password"));


           loginPage.enterUsername(configUsername);
          // Thread.sleep(2000);
           loginPage.enterpassword(configPassword);
         //  Thread.sleep(2000);
           loginPage.clickLoginBtn();

           ScreenshotUtil.takeScreenshot(driver,"LoginSuccess");







       } catch (Exception e) {
           throw new RuntimeException("file reader issue");
       }


    }
@Test
    public void validate_Url(){


        // After navigating to the page
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty("Homepage_url");


        Assert.assertEquals(actualUrl,expectedUrl,"correctly navigate to the dashboard page");

        ScreenshotUtil.takeScreenshot(driver,"Navigate dashboard page");


    }
    @Test(priority = 2)
    public void checkInvalid_username() throws InterruptedException {

        LoginPage loginPage= new LoginPage(driver);
        loginPage.enterUsername(ConfigReader.getProperty("InvalidUsername"));
        loginPage.enterpassword(ConfigReader.getProperty("Password"));
        loginPage.clickLoginBtn();

        Thread.sleep(2000);


        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty("Homepage_url");


        Assert.assertNotEquals(actualUrl,expectedUrl,"Login function failed");

        ScreenshotUtil.takeScreenshot(driver,"Login fail");

    }
}
