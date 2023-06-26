package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrl = "https://courses.ultimateqa.com/\n";

    @Before
    public void testsui() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        //get the signin link
        driver.findElement(By.linkText("Sign In")).click();
        //verify the welcome back
        String expectedelement = "Welcome Back!";
        String actualelement = driver.findElement(By.tagName("h2")).getText();
        Assert.assertEquals("Welcome Back! is not display", expectedelement, actualelement);

    }

    @Test
    public void verifyTheErrorMessage() {
        //get the signin link
        driver.findElement(By.linkText("Sign In")).click();
        //Enter invalid username
        driver.findElement(By.id("user[email]")).sendKeys("prime12@gmail.com");
        //Enter invalid password
      driver.findElement(By.name("user[password]")).sendKeys("prime123");
      String expectedelement = "Invalid email or password";






    }
    @After
    public void close() {
        closeBrowser();
    }
}

