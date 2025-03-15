package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage {

    protected WebDriver driver;
    WebDriverWait wait;

    // Defining locators for all the modules
    By adminModule = By.xpath("//a[contains(.,'Admin')]");
    By pimModule = By.xpath("//span[contains(.,'PIM')]");
    By leaveModule = By.xpath("//span[contains(., 'Leave')]");
    By timeModule = By.xpath("//a[@class='oxd-main-menu-item' and contains(.,'Time')]");
    By recruitmentModule = By.xpath("//a[@class='oxd-main-menu-item' and contains(.,'Recruitment')]");
    By myInfoModule = By.xpath("//span[contains(.,'My Info')]");
    By performanceModule = By.xpath("//span[contains(.,'Performance')]");
    By dashboardModule = By.xpath("//span[contains(.,'Dashboard')]");
    By directoryModule = By.xpath("//span[contains(.,'Directory')]");
    By maintenanceModule = By.xpath("//span[contains(.,'Maintenance')]");
    By claimModule = By.xpath("//span[contains(.,'Claim')]");
    By buzzModule = By.xpath("//span[contains(.,'Buzz')]");

    // Constructor to initialize WebDriver and WebDriverWait
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Method to click on the Admin Module
    public void clickAdminModule() {
        WebElement adminElement = wait.until(ExpectedConditions.elementToBeClickable(adminModule));
        adminElement.click();
    }

    // Method to click on the PIM Module
    public void clickPimModule() {
        WebElement pimElement = wait.until(ExpectedConditions.elementToBeClickable(pimModule));
        pimElement.click();
    }

    // Method to click on the Leave Module
    public void clickLeaveModule() {
        WebElement leaveElement = wait.until(ExpectedConditions.elementToBeClickable(leaveModule));
        leaveElement.click();
    }

    // Method to click on the Time Module
    public void clickTimeModule() {
        WebElement timeElement = wait.until(ExpectedConditions.elementToBeClickable(timeModule));
        timeElement.click();
    }

    // Method to click on the Recruitment Module
    public void clickRecruitmentModule() {
        WebElement recruitmentElement = wait.until(ExpectedConditions.elementToBeClickable(recruitmentModule));
        recruitmentElement.click();
    }

    // Method to click on the My Info Module
    public void clickMyInfoModule() {
        WebElement myInfoElement = wait.until(ExpectedConditions.elementToBeClickable(myInfoModule));
        myInfoElement.click();
    }

    // Method to click on the Performance Module
    public void clickPerformanceModule() {
        WebElement performanceElement = wait.until(ExpectedConditions.elementToBeClickable(performanceModule));
        performanceElement.click();
    }

    // Method to click on the Dashboard Module
    public void clickDashboardModule() {
        WebElement dashboardElement = wait.until(ExpectedConditions.elementToBeClickable(dashboardModule));
        dashboardElement.click();
    }

    // Method to click on the Directory Module
    public void clickDirectoryModule() {
        WebElement directoryElement = wait.until(ExpectedConditions.elementToBeClickable(directoryModule));
        directoryElement.click();
    }

    // Method to click on the Maintenance Module
    public void clickMaintenanceModule() {
        WebElement maintenanceElement = wait.until(ExpectedConditions.elementToBeClickable(maintenanceModule));
        maintenanceElement.click();
    }

    // Method to click on the Claim Module
    public void clickClaimModule() {
        WebElement claimElement = wait.until(ExpectedConditions.elementToBeClickable(claimModule));
        claimElement.click();
    }

    // Method to click on the Buzz Module
    public void clickBuzzModule() {
        WebElement buzzElement = wait.until(ExpectedConditions.elementToBeClickable(buzzModule));
        buzzElement.click();
    }
}
