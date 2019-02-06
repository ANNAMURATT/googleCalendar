import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GoogleCalendar {

    @Test
    public void test() throws InterruptedException {
        Nau events = new Nau();
        events.test();


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com/calendar");
        WebElement username = driver.findElement(By.xpath("//input[@type='email']"));
        username.sendKeys("gundogdiyev@gmail.com");

        driver.findElement(By.xpath("//span[@class = 'RveJvd snByac']")).click();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));

        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("annamurat1234$");
        driver.findElement(By.id("passwordNext")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[ @class='VfPpkd-Q0XOV']")));



        for (int i = 0; i < 10; i++) {

            String even = events.eventName.get(i);
            String dat = events.eventDate.get(i);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[ @class='VfPpkd-Q0XOV']")).click();

            Actions actions = new Actions(driver);

                Thread.sleep(3000);
                WebElement event =driver.findElement(By.xpath("//input[ @aria-label='Add title']"));
                event.sendKeys(even);

                Thread.sleep(3000);
                WebElement date = driver.findElement(By.xpath("//input[ @aria-label='Start date']"));
                actions.click(date).perform();
                date.sendKeys(dat);

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@role='button' and *='Save']")));
            driver.findElement(By.xpath("//*[@role='button' and *='Save']")).click();
        }

    }
}
