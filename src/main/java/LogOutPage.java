import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutPage extends BasePage{


    public LogOutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="/html/body/div/h2/a")
    public WebElement logOut;


    void Out(){
        logOut.click();
    }

}
