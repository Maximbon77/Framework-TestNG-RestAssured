import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import static java.sql.DriverManager.getDriver;

public class BaseTest {
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;
    String url;
/*
    @BeforeMethod
    public void browserSetUp() {
        driver = pickBrowser(System.getProperty("browser"));
//        WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public WebDriver pickBrowser(String browserName) {
        switch(browserName) {
            case "safari":
                WebDriverManager.safaridriver().setup();
                return driver = new SafariDriver();
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                return driver = new FirefoxDriver();
            case "IE":
                WebDriverManager.edgedriver().setup();
                return driver = new EdgeDriver();
            default:
                WebDriverManager.chromedriver().setup();
                return driver = new ChromeDriver();
        }
    }

 */
}