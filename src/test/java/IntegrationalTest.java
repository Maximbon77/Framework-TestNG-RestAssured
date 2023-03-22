import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class IntegrationalTest extends BaseTest{

    @Test
    public void KoelTest(){
        // WebDriverManager.chromedriver().setup();
        //ChromeOptions options = new ChromeOptions();
       // options.addArguments("--remote-allow-origins=*");
      // WebDriver driver = new ChromeDriver(options);
        driver.get("http://google.com");
        driver.quit();

    }
}
