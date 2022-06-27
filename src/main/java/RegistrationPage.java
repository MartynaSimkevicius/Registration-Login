import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="/html/body/div/form/div[1]/input")
    public  WebElement activetedField;



    @FindBy(xpath="/html/body/div/form/div[1]/input")
    public WebElement usermane;

    @FindBy(xpath="/html/body/div/form/div[2]/input")
    public  WebElement password;

    @FindBy(xpath="/html/body/div/form/div[3]/input")
    public  WebElement passwordReapet;

    @FindBy(xpath="/html/body/div/form/button")
    public  WebElement submit;

    void Activation(){
        submit.click();
    }

    void YorName(String value){
        usermane.sendKeys(value);
    }

    void Password(String value){
        password.sendKeys(value);
    }
    void PasswordReapeat(String value){
        passwordReapet.sendKeys(value);
    }
    void Submit(){
        submit.click();
    }

}
