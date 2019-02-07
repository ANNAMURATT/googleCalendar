package com.anna.pages;

import com.anna.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Nau {

    public static void main(String[] args) {
        Nau nau = new Nau();
        System.out.println(nau.eventName.size());
    }
    public List<String> eventName = new ArrayList <>();
    public List<String> eventDate = new ArrayList <>();
    @Test
    public void test() throws InterruptedException {


        WebDriver driver = Driver.getDriver();
        driver.get("http://www.na.edu/");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@href='http://login.microsoftonline.com']")).click();

        String currentUrl = driver.getCurrentUrl();

        String parent = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        for (String child : allWindows){
            if (!parent.equalsIgnoreCase(child)){
                driver.switchTo().window(child);

                driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
                driver.findElement(By.xpath("//input[@type='email']")).sendKeys("agundogdyyev@na.edu");
//                Thread.sleep(3000);

                driver.findElement(By.xpath("//input[@type='submit']")).click();

                driver.findElement(By.xpath("//input[@type='password']")).sendKeys("3Dau@72");

                WebDriverWait wait = new WebDriverWait(driver,10);
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='idSIButton9']")));
                HomePage1 homePage1 = new HomePage1();
                driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
                homePage1.signIn.click();

                driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
                homePage1.signIn.click();

                driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
                homePage1.mainLink.click();

//                Thread.sleep(3000);
                homePage1.moodle.click();

                Thread.sleep(3000);

                Set<String> allWindows2 = driver.getWindowHandles();
                for (String child2:allWindows2){
                    if (!child2.equalsIgnoreCase(child)&&!child2.equalsIgnoreCase(parent)){
                        driver.switchTo().window(child2);

                        Thread.sleep(10000);

                        List<WebElement> eventList = driver.findElements(By.xpath("//a[@data-type='event']"));
                        List<WebElement> eventdate = driver.findElements(By.xpath("//div[@class='date']"));
                        eventName = new ArrayList <>();
                        eventDate = new ArrayList <>();
                        for (int i = 0; i <eventList.size() ; i++) {
                            eventName.add(eventList.get(i).getText());
                            eventDate.add(eventdate.get(i).getText().substring(0,14));
                        }
                        System.out.println(eventName);
                        System.out.println(eventDate);

                        driver.quit();


                    }
                }


            }
        }



    }
}
