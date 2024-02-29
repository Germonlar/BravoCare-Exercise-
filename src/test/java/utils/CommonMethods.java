package utils;

import io.cucumber.java.bs.A;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.PageInitializer;

import java.io.File;
import java.time.Duration;

public class CommonMethods extends PageInitializer  {
    public static WebDriver driver;




    @BeforeMethod
    public static void openBrowserAndNavigateToURL() throws InterruptedException {
        ConfigReader.readProperties(Constants.CONFIG_READER_PATH);
        switch (ConfigReader.getPropertyValue("browser")) {
            case "chrome":
                ChromeOptions cp=new ChromeOptions();
                cp.addExtensions(new File("./Extensions/AdBlock.crx"));

                driver = new ChromeDriver(cp);
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
        }

            Thread.sleep(3000);

        String mainPageHandle = driver.getWindowHandle();
        driver.manage().window().maximize();
        driver.get(ConfigReader.getPropertyValue("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //this method is going to initialize all the objects available inside this method
        initializePageObjects();

        driver.switchTo().window(mainPageHandle);




    }



    @AfterMethod
    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static void sendText(String text, WebElement element) {
        element.clear();
        element.sendKeys(text);
    }

    public static void sendInt(int number, WebElement element) {
        element.clear();
        element.sendKeys(String.valueOf(number));
    }

    public static WebDriverWait getWait(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait;
    }

    public static void waitForClickability(WebElement element){
        getWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void click(WebElement element){
        waitForClickability(element);
        element.click();
    }

    public static void selectFromDropdown(WebElement dropDown, String visibleText) {
        Select sel = new Select(dropDown);
        sel.selectByVisibleText(visibleText);
    }

    public static void selectFromDropdown(String value, WebElement dropDown) {
        Select sel = new Select(dropDown);
        sel.selectByValue(value);
    }

    public static void scrollDown(int pixelsToScroll) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + pixelsToScroll + ")");
    }

    public static void mouseOverAndClick(WebElement element){
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
        action.click(element).perform();

    }

    public static void clickByLocation (WebElement element){
        Actions action = new Actions(driver);
        Point p = element.getLocation();
        System.out.println(p.getX());
        System.out.println(p.getY());
//        action.moveToLocation(p.getX(),p.getY()).click().perform();


    }
}



