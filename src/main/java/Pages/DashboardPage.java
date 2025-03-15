package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage {

    protected WebDriver driver;
    WebDriverWait wait;







    public DashboardPage(WebDriver driver) {

        this.driver= driver;
        this.wait= new WebDriverWait(driver, Duration.ofSeconds(10));


    }
}
