package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

 protected    WebDriver driver;
 protected WebDriverWait wait;


    By usernamefiled= By.xpath("//input[contains(@name,'username')]");
    By passwordfiled= By.xpath("//input[contains(@name,'password')]");
    By loginbutton =By.xpath("//button[contains(@type,'submit')]");



    public LoginPage(WebDriver driver){

        this.driver=driver;
        this.wait= new WebDriverWait(driver, Duration.ofSeconds(20));


    }
    public void enterUsername(String uname){

       wait.until(ExpectedConditions.visibilityOf(driver.findElement(usernamefiled))).sendKeys(uname);

   // driver.findElement(usernamefiled).sendKeys(uname);



    }


    public void enterpassword(String password){


        wait.until(ExpectedConditions.visibilityOf(driver.findElement(passwordfiled))).sendKeys(password);

        //driver.findElement(passwordfiled).sendKeys(password);

    }


    public void clickLoginBtn() throws InterruptedException {


        wait.until(ExpectedConditions.elementToBeClickable(loginbutton)).click();
        Thread.sleep(5000);

    }





    public void loginToApp(String username, String password) {
        WebElement userField = wait.until(ExpectedConditions.visibilityOfElementLocated(usernamefiled));
        userField.sendKeys(username);

        WebElement passField = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordfiled));
        passField.sendKeys(password);

        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(loginbutton));
        loginBtn.click();



    }

}
