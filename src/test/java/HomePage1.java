import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage1 {

public HomePage1(){
    PageFactory.initElements(Driver.getDriver(),this);

}
    @FindBy(xpath = "//*[@id='idSIButton9']")
    public WebElement signIn;

    @FindBy(xpath = "//span[@class='ms-Icon--WaffleOffice365 ms-icon-font-size-16']")
    public WebElement mainLink;


    @FindBy(xpath = "//a[@href='https://account.activedirectory.windowsazure.com/applications/signin/Moodle%20NAU/408aeea0-3ccf-4e46-a6eb-a0e15a754974']")
    public WebElement moodle;

    @FindBy(xpath = "//div[@class='event']")
    public WebElement events;

    @FindBy(xpath = "//a[@data-type='event']")
    public WebElement eventName;


    @FindBy(xpath = "//div[@class='date']")
    public WebElement eventDate;


}
