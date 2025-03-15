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
    public AdminPage clickAdminModule() {
        WebElement adminElement = wait.until(ExpectedConditions.elementToBeClickable(adminModule));
        adminElement.click();
        return new AdminPage(driver);  // Returning the AdminPage object after clicking
    }

    // Method to click on the PIM Module
    public PimPage clickPimModule() {
        WebElement pimElement = wait.until(ExpectedConditions.elementToBeClickable(pimModule));
        pimElement.click();
        return new PimPage(driver);  // Returning the PimPage object after clicking
    }

    // Method to click on the Leave Module
    public LeavePage clickLeaveModule() {
        WebElement leaveElement = wait.until(ExpectedConditions.elementToBeClickable(leaveModule));
        leaveElement.click();
        return new LeavePage(driver);  // Returning the LeavePage object after clicking
    }

    // Method to click on the Time Module
    public TimePage clickTimeModule() {
        WebElement timeElement = wait.until(ExpectedConditions.elementToBeClickable(timeModule));
        timeElement.click();
        return new TimePage(driver);  // Returning the TimePage object after clicking
    }

    // Method to click on the Recruitment Module
    public RecruitmentPage clickRecruitmentModule() {
        WebElement recruitmentElement = wait.until(ExpectedConditions.elementToBeClickable(recruitmentModule));
        recruitmentElement.click();
        return new RecruitmentPage(driver);  // Returning the RecruitmentPage object after clicking
    }

    // Method to click on the My Info Module
    public MyInfoPage clickMyInfoModule() {
        WebElement myInfoElement = wait.until(ExpectedConditions.elementToBeClickable(myInfoModule));
        myInfoElement.click();
        return new MyInfoPage(driver);  // Returning the MyInfoPage object after clicking
    }

    // Method to click on the Performance Module
    public PerformancePage clickPerformanceModule() {
        WebElement performanceElement = wait.until(ExpectedConditions.elementToBeClickable(performanceModule));
        performanceElement.click();
        return new PerformancePage(driver);  // Returning the PerformancePage object after clicking
    }

    // Method to click on the Dashboard Module
    public DashboardPage clickDashboardModule() {
        WebElement dashboardElement = wait.until(ExpectedConditions.elementToBeClickable(dashboardModule));
        dashboardElement.click();
        return new DashboardPage(driver);  // Returning the DashboardPage object after clicking
    }

    // Method to click on the Directory Module
    public DirectoryPage clickDirectoryModule() {
        WebElement directoryElement = wait.until(ExpectedConditions.elementToBeClickable(directoryModule));
        directoryElement.click();
        return new DirectoryPage(driver);  // Returning the DirectoryPage object after clicking
    }

    // Method to click on the Maintenance Module
    public MaintenancePage clickMaintenanceModule() {
        WebElement maintenanceElement = wait.until(ExpectedConditions.elementToBeClickable(maintenanceModule));
        maintenanceElement.click();
        return new MaintenancePage(driver);  // Returning the MaintenancePage object after clicking
    }

    // Method to click on the Claim Module
    public ClaimPage clickClaimModule() {
        WebElement claimElement = wait.until(ExpectedConditions.elementToBeClickable(claimModule));
        claimElement.click();
        return new ClaimPage(driver);  // Returning the ClaimPage object after clicking
    }

    // Method to click on the Buzz Module
    public BuzzPage clickBuzzModule() {
        WebElement buzzElement = wait.until(ExpectedConditions.elementToBeClickable(buzzModule));
        buzzElement.click();
        return new BuzzPage(driver);  // Returning the BuzzPage object after clicking
    }
}
