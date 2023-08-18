package testcase.airbnb;

import base.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

public class LoginTest extends Browser {

    @Test
    public void login() throws IOException {

        f = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\menu-locators.properties");
        p.load(f);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();

        driver.navigate().to(p.getProperty("url")+"/login");

        WebElement emailBtn = driver.findElement(By.xpath(p.getProperty("email-btn")));
        emailBtn.click();

        WebElement emailInput = driver.findElement(By.xpath(p.getProperty("email-input")));
        emailInput.sendKeys(p.getProperty("username"));
        WebElement contBtn = driver.findElement(By.xpath(p.getProperty("continue-btn")));
        contBtn.click();

        WebElement passInput = driver.findElement(By.xpath(p.getProperty("password-input")));
        passInput.sendKeys(p.getProperty("password"));

        WebElement loginBtn = driver.findElement(By.xpath(p.getProperty("login-btn")));
        loginBtn.click();

    }

}
