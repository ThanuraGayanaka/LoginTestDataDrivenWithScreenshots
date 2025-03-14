package TestPages;

import Basepage.BaseTestpage;
import Pages.LoginPage;
import Utility.ConfigReader;
import Utility.ScreenshotUtil;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class LoginTest extends BaseTestpage {

    @Test
    public void login(){

       try {
           LoginPage loginPage = new LoginPage(driver);



           String configUsername = ConfigReader.getProperty("Username");

           System.out.println( ConfigReader.getProperty("Username"));

           String configPassword = ConfigReader.getProperty("Password");


           System.out.println( ConfigReader.getProperty("Password"));


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
}
