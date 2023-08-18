package testcase.airbnb;

import base.Browser;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

public class SearchTest extends Browser {

    @Test
    public void searchTest() throws IOException {

        f = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\menu-locators.properties");
        p.load(f);

        System.out.println("Search Test");
        Wait<WebDriver> fwait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        WebElement searchIcon = driver.findElement(By.xpath(p.getProperty("searchIcon")));
        fwait.until(ExpectedConditions.elementToBeClickable(searchIcon));
        searchIcon.click();

        WebElement destField = driver.findElement(By.xpath(p.getProperty("destination-btn")));
        destField.click();
        destField.sendKeys("Lon");
        fwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@aria-label='Search suggestions']")));
        destField.sendKeys(Keys.ARROW_DOWN);
        destField.sendKeys(Keys.ENTER);

        WebElement forward = driver.findElement(By.xpath(p.getProperty("move-forward")));
        fwait.until(ExpectedConditions.elementToBeClickable(forward));
        forward.click();

        driver.findElement(By.xpath("//div[@data-testid='calendar-day-10/01/2023']")).click();
        driver.findElement(By.xpath("//div[@data-testid='calendar-day-10/20/2023']")).click();

        WebElement guests = driver.findElement(By.xpath(p.getProperty("addguests-btn")));
        guests.click();
        fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-testid='structured-search-input-field-guests-panel']")));
        WebElement increaseAdults = driver.findElement(By.xpath("//div[@id='stepper-adults']//button[@aria-label='increase value']"));
        WebElement increaseChildren = driver.findElement(By.xpath("//div[@id='stepper-children']//button[@aria-label='increase value']"));
        increaseAdults.click();
        increaseAdults.click();
        increaseChildren.click();

        WebElement search = driver.findElement(By.xpath(p.getProperty("search-btn")));
        search.click();
    }

}
