import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.cssSelector;

public class ParallelTesting extends BaseTestParallelExecution{


        @Test
        public void loginValidCredentials() {
            getDriver().findElement(By.cssSelector("input[type='email']")).sendKeys("maxim.ibon@gmail.com");
            getDriver().findElement(By.cssSelector("input[type='password']")).sendKeys("te$t$tudent1");
            getDriver().findElement(By.cssSelector("button[type='submit']")).click();
            WebElement avatar = getDriver().findElement(cssSelector("img[class='avatar']"));
            Assert.assertTrue(avatar.isDisplayed(), "Profile avatar is displayed");
        }

        @Test
        public void loginInvalidCredentials() {
            getDriver().findElement(By.cssSelector("input[type='email']")).sendKeys("maxim.ibon@gmail.com");
            getDriver().findElement(By.cssSelector("input[type='password']")).sendKeys("te$t$tudent");
            getDriver().findElement(By.cssSelector("button[type='submit']")).click();
            WebElement loginform = getDriver().findElement(cssSelector("form[data-testid='login-form']"));
            Assert.assertTrue(loginform.isDisplayed(), "Login form is Displayed");
        }



    }

