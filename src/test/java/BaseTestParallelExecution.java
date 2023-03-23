import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;
import static java.sql.DriverManager.getDriver;

public class BaseTestParallelExecution {

    ThreadLocal<WebDriver> threadDriver;
    String url="https://bbb.testpro.io";

    @BeforeMethod
    public void browserSetUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        threadDriver= new ThreadLocal<>();
        threadDriver.set(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        getDriver().get("https://bbb.testpro.io");
    }
    @AfterMethod
    public void tearDownBrowser(){
        getDriver().quit();
        threadDriver.remove();
}
    public WebDriver getDriver() {
        return threadDriver.get();
    }
}
