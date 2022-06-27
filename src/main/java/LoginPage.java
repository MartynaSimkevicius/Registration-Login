import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {



    public LoginPage(WebDriver driver) {
        super(driver);
    }

//    @FindBy(xpath="/html/body/div/form/div/input[1]")
//    public WebElement activation;

    @FindBy(xpath="/html/body/div/form/div/input[1]")
    public WebElement userName;

    @FindBy(xpath="/html/body/div/form/div/input[2]")
    public  WebElement PassWord;

    @FindBy(xpath="/html/body/div/form/div/button")
    public  WebElement button;



    void FillSearch(String value){
        userName.sendKeys(value);
    }

    void FiillPasword(String value){
        PassWord.sendKeys(value);
    }

    void ClickYes(){
        button.click();
    }


}
